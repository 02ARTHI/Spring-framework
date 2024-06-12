import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class launchJackson1 {
  public static void main(String[] args) throws JsonProcessingException {
	  ObjectMapper mapper = new ObjectMapper();
	  
	
	  Alien alien= mapper.readValue(new File("json/sample.json"), Alien.class);
	  System.out.println(alien);
}
}
