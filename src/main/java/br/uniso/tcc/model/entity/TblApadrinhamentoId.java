package br.uniso.tcc.model.entity;

import org.hibernate.Hibernate;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class TblApadrinhamentoId implements Serializable {
    private static final long serialVersionUID = -5807445081062491788L;
    @Column(name = "cod_padrinho", nullable = false)
    private Integer codPadrinho;
    @Column(name = "cod_animal", nullable = false)
    private Integer codAnimal;

    public Integer getCodAnimal() {
        return codAnimal;
    }

    public void setCodAnimal(Integer codAnimal) {
        this.codAnimal = codAnimal;
    }

    public Integer getCodPadrinho() {
        return codPadrinho;
    }

    public void setCodPadrinho(Integer codPadrinho) {
        this.codPadrinho = codPadrinho;
    }

    @Override
    public int hashCode() {
        return Objects.hash(codAnimal, codPadrinho);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        TblApadrinhamentoId entity = (TblApadrinhamentoId) o;
        return Objects.equals(this.codAnimal, entity.codAnimal) &&
                Objects.equals(this.codPadrinho, entity.codPadrinho);
    }
}