import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class GerenciadorRotas {

	private ArrayList<Rota> rotas;

	public GerenciadorRotas() {
		this.rotas = new ArrayList<>();
	}

	public void carregaRotas(GerenciadorCias gerenciadorCias, GerenciadorAeroportos gerenciadorAeroportos, GerenciadorAeronaves GerenciadorAeronaves) throws IOException {
		Path path2 = Paths.get("routes.dat");
		try (Scanner sc = new Scanner( Files.newBufferedReader(path2, Charset.forName("utf8")))) {
			sc.useDelimiter("[;\n ]");
			String header = sc.nextLine();
			String cia, origem, destino, aeronave;
			while (sc.hasNext()) {
				cia = sc.next().replaceAll("(\r)", "");
				origem = sc.next().replaceAll("(\r)", "");
				destino = sc.next().replaceAll("(\r)", "");
				sc.next(); // Dados ignorados
				sc.next(); // Dados ignorados
				aeronave = sc.next().replaceAll("(\r)", "");
				sc.nextLine(); // Pula a linha depois de atribuir a primera aeronave, ignorando quando tem mais de uma aeronave para a mesma rota.
				CiaAerea cia1 = gerenciadorCias.buscarCodigo(cia);
				Aeroporto origem1 = gerenciadorAeroportos.buscarCodigo(origem);
				Aeroporto destino1 = gerenciadorAeroportos.buscarCodigo(destino);
				Aeronave aeronave1 = GerenciadorAeronaves.buscarPorCodigo(aeronave);
				Rota rota = new Rota(cia1, origem1, destino1, aeronave1);
				add(rota);

			}
		} catch(IOException erro) {
			System.err.format("Erro de E/S: %s%n", erro);
		}
	}

	public void add(Rota rota) {

		this.rotas.add(rota);
	}

	public ArrayList<Rota> listarTodas() {
		//return new ArrayList<>( rotas );
		return rotas;
	}

	public ArrayList<Rota> buscarPorOrigem(Aeroporto orig) {
		ArrayList<Rota> busca = new ArrayList<Rota>(  );
		for (Rota r: rotas)
			if (r.getOrigem().getCodigo().equals(orig))
				busca.add(r);
		return busca;
	}

	public void ordenarNomesCias(){
		rotas.sort( (Rota r1, Rota r2) -> r1.getCiaAerea().getNome().compareTo( r2.getCiaAerea().getNome() ) );
	}

	public void ordenarNomesAeroportos() {
		rotas.sort( (Rota r1, Rota r2) -> r1.getOrigem().getNome().compareTo(r2.getOrigem().getNome()));
	}

	public void ordenarNomesAeroportosCias() {
		rotas.sort( (Rota r1, Rota r2) -> {
			int result = r1.getOrigem().getNome().compareTo(
					r2.getOrigem().getNome());
			if(result != 0)
				return result;
			return r1.getCiaAerea().getNome().compareTo(
					r2.getCiaAerea().getNome());
		});
	}
}