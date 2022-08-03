package juan.dominio;

import java.util.LinkedHashSet;
import java.util.Set;
// em construção
public class Bootcamp {
	private Set<Dev> devsInscritos = new LinkedHashSet<>();
	private boolean bootcampDisponivel = true;
	
	public void adicionarDev(Dev dev) throws BootcampNotAvaliableException {
		if (bootcampDisponivel) {
			throw new BootcampNotAvaliableException("Bootcamp não está disponível para inscrição.");
		} else {
			devsInscritos.add(dev);
		}
		
	}
}
