import java.time.Duration;
import java.time.LocalDateTime;

/**
 * App de Testes para a Classe MyFlight
 *
 */
public class App {

    public static void main(String[] args) {

        GerenciadorCias gercias = new GerenciadorCias();

        System.out.println("\n* cia aérea:");
        CiaAerea c1 = new CiaAerea("JJ", "Latam Airlines");
        System.out.println("codigo de c1: "+ c1.toString());

        System.out.println("\n* geo:");
        Geo g1 = new Geo(5.0, 5.0);
        System.out.println(g1.toString());
        Geo g2 = new Geo(7.0, 7.0);
        System.out.println(g2.toString());


        System.out.println("\n* Aeroporto:");
        Aeroporto aeroporto1=new Aeroporto("CódigoAeroporto1", "NomeAeroporto1", g1);
        Aeroporto aeroporto2=new Aeroporto("CódigoAeroporto2", "NomeAeroporto2", g2);
        System.out.println(aeroporto1.toString());
        System.out.println(aeroporto2.toString());

        System.out.println("\n* Aeronave:");
        Aeronave aeronave1 = new Aeronave("codigoAeronave1", "descricaoAeronave1", 51);
        System.out.println(aeronave1.toString());





        //cia aerea


        //Voo v1 = new Voo(Rota rota, LocalDateTime datahora, Duration duracao)


        System.out.println();
    }
}
