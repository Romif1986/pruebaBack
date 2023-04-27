
package com.trabajo.ap.service;

import com.trabajo.ap.entity.Educacion;
import com.trabajo.ap.repository.REducacion;
import jakarta.transaction.Transactional;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class SEducacion {
     @Autowired
    public REducacion eduRepo;


 public List <Educacion> verEducacion(){
        List<Educacion> listaEducacion = eduRepo.findAll();
        return listaEducacion;
    }
    
   
    public void crearEducacion(Educacion edu){
        eduRepo.save(edu);
        
    }
    
    public void borrarEducacion(int id){
        eduRepo.deleteById(id);
    }
    
    public Educacion buscarEducacion(int id){
        Educacion edu = eduRepo.findById(id).orElse(null);
        return edu;
    }
    public void editarEducacion(Educacion edu){
        eduRepo.save(edu);
        
    }
}