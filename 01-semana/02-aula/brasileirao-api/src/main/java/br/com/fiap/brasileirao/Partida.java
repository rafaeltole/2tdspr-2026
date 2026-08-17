package br.com.fiap.brasileirao;

import java.util.Objects;

public class Partida {

    private Long codigo;

    private String timeDaCasa;
    private String timeVisitante;

    private Integer golsTimeDaCasa;
    private Integer golsTimeVisitante;

    public Long getCodigo() {
        return codigo;
    }

    public void setCodigo(Long codigo) {
        this.codigo = codigo;
    }

    public String getTimeDaCasa() {
        return timeDaCasa;
    }

    public void setTimeDaCasa(String timeDaCasa) {
        this.timeDaCasa = timeDaCasa;
    }

    public String getTimeVisitante() {
        return timeVisitante;
    }

    public void setTimeVisitante(String timeVisitante) {
        this.timeVisitante = timeVisitante;
    }

    public Integer getGolsTimeDaCasa() {
        return golsTimeDaCasa;
    }

    public void setGolsTimeDaCasa(Integer golsTimeDaCasa) {
        this.golsTimeDaCasa = golsTimeDaCasa;
    }

    public Integer getGolsTimeVisitante() {
        return golsTimeVisitante;
    }

    public void setGolsTimeVisitante(Integer golsTimeVisitante) {
        this.golsTimeVisitante = golsTimeVisitante;
    }

    @Override
    public String toString() {
        return "Partida{" +
                "timeDaCasa='" + timeDaCasa + '\'' +
                ", golsTimeDaCasa=" + golsTimeDaCasa +
                ", timeVisitante='" + timeVisitante + '\'' +
                ", golsTimeVisitante=" + golsTimeVisitante +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Partida partida = (Partida) o;
        return Objects.equals(codigo, partida.codigo);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(codigo);
    }
}
