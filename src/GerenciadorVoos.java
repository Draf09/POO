import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Comparator;

public class GerenciadorVoos {

	private ArrayList<Voo> voos;

	public GerenciadorVoos(){

		this.voos = new ArrayList<>(  );
	}

	public void add(Voo v) {

		this.voos.add( v );
	}

	public ArrayList<Voo> listarTodos() {
		return voos;
		//return new ArrayList<>(voos);
	}

	public void ordenarDataHora() {
		//voos.sort(Comparator.comparing(v -> v.getDatahora()));
		voos.sort(Comparator.comparing(Voo::getDataHora));
	}

	public void ordenarDataHoraDuracao() {
		voos.sort( Comparator.comparing(Voo::getDataHora).
				thenComparing(Voo::getDuracao));
	}


	public ArrayList<Voo> buscarData(LocalDateTime data) {
		ArrayList<Voo> result = new ArrayList<Voo>(  );
		for(Voo v: voos)
			if (v.getDataHora().equals(data)) {
				result.add( v );
			}
		return result;
	}

	public java.lang.String toString(){
		java.lang.String voos = "Voos\n" + "--------------------------\n";
		for (int i=0; i<this.voos.size(); i++){
			voos += "" + this.voos.get( i ) + "\n";
		}
		return voos;
	}
}