package com.tinymood.designpattern.observer.weather;

/**
 * 主题（可观察者）
 * @author 哓哓
 *
 */
public interface Subject {
	public abstract void registerObserver(Observer o);
	public abstract void removeObserver(Observer o);
	public abstract void notifyObservers();
}
