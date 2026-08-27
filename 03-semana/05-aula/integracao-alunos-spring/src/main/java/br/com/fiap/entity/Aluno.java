package br.com.fiap.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;

@Entity
public class Aluno {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codigo;

    @Column(nullable = false)
    @NotBlank(message = "O rm deve ser informado")
    private String rm;

    @Column(nullable = false)
    @NotBlank(message = "O nome deve ser informado")
    private String nome;

    public Long getCodigo() {
        return codigo;
    }

    public void setCodigo(final Long codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(final String nome) {
        this.nome = nome;
    }

    public String getRm() {
        return rm;
    }

    public void setRm(final String rm) {
        this.rm = rm;
    }

}
