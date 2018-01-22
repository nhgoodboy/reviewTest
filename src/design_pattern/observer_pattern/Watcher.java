package design_pattern.observer_pattern;

import java.util.Observable;
import java.util.Observer;

public class Watcher implements Observer {
	
	public Watcher(Observable o) {
		o.addObserver(this);
	}

	@Override
	public void update(Observable o, Object arg) {

		System.out.println("Status has changed : " + ((Watched)o).getData());
	}

}
