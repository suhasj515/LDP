package com.spring.mvc.demo.validation;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Constraint(validatedBy = CouseCodeConstraintValidator.class)
@Target({ElementType.METHOD,ElementType.FIELD}) //can apply annotation in method and feeld
@Retention(RetentionPolicy.RUNTIME) //retain and run at runtime
public @interface CourseCode {

    //define default course code
    public String value() default "LDP";

    //define deafult error message
    public String message() default "must start with LDP";

    //define default groups
    public Class<?>[] groups() default {};

    //define default payload
    public Class<? extends Payload>[] payload() default {};
}
