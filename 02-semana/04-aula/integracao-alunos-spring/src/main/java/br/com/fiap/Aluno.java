package br.com.fiap;

public class Aluno {

    private Long codigo;
    private String rm;
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
