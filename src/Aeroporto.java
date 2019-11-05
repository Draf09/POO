import java.util.Comparator;
import java.lang.String;

public class Aeroporto implements Comparable<Aeroporto> {
	private String codigo;
	private Geo loc;
	private String nome;
	private String codPais;

	public Aeroporto(String codigo, Geo loc, String nome, String codPais) {
		this.codigo = codigo;
		this.loc = loc;
		this.nome = nome;
		this.codPais = codPais;
	}

	public String getCodigo() {
		return codigo;
	}

	public Geo getLocal() {
		return loc;
	}

	public String getNome() {
		return nome;
	}

	public String getCodPais() {
		return codPais;
	}

	@Override
	public int compareTo(Aeroporto outro) {
		return this.nome.compareTo(outro.nome);
	}

	@Override
	public java.lang.String toString() {
		return "Aeroporto{" +
				"código=" + codigo +
				", nome=" + nome +
				", geo=" + loc +
				", codigo país=" + codPais +
 				'}';
	}
}