package br.com.fiap.brasileirao;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/partidas")
public class PartidaResource {

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity cadastrar(@RequestBody Partida novaPartida) {
        System.out.println("Cadastrando Partida ...");
        return ResponseEntity.status(HttpStatus.CREATED.value()).build();
    }

    @PutMapping(path = "/{codigo}", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity atualizar(@PathVariable Long codigo, @RequestBody Partida partida) {
        System.out.println("Atualizando Partida [" + codigo + "]");
        return ResponseEntity.ok().build();
    }

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Partida> consultar() {
        System.out.println("Consultando Partida ...");

        Partida partida = new Partida();
        partida.setTimeDaCasa("Time da Casa");
        partida.setGolsTimeDaCasa(2);

        partida.setTimeVisitante("Time Visitante");
        partida.setGolsTimeVisitante(1);

        return ResponseEntity.ok(partida);
    }

    @DeleteMapping(path = "/{codigo}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity excluir(@PathVariable Long codigo) {
        System.out.println("Excluindo Partida [" + codigo + "]");
        return ResponseEntity.noContent().build();
    }

}
