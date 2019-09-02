import java.util.ArrayList;


public class GerenciadorRotas {

	private ArrayList<Rota> rotas;

	public GerenciadorRotas(ArrayList<Rota> rota) {

		this.rotas = new ArrayList<>(  );
	}

	public void adicionarRota(Rota rota) {

		rotas.add(rota);
	}

	public ArrayList<Rota> listarTodas() {

		return new ArrayList<>( rotas );
	}

	public ArrayList<Rota> buscarPorOrigem(String codigo) {
		ArrayList<Rota> result = new ArrayList<>(  );
		for (Rota r: rotas)
			if (r.getOrigem().getCodigo().equals(codigo))
				result.add(r);
		return result;
	}
}
