package net.atos.repository;

import net.atos.model.Partenaire;
import net.atos.model.PartenaireAcad;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
@Repository
public interface PartenaireAcadRepository extends JpaRepository<PartenaireAcad, Long> {
    Optional<PartenaireAcad> findPartenaireAcadById(Long id);
    void deletePartenaireAcadById(Long id);
}