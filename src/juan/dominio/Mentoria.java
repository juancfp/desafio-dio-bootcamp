package juan.dominio;

import java.time.LocalDate;

/**
 * Classe abstrai uma mentoria em formato de live, com a hora e data para acontecer
 * @author juanc
 * @see juan.dominio.Dev
 *
 */
public class Mentoria extends Conteudo {

	private LocalDate data;
	
	/** 
	 * Adiciona XP para os usuários que assisiram a mentoria.
	 */
	@Override
    public double calcularXP() {
        return XP_PADRAO + 20d;
    }

	public LocalDate getData() {
		return data;
	}

	public void setData(LocalDate data) {
		this.data = data;
	}
	
}
