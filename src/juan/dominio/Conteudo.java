package juan.dominio;

/**
 * Classe abstrata para criação de conteúdo do bootcamp. Implementa o conceito de gamificação 
 * no bootcamp.
 * @author juanc
 *
 */
public abstract class Conteudo {
	
	protected static final double XP_PADRAO = 10d;
	
	
	private String titulo;
	private String descricao;
	
	/**
	 * Calcula o total de XP adquirido neste conteúdo.
	 * @return totalXP
	 */
	public double calcularXP() {
		return 0d;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	
}
