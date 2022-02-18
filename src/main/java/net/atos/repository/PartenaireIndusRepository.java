package net.atos.repository;

import net.atos.model.Partenaire;
import net.atos.model.PartenaireIndus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface PartenaireIndusRepository extends JpaRepository<PartenaireIndus, Long> {
    Optional<PartenaireIndus> findPartenaireIndusById(Long id);
    void deletePartenaireIndusById(Long id);
}
