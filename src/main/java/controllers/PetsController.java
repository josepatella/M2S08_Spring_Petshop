package controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import service.PetService;

@RestController
@RequestMapping("/pets")
public class PetsController {
@Autowired
    PetService service;
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
