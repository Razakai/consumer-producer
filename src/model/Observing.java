package model;

import java.util.ArrayList;

import java.util.Observable;
import java.util.Observer;

@SuppressWarnings("deprecation")
public class Observing extends Observable {
	
	private ArrayList<Observer> observers = new ArrayList<Observer>();
	Object[] villan;
	
	public Observing (String villanName, int num) {
		super();
		villan = new Object[]{villanName, num};
	}
	
	public ArrayList<Observer> getObservers(){
		return observers;
	}
	
	
	public void setPresent(String villanName, int fileNum) {
		System.out.println("Hero name:"+ villanName);
			this.villan[0] = villanName;
			this.villan[1] = fileNum;
			setChanged();
			notifyObservers(this);
			//this.villanName = "Not Available";
		
	}
	
	
	public void notifyObservers(Observable observable) {
		System.out.println("Notifying superheros, Possible villan has arrived!");
		for (Observer ob : observers) {
			ob.update(observable, this.villan);
		}
	}
	
	
	
	
	
	
	public void registerObserver(Observer observer) {
		observers.add(observer);
	}
	
	public void removeObserver(Observer observer) {
		observers.remove(observer);
	}
	
}
