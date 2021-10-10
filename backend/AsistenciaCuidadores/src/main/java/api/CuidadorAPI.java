package api;

import dao.CuidadorDAO;
import model.Cuidador;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("cuidadores")
public class CuidadorAPI {

    @Autowired
    private CuidadorDAO cuidadorDAO;

    @PostMapping("/crear")
    public void crear(@RequestBody Cuidador cuidador) {
        cuidadorDAO.save(cuidador);
    }

    @GetMapping("/listar")
    public List<Cuidador> listar() {
        return cuidadorDAO.findAll();
    }

    @PutMapping("/actualizar")
    public void actualizar(@RequestBody Cuidador cuidador) {
        cuidadorDAO.save(cuidador);
    }

    @DeleteMapping("/eliminar/{id}")
    public void eliminar(@PathVariable("id") Integer id) {
        cuidadorDAO.deleteById(id);
    }
}
