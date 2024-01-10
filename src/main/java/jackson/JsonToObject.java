package jackson;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonToObject{
	
	public static void main(String[] args) throws StreamReadException, DatabindException, IOException {
		
		File f = new File("filet.json");
		ObjectMapper ff = new ObjectMapper();
		Student s = ff.readValue(f, Student.class);
		
		System.out.println(s);
		
	}
	
	
	
	
	
	
	

}
