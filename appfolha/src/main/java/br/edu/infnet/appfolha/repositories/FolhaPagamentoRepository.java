package br.edu.infnet.appfolha.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.edu.infnet.appfolha.entidades.FolhaPagamento;

@Repository
public interface FolhaPagamentoRepository extends JpaRepository<FolhaPagamento,Integer> {

}
