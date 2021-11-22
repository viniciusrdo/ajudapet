package br.uniso.tcc.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDate;

@Table(name = "tbl_donativo")
@Entity
public class TblDonativo {
    @Id
    @Column(name = "cod_donativo", nullable = false)
    private Integer id;

    @Column(name = "nom_donativo")
    private String nomDonativo;

    @Column(name = "tbl_Donativocol", length = 45)
    private String tblDonativocol;

    @Column(name = "dat_cadastro")
    private LocalDate datCadastro;

    public LocalDate getDatCadastro() {
        return datCadastro;
    }

    public void setDatCadastro(LocalDate datCadastro) {
        this.datCadastro = datCadastro;
    }

    public String getTblDonativocol() {
        return tblDonativocol;
    }

    public void setTblDonativocol(String tblDonativocol) {
        this.tblDonativocol = tblDonativocol;
    }

    public String getNomDonativo() {
        return nomDonativo;
    }

    public void setNomDonativo(String nomDonativo) {
        this.nomDonativo = nomDonativo;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}