package br.com.fiap.dto;

import br.com.fiap.entity.Aluno;
import jakarta.validation.constraints.NotBlank;

public record AlunoRequest(
        @NotBlank String rm,
        @NotBlank String nome
) {
    public Aluno toEntity() {
        Aluno aluno = new Aluno();
        aluno.setNome(nome);
        aluno.setRm(rm);
        return aluno;
    }
}
