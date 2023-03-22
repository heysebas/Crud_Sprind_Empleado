package com.empleado.empleado.repositorie;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.empleado.empleado.entity.Departamento;

@Repository
public interface DepartamentoRepositorio extends JpaRepository<Departamento, Long> {
    
}
