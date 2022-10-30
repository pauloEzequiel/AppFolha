package br.edu.infnet.appfolha.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.edu.infnet.appfolha.entidades.Beneficio;

@Repository
public interface BeneficioRepository extends JpaRepository<Beneficio,Integer> {

}
