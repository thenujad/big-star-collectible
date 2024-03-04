package com.example.bigstarcollectible.validators;

import org.apache.catalina.User;
import org.apache.el.util.Validation;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

@Component
public class UserValidator implements Validator {

    @Override
    public boolean supports(Class<?> clazz) {
        return User.class.equals(clazz);
    }

    @Override
    public void validate(Object target, Errors errors) {

        ValidationUtils.rejectIfEmpty(errors, "email","email.empty");
        ValidationUtils.rejectIfEmpty(errors, "name","name.empty");

    }
}
