import java.time.Duration;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class VooEscalas extends Voo{


    public enum Status { CONFIRMADO, ATRASADO, CANCELADO };

    private ArrayList<Rota> rotas;

    private LocalDateTime datahora;
    private Duration duracao;
    private Rota rota;
    private Rota rotaFinal;
    private Status status;

    // Construtor
    public VooEscalas(Rota rota, Rota rotaFinal, LocalDateTime datahora, Duration duracao) {
        super(rota, datahora, duracao);
        this.rotaFinal = rotaFinal;
        //rotas = new ArrayList<>();
    }

    public ArrayList<Rota> getRotas() {
        return rotas;
    }

    public void setRotas(ArrayList<Rota> rotas) {
        this.rotas = rotas;
    }

    public LocalDateTime getDatahora() {
        return datahora;
    }


    @Override
    public Duration getDuracao() {
        return duracao;
    }

    @Override
    public Rota getRota() {
        return rota;
    }


    public Rota getRotaFinal() {
        return rotaFinal;
    }


    @Override
    public java.lang.String toString() {
        return "VooEscalas{" +
                "rotas=" + rotas +
                ", datahora=" + datahora +
                ", duracao=" + duracao +
                ", rota=" + rota +
                ", rotaFinal=" + rotaFinal +
                ", status=" + status +
                '}';
    }



//    @Override
//    public String toString() {
//        //return status + " " + datahora + "("+duracao+"): " + rota + " -> " + rotaFinal;
//        return getStatus() + " " + getDataHora() + "("+getDuracao()+"): " + getRota() + " -> " + rotaFinal;
//    }
}
