
package com.trabajo.ap.service;

import com.trabajo.ap.entity.Habilidad;
import com.trabajo.ap.repository.RHabilidad;
import jakarta.transaction.Transactional;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class SHabilidad {
    @Autowired
    public RHabilidad habRepo;
    
    public List <Habilidad> verHabilidad(){
        List<Habilidad> listaHabilidad = habRepo.findAll();
        return listaHabilidad;
    }
    
    public void crearHabilidad(Habilidad hab){
        habRepo.save(hab);
    }
    
    public void borrarHabilidad(int id){
       habRepo.deleteById(id);
    }
    public Habilidad buscarHabilidad(int id){
        Habilidad hab= habRepo.findById(id).orElse(null);
        return hab;
    }
     public void editarHabilidad(Habilidad hab){
        habRepo.save(hab);
        
    }

    
    
}
