package br.com.fiap.brasileirao.repository;

import br.com.fiap.brasileirao.model.Partida;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Repository
public class PartidaRepository {

    private Random random = new Random();
    private List<Partida> partidas = new ArrayList<>();

    public void cadastrar(Partida novaPartida) {
        System.out.println("Cadastrando Partida ...");

        novaPartida.setCodigo(random.nextLong(1, 100));
        partidas.add(novaPartida);
    }

    public void atualizar(Partida partidaAtualizada) {
        System.out.println("Atualizando Partida [" + partidaAtualizada.getCodigo() + "]");

        int indice = partidas.indexOf(partidaAtualizada);

        Partida partida = partidas.get(indice);
        partida.setTimeDaCasa(partidaAtualizada.getTimeDaCasa());
        partida.setGolsTimeDaCasa(partidaAtualizada.getGolsTimeDaCasa());

        partida.setTimeVisitante(partidaAtualizada.getTimeVisitante());
        partida.setGolsTimeVisitante(partidaAtualizada.getGolsTimeVisitante());
    }

    public List<Partida> consultar() {
        System.out.println("Consultando Partidas ...");
        return partidas;
    }


    public void excluir(Long codigo) {
        System.out.println("Excluindo Partida [" + codigo + "]");

        Partida partida = new Partida();
        partida.setCodigo(codigo);

        partidas.remove(partida);
    }

}
