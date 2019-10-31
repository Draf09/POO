public class Rota implements Comparable<Rota>{

	private Aeroporto origem;
	private Aeroporto aeroporto;
	private Aeroporto destino;
	private Aeronave aeronave;
	private CiaAerea ciaAerea;


	public Aeroporto getOrigem() {
		return origem;
	}

	public Aeroporto getAeroporto() {
		return aeroporto;
	}

	public Aeroporto getDestino() {
		return destino;
	}

	public Aeronave getAeronave() {
		return aeronave;
	}

	public CiaAerea getCiaAerea() {
		return ciaAerea;
	}

	public Rota(Aeroporto origem, Aeroporto aeroporto, Aeroporto destino, Aeronave aeronave, CiaAerea ciaAerea) {
		this.origem = origem;
		this.aeroporto = aeroporto;
		this.destino = destino;
		this.aeronave = aeronave;
		this.ciaAerea = ciaAerea;
	}

	@Override
	public int compareTo(Rota rota) {
		return this.ciaAerea.getNome().compareTo(rota.ciaAerea.getNome());
	}

	@Override
	public java.lang.String toString() {
		return "Rota{" + "origem=" + getOrigem() +
				", aeroporto=" + getAeroporto() +
				", destino=" + getDestino() +
				", aeronave=" + getAeronave() +
				", ciaAerea=" + getCiaAerea() +
				'}';
	}
}
