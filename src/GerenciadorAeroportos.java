import java.util.ArrayList;

public class GerenciadorAeroportos {
	private ArrayList<Aeroporto> aeroportos;

	public GerenciadorAeroportos(ArrayList<Aeroporto> aeroportos) {
		this.aeroportos = aeroportos;
	}

	public void adicionar(Aeroporto aero) {
		aeroportos.add(aero);
	}

	public ArrayList<Aeroporto> listarTodos() {

		return new ArrayList<>(aeroportos);
	}

	public Aeroporto buscarCodigo(String codigo) {
		for(Aeroporto a: aeroportos)
			if(a.getCodigo().equals(codigo))
				return a;
		return null;
	}

}
