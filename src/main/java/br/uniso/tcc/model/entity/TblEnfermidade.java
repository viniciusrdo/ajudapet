package br.uniso.tcc.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "tbl_enfermidade")
@Entity
public class TblEnfermidade {
    @Id
    @Column(name = "cod_enfermidade", nullable = false)
    private Integer id;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}