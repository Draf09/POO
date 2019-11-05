import java.util.Comparator;
import java.lang.String;

public class Aeroporto implements Comparable<Aeroporto> {
	private String codigo;
	private String nome;
	private Geo loc;

	public Aeroporto(String codigo, String nome, Geo loc) {
		this.codigo = codigo;
		this.nome = nome;
		this.loc = loc;
	}

	public String getCodigo() {
		return codigo;
	}

	public String getNome() {
		return nome;
	}

	public Geo getLoc() {
		return loc;
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
				'}';
	}
}