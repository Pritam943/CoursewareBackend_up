package com.Courseware.cutm.model;

import lombok.Data;

@Data
public class JwtAuthenticationResponse {
    private String token;
    private Login user;
}
