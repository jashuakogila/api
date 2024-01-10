package jackson;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.core.exc.StreamWriteException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ObjectToJson {
	
	public static void main(String[] args) throws StreamWriteException, DatabindException, IOException {
		
		Student s = new Student("Donald","Trump",7);
		
		ObjectMapper mapper = new ObjectMapper();
		mapper.writeValue(new File("filet.json"), s);
		
		System.out.println("Success");
	}
	
	
}
 