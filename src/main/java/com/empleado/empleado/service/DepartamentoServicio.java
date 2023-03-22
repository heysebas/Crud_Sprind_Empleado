package com.empleado.empleado.service;

import java.util.List;

import com.empleado.empleado.entity.Departamento;

public interface DepartamentoServicio  {


    public List<Departamento> listarTodosLosDepartamentos();

    public Departamento guardarDepartamento(Departamento departamento);

    public Departamento obtenerDepartamentoPorId(Long id);

    public Departamento actualizarDepartamento(Departamento departamento);

    public void eliminarDepartamento(Long id);


}
