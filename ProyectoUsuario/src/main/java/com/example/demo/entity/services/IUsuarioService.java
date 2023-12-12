package com.example.demo.entity.services;

import java.util.List;

import com.example.demo.entity.Usuario;

public interface IUsuarioService {

	public List<Usuario> findAll();

	public Usuario save(Usuario usuario);

	public Usuario findById(Long id);

	public void delete(Long id);
}
