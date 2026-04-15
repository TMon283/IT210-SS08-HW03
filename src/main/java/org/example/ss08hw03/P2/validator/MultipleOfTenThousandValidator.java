package org.example.ss08hw03.P2.validator;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class MultipleOfTenThousandValidator implements ConstraintValidator<MultipleOfTenThousand, Long> {

    @Override
    public boolean isValid(Long value, ConstraintValidatorContext context) {
        if (value == null) {
            return false;
        }
        if (value < 0) {
            return false;
        }
        return value % 10000 == 0;
    }
}
