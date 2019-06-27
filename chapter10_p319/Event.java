package chapter10_p319;

import java.util.Date;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Fujitsu V6505
 */
public abstract class Event {
    private long eventTime;
    protected final long delayTime;
    public Event(long delayTime) {
        this.delayTime = delayTime;
        start();
    }
    public void start() { // umożliwia restart
        eventTime = new Date().getTime() + delayTime;
    }
    public boolean ready() {
        return new Date().getTime() >= eventTime;
    }
    public abstract void action();
}
