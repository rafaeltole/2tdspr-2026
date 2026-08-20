package br.com.fiap;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicLong;

@RestController
@RequestMapping("/alunos")
public class AlunoResource {

    private final List<Aluno> alunos = new ArrayList<>();
    private final AtomicLong geradorCodidoAluno = new AtomicLong();

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity cadastrar(@RequestBody Aluno novoAluno) {
        novoAluno.setCodigo(geradorCodidoAluno.incrementAndGet());
        alunos.add(novoAluno);
        return ResponseEntity.status(HttpStatus.CREATED.value()).build();
    }

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<Aluno>> consultar() {
        return ResponseEntity.ok(alunos);
    }

    @GetMapping(path = "/{codigo}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Aluno> consultarPorCodigo(@PathVariable Long codigo) {
        Optional<Aluno> retornoConsulta = alunos.stream().filter(aluno -> aluno.getCodigo().equals(codigo)).findFirst();

        if (retornoConsulta.isPresent()) {
            return ResponseEntity.ok(retornoConsulta.get());
        }

        return ResponseEntity.notFound().build();
    }

    @GetMapping(params = "nome", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<Aluno>> consultarPorNome(@RequestParam String nome) {
        List<Aluno> alunosCadastrados = alunos.stream().filter(aluno -> aluno.getNome().equals(nome)).toList();
        return ResponseEntity.ok(alunosCadastrados);
    }

    @PutMapping(path = "/{codigo}", consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity atualizar(@PathVariable Long codigo, @RequestBody Aluno aluno) {
        Optional<Aluno> retornoConsulta = alunos.stream().filter(alunoCadastrado -> alunoCadastrado.getCodigo().equals(codigo)).findFirst();
        if (retornoConsulta.isPresent()) {
            Aluno alunoCadastrado = retornoConsulta.get();
            alunoCadastrado.setNome(aluno.getNome());
        }
        return ResponseEntity.ok().build();
    }

    @DeleteMapping(path = "/{codigo}")
    public ResponseEntity<Object> remover(@PathVariable Long codigo) {
        Optional<Aluno> retornoConsulta = alunos.stream().filter(alunoCadastrado -> alunoCadastrado.getCodigo().equals(codigo)).findFirst();
        if (retornoConsulta.isPresent()) {
            alunos.removeIf(aluno -> aluno.getCodigo().equals(codigo));
        }
        return ResponseEntity.noContent().build();
    }

}
