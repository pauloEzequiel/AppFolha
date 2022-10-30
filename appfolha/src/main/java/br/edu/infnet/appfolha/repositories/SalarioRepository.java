package br.edu.infnet.appfolha.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.edu.infnet.appfolha.entidades.Salario;

@Repository
public interface SalarioRepository extends JpaRepository<Salario,Integer> {

}
