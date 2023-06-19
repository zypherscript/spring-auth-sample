package com.example.authorizationserver;

import com.nimbusds.jose.jwk.source.JWKSource;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class KeyController {

  private final JWKSource jwkSource;

  public KeyController(JWKSource jwkSource) {
    this.jwkSource = jwkSource;
  }

  @PostMapping("/oauth2/jwks")
  String generate() {
    return jwkSource.toString();
  }
}
