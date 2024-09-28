package com.api.payload;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class RegistrationDto {
@NotNull
 @Size(min=5,message="min should be 4 character")
 private String name;

@Email
 private String email;

@Size(min=10,max=10,message="should be 10 digit")
 private String mobile;

}