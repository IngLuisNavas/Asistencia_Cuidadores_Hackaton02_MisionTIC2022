package api;

import dao.ServicioDAO;
import model.Servicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("servicios")
public class ServicioAPI {

    @Autowired
    private ServicioDAO servicioDAO;

    @PostMapping("/crear")
    public void crear(@RequestBody Servicio servicio) {
        servicioDAO.save(servicio);
    }

    @GetMapping("/listar")
    public List<Servicio> listar() {
        return servicioDAO.findAll();
    }

    @PutMapping("/actualizar")
    public void actualizar(@RequestBody Servicio servicio) {
        servicioDAO.save(servicio);
    }

    @DeleteMapping("/eliminar/{id}")
    public void eliminar(@PathVariable("id") Integer id) {
        servicioDAO.deleteById(id);
    }
}
