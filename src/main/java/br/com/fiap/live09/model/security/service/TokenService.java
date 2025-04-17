package br.com.fiap.live09.model.security.service;


import br.com.fiap.live09.model.User;
import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.exceptions.JWTVerificationException;
import org.springframework.stereotype.Service;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneOffset;

@Service
public class TokenService {

    private static final String SECRET = "fiap";

    public String createToken(User user) {

        Algorithm algorithm = Algorithm.HMAC256(SECRET);

        Instant expiresAt = LocalDateTime
                .now()
                .plusHours(2)
                .toInstant(ZoneOffset.of("-03:00"));

        String token = JWT.create()
                .withIssuer("live09")
                .withSubject(user.getUsername())
                .withExpiresAt(expiresAt)
                .sign(algorithm);

        return token;
    }

    public String validateToken(String token) {
        try{
            Algorithm algorithm = Algorithm.HMAC256(SECRET);

            return JWT.require(algorithm)
                    .withIssuer("live09")
                    .build()
                    .verify(token)
                    .getSubject();
        } catch (JWTVerificationException e) {
            return "";
        }

    }

}