import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

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

    public void ordenarDescricao() {
        // Usando Comparable<Aeronave> em Aeronave
        Collections.sort(aeronaves);

        // Usando expressão lambda
        aeronaves.sort( (Aeronave a1, Aeronave a2) -> a1.getDescricao().compareTo(a2.getDescricao()));

        aeronaves.sort(Comparator.comparing(a -> a.getDescricao()));

        aeronaves.sort( Comparator.comparing(Aeronave::getDescricao).reversed());
    }

    public void ordenarCodigoDescricao() {
        // Ordenando pelo código e desempatando pela descrição
        aeronaves.sort(Comparator.comparing(Aeronave::getCodigo).
                thenComparing(Aeronave::getDescricao));
    }

    public void ordenarCodigo() {
        aeronaves.sort( (Aeronave a1, Aeronave a2) ->
                a1.getCodigo().compareTo(a2.getCodigo()));
    }
}

