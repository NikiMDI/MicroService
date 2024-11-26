package com.nikita.ecommerce.payment;

import jakarta.validation.constraints.NotNull;
import org.springframework.validation.annotation.Validated;
import jakarta.validation.constraints.Email;

@Validated
public record Customer(
        String id,
        @NotNull(message = "Firstname is required")
        String firstname,
        @NotNull(message = "Lastname is required")
        String lastname,
        @NotNull(message = "Email is required")
        @Email(message = "The customer email is not correctly formatted")
        String email
) {

}
