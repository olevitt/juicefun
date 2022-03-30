package com.intech.netflix.premierservice.controller;

import com.auth0.jwt.JWT;
import com.auth0.jwt.JWTVerifier;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.exceptions.JWTVerificationException;
import com.auth0.jwt.interfaces.DecodedJWT;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SPController {

    @GetMapping("/admin")
    public ResponseEntity admin(@RequestHeader String authorization) {
        String token = authorization.replaceAll("Bearer ","");
        try {
            Algorithm algorithm = Algorithm.HMAC256("secret");
            JWTVerifier verifier = JWT.require(algorithm)
                    .withIssuer("monappli")
                    .build(); //Reusable verifier instance
            DecodedJWT jwt = verifier.verify(token);
            return new ResponseEntity(jwt.getClaim("username").asString(), HttpStatus.OK);
        } catch (JWTVerificationException exception){
            return new ResponseEntity(null, HttpStatus.FORBIDDEN);
        }
    }
}
