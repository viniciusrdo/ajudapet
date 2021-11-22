package br.uniso.tcc.model.entity;

import javax.persistence.*;

@Table(name = "tbl_especie")
@Entity
public class TblEspecie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cod_especie", nullable = false)
    private Integer id;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}