package com.project.back_end.DTO;

import lombok.Getter;
import lombok.Setter;

public class Login {

    private String identifier;

    @Getter
    @Setter
    private String email;

    @Getter
    @Setter
    private String password;

}
