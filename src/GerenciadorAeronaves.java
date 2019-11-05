import java.util.ArrayList;

public class GerenciadorAeronaves {

	private ArrayList<Aeronave> aeronaves;

	public GerenciadorAeronaves(ArrayList<Aeronave> aeronaves) {
		this.aeronaves = aeronaves;
	}

	public GerenciadorAeronaves() {}


	public ArrayList<Aeronave> getAeronaves() {
		return aeronaves;
	}

	public void add(Aeronave aviao) {
		aeronaves.add(aviao);
	}

	public ArrayList<Aeronave> listarTodas() {
		return getAeronaves();
	}

	public Aeronave buscarPorCodigo(String cod) {
		for (Aeronave a: aeronaves)
			if(a.getCodigo().equals( cod ))
				return a;
		return null;
	}
}