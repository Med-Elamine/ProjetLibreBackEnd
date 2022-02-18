package net.atos.service;

import net.atos.exception.PartenaireNotFoundException;
import net.atos.model.PartenaireAcad;
import net.atos.model.PartenaireIndus;
import net.atos.repository.PartenaireAcadRepository;
import net.atos.repository.PartenaireIndusRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PartenaireAcadService {
    @Autowired
    PartenaireAcadRepository partenaireRepo;

    public PartenaireAcad addPartenaire(PartenaireAcad partenaire) {
        return partenaireRepo.save(partenaire);
    }

    public PartenaireAcad updatePartenaire(PartenaireAcad partenaire) {
        return partenaireRepo.save(partenaire);
    }

    public PartenaireAcad findPartenaireById(Long id) {
        return partenaireRepo.findPartenaireAcadById(id).orElseThrow(() -> new PartenaireNotFoundException("Partenaire by id : " + id + " was not found."));
    }

    public List<PartenaireAcad> findAllPartenaires() {
        return partenaireRepo.findAll();
    }

    public void deletePartenaireById(Long id) {
        partenaireRepo.deletePartenaireAcadById(id);
    }
}

