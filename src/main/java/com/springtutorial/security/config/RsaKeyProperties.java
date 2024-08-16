package com.springtutorial.security.config;

import java.security.interfaces.RSAPrivateKey;
import java.security.interfaces.RSAPublicKey;

import org.springframework.boot.context.properties.ConfigurationProperties;

/*
 * RSA is an asymmetric encryption technique that is mostly used when there are 2 different endpoints 
 * that are involved such as VPN client and server, SSH, etc. 
 * It uses two different keys as public and private keys.
 */

@ConfigurationProperties(prefix = "rsa")
public record RsaKeyProperties(RSAPublicKey publicKey, RSAPrivateKey privateKey) {
}
