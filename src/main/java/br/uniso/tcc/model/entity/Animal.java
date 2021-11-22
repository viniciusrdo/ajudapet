package br.uniso.tcc.model.entity;

import javax.persistence.*;
import java.time.LocalDate;

@Table(name = "tbl_animal", indexes = {
        @Index(name = "cod_enfermidade_idx", columnList = "cod_enfermidade"),
        @Index(name = "cod_especie_idx", columnList = "cod_especie"),
        @Index(name = "cod_porte_idx", columnList = "cod_porte"),
        @Index(name = "cod_temperamento_idx", columnList = "cod_temperamento")
})
@Entity
public class Animal {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cod_animal", nullable = false)
    private Integer id;

    @Column(name = "nom_animal", length = 45)
    private String nomAnimal;

    @Column(name = "dat_nascimento")
    private LocalDate datNascimento;

    @Column(name = "dat_resgate")
    private LocalDate datResgate;

    @Column(name = "dsc_hist_animal")
    private String dscHistAnimal;

    @Column(name = "ind_operado")
    private Integer indOperado;

    @Column(name = "dsc_observacoes")
    private String dscObservacoes;

    @Column(name = "ind_restricao_mobilidade")
    private Integer indRestricaoMobilidade;

    @Column(name = "ind_hist_maus_tratos", nullable = false)
    private Integer indHistMausTratos;

    @Column(name = "ind_disponivel_adocao", nullable = false)
    private Integer indDisponivelAdocao;

    @ManyToOne
    @JoinColumn(name = "cod_especie")
    private TblEspecie codEspecie;

    @ManyToOne
    @JoinColumn(name = "cod_temperamento")
    private TblTemperamento codTemperamento;

    @ManyToOne
    @JoinColumn(name = "cod_porte")
    private TblPorte codPorte;

    @Column(name = "dat_modificacao")
    private LocalDate datModificacao;

    @Column(name = "dat_cadastro", nullable = false)
    private LocalDate datCadastro;

    @ManyToOne(optional = false)
    @JoinColumn(name = "cod_enfermidade", nullable = false)
    private TblEnfermidade codEnfermidade;

    public TblEnfermidade getCodEnfermidade() {
        return codEnfermidade;
    }

    public void setCodEnfermidade(TblEnfermidade codEnfermidade) {
        this.codEnfermidade = codEnfermidade;
    }

    public LocalDate getDatCadastro() {
        return datCadastro;
    }

    public void setDatCadastro(LocalDate datCadastro) {
        this.datCadastro = datCadastro;
    }

    public LocalDate getDatModificacao() {
        return datModificacao;
    }

    public void setDatModificacao(LocalDate datModificacao) {
        this.datModificacao = datModificacao;
    }

    public TblPorte getCodPorte() {
        return codPorte;
    }

    public void setCodPorte(TblPorte codPorte) {
        this.codPorte = codPorte;
    }

    public TblTemperamento getCodTemperamento() {
        return codTemperamento;
    }

    public void setCodTemperamento(TblTemperamento codTemperamento) {
        this.codTemperamento = codTemperamento;
    }

    public TblEspecie getCodEspecie() {
        return codEspecie;
    }

    public void setCodEspecie(TblEspecie codEspecie) {
        this.codEspecie = codEspecie;
    }

    public Integer getIndDisponivelAdocao() {
        return indDisponivelAdocao;
    }

    public void setIndDisponivelAdocao(Integer indDisponivelAdocao) {
        this.indDisponivelAdocao = indDisponivelAdocao;
    }

    public Integer getIndHistMausTratos() {
        return indHistMausTratos;
    }

    public void setIndHistMausTratos(Integer indHistMausTratos) {
        this.indHistMausTratos = indHistMausTratos;
    }

    public Integer getIndRestricaoMobilidade() {
        return indRestricaoMobilidade;
    }

    public void setIndRestricaoMobilidade(Integer indRestricaoMobilidade) {
        this.indRestricaoMobilidade = indRestricaoMobilidade;
    }

    public String getDscObservacoes() {
        return dscObservacoes;
    }

    public void setDscObservacoes(String dscObservacoes) {
        this.dscObservacoes = dscObservacoes;
    }

    public Integer getIndOperado() {
        return indOperado;
    }

    public void setIndOperado(Integer indOperado) {
        this.indOperado = indOperado;
    }

    public String getDscHistAnimal() {
        return dscHistAnimal;
    }

    public void setDscHistAnimal(String dscHistAnimal) {
        this.dscHistAnimal = dscHistAnimal;
    }

    public LocalDate getDatResgate() {
        return datResgate;
    }

    public void setDatResgate(LocalDate datResgate) {
        this.datResgate = datResgate;
    }

    public LocalDate getDatNascimento() {
        return datNascimento;
    }

    public void setDatNascimento(LocalDate datNascimento) {
        this.datNascimento = datNascimento;
    }

    public String getNomAnimal() {
        return nomAnimal;
    }

    public void setNomAnimal(String nomAnimal) {
        this.nomAnimal = nomAnimal;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}