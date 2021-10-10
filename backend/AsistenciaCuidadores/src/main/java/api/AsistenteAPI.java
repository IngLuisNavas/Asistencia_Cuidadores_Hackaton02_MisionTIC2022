package api;

import dao.AsistenteDAO;
import model.Asistente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("asistentes")
public class AsistenteAPI {

    @Autowired
    private AsistenteDAO asistenteDAO;

    @PostMapping("/crear")
    public void crear(@RequestBody Asistente asistente) {
        asistenteDAO.save(asistente);
    }

    @GetMapping("/listar")
    public List<Asistente> listar() {
        return asistenteDAO.findAll();
    }

    @PutMapping("/actualizar")
    public void actualizar(@RequestBody Asistente asistente) {
        asistenteDAO.save(asistente);
    }

    @DeleteMapping("/eliminar/{id}")
    public void eliminar(@PathVariable("id") Integer id) {
        asistenteDAO.deleteById(id);
    }
}
