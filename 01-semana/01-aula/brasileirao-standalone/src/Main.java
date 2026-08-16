import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class Main {

    static void main(String[] args) throws IOException {
        Partida partida = new Partida();

        // --- Para cada partida atualizamos os dados do time da casa
        partida.setTimeDaCasa("Santos");
        partida.setGolsTimeDaCasa(3);

        // --- Para cada partida atualizamos os dados do time visitante
        partida.setTimeVisitante("Mirassol");
        partida.setGolsTimeVisitante(1);

        String linha = "Partida " + partida.getTimeDaCasa() + " " + partida.getGolsTimeDaCasa() + " X " //
                + partida.getGolsTimeVisitante() + " " + partida.getTimeVisitante() + "\n";

        Path arquivo = Paths.get("src/partidas.txt");
        if (Files.exists(arquivo)) {
            Files.writeString(arquivo, linha, StandardOpenOption.APPEND);
        } else {
            Files.writeString(arquivo, linha, StandardOpenOption.CREATE);
        }

        System.out.println("Processamento finalizado.");
    }

}
