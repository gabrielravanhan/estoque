package br.com.gabriel.estoque.resource;

import br.com.gabriel.estoque.model.Categoria;
import br.com.gabriel.estoque.repository.CategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CategoriaResource {

    @Autowired
    private CategoriaRepository categoriaRepository;

    public List<Categoria> listarTodasCategorias() {
        return categoriaRepository.findAll();
    }
}
