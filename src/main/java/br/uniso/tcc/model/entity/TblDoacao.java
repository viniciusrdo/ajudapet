package br.uniso.tcc.model.entity;

import javax.persistence.*;
import java.time.LocalDate;

@Table(name = "tbl_doacao", indexes = {
        @Index(name = "cod_doacao_idx", columnList = "cod_doacao")
})
@Entity
public class TblDoacao {
    @EmbeddedId
    private TblDoacaoId id;

    @Column(name = "qtd_doado")
    private Integer qtdDoado;

    @Column(name = "dsc_doacao")
    private String dscDoacao;

    @Column(name = "dat_registro")
    private LocalDate datRegistro;

    public LocalDate getDatRegistro() {
        return datRegistro;
    }

    public void setDatRegistro(LocalDate datRegistro) {
        this.datRegistro = datRegistro;
    }

    public String getDscDoacao() {
        return dscDoacao;
    }

    public void setDscDoacao(String dscDoacao) {
        this.dscDoacao = dscDoacao;
    }

    public Integer getQtdDoado() {
        return qtdDoado;
    }

    public void setQtdDoado(Integer qtdDoado) {
        this.qtdDoado = qtdDoado;
    }

    public TblDoacaoId getId() {
        return id;
    }

    public void setId(TblDoacaoId id) {
        this.id = id;
    }
}