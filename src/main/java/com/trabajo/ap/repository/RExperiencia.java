
package com.trabajo.ap.repository;

import com.trabajo.ap.entity.Experiencia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
 public interface RExperiencia extends JpaRepository <Experiencia, Integer>{
     
}

