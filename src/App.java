public class App {

    public static void main(String[] args) {

        GerenciadorCias gercias = new GerenciadorCias();
        CiaAerea c1 = new CiaAerea("JJ", "Latam Airlines");
        CiaAerea c2 = new CiaAerea("G3", "Gol Linhas Aéreas SA");
        CiaAerea c3 = new CiaAerea("TP", "TAP Portugal");
        CiaAerea c4 = new CiaAerea("AD", "Azul Linha Aereas");

        System.out.println("codigo de c1: "+ c1.getCodigo());
        System.out.println("codigo de c2: "+ c2.getCodigo());
        System.out.println("codigo de c3: "+ c3.getCodigo());
        System.out.println("codigo de c4: "+ c4.getCodigo());

        gercias.add("JJ", "Latam Airlines");
        //gercias.inserir(c2);

        for(CiaAerea c: gercias.getCias()){
            System.out.println(c);
        }

        CiaAerea c5 = GerenciadorCias.pesquisar("AA");
    }
}
