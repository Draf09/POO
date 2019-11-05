import java.time.Duration;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;

public class VooEscalas extends Voo {

    ArrayList<Rota> rotas;


    // Construtor
    public VooEscalas(Rota rota,
                      LocalDateTime datahora, Duration duracao) {
        super(rota, datahora, duracao);
        rotas = new ArrayList<>(  );
    }

    public void adicionarRota(Rota nova) {
        rotas.add(nova);
    }


    public int getTotalRotas() {
        return rotas.size();
    }

    public ArrayList<Rota> getRotas() {
        return new ArrayList<>(rotas);
    }


    @Override
    public String toString() {
        String aux = super.toString();
        for(Rota r: rotas)
            aux += "\n   " + r;
        return aux;
    }

//    public ArrayList<Voo> getRotas() {
//        return escalas;
//    }
//
//    public String PrintSomaDuracao(){
//        return ("a duração de todos voos somada é: "+getDuracao());
//    }
//
//    public Duration getDuracao() {
//        Duration duracao=Duration.of(0, ChronoUnit.HOURS);
//        for (Voo a: escalas)
//            duracao=duracao.plus(a.getDuracao());
//        return duracao;
//    }


//    public java.lang.String toString() {
//        String A="";
//        for (Voo b: escalas) {
//            A = A.concat(b.toString());
//            A = A.concat("\n");
//        }
//        return A;
//    }


}