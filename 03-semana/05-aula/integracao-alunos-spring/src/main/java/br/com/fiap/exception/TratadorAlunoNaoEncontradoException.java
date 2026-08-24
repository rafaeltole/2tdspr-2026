package br.com.fiap.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ProblemDetail;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class TratadorAlunoNaoEncontradoException {

    @ExceptionHandler(AlunoNaoEncontradoException.class)
    public ProblemDetail tratar(AlunoNaoEncontradoException e) {
        ProblemDetail problemDetail = ProblemDetail.forStatus(HttpStatus.NOT_FOUND);
        problemDetail.setTitle("Aluno não encontrado");
        problemDetail.setDetail(e.getMessage());
        return problemDetail;
    }

}
