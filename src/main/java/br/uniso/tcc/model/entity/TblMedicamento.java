package br.uniso.tcc.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "tbl_medicamento")
@Entity
public class TblMedicamento {
    @Id
    @Column(name = "cod_medicamento", nullable = false)
    private Integer id;

    @Column(name = "nom_medicamento", nullable = false)
    private String nomMedicamento;

    @Column(name = "ind_medicamento_continuo", nullable = false)
    private Integer indMedicamentoContinuo;

    public Integer getIndMedicamentoContinuo() {
        return indMedicamentoContinuo;
    }

    public void setIndMedicamentoContinuo(Integer indMedicamentoContinuo) {
        this.indMedicamentoContinuo = indMedicamentoContinuo;
    }

    public String getNomMedicamento() {
        return nomMedicamento;
    }

    public void setNomMedicamento(String nomMedicamento) {
        this.nomMedicamento = nomMedicamento;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}