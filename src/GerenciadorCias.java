import java.util.ArrayList;
import java.lang.String;
import java.util.Comparator;

public class GerenciadorCias {

	private static ArrayList<CiaAerea> empresas;
	private ArrayList<CiaAerea> cia;

	public GerenciadorCias() {
		cia = new ArrayList<>(  );
		empresas = new ArrayList<>(  );
	}

	public void add(String codigo, String nome){
		empresas.add(new CiaAerea(codigo, nome));
	}

	public ArrayList<CiaAerea> getCias(){

		return empresas;
	}

	public ArrayList<CiaAerea> listarTodas() {
		return getCias();
	}

	public static CiaAerea pesquisar(String codigo) {
		for(CiaAerea cia: empresas){
			if(cia.getCodigo().compareTo(codigo) == 0){  //0 <0 >0  ordenacao
				return cia;
			}
		}
		return null;
	}

	public CiaAerea buscarNome(String nome) {
		for(CiaAerea cia: empresas)
			if(cia.getNome().equals(nome))
				return cia;
		return null;
	}
}
