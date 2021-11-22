package br.uniso.tcc.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "tbl_endereco_benfeitor")
@Entity
public class TblEnderecoBenfeitor {
    @Id
    @Column(name = "cod_endereco", nullable = false)
    private Integer id;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}