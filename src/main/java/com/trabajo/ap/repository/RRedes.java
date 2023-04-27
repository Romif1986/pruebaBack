
package com.trabajo.ap.repository;

import com.trabajo.ap.entity.Redes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RRedes extends JpaRepository <Redes, Integer>{
    
}
