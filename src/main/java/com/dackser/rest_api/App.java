package com.dackser.rest_api;

import java.io.File;

import com.dachser.Entity.Student;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        try {
        	// create object mapper
			ObjectMapper mapper = new ObjectMapper();
			
			// read JSON file and map to Java POJO
			// data/sample-lite.json
			Student student = mapper.readValue(new File("data/sample-lite.json"), Student.class);
			
			System.out.println(student.toString());
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
    }
}
