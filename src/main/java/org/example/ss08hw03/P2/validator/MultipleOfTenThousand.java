package org.example.ss08hw03.P2.validator;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.*;

@Documented
@Constraint(validatedBy = MultipleOfTenThousandValidator.class)
@Target({ ElementType.FIELD, ElementType.PARAMETER })
@Retention(RetentionPolicy.RUNTIME)
public @interface MultipleOfTenThousand {
    String message() default "Số tiền rút phải là bội số của 10.000 VNĐ";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}
