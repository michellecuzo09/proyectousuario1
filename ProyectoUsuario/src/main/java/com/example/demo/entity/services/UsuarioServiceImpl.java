package com.example.demo.entity.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.dao.IUsuarioDao;
import com.example.demo.entity.Usuario;

@Service
public class UsuarioServiceImpl implements IUsuarioService {
	@Autowired
	private IUsuarioDao usuariorepository;

	@Override
	@Transactional(readOnly=true)
	public List<Usuario>findAll() {
		
		return (List<Usuario>)usuariorepository.findAll();
	}

	@Override
	@Transactional
	public Usuario save (Usuario usuario) {
		
		return usuariorepository.save(usuario);
	}

	@Override
	@Transactional(readOnly = true)
	public Usuario findById(Long id) {
		
		return usuariorepository.findById(id).orElse(null);
	}

	@Override
	public void delete(Long id) {
		usuariorepository.deleteById(id);
		
	}
}
