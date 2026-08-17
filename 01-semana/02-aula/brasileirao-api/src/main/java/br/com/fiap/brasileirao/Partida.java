package br.com.fiap.brasileirao;

public class Partida {

    private String timeDaCasa;
    private String timeVisitante;

    private Integer golsTimeDaCasa;
    private Integer golsTimeVisitante;

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

}
