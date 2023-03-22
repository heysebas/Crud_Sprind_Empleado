package com.empleado.empleado.repositorie;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.empleado.empleado.entity.Empleado;

@Repository
public interface EmpleadoRepositorio extends JpaRepository<Empleado, Long> {
 
}
