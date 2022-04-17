package observer;
import java.util.ArrayList;
import java.util.List;

public class BlackBoard  implements Observable{

	private List<Observer> observers;
	private String content;
	
	public BlackBoard() {
		this.observers = new ArrayList<>();
	}
	
	@Override
	public void subscribe(Observer observer) {
		this.observers.add(observer);
		observer.setObservable(this);
	}

	@Override
	public void unsubscribe(Observer observer) {
		this.observers.remove(observer);
		observer.setObservable(null);
	}

	@Override
	public void notifyObservers() {
		for(Observer observer: this.observers) {
			observer.update();
		}
	}

	@Override
	public String getUpdate() {
		return this.content;
	}

	public void setContent(String content) {
		this.content = content;
		this.notifyObservers();
	}
}
