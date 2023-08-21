package com.payonlinesimplificado.DTO;

import java.math.BigDecimal;

import com.payonlinesimplificado.entities.TypeUser;

public record UserDTO(String firstName, String lastName, String document, BigDecimal balance, String email,String password, TypeUser typeUser) {

}
