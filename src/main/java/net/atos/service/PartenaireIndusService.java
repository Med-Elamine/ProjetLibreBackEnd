package net.atos.service;

import net.atos.exception.PartenaireNotFoundException;
import net.atos.model.Partenaire;
import net.atos.model.PartenaireIndus;
import net.atos.repository.PartenaireIndusRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PartenaireIndusService {
    @Autowired
    PartenaireIndusRepository partenaireRepo;

    public PartenaireIndus addPartenaire(PartenaireIndus partenaire) {
        return partenaireRepo.save(partenaire);
    }

    public PartenaireIndus updatePartenaire(PartenaireIndus partenaire) {
        return partenaireRepo.save(partenaire);
    }

    public PartenaireIndus findPartenaireById(Long id) {
        return partenaireRepo.findPartenaireIndusById(id).orElseThrow(() -> new PartenaireNotFoundException("Partenaire by id : " + id + " was not found."));
    }

    public List<PartenaireIndus> findAllPartenaires() {
        return partenaireRepo.findAll();
    }

    public void deletePartenaireById(Long id) {
        partenaireRepo.deletePartenaireIndusById(id);
    }
}

