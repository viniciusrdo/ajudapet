package br.uniso.tcc.model.entity;

import javax.persistence.*;

@Table(name = "tbl_porte")
@Entity
public class TblPorte {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cod_porte", nullable = false)
    private Integer id;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}