package com.sdz.observer;
import java.util.Observer;

/**
 * @author thame
 *
 */
public interface Observable {
	/**
	 * @param obs
	 */
	public void addObserver(Observer obs);

	/**
	 * 
	 */
	public void removeObserver();

	/**
	 * @param str
	 */
	public void notifyObserver(String str);

}
