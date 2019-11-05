import java.io.IOException;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;

/**
 * App de Testes
 *
 */
public class App {

    public static void main(String[] args) {

        GerenciadorCias gerenciadorCias1 = new GerenciadorCias();

        System.out.println("################## CIAS AÉREAS ##################");

        try {
            gerenciadorCias1.carregaCias( "airlines.dat" );
        } catch (IOException e) {
            System.out.println("Não foi possível ler airlines.dat!");
        }
        ArrayList<CiaAerea> todasCias = gerenciadorCias1.listarTodas();
        System.out.println("Total cias:"+todasCias.size());
        for(CiaAerea cia: todasCias)
            System.out.println(cia.getCodigo()+" - "+cia.getNome());



        gerenciadorCias1.add(new CiaAerea("JJ", "LATAM Linhas Aéreas"));
        gerenciadorCias1.add(new CiaAerea("G3", "Gol Linhas Aéreas S/A"));
        gerenciadorCias1.add(new CiaAerea("TP", "TAP Portugal"));
        gerenciadorCias1.add(new CiaAerea("AD", "Azul Linhas Aéreas"));



        GerenciadorRotas gerenciadorRotas1 = new GerenciadorRotas();

        GerenciadorVoos gerenciadorVoos1 = new GerenciadorVoos();


        System.out.println("################## AERONAVES ##################");


        GerenciadorAeronaves gerenciadorAeronaves1 = new GerenciadorAeronaves();

        try {
            gerenciadorAeronaves1.carregaAeronaves("equipment.dat");
        } catch (IOException e) {
            System.out.println("Não foi possível ler equipment.dat!");
        }
        ArrayList<Aeronave> todosAvioes = gerenciadorAeronaves1.listarTodas();
        System.out.println("Total avioes:"+todosAvioes.size());
        for(Aeronave aviao: todosAvioes)
            System.out.println(aviao.getCodigo()+" - "+aviao.getDescricao()+ " - " +aviao.getCapacidade());



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


        System.out.println("################## AEROPORTOS ################## ");

        GerenciadorAeroportos gerenciadorAeroportos1 = new GerenciadorAeroportos();

        try {
            gerenciadorAeroportos1.carregaAeroportos("airports.dat");
        } catch (IOException e) {
            System.out.println("Não foi possível ler airports.dat!");
        }
        ArrayList<Aeroporto> todosAero = gerenciadorAeroportos1.listarTodos();
        System.out.println("Total Aero:"+todosAero.size());
        for(Aeroporto aero: todosAero)
            System.out.println(aero.getCodigo()+" - "+aero.getLocal()+ " - " +aero.getNome());


/*
	gerAero.adicionar(new Aeroporto("POA", "Salgado Filho Intl",
                new Geo(-29.9939, -51.1711)));
		gerAero.adicionar(new Aeroporto("GRU", "São Paulo Guarulhos Intl",
                new Geo(-23.4356, -46.4731)));
		gerAero.adicionar(new Aeroporto("LIS", "Lisbon",
                new Geo(38.7742, -9.1342)));
		gerAero.adicionar(new Aeroporto("MIA", "Miami Intl Airport",
                new Geo(25.7933, -80.2906)));
		gerAero.ordenarNomes();


		*/

        System.out.println("\nAeroportos ordenados por nome:\n");
        for(Aeroporto a: gerenciadorAeroportos1.listarTodos())
            System.out.println(a);
        System.out.println();

        // Para facilitar a criação de rotas:

        CiaAerea latam = gerenciadorCias1.buscarCodigo("JJ");
        CiaAerea gol   = gerenciadorCias1.buscarCodigo("G3");
        CiaAerea tap   = gerenciadorCias1.buscarCodigo("TP");
        CiaAerea azul  = gerenciadorCias1.buscarCodigo("AD");

        Aeronave b733 = gerenciadorAeronaves1.buscarPorCodigo("733");
        Aeronave b73g = gerenciadorAeronaves1.buscarPorCodigo("73G");
        Aeronave a380 = gerenciadorAeronaves1.buscarPorCodigo("380");

        Aeroporto poa = gerenciadorAeroportos1.buscarCodigo("POA");
        Aeroporto gru = gerenciadorAeroportos1.buscarCodigo("GRU");
        Aeroporto lis = gerenciadorAeroportos1.buscarCodigo("LIS");
        Aeroporto mia = gerenciadorAeroportos1.buscarCodigo("MIA");

		/*
        System.out.println("Distância POA->GRU: "+
            Geo.distancia(poa.getLocal(), gru.getLocal()));

        System.out.println("Distâcia GRU->POA: " +
            gru.getLocal().distancia(poa.getLocal()));
        */


        System.out.println("\n* Aeroporto:");
        Aeroporto aeroporto1=new Aeroporto("CódigoAeroporto1", g1, "NomeAeroporto1", "");
        Aeroporto aeroporto2=new Aeroporto("CódigoAeroporto2", g2, "NomeAeroporto2", "");
        Aeroporto aeroporto3=new Aeroporto("CódigoAeroporto3", g3, "NomeAeroporto3", "");
        System.out.println(aeroporto1.toString());
        System.out.println(aeroporto2.toString());

        System.out.println("\n* Aeronave:");
        Aeronave aeronave1 = new Aeronave("codigoAeronave1", "descricaoAeronave1", 51);
        System.out.println(aeronave1.toString());


        //ArrayList<Aeronave> todasAeronaves = gerAeronave.listarTodas();


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

        System.out.println();
    }
}