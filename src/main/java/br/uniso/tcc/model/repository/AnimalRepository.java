package br.uniso.tcc.model.repository;

import br.uniso.tcc.model.entity.Animal;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AnimalRepository extends JpaRepository<Animal, Integer> {
}