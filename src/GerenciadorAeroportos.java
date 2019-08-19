import java.util.ArrayList;

public class GerenciadorAeroportos {
	private ArrayList<Aeroporto> aeroportos;

	public GerenciadorAeroportos() {
		this.aeroportos = new Arraylist<>();
	}

	public void adicionar(Aeroporto aero) {
		aeroportos.add(aero);
	}

	public ArrayList<Aeroporto> listarTodos() {
		return new ArrayList<>(aeroportos);
	}

	public Aeroporto buscarPorCodigo(String cod) {
		return null;
	}

}
