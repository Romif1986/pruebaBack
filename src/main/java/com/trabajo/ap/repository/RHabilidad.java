
package com.trabajo.ap.repository;

import com.trabajo.ap.entity.Habilidad;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RHabilidad extends JpaRepository <Habilidad, Integer>{
    
}
