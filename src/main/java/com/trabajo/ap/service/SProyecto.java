
package com.trabajo.ap.service;

import com.trabajo.ap.entity.Proyecto;
import com.trabajo.ap.repository.RProyecto;
import jakarta.transaction.Transactional;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class SProyecto {
    @Autowired
    public RProyecto proRepo;
    
    public List <Proyecto> verProyecto(){
        List<Proyecto>listaProyecto = proRepo.findAll();
        return listaProyecto;
    }
    
     public void crearProyecto(Proyecto pro){
        proRepo.save(pro);
        
    }
     public void borrarProyecto(int id){
        proRepo.deleteById(id);
    }
     public Proyecto buscarProyecto(int id){
        Proyecto pro = proRepo.findById(id).orElse(null);
        return pro;
    }
     public void editarProyecto(Proyecto pro){
        proRepo.save(pro);
        
    }
}
