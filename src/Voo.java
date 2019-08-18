import java.time.LocalDateTime;

public class Voo {
	private LocalDateTime datahora;
	private Dutarion duracao;
	private Rota rota;

	public Voo(LocalDateTime datahora) {
		this.datahora = datahora;
	}

	public LocalDateTime getDataHora() {
		return datahora;
	}
}
