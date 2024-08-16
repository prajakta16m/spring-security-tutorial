package com.springtutorial.security.service;

import org.springframework.security.oauth2.jwt.JwtEncoder;
import org.springframework.stereotype.Service;

import ch.qos.logback.core.subst.Token;

@Service
public class TokenService {

  private final JwtEncoder jwtEncoder;

  public TokenService(JwtEncoder jwtEncoder) {
    this.jwtEncoder = jwtEncoder;
  }
}
