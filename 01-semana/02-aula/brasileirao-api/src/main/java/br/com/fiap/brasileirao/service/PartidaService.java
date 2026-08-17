package br.com.fiap.brasileirao.service;

import br.com.fiap.brasileirao.model.Partida;
import br.com.fiap.brasileirao.repository.PartidaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PartidaService {

    private PartidaRepository repository;

    public PartidaService(PartidaRepository repository) {
        this.repository = repository;
    }

    public void cadastrar(Partida novaPartida) {
        repository.cadastrar(novaPartida);
    }

    public void atualizar(Partida partida) {
        repository.atualizar(partida);
    }


    public List<Partida> consultar() {
        List<Partida> partidas = repository.consultar();
        return partidas;
    }

    public void excluir(Long codigo) {
        repository.excluir(codigo);
    }

}
