import java.time.Duration;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;

public class VooEscalas {


    ArrayList<Voo> escalas = new ArrayList<Voo>();


   // Construtor
    public VooEscalas(Voo ... a) {
        for (Voo i: a)
            escalas.add(i);
    }

    public ArrayList<Voo> getRotas() {
        return escalas;
    }

    public String PrintSomaDuracao(){
        return ("a duração de todos voos somada é: "+getDuracao());
    }

    public Duration getDuracao() {
        Duration duracao=Duration.of(0, ChronoUnit.HOURS);
        for (Voo a: escalas)
            duracao=duracao.plus(a.getDuracao());
        return duracao;
    }




    public java.lang.String toString() {
        String A="";
        for (Voo b: escalas) {
            A = A.concat(b.toString());
            A = A.concat("\n");
        }
        return A;
    }


}
