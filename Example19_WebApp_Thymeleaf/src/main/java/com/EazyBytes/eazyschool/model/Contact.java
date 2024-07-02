package com.EazyBytes.eazyschool.model;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class Contact {
    @NotBlank(message = "Name must not be blank")
    @Size(min=3,message = "Name must be Atleast 3 Characters Long")
    private String name;

    @NotBlank(message = "Mobile Number must not be blank")
    @Pattern(regexp = "(^$|[0-9]{10})", message = "Mobile Number must not be 10 digits")
    private String mobileNum;

    @NotBlank(message = "Email must not be blank")
    @Email(message = "Please provide a valid email address")
    private String email;

    @NotBlank(message = "Subject must not be blank")
    @Size(min=5,message = "Subject must be Atleast 5 Characters Long")
    private String subject;

    @NotBlank(message = "Message must not be blank")
    @Size(min=10,message = "Message must be Atleast 10 Characters Long")

    private String message;
}
