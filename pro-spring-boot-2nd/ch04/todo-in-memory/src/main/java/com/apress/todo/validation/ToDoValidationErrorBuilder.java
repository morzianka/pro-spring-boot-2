package com.apress.todo.validation;

import org.springframework.validation.Errors;

/**
 * @author Shabunina Anita
 */
public class ToDoValidationErrorBuilder {

    public static ToDoValidationError fromBindingErrors(Errors errors) {
        ToDoValidationError error = new ToDoValidationError(String
                .format("Validation failed. %s error(s)", errors.getErrorCount()));
        errors.getAllErrors().forEach(er -> error.addValidationError(er.getDefaultMessage()));

        return error;
    }
}
