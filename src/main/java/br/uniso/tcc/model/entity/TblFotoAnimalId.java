package br.uniso.tcc.model.entity;

import org.hibernate.Hibernate;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class TblFotoAnimalId implements Serializable {
    private static final long serialVersionUID = -3960344103287852739L;
    @Column(name = "cod_foto", nullable = false)
    private Integer codFoto;
    @Column(name = "cod_animal", nullable = false)
    private Integer codAnimal;

    public Integer getCodAnimal() {
        return codAnimal;
    }

    public void setCodAnimal(Integer codAnimal) {
        this.codAnimal = codAnimal;
    }

    public Integer getCodFoto() {
        return codFoto;
    }

    public void setCodFoto(Integer codFoto) {
        this.codFoto = codFoto;
    }

    @Override
    public int hashCode() {
        return Objects.hash(codAnimal, codFoto);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        TblFotoAnimalId entity = (TblFotoAnimalId) o;
        return Objects.equals(this.codAnimal, entity.codAnimal) &&
                Objects.equals(this.codFoto, entity.codFoto);
    }
}