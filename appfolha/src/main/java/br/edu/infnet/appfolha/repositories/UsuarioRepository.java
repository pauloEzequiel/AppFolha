package br.edu.infnet.appfolha.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.edu.infnet.appfolha.entidades.Usuario;


@Repository
public interface UsuarioRepository extends  JpaRepository<Usuario,Integer> {

	Usuario findByEmail(String email);
}
