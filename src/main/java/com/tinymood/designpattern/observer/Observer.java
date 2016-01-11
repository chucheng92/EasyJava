package com.tinymood.designpattern.observer;

/**
 * 观察者
 * @author 哓哓
 *
 */
public interface Observer {
	public abstract void update(float temp, float humidity, float pressure);
}
