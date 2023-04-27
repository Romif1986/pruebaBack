/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.trabajo.ap.Security.Service;

import com.trabajo.ap.Security.Entity.Rol;
import com.trabajo.ap.Security.Enums.RolNombre;
import com.trabajo.ap.Security.Repository.RolRepository;
import jakarta.transaction.Transactional;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class RolService {
    @Autowired
    RolRepository irolRepository;
    
    public Optional<Rol> getByRolNombre(RolNombre rolNombre){
        return irolRepository.findByRolNombre(rolNombre);
        
    }
    public void save(Rol rol){
        irolRepository.save(rol);
    }
}
