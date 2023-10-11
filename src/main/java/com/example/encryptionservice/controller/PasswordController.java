package com.example.encryptionservice.controller;

import com.example.encryptionservice.util.EncryptionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class PasswordController {

    @Autowired
    private EncryptionUtils encryptionUtils;

    @GetMapping("/encrypt/{plainText}")
    public String encryptPassword(@PathVariable String plainText) {
        String encryptedPassword = encryptionUtils.encodeBase64(plainText);
        return encryptedPassword;
    }

    @GetMapping("/decrypt/{password}")
    public String decryptPassword(@PathVariable String password) {
        String decodedPassword = encryptionUtils.decodeBase64(password);
        return decodedPassword;
    }
}


