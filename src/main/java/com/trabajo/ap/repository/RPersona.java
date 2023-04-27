
package com.trabajo.ap.repository;

import com.trabajo.ap.entity.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface RPersona extends JpaRepository <Persona, Integer>{
     
}
