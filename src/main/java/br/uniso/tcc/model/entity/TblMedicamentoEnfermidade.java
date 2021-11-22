package br.uniso.tcc.model.entity;

import javax.persistence.*;
import java.time.LocalDate;

@Table(name = "tbl_medicamento_enfermidade", indexes = {
        @Index(name = "cod_enfermidade_idx", columnList = "cod_enfermidade")
})
@Entity
public class TblMedicamentoEnfermidade {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cod_medicamento_enfermidade", nullable = false)
    private Integer id;

    @ManyToOne(optional = false)
    @JoinColumn(name = "cod_enfermidade", nullable = false)
    private TblEnfermidade codEnfermidade;

    @Column(name = "cod_medicamento", nullable = false)
    private Integer codMedicamento;

    @Column(name = "dat_cadastro")
    private LocalDate datCadastro;

    public LocalDate getDatCadastro() {
        return datCadastro;
    }

    public void setDatCadastro(LocalDate datCadastro) {
        this.datCadastro = datCadastro;
    }

    public Integer getCodMedicamento() {
        return codMedicamento;
    }

    public void setCodMedicamento(Integer codMedicamento) {
        this.codMedicamento = codMedicamento;
    }

    public TblEnfermidade getCodEnfermidade() {
        return codEnfermidade;
    }

    public void setCodEnfermidade(TblEnfermidade codEnfermidade) {
        this.codEnfermidade = codEnfermidade;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}