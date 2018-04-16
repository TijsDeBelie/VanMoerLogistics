package be.odisee.brainstorm.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import be.odisee.brainstorm.domain.Klant;

public interface PersoonRepository extends JpaRepository<Klant, Integer> {
	Klant findByEmailadres(String email);
}
