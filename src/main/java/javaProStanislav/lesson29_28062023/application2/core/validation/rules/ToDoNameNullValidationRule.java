package javaProStanislav.lesson29_28062023.application2.core.validation.rules;

import javaProStanislav.lesson29_28062023.application2.core.validation.ValidationException;
import javaProStanislav.lesson29_28062023.application2.core.validation.ValidationRule;
import javaProStanislav.lesson29_28062023.application2.dto.AddToDoRequest;

public class ToDoNameNullValidationRule implements ValidationRule {
    @Override
    public void validate(AddToDoRequest request) {
        if (request.getName() == null) {
            throw new ValidationException("ToDo name must not be null");
        }
    }
}
