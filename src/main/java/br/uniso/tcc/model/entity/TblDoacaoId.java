package br.uniso.tcc.model.entity;

import org.hibernate.Hibernate;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class TblDoacaoId implements Serializable {
    private static final long serialVersionUID = -7011845449526764868L;
    @Column(name = "cod_doador", nullable = false)
    private Integer codDoador;
    @Column(name = "cod_doacao", nullable = false)
    private Integer codDoacao;

    public Integer getCodDoacao() {
        return codDoacao;
    }

    public void setCodDoacao(Integer codDoacao) {
        this.codDoacao = codDoacao;
    }

    public Integer getCodDoador() {
        return codDoador;
    }

    public void setCodDoador(Integer codDoador) {
        this.codDoador = codDoador;
    }

    @Override
    public int hashCode() {
        return Objects.hash(codDoador, codDoacao);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        TblDoacaoId entity = (TblDoacaoId) o;
        return Objects.equals(this.codDoador, entity.codDoador) &&
                Objects.equals(this.codDoacao, entity.codDoacao);
    }
}