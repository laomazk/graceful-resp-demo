package com.example.demo;

import com.feiniaojin.gracefulresponse.api.ValidationStatusCode;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import org.hibernate.validator.constraints.Length;

@Data
public class UserInfoQuery {
    @NotNull(message = "{userName.notEmpty}")
    @Length(min = 6, max = 12)
    private String userName;
}