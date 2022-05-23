package com.lamichane.jackson.reading.sample.full.file.json.data;

import java.io.File;

import com.fasterxml.jackson.databind.ObjectMapper;

public class Main {

	public static void main(String[] args) {
		
		
		
		try {
			ObjectMapper objectMapper = new ObjectMapper();
			Student theStudent = objectMapper.readValue(new File("data/sample-full.json"), Student.class);
			System.out.println(theStudent.getId());
			System.out.println(theStudent.getFirstName());
			System.out.println(theStudent.getLastName());
			System.out.println(theStudent.isActive());
			System.out.println();
			Address address = theStudent.getAddress();
			System.out.println(address.getStreet());
			System.out.println(address.getCity());
			System.out.println(address.getState());
			System.out.println(address.getCountry());
			System.out.println(address.getZip());
			System.out.println();
			
			for(String s: theStudent.getLanguages()) {
				System.out.println(s);
			}
			
		}
		catch(Exception e) {
			
		}

	}

}

