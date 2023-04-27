/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.trabajo.ap.Security.Repository;

import com.trabajo.ap.Security.Entity.Usuario;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface iUsuarioRepository extends JpaRepository<Usuario, Integer> {
 Optional<Usuario> findByNombreUsuario(String nombreUsuario);
 boolean existisByNombreUsuario(String nombreUsuario);
 boolean existsByEmail(String email);
 
 
 
}
