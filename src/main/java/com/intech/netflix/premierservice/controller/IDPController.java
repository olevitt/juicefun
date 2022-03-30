package com.intech.netflix.premierservice.controller;

import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.exceptions.JWTCreationException;
import com.intech.netflix.premierservice.security.Authentification;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IDPController {

    @PostMapping("/login")
    public ResponseEntity login(@RequestBody  Authentification authentification) throws JWTCreationException{
        if (authentification.getIdentifiant().equals("admin") && authentification.getPassword().equals("admin")) {
                Algorithm algorithm = Algorithm.HMAC256("secret");
                String token = JWT.create()
                        .withIssuer("monappli")
                        .withClaim("username",authentification.getIdentifiant())
                        .sign(algorithm);
                return new ResponseEntity(token, HttpStatus.OK);
        }
        else {
            return new ResponseEntity<>(null, HttpStatus.FORBIDDEN);
        }
    }
}
