package com.softdev.linkbee;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;



@Controller
public class TestController {

	@GetMapping("/start")
	@ResponseBody
	public String hello() {
		return "Hello!";
	}

	Cliente cliente1 = new Cliente("João", 10, "joãoalves@xys.com", "4899145-7700", false);
	Cliente cliente2 = new Cliente("Maria", 10, "maria@xys.com", "4812145-7700", false);
	Cliente cliente3 = new Cliente("Francisco", 10, "franciso@xys.com", "4899145-2700", false);
	Cliente cliente4 = new Cliente("José", 10, "jose@xys.com", "5399145-7700", false);

	@GetMapping("/clientes")
	@ResponseBody
	public ArrayList<Cliente> buscarClientes() {

		ArrayList<Cliente> clientes = new ArrayList<>();
		clientes.add(cliente1);
		clientes.add(cliente2);
		clientes.add(cliente3);
		clientes.add(cliente4);
		return clientes;
		

	}

}
