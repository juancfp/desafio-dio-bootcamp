package juan.dominio;

/**
 * Classe abstrai um curso, com uma determinada carga horária e uma pontuação padrão para o dev que concluir.
 * @author juanc
 * @see juan.dominio.Dev
 *
 */
public class Curso extends Conteudo {
	private int cargaHoraria;
	
	/** 
	 * Adiciona XP para os usuários que assisiram a todas as aulas.
	 */
	@Override
    public double calcularXP() {
        return XP_PADRAO * cargaHoraria;
    }

	public int getCargaHoraria() {
		return cargaHoraria;
	}

	public void setCargaHoraria(int cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}

	@Override
	public String toString() {
		return "Curso [cargaHoraria=" + cargaHoraria + ", Titulo()=" + getTitulo() + ", Descricao()="
				+ getDescricao() + "]";
	}
	
}
