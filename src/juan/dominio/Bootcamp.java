package juan.dominio;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
/**
 * Classe que abstrai um bootcamp, com cursos e mentorias a serem realizadas.
 * Existe uma data limite para o bootcamp, que define o fim das inscrições.
 * @author juanc
 * @see juan.dominio.Dev
 *
 */

public class Bootcamp {
	private String nome;
	private String descricao;

	private Set<Dev> devsInscritos = new HashSet<>();
	private boolean bootcampDisponivel = true;
	private final LocalDate dataInicial = LocalDate.now();
    private final LocalDate dataFinal = dataInicial.plusDays(45);
    private Set<Conteudo> conteudos = new LinkedHashSet<>();
	
    /** 
     * Adiciona o desenvolvedor ao bootcamp. se diaDaInscricao for maior que o dia limite da inscrição do bootcamp, 
     * o método lança uma exceção.
     * @param dev
     * @param diaDaInscricao
     * @throws BootcampNotAvaliableException
     */
	public void adicionarDev(Dev dev, LocalDate diaDaInscricao) throws BootcampNotAvaliableException {
		if (diaDaInscricao.compareTo(dataFinal) > 0) {
			throw new BootcampNotAvaliableException("Bootcamp não está disponível para inscrição.");
		} else {
			devsInscritos.add(dev);
		}
		
	}

	public Set<Dev> getDevsInscritos() {
		return devsInscritos;
	}

	public void setDevsInscritos(Set<Dev> devsInscritos) {
		this.devsInscritos = devsInscritos;
	}

	public boolean isBootcampDisponivel() {
		return bootcampDisponivel;
	}

	public void setBootcampDisponivel(boolean bootcampDisponivel) {
		this.bootcampDisponivel = bootcampDisponivel;
	}

	public Set<Conteudo> getConteudos() {
		return conteudos;
	}

	public void setConteudos(Set<Conteudo> conteudos) {
		this.conteudos = conteudos;
	}

	public LocalDate getDataInicial() {
		return dataInicial;
	}

	public LocalDate getDataFinal() {
		return dataFinal;
	}
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	
}
