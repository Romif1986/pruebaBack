/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.trabajo.ap.Security.Repository;

import com.trabajo.ap.Security.Entity.Rol;
import com.trabajo.ap.Security.Enums.RolNombre;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RolRepository extends JpaRepository<Rol, Integer> {
 Optional<Rol> findByRolNombre(RolNombre rolNombre);   
 
}
