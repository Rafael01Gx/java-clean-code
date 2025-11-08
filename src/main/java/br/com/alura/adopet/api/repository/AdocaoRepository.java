package br.com.alura.adopet.api.repository;

import br.com.alura.adopet.api.model.Adocao;
import br.com.alura.adopet.api.model.StatusAdocao;
import jakarta.validation.constraints.NotNull;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AdocaoRepository extends JpaRepository<Adocao, Long> {

    Boolean existsByPetIdAndStatusOrStatus(@NotNull Long aLong, StatusAdocao statusAdocao, StatusAdocao statusAdocao1);

    List<Adocao> findAllByIdTutor(@NotNull Long aLong);
}
