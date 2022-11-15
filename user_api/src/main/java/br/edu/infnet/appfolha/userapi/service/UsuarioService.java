package br.edu.infnet.appfolha.userapi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.appfolha.userapi.Repository.UsuarioRepository;
import br.edu.infnet.appfolha.userapi.entidades.Usuario;

@Service
public class UsuarioService {
	
	@Autowired
	private UsuarioRepository usuarioRepository;

	public void incluir(Usuario usuario) {
		usuarioRepository.save(usuario);
	}

	public void excluir(Integer id) {
		usuarioRepository.deleteById(id);
	}

	public List<Usuario> obterLista(){

		return (List<Usuario>) usuarioRepository.findAll();
	}

	public Usuario validar(String email, String senha) {
		
		Usuario usuario = usuarioRepository.findByEmail(email);
		
		if(usuario != null && usuario.getSenha().equals(senha)) {
			return usuario;
		}
		
		return null;
	}
}
