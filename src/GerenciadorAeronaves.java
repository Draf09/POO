import java.util.ArrayList;

public class GerenciadorAeronaves {

	private ArrayList<Aeronave> aeronaves;

	public GerenciadorAeronaves(ArrayList<Aeronave> aeronaves) {
		this.aeronaves = aeronaves;
	}

	public ArrayList<Aeronave> getAeronaves() {
		return aeronaves;
	}

	public void adicionar(Aeronave aviao) {
		aeronaves.add(aviao);
	}

	public ArrayList<Aeronave> listarTodas() {
		return getAeronaves();
	}

	public Aeronave buscarPorCodigo(String cod) {
		return null;
	}




}
