import java.util.ArrayList;
import java.util.List;

public class HeadHunter implements Subject{

	private List<Observer> observadores;
	private List<String> vagas;
	
	public HeadHunter() {
		super();
		this.observadores = new ArrayList<>();
		this.vagas = new ArrayList<>();
	}
	
	public void recebeVaga(String vaga) {
		this.vagas.add(vaga);
		this.notifyAllObserver();
	}

	@Override
	public void addObserver(Observer observer) {
		this.observadores.add(observer);
		
	}

	@Override
	public void removeObserver(Observer observer) {
		int ind = this.observadores.indexOf(observer);
		if (ind >= 0) {
			this.observadores.remove(observer);
		}
	}

	@Override
	public void notifyAllObserver() {
		for (Observer observer : observadores) {
			observer.update(this.vagas.get(this.vagas.size()-1));
		}
	}
	
	
}
