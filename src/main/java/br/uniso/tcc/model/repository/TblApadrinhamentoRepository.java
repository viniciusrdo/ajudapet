package br.uniso.tcc.model.repository;

import br.uniso.tcc.model.entity.TblApadrinhamento;
import br.uniso.tcc.model.entity.TblApadrinhamentoId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TblApadrinhamentoRepository extends JpaRepository<TblApadrinhamento, TblApadrinhamentoId> {
}