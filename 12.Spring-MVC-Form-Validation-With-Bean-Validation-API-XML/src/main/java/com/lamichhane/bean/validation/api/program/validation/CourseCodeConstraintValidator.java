package com.lamichhane.bean.validation.api.program.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CourseCodeConstraintValidator implements ConstraintValidator<CourseCode,String>{

	private String coursePrefix;
	@Override
	public boolean isValid(String arg0, ConstraintValidatorContext arg1) {
		
		boolean result;
		if(arg0 != null) {
			result = arg0.startsWith(coursePrefix);
		}
		else {
			result=true;
		}
		return result;
	}

	@Override
	public void initialize(CourseCode constraintAnnotation) {
		
		coursePrefix = constraintAnnotation.value();
	}
	
	

}
