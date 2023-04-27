
package com.trabajo.ap.service;

import com.trabajo.ap.entity.Redes;
import com.trabajo.ap.repository.RRedes;
import jakarta.transaction.Transactional;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class SRedes {
    @Autowired
    public RRedes redesRepo;
    
     public List <Redes> verRedes(){
        List<Redes> listaRedes = redesRepo.findAll();
        return listaRedes;
    }
     public void crearRedes(Redes red){
        redesRepo.save(red);
        
    }
    
    public void borrarRedes(int id){
        redesRepo.deleteById(id);
    }
    
    public Redes buscarRedes(int id){
        Redes red = redesRepo.findById(id).orElse(null);
        return red;
    }
    public void editarRedes(Redes red){
       redesRepo.save(red);
        
    }
    
}
