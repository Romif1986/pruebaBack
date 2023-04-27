
package com.trabajo.ap.controler;

import com.trabajo.ap.entity.Redes;
import com.trabajo.ap.service.SRedes;
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
@RequestMapping("redes")
@CrossOrigin(origins = "http://localhost:4200")
public class CRedes {
    @Autowired
    SRedes redesServ;
    
    @GetMapping ("/lista")
    @ResponseBody
    public List <Redes> verRedes(){
        return redesServ.verRedes();
    }
     
     @GetMapping ("/ver/{id}")
    @ResponseBody
     public Redes verRedes(@PathVariable int id){
         return redesServ.buscarRedes(id);
     }
     
     @PostMapping("/crear")
     public String agregarRedes(@RequestBody Redes red){
         redesServ.crearRedes(red);
         return "La red fue creada correctamente";
     }
    
    @DeleteMapping ("/borrar/{id}")
    public String eliminarRedes(@PathVariable int id){
        redesServ.borrarRedes(id);
        return "La red fue borrada correctamente";
    }
    @PutMapping ("/editar/{id}")
    public void updateRedes(@RequestBody Redes red){
       redesServ.editarRedes(red);
    }
}
