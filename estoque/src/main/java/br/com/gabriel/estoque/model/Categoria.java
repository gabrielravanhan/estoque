package br.com.gabriel.estoque.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name="categoria")
public class Categoria {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nomecategoria;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNomecategoria() {
        return nomecategoria;
    }

    public void setNomecategoria(String nomecategoria) {
        this.nomecategoria = nomecategoria;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Categoria categoria = (Categoria) o;
        return getId().equals(categoria.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }
}
