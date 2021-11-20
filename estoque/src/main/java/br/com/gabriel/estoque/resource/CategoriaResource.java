package br.com.gabriel.estoque.resource;

import br.com.gabriel.estoque.model.Categoria;
import br.com.gabriel.estoque.repository.CategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/categorias")
public class CategoriaResource {

    @Autowired
    private CategoriaRepository categoriaRepository;

    @GetMapping("/todas")
    public List<Categoria> listarTodasCategorias() {
        return categoriaRepository.findAll();
    }
}
