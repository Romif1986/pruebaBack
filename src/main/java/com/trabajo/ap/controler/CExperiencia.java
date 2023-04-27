
package com.trabajo.ap.controler;

import com.trabajo.ap.entity.Experiencia;
import com.trabajo.ap.service.SExperiencia;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("experiencia")
@CrossOrigin(origins = "http://localhost:4200")

public class CExperiencia {
     @Autowired
    SExperiencia expeServ;
    
    @GetMapping ("/lista")
    @ResponseBody
    public List <Experiencia> verExperiencia(){
        return expeServ.verExperiencia();
    }
     
     @GetMapping ("/ver/{id}")
    @ResponseBody
     public Experiencia verExperiencia(@PathVariable int id){
         return expeServ.buscarExperiencia(id);
     }
     
     @PostMapping("/crear")
     public String agregarExperiencia(@RequestBody Experiencia expe){
         expeServ.crearExperiencia(expe);
         return "La experiencia laboral fue creada correctamente";
     }
    
    @DeleteMapping ("/borrar/{id}")
    public String eliminarExperiencia(@PathVariable int id){
        expeServ.borrarExperiencia(id);
        return "La experiencia laboral fue borrada correctamente";
    }
    @PutMapping ("/editar/{id}")
    public void updateExperiencia(@RequestBody Experiencia expe){
       expeServ.editarExperiencia(expe);
    }
}
