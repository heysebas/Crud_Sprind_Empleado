package com.empleado.empleado.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.empleado.empleado.entity.Departamento;
import com.empleado.empleado.repositorie.DepartamentoRepositorio;

@Service
public class DepartamentoServicioImpl implements DepartamentoServicio{
    @Autowired
    private DepartamentoRepositorio repositorio;
    @Override
    public List<Departamento> listarTodosLosDepartamentos() {

        return repositorio.findAll();
    }
    
    
}
