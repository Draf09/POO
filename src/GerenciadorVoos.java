import java.time.LocalDateTime;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.time.Period;

public class GerenciadorVoos {

	private ArrayList<Voo> voos;

	public GerenciadorVoos(){
		this.voos = new ArrayList<>(  );
	}

	public void adicionarVoo(Voo r) {
		voos.add( r );
	}

	public Arraylist<Voo> listarTodos() {
		return new Arraylist<>(voos);
	}

	public ArrayList<Voo> buscarData(LocalDate data) {
		ArrayList<Voo> result = new ArrayList<>(  );
		for(Voo v: voos)
			if (v.getDataHora().toLocalDate().equals(data)) {
				result.add( v );
			}
		return result;
	}



}
