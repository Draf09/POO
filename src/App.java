import java.time.Duration;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

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
        Geo g3 = new Geo(9.0, 9.0);
        System.out.println(g3.toString());


        System.out.println("\n* Aeroporto:");
        Aeroporto aeroporto1=new Aeroporto("CódigoAeroporto1", "NomeAeroporto1", g1);
        Aeroporto aeroporto2=new Aeroporto("CódigoAeroporto2", "NomeAeroporto2", g2);
        Aeroporto aeroporto3=new Aeroporto("CódigoAeroporto3", "NomeAeroporto3", g3);
        System.out.println(aeroporto1.toString());
        System.out.println(aeroporto2.toString());

        System.out.println("\n* Aeronave:");
        Aeronave aeronave1 = new Aeronave("codigoAeronave1", "descricaoAeronave1", 51);
        System.out.println(aeronave1.toString());

        System.out.println("\n* Rota:");
        Rota rota1 = new Rota( aeroporto1,  aeroporto2, aeronave1, c1);
        Rota rota2 = new Rota( aeroporto2,  aeroporto3, aeronave1, c1);
        System.out.println(rota1.toString());
        System.out.println(rota2.toString());

        System.out.println("\n* Voo:");
        Voo voo1 = new Voo( rota1, LocalDateTime.of(2016,8,12,12,00,0), Duration.of(1, ChronoUnit.HOURS));
        Voo voo2 = new Voo( rota2, LocalDateTime.of(2016,8,12,15,00,0), Duration.of(2, ChronoUnit.HOURS));
        System.out.println(voo1.toString());
        System.out.println(voo2.toString());

        System.out.println("\n* VooEscalas:");
        VooEscalas VooEscalas1 = new VooEscalas(voo1, voo2);
        System.out.println(VooEscalas1.PrintSomaDuracao());
        System.out.println("aqui está a descrição de cada um dos voos que compões a escala");
        System.out.println(VooEscalas1.toString());







        //Voo v1 = new Voo(Rota rota, LocalDateTime datahora, Duration duracao)


        System.out.println();
    }
}
