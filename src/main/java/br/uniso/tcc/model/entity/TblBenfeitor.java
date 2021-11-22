package br.uniso.tcc.model.entity;

import javax.persistence.*;

@Table(name = "tbl_benfeitor", indexes = {
        @Index(name = "cod_endereco_idx", columnList = "cod_endereco")
})
@Entity
public class TblBenfeitor {
    @Id
    @Column(name = "cod_benfeitor", nullable = false)
    private Integer id;

    @Column(name = "nom_benfeitor")
    private String nomBenfeitor;

    @Column(name = "num_cpf_cnpj")
    private String numCpfCnpj;

    @Column(name = "ind_pessoa_fisica_juridica", length = 5)
    private String indPessoaFisicaJuridica;

    @ManyToOne
    @JoinColumn(name = "cod_endereco")
    private TblEnderecoBenfeitor codEndereco;

    public TblEnderecoBenfeitor getCodEndereco() {
        return codEndereco;
    }

    public void setCodEndereco(TblEnderecoBenfeitor codEndereco) {
        this.codEndereco = codEndereco;
    }

    public String getIndPessoaFisicaJuridica() {
        return indPessoaFisicaJuridica;
    }

    public void setIndPessoaFisicaJuridica(String indPessoaFisicaJuridica) {
        this.indPessoaFisicaJuridica = indPessoaFisicaJuridica;
    }

    public String getNumCpfCnpj() {
        return numCpfCnpj;
    }

    public void setNumCpfCnpj(String numCpfCnpj) {
        this.numCpfCnpj = numCpfCnpj;
    }

    public String getNomBenfeitor() {
        return nomBenfeitor;
    }

    public void setNomBenfeitor(String nomBenfeitor) {
        this.nomBenfeitor = nomBenfeitor;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}