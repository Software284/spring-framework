package com.lamichane.jackson.reading.sample.lite.file.json.data;

import java.io.File;

import com.fasterxml.jackson.databind.ObjectMapper;

public class Main {

	public static void main(String[] args) {
		
		
		
		try {
			ObjectMapper objectMapper = new ObjectMapper();
			Student theStudent = objectMapper.readValue(new File("data/sample-lite.json"), Student.class);
			System.out.println(theStudent.getId());
			System.out.println(theStudent.getFirstName());
			System.out.println(theStudent.getLastName());
			System.out.println(theStudent.isActive());
			
		}
		catch(Exception e) {
			
		}

	}

}

