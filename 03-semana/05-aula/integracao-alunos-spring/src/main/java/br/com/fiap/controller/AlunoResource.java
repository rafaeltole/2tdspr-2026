package br.com.fiap.controller;

import br.com.fiap.dto.AlunoRequest;
import br.com.fiap.entity.Aluno;
import br.com.fiap.service.AlunoService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/alunos")
public class AlunoResource {

    private AlunoService alunoService;

    public AlunoResource(AlunoService alunoService) {
        this.alunoService = alunoService;
    }

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity cadastrar(@Valid @RequestBody AlunoRequest novoAluno) {
        alunoService.cadastrar(novoAluno);
        return ResponseEntity.status(HttpStatus.CREATED.value()).build();
    }

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Iterable<Aluno>> consultar() {
        Iterable<Aluno> alunosCadastrados = alunoService.consultar();
        return ResponseEntity.ok(alunosCadastrados);
    }

    @GetMapping(path = "/{codigo}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Aluno> consultarPorCodigo(@PathVariable Long codigo) {
        Aluno aluno = alunoService.consultarPorCodigo(codigo);
        return ResponseEntity.ok(aluno);
    }

    @GetMapping(params = "nome", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<Aluno>> consultarPorNome(@RequestParam String nome) {
        List<Aluno> alunosCadastrados = alunoService.consultarPorNome(nome);
        return ResponseEntity.ok(alunosCadastrados);
    }

    @PutMapping(path = "/{codigo}", consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity atualizar(@PathVariable Long codigo, @RequestBody Aluno aluno) {
        alunoService.atualizar(codigo, aluno);
        return ResponseEntity.ok().build();
    }

    @DeleteMapping(path = "/{codigo}")
    public ResponseEntity<Object> remover(@PathVariable Long codigo) {
        alunoService.remover(codigo);
        return ResponseEntity.noContent().build();
    }

}
