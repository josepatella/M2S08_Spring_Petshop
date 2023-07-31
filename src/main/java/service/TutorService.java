package service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.TutorRepository;

@Service
public class TutorService {
    @Autowired private TutorRepository repository;
}
