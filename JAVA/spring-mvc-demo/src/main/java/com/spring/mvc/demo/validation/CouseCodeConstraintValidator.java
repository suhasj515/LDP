package com.spring.mvc.demo.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CouseCodeConstraintValidator
        implements ConstraintValidator<CourseCode,String> {
    private String cousePrefix;

    @Override
    public void initialize(CourseCode constraintAnnotation) {
        cousePrefix=constraintAnnotation.value();
    }

    @Override
    public boolean isValid(String theCode, ConstraintValidatorContext constraintValidatorContext) {

        boolean result=theCode.startsWith(cousePrefix);

        return result;
    }
}
