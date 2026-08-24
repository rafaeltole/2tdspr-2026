package br.com.fiap.service;

import br.com.fiap.entity.Aluno;
import br.com.fiap.exception.AlunoNaoEncontradoException;
import br.com.fiap.repository.AlunoRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class AlunoService {

    private AlunoRepository alunoRepository;

    public AlunoService(AlunoRepository alunoRepository) {
        this.alunoRepository = alunoRepository;
    }

    public void cadastrar(Aluno novoAluno) {
        alunoRepository.save(novoAluno);
    }

    public Iterable<Aluno> consultar() {
        return alunoRepository.findAll();
    }

    public Aluno consultarPorCodigo(Long codigo) {
        Optional<Aluno> retornoConsulta = alunoRepository.findById(codigo);
        if (retornoConsulta.isPresent()) {
            return retornoConsulta.get();
        }
        throw new AlunoNaoEncontradoException("Aluno [codigo=" + codigo + "] não encontrado.");
    }

    public List<Aluno> consultarPorNome(String nome) {
        return alunoRepository.findByNome(nome);
    }

    public void atualizar(Long codigo, Aluno aluno) {
        Optional<Aluno> retornoConsulta = alunoRepository.findById(codigo);
        if (retornoConsulta.isPresent()) {
            Aluno alunoCadastrado = retornoConsulta.get();
            alunoCadastrado.setNome(aluno.getNome());
            alunoRepository.save(alunoCadastrado);
        }
    }

    public void remover(Long codigo) {
        Optional<Aluno> retornoConsulta = alunoRepository.findById(codigo);
        if (retornoConsulta.isPresent()) {
            alunoRepository.deleteById(codigo);
        }
    }

}
