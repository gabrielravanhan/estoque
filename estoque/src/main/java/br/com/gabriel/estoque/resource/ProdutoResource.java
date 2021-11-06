package br.com.gabriel.estoque.resource;

import br.com.gabriel.estoque.model.Produto;
import br.com.gabriel.estoque.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/produtos")
public class ProdutoResource {

    @Autowired
    private ProdutoRepository produtoRepository;

    @GetMapping()
    public List<Produto> listarTodosProdutos() {
        return produtoRepository.findAll();
    }
}
