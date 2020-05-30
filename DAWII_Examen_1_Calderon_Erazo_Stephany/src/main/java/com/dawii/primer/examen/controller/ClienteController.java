package com.dawii.primer.examen.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.dawii.primer.examen.models.entity.Cliente;
import com.dawii.primer.examen.models.entity.Tipo;
import com.dawii.primer.examen.models.service.IClienteService;
import com.dawii.primer.examen.models.service.ITipoService;

@Controller
public class ClienteController {

	
	@Autowired
	private IClienteService clienteservice;
	
	@Autowired
	private ITipoService tiposervice;
	
	@RequestMapping("/index")
	public String ver() {
		return "registraCliente";
	}
	
	@RequestMapping("/listarTipo")
	@ResponseBody
	public List<Tipo> listarTipo() {
		return tiposervice.listTipo();
	}
	
	
	@RequestMapping("/registrarCliente")
	public String save(Cliente reg, HttpSession session) {
		Cliente obj = clienteservice.save(reg);
		if (obj == null) {
			session.setAttribute("MENSAJE", "Registro Erroneo");
		} else {
			session.setAttribute("MENSAJE", "Registro Exitoso");
		}
		return "redirect:index";
	}
	
}
