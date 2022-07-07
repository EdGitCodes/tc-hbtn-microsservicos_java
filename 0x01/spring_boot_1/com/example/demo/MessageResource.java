package com.example.demo;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value="/messages")
public class MessageResource {

    @GetMapping("/simpleMessageWelcome")
    @ResponseBody
    public String simpleMessageWelcome() {
        return "BEM VINDO A AULA DE MICROSSERVIÇO USANDO SPRING BOOT !!!";
    }

    @GetMapping("/login")
    @ResponseBody
    public String login(@RequestParam String user, @RequestParam String password) {

        if (user.isBlank() || user.isEmpty() || password.isBlank() || password.isEmpty()) {
            return "USUÁRIO E SENHA NÃO INFORMADOS";
        } else if (user.length() <= 15 || password.length() <= 15) {
            return "USUÁRIO E SENHA INVÁLIDOS";
        }
        return "LOGIN EFETUADO COM SUCESSO !!!";
    }
}

