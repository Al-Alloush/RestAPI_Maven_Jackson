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
			// data/sample-full.json
			
//			Student studentlite = mapper.readValue(new File("data/sample-lite.json"), Student.class);
//			System.out.println(studentlite.toString());
			
			Student studentFull = mapper.readValue(new File("data/sample-full.json"), Student.class);
			System.out.println(studentFull.toString());
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
    }
}
