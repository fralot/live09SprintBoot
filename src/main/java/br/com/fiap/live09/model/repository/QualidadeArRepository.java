package br.com.fiap.live09.model.repository;

import br.com.fiap.live09.model.QualidadeAr;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QualidadeArRepository extends JpaRepository<QualidadeAr, Long> {
}
