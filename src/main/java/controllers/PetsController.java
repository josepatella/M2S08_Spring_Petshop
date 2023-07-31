package controllers;

import org.springframework.web.bind.annotation.*;
@RestController
@RequestMapping("/pets")
public class PetsController {

        @PostMapping
        public void criar(){
            System.out.println("Create");
        }
        @GetMapping
        public void ler(){
            System.out.println("Read");
        }
        @PutMapping
        public void atualizar(){
            System.out.println("Update");
        }
        @DeleteMapping
        public void excluir(){
            System.out.println("Delete");
        }
    }
