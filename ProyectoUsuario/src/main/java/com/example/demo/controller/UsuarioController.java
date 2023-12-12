package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Usuario;
import com.example.demo.entity.services.IUsuarioService;

@RestController
@RequestMapping("/api") 
public class UsuarioController {
	
	@Autowired //
	private IUsuarioService usuarioservice;

	@GetMapping("/listaUsuario")
	public Object listadousuario() {
		return usuarioservice.findAll();

	}

	// buscar por id
		@GetMapping("/listaUsuario/{id}")
		public Usuario show(@PathVariable Long id) {
			return usuarioservice.findById(id);
		}

		// guardar categ
		@PostMapping("/guardarUsuario")
		@ResponseStatus(HttpStatus.CREATED)
		public Usuario create(@RequestBody Usuario usuario) {
			return usuarioservice.save(usuario);
		}

		// editar categ

		@PutMapping("/editaUsuario/{id}")
		@ResponseStatus(HttpStatus.CREATED)
		public Usuario update(@RequestBody Usuario usuario, @PathVariable Long id) {
		    Usuario usuarioactual = usuarioservice.findById(id);
		    usuarioactual.setNombre(usuario.getNombre());
		    usuarioactual.setClave(usuario.getClave());
		    usuarioactual.setEmail(usuario.getEmail());
		    usuarioactual.setEstado(usuario.getEstado());
		    return usuarioservice.save(usuarioactual);
		}


		//elimar
		@DeleteMapping("/eliminarUsuario/{id}")
		@ResponseStatus(HttpStatus.NO_CONTENT)
		public void Eliminar(@PathVariable Long id) {
			usuarioservice.delete(id);
		}

}
