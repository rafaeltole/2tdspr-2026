package br.com.fiap.brasileirao;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@RestController
@RequestMapping("/partidas")
public class PartidaResource {

    private Random random = new Random();
    private List<Partida> partidas = new ArrayList<>();

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity cadastrar(@RequestBody Partida novaPartida) {
        System.out.println("Cadastrando Partida ...");

        novaPartida.setCodigo(random.nextLong(1, 100));
        partidas.add(novaPartida);

        return ResponseEntity.status(HttpStatus.CREATED.value()).build();
    }

    @PutMapping(path = "/{codigo}", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity atualizar(@PathVariable Long codigo, @RequestBody Partida partidaAtualizada) {
        System.out.println("Atualizando Partida [" + codigo + "]");

        partidaAtualizada.setCodigo(codigo);
        int indice = partidas.indexOf(partidaAtualizada);

        Partida partida = partidas.get(indice);
        partida.setTimeDaCasa(partidaAtualizada.getTimeDaCasa());
        partida.setGolsTimeDaCasa(partidaAtualizada.getGolsTimeDaCasa());

        partida.setTimeVisitante(partidaAtualizada.getTimeVisitante());
        partida.setGolsTimeVisitante(partidaAtualizada.getGolsTimeVisitante());

        return ResponseEntity.ok().build();
    }

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<Partida>> consultar() {
        System.out.println("Consultando Partida ...");
        return ResponseEntity.ok(partidas);
    }

    @DeleteMapping(path = "/{codigo}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity excluir(@PathVariable Long codigo) {
        System.out.println("Excluindo Partida [" + codigo + "]");

        Partida partida = new Partida();
        partida.setCodigo(codigo);

        partidas.remove(partida);

        return ResponseEntity.noContent().build();
    }

}
