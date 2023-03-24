package com.empleado.empleado.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.empleado.empleado.entity.Departamento;
import com.empleado.empleado.service.DepartamentoServicio;

@Controller
public class DepartamentoController {

    @Autowired
    private DepartamentoServicio servicio;

    @GetMapping({ "/departamentos"})
    public String listarEmpleados(Model modelo) {
        modelo.addAttribute("departamentos", servicio.listarTodosLosDepartamentos());
        return "departamentos"; // nos retorna al archivo empleados
    }
    
    @GetMapping("/departamentos/nuevo")
    public String mostrarFormularioDeRegistrtarDepartamento(Model modelo) {
        Departamento departamento = new Departamento();
        modelo.addAttribute("departamento", departamento);
        return "crear_departamento";
    }

    @PostMapping("/departamentos")
    public String guardarDepartamento(@ModelAttribute("departamento") Departamento departamento) {
        servicio.guardarDepartamento(departamento);
        return "redirect:/departamentos";
    }

    @GetMapping("/departamentos/editar/{id}")
    public String mostrarFormularioDeEditar(@PathVariable Long id, Model modelo) {
        modelo.addAttribute("departamento", servicio.obtenerDepartamentoPorId(id));
        return "editar_departamento";
    }

    @PostMapping("/departamentos/{id}")
    public String actualizarEstudiante(@PathVariable Long id, @ModelAttribute("departamento") Departamento departamento,
                                       Model modelo) {
        Departamento departamentoExistente = servicio.obtenerDepartamentoPorId(id);
        departamentoExistente.setCodigo(id);
    
        departamentoExistente.setNombre(departamento.getNombre());
 

        servicio.actualizarDepartamento(departamentoExistente);
        return "redirect:/departamentos";
    }

    @GetMapping("/departamentos/{id}")
    public String eliminarDepartamento(@PathVariable Long id) {
        servicio.eliminarDepartamento(id);
        return "redirect:/departamentos";
    }
    
}
