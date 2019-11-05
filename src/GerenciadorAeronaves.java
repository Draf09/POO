import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

public class GerenciadorAeronaves {
	private Map<String, Aeronave> avioes;

	public GerenciadorAeronaves() {
		this.avioes = new LinkedHashMap<>(  );
	}

	public ArrayList<Aeronave> listarTodas() {
		return new ArrayList<>(avioes.values());
	}

	public void carregaAeronaves(String nomeArq) throws IOException {
		Path path = Paths.get(nomeArq);
		try (Scanner sc = new Scanner( Files.newBufferedReader(path, Charset.forName("utf8")))) {
			sc.useDelimiter("[;\n]");
			String header = sc.nextLine(); // pular cabeçalho
			String cod, desc;
			int  cap;
			while (sc.hasNext()) {
				cod = sc.next();
				desc = sc.next();
				cap = Integer.parseInt(sc.next().replaceAll("(\r)", ""));
				Aeronave nova = new Aeronave(cod, desc, cap);
				add(nova);
			}
		}
	}

	public void add(Aeronave aviao) {
		avioes.put(aviao.getCodigo(),
				aviao);
	}

	public Aeronave buscarPorCodigo(String codigo) {
		return avioes.get(codigo);
		//		for (Aeronave a: aeronaves)
//			if(a.getCodigo().equals( cod ))
//				return a;
//		return null;
	}

}