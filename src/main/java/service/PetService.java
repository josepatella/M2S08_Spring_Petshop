package service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.PetRepository;

@Service
public class PetService {
    @Autowired private PetRepository repository;
}
