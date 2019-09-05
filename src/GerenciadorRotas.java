import java.util.ArrayList;


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


	public ArrayList<Rota> buscarPorOrigem(Aeroporto orig) {
		ArrayList<Rota> busca = new ArrayList<Rota>(  );
		for (Rota r: rotas)
			if (r.getOrigem().getCodigo().equals(orig))
				busca.add(r);
		return busca;
	}
}
