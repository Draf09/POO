public class Aeronave implements Comparable<Aeronave>, Imprimivel {

	private String codigo;
	private String descricao;
	private int capacidade;


	public Aeronave(String codigo, String descricao, int capacidade) {
		this.codigo = codigo;
		this.descricao = descricao;
		this.capacidade = capacidade;
	}


	public String getCodigo() {
		return codigo;
	}

	public String getDescricao() {
		return descricao;
	}

	public int getCapacidade() {
		return capacidade;
	}

//	@Override
//	public String toString() {
//		return "Aeronave{" + "codigo='" + codigo + '\'' + ", descricao='" + descricao + '\'' + ", capacidade=" + capacidade + '}';
//	}

	//Implementação da Interface pra Impressão,
	//utilizando o método toString.
	@Override
	public void imprimir(){
		System.out.println(toString());
	}

	@Override
	public String toString() {
		return codigo + " - " + descricao + "(" + capacidade + ")";
	}


	//método compareTo
	@Override
	public int compareTo(Aeronave outra) {
		return descricao.compareTo( outra.descricao );
	}
}



