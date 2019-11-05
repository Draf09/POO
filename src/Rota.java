public class Rota implements Comparable<Rota>{

	private CiaAerea ciaAerea;
	private Aeroporto origem;
	private Aeroporto destino;
	private Aeronave aeronave;


	public CiaAerea getCiaAerea() {
		return ciaAerea;
	}

	public Aeroporto getOrigem() {
		return origem;
	}

	public Aeroporto getDestino() {
		return destino;
	}

	public Aeronave getAeronave() {
		return aeronave;
	}



	public Rota(){}
	public Rota(CiaAerea ciaAerea, Aeroporto origem, Aeroporto destino, Aeronave aeronave) {
		this.ciaAerea = ciaAerea;
		this.origem = origem;
		this.destino = destino;
		this.aeronave = aeronave;

	}

	@Override
	public int compareTo(Rota rota) {
		return this.ciaAerea.getNome().compareTo(rota.ciaAerea.getNome());
	}

	@Override
	public java.lang.String toString() {
		return "Rota{" + "origem=" + getOrigem() +
				", destino=" + getDestino() +
				", aeronave=" + getAeronave() +
				", ciaAerea=" + getCiaAerea() +
				'}';
	}
}