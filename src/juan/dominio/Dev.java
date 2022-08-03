package juan.dominio;

import java.time.LocalDate;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Optional;
import java.util.Set;

/** 
 * Essa classe representa um desenvolvedor que pode ser cadastrado
 * em bootcamps e mentorias.
 * @author juanc
 * @see juan.dominio.Bootcamp
 */
public class Dev {

	private String nome; // nome do user
	private Set<Conteudo> conteudosInscritos = new LinkedHashSet<Conteudo>();
	private Set<Conteudo> conteudosConcluidos = new LinkedHashSet<Conteudo>();
	
	/**
	 * Construtor sem parâmetros como privado para evitar a inicialização
	 * da classe sem nome.
	 */
	
	private Dev() {	
	}
	
	/**
	 * Construtor Dev
	 * da classe sem nome.
	 * @param nome
	 */
	
	public Dev(String nome) {
		this.nome = nome;
	}
	
	/**
	 * Cadastra o dev em um bootcamp já existente. Verifica se o bootcamp está disponível para inscrição
	 * @param bootcamp
	 */
	public void inscreverBootcamp(Bootcamp bootcamp) {
		try {
			bootcamp.adicionarDev(this, LocalDate.now());
			
		} catch(BootcampNotAvaliableException e) {
			System.out.println("Não foi possível realizar a inscrição: "+ e.getMessage());
		}

	}
	/**
	 * Progride o desempenho do dev no bootcamp, de acordo com a ordem das matérias listadas.
	 * 
	 */
	
	public void progredir() {
		Optional<Conteudo> conteudo = this.conteudosInscritos.stream().findFirst();
		
		if(conteudo.isPresent()) {
			conteudosInscritos.remove(conteudo.get());
			conteudosConcluidos.add(conteudo.get());
		} else {
			System.err.println("Você não está matriculado no bootcamp.");
		}
	}
	/**
	 * Calcula o total de XP do dev na plataforma.
	 */
	public double calcularTotalXP() {
		return conteudosConcluidos
				.stream()
				.map(Conteudo::calcularXP)
				.reduce(0d, (x,y) -> x+y);
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Set<Conteudo> getConteudosInscritos() {
		return conteudosInscritos;
	}

	public void setConteudosInscritos(Set<Conteudo> conteudosInscritos) {
		this.conteudosInscritos = conteudosInscritos;
	}

	public Set<Conteudo> getConteudosConcluidos() {
		return conteudosConcluidos;
	}

	public void setConteudosConcluidos(Set<Conteudo> conteudosConcluidos) {
		this.conteudosConcluidos = conteudosConcluidos;
	}
	
	
	
	
}
