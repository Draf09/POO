import java.time.Duration;
import java.time.LocalDateTime;

public class Voo {

	public enum Status {COONFIRMADO, ATRASADO, CANCELADO}

	private LocalDateTime datahora;
	private Duration duracao;
	private Rota rota;
	private Status status;

	public Voo(Rota rota, LocalDateTime datahora, Duration duracao) {
		this.rota = rota;
		this.datahora = datahora;
		this.duracao = duracao;
		this.status = Status.COONFIRMADO;
	}


	public LocalDateTime getDataHora() {
		return datahora;
	}

	public Duration getDuracao() {
		return duracao;
	}

	public Rota getRota() {
		return rota;
	}

	public Status getStatus() {
		return status;
	}



	@Override
	public java.lang.String toString() {
		return "Voo{" +
				"datahora=" + datahora +
				", duracao=" + duracao +
				", rota=" + rota +
				", status=" + status +
				'}';
	}
}
