package UD26.Spring.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import UD26.Spring.dto.Usuario;

public interface IUsuarioDAO extends JpaRepository<Usuario, Long> {
	
	Usuario findByUsername(String username);

}
