import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class launchJackson1 {
  public static void main(String[] args) throws JsonProcessingException {
	Alien alien = new Alien();
	alien.setCity("cbe");
	alien.setId(1);
	alien.setName("arthi");
	
	System.out.println(alien);
	
	ObjectMapper mapper = new ObjectMapper();
	String json = mapper.writeValueAsString(alien);
	System.out.println(json);
}
}
