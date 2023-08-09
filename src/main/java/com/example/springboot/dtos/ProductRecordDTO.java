package com.example.springboot.dtos;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.math.BigDecimal;

// os dtos só tem métodos getters, pois uma vez criados, não podem ser alterados.

public record ProductRecordDTO(@NotBlank String name, @NotNull BigDecimal value) {

}
