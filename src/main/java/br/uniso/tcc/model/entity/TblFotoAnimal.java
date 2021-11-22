package br.uniso.tcc.model.entity;

import javax.persistence.*;
import java.time.LocalDate;

@Table(name = "tbl_foto_animal", indexes = {
        @Index(name = "cod_animal_idx", columnList = "cod_animal")
})
@Entity
public class TblFotoAnimal {
    @EmbeddedId
    private TblFotoAnimalId id;

    @Column(name = "bin_foto", nullable = false)
    private byte[] binFoto;

    @Column(name = "dat_cadastro", nullable = false)
    private LocalDate datCadastro;

    public LocalDate getDatCadastro() {
        return datCadastro;
    }

    public void setDatCadastro(LocalDate datCadastro) {
        this.datCadastro = datCadastro;
    }

    public byte[] getBinFoto() {
        return binFoto;
    }

    public void setBinFoto(byte[] binFoto) {
        this.binFoto = binFoto;
    }

    public TblFotoAnimalId getId() {
        return id;
    }

    public void setId(TblFotoAnimalId id) {
        this.id = id;
    }
}