package br.uniso.tcc.model.entity;

import javax.persistence.*;
import java.time.LocalDate;

@Table(name = "tbl_apadrinhamento", indexes = {
        @Index(name = "cod_animal_idx", columnList = "cod_animal")
})
@Entity
public class TblApadrinhamento {
    @EmbeddedId
    private TblApadrinhamentoId id;

    @Column(name = "dsc_apadrinhamento")
    private String dscApadrinhamento;

    @Column(name = "dat_apadrinhamento", nullable = false)
    private LocalDate datApadrinhamento;

    @Column(name = "dat_cadastro")
    private LocalDate datCadastro;

    public LocalDate getDatCadastro() {
        return datCadastro;
    }

    public void setDatCadastro(LocalDate datCadastro) {
        this.datCadastro = datCadastro;
    }

    public LocalDate getDatApadrinhamento() {
        return datApadrinhamento;
    }

    public void setDatApadrinhamento(LocalDate datApadrinhamento) {
        this.datApadrinhamento = datApadrinhamento;
    }

    public String getDscApadrinhamento() {
        return dscApadrinhamento;
    }

    public void setDscApadrinhamento(String dscApadrinhamento) {
        this.dscApadrinhamento = dscApadrinhamento;
    }

    public TblApadrinhamentoId getId() {
        return id;
    }

    public void setId(TblApadrinhamentoId id) {
        this.id = id;
    }
}