package com.daluga.baseball.model.domain;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import org.junit.Test;

import com.daluga.baseball.model.AbstractTestCase;

public class TeamTest extends AbstractTestCase {

    @Test
    public void validate() {
            	
        ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
        Validator validator = factory.getValidator();
        
        Team team = new Team();
        Set<ConstraintViolation<Team>> constraintViolations = validator.validate(team);
        
        for (ConstraintViolation<Team> violation : constraintViolations) {
        	System.out.println(violation.getMessage());
        }
    }
}

