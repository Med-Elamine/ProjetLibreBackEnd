package net.atos.controller;

import net.atos.model.Partenaire;
import net.atos.model.PartenaireAcad;
import net.atos.service.PartenaireAcadService;
import net.atos.service.PartenaireIndusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/api/partenaireacad")
public class PartenaireAcadController {
    @Autowired
    PartenaireAcadService partenaireService;

    @RequestMapping("")
    public String index() {
        return "hoho";
    }

    @PostMapping("/add")
    public ResponseEntity<PartenaireAcad> addModule(@RequestBody PartenaireAcad partenaire) {
        PartenaireAcad newPartenaire = partenaireService.addPartenaire(partenaire);
        return new ResponseEntity<>(newPartenaire, HttpStatus.OK);
    }

    @PutMapping("/update")
    public ResponseEntity<PartenaireAcad> updateModule(@RequestBody PartenaireAcad partenaire) {
        PartenaireAcad updatedPartenaire = partenaireService.updatePartenaire(partenaire);
        return new ResponseEntity<>(updatedPartenaire, HttpStatus.OK);
    }

    @Transactional
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deletePartenaireById(@PathVariable Long id) {
        partenaireService.deletePartenaireById(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping("/find/{id}")
    public ResponseEntity<PartenaireAcad> findPartenaireById(@PathVariable Long id) {
        PartenaireAcad foundPartenaire = partenaireService.findPartenaireById(id);
        return new ResponseEntity<>(foundPartenaire, HttpStatus.OK);
    }

    @GetMapping("/all")
    public ResponseEntity<List<PartenaireAcad>> findAllPartenaires() {
        List<PartenaireAcad> listPartenaire = partenaireService.findAllPartenaires();
        return new ResponseEntity<>(listPartenaire, HttpStatus.OK);
    }
}
