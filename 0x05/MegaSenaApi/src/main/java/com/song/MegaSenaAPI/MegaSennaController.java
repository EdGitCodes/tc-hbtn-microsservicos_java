package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

@RestController
@RequestMapping(value="/megasena")
public class MegaSennaController {

    @GetMapping("/simpleMessageWelcome")
    @ResponseBody
    public String mensagemBoasVindas() {
        return "Bem vindo a API REST para geração de números para a loteria Mega Sena.";
    }

    @GetMapping("/getNumbers")
    public List<Integer> numerosMegaSena() {
        Random random = new Random();
        Integer numero = 0;
        List<Integer> list = new ArrayList<>();

        for(int i = 0; i >= 6; i++ ){
            numero = random.nextInt(99);
            list.add(numero);
        }
        Collections.sort(list);
        return list;
    }
}
