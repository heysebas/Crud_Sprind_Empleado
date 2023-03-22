package com.empleado.empleado.service;

import java.util.List;

import com.empleado.empleado.entity.Departamento;
import com.empleado.empleado.repositorie.DepartamentoRepositorio;


public interface DepartamentoServicio extends DepartamentoRepositorio {
    public List<Departamento> listarTodosLosDepartamentos();

    public Departamento guardarDepartamento(Departamento departamento);

    public Departamento obtenerDepartamentoPorId(Long id);

    public Departamento actualizarDepartamento(Departamento departamento);

    public void eliminarDepartamento(Long id);

}
