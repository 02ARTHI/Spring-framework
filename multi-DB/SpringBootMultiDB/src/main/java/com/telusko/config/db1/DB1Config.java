package com.telusko.config.db1;

import java.util.HashMap;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import jakarta.persistence.EntityManagerFactory;

@Configuration
@EnableTransactionManagement
@EnableJpaRepositories(entityManagerFactoryRef="db1EntityManager",transactionManagerRef="db1Transaction"
,basePackages="com.telusko.repo.cx")	
public class DB1Config 
{
	@Bean
	@ConfigurationProperties(prefix="db1.datasource")
	public DataSource dbDataSource()
	{
			return DataSourceBuilder.create().build();
	}
	
	//Entity
	@Bean
	public LocalContainerEntityManagerFactoryBean db1EntityManager(EntityManagerFactoryBuilder emfb)
	{
		HashMap<String ,Object> properties=new HashMap<>();
		properties.put("hibernate.hbm2ddl.auto", "update");
		properties.put("hibernate.dialect", "org.hibernate.dialect.MySQL8Dialect");
		properties.put("hibernate.show_sql", "true");
		properties.put("hibernate.format_sql", "true");
		return emfb.dataSource(dbDataSource()).packages("com.telusko.mysql.model").properties(properties).
				persistenceUnit("jdbclearning").build();
		
		
	}
	
	//transactionmanagement
	
	@Bean
	public PlatformTransactionManager db1Transaction(@Qualifier("db1EntityManager")EntityManagerFactory factory)
	{
		return new JpaTransactionManager(factory);
	}

}
