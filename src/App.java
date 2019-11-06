import java.io.IOException;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;

/**
 * App de testes para MyFlight
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
        gerenciadorCias1.add(new CiaAerea("4H", "United Airways Bangladesh"));
        gerenciadorCias1.add(new CiaAerea("5G", "Fly 540 Ghana"));
        gerenciadorCias1.add(new CiaAerea("8L", "Lucky Air Co. Ltd."));
        gerenciadorCias1.add(new CiaAerea("FI", "Icelandair"));
        gerenciadorCias1.add(new CiaAerea("KA", "Dragonair"));
        gerenciadorCias1.add(new CiaAerea("KE", "Korean Air"));
        gerenciadorCias1.add(new CiaAerea("KU", "Kuwait Airways"));

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
            System.out.println(aero.getCodigo()+" - "+aero.getLocal()+ " - " +aero.getNome()+ " - "+aero.getCodPais());


	    gerenciadorAeroportos1.adicionar(new Aeroporto("POA",
                new Geo(-29.9939, -51.1711), "Salgado Filho Airport", "BR"));

        gerenciadorAeroportos1.adicionar(new Aeroporto("GRU",
                new Geo(-23.4356, -46.4731),"São Paulo Guarulhos Intl", "BR" ));

        gerenciadorAeroportos1.adicionar(new Aeroporto("LIS",
                new Geo(38.7742, -9.1342), "Lisbon", "PT"));

        gerenciadorAeroportos1.adicionar(new Aeroporto("MIA",
                new Geo(25.7933, -80.2906),"Miami Intl Airport", "US"));

        gerenciadorAeroportos1.listarTodosOrdenado();



        System.out.println("\nAeroportos ordenados por nome:\n");
        for(Aeroporto a: gerenciadorAeroportos1.listarTodos())
            System.out.println(a);
        System.out.println();


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

        System.out.println("\n* Aeroporto:");
        Aeroporto aeroporto1=new Aeroporto("CódigoAeroporto1", g1, "NomeAeroporto1", "");
        Aeroporto aeroporto2=new Aeroporto("CódigoAeroporto2", g2, "NomeAeroporto2", "");
        Aeroporto aeroporto3=new Aeroporto("CódigoAeroporto3", g3, "NomeAeroporto3", "");
        System.out.println(aeroporto1.toString());
        System.out.println(aeroporto2.toString());

        System.out.println("\n* Aeronave:");
        Aeronave aeronave1 = new Aeronave("codigoAeronave1", "descricaoAeronave1", 51);
        System.out.println(aeronave1.toString());



        System.out.println("################## ROTAS ################## ");



        System.out.println("Distância POA->GRU: "+
                Geo.distancia(poa.getLocal(), gru.getLocal()));

        System.out.println("Distâcia GRU->POA: " +
                gru.getLocal().distancia(poa.getLocal()));

        GerenciadorRotas gerRotas = new GerenciadorRotas();

        Rota poagru = new Rota(latam, poa, gru, b733);

        Rota grupoa = new Rota(latam, gru, poa, b733);
        Rota grumia = new Rota(tap, gru, mia, a380);
        Rota grulis = new Rota(tap, gru, lis, a380);

        gerRotas.add(grumia);
        gerRotas.add(grulis);
        gerRotas.add(poagru);
        gerRotas.add(grupoa);
        gerRotas.ordenarNomesCias();
        gerRotas.ordenarNomesAeroportosCias();

        System.out.println("\nRotas ordenadas:\n");
        for(Rota r: gerRotas.listarTodas())
            System.out.println(r);
        System.out.println();


        LocalDateTime manhacedo = LocalDateTime.of(2018, 3, 29, 8, 0);
        LocalDateTime manhameio = LocalDateTime.of(2018, 4, 4, 10, 0);
        LocalDateTime tardecedo = LocalDateTime.of(2018, 4, 4, 14, 30);
        LocalDateTime tardetarde = LocalDateTime.of(2018, 4, 5, 17, 30);

        Duration curto = Duration.ofMinutes(90);
        Duration longo1 = Duration.ofHours(12);
        Duration longo2 = Duration.ofHours(14);

        GerenciadorVoos gerVoos = new GerenciadorVoos();

        gerVoos.add(new Voo(grulis, tardecedo, longo2));
        gerVoos.add(new Voo(grulis, tardetarde, longo2));
        gerVoos.add(new Voo(poagru, manhacedo, curto));
        gerVoos.add(new Voo(grupoa, manhameio, curto));
        gerVoos.add(new Voo(grumia, manhacedo, longo1));


        System.out.println("\n* Rota:");
        Rota rota1 = new Rota( c1, aeroporto1,  aeroporto2, aeronave1);
        Rota rota2 = new Rota( c1, aeroporto2,  aeroporto3, aeronave1);
        System.out.println(rota1.toString());
        System.out.println(rota2.toString());

        System.out.println("\n* Voo:");
        Voo voo1 = new Voo( rota1, LocalDateTime.of(2016,8,12,12,00,0), Duration.of(1, ChronoUnit.HOURS));
        Voo voo2 = new Voo( rota2, LocalDateTime.of(2016,8,12,15,00,0), Duration.of(2, ChronoUnit.HOURS));
        System.out.println(voo1.toString());
        System.out.println(voo2.toString());

        System.out.println("\n* VooEscalas:");


        // Vôo com várias escalas

        VooEscalas vooEsc = new VooEscalas(poagru, manhacedo, longo2);
        vooEsc.adicionarRota(grulis);

        gerVoos.add(vooEsc);

        gerenciadorVoos1.add(vooEsc);

        System.out.println(vooEsc.toString());

        gerVoos.ordenarDataHoraDuracao();
        gerenciadorVoos1.ordenarDataHoraDuracao();
        System.out.println("Todos os vôos:\n");
        for(Voo v: gerenciadorVoos1.listarTodos())
        {
            if(v instanceof VooEscalas) {
                System.out.println("==> Vôo com escalas! ");
                VooEscalas vooE = (VooEscalas) v;
                System.out.println("Escalas: "+vooE.getTotalRotas());
            }
            System.out.println(v);
        }

        System.out.println();
    }
}