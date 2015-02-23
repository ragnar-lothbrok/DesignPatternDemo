package com.home.dp.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class Topic implements Subject {

    private List<Observer> observers;
    private String message;
    private boolean changed;
    final Object MUTEX = new Object();

    public Topic() {
        this.observers = new ArrayList<Observer>();
    }

    @Override
    public void register(Observer obj) {
        if (obj == null)
            throw new NullPointerException("Null Observer");
        synchronized (MUTEX) {
            if (!observers.contains(obj)) {
                observers.add(obj);
            }
        }

    }

    @Override
    public void unregister(Observer obj) {
        synchronized (MUTEX) {
            observers.remove(obj);
        }
    }

    @Override
    public void notifyObservers() {
        List<Observer> localObserverList = null;
        synchronized (MUTEX) {
            if (!changed)
                return;
            localObserverList = new ArrayList<Observer>(this.observers);
            this.changed = false;
        }

        for (Observer observer : localObserverList) {
            observer.update();
        }

    }

    @Override
    public Object getUpdate(Observer obj) {
        return this.message;
    }

    // method to post message to the topic
    public void postMessage(String msg) {
        System.out.println("Message Posted to Topic:" + msg);
        this.message = msg;
        this.changed = true;
        notifyObservers();
    }

}
