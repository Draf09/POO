import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.lang.String;
import java.util.Scanner;
import java.util.*;

public class GerenciadorCias {
	private Map<String, CiaAerea> empresas;
	//private static ArrayList<CiaAerea> empresas;
	//private ArrayList<CiaAerea> cia;

	public GerenciadorCias() {
		this.empresas = new HashMap<>(  );
//		cia = new ArrayList<>(  );
//		empresas = new ArrayList<>(  );
	}
	public void carregaCias(String nomeArq) throws IOException{
		Path path1 = Paths.get( "airlines.dat" );
		try (Scanner sc = new Scanner(Files.newBufferedReader(path1, Charset.forName("utf8")))) {
			sc.useDelimiter( "[;\n]" );
			String header = sc.nextLine();
			String cod, nome;
			while(sc.hasNext()){
				cod = sc.next();
				nome = sc.next();
				CiaAerea nova = new CiaAerea( cod, nome );
				adicionar( nova );
			}
		}
	}

	public void adicionar(CiaAerea cia1) {
		empresas.put(cia1.getCodigo(), cia1);
	}

//	public void add(String codigo, String nome){
//		empresas.add(new CiaAerea(codigo, nome));
//	}

//	public ArrayList<CiaAerea> getCias(){
//
//		return empresas;
//	}

//	public ArrayList<CiaAerea> listarTodas() {
//		return getCias();
//	}

//	public static CiaAerea pesquisar(String codigo) {
//		for(CiaAerea cia: empresas){
//			if(cia.getCodigo().compareTo(codigo) == 0){  //0 <0 >0  ordenacao
//				return cia;
//			}
//		}
//		return null;
//	}

	public CiaAerea buscarCodigo(String cod){
		return empresas.get( cod );
	}

	public CiaAerea buscarNome(String nome) {
		for(CiaAerea cia: empresas.values())
			if(cia.getNome().equals(nome))
				return cia;
		return null;
	}
}
