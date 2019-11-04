import java.util.ArrayList;
import java.util.Collections;


public class GerenciadorRotas {

	private ArrayList<Rota> rotas;

	public GerenciadorRotas(ArrayList<Rota> rota) {

		this.rotas = new ArrayList<>(  );
	}


	public void adicionar(Rota rota) {

		this.rotas.add(rota);
	}

	public ArrayList<Rota> listarTodas() {
		//return new ArrayList<>( rotas );
		return rotas;
	}

	public void ordenarCias() {
		Collections.sort(rotas);
	}

	public ArrayList<Rota> buscarPorOrigem(Aeroporto orig) {
		ArrayList<Rota> busca = new ArrayList<>(  );
		for (Rota r: rotas)
			if (r.getOrigem().getCodigo().equals(orig))
				busca.add(r);
		return busca;
	}

	public void ordenarNomesCias(){
		rotas.sort( (Rota r1, Rota r2) ->
				r1.getCiaAerea().getNome().compareTo(
				r2.getCiaAerea().getNome() ) );
	}

	public void ordenarNomesAeroportos() {
		rotas.sort( (Rota r1, Rota r2) -> r1.getCiaAerea().getNome().compareTo( r2.getCiaAerea().getNome() ));
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
