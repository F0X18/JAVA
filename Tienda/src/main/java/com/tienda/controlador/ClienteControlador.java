package com.tienda.controlador;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import com.tienda.dao.ClienteDAO;
import com.tienda.entidades.Cliente;
@Controller
@RequestMapping("/cliente")
public class ClienteControlador {
// inyección de un objeto con la interfaz ClienteDAO
@Autowired
private ClienteDAO clienteDAO;
@RequestMapping("/lista")
public String listaClientes(Model model) {
// obtiene los clientes
List<Cliente> clientes = clienteDAO.getClientes();
// se añaden los clientes al modelo
model.addAttribute("clientes", clientes);
return "lista-clientes";
}
}