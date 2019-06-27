package chapter11_ex13;

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
public class GreenHouseControls extends Controller {
    private boolean light = false;
    public class LightsOn extends Event {
        public LightsOn(long delayTime){ super(delayTime); }
        @Override
        public void action() {
            // włączenie światła
            light = true;
        }
        public String toString() { return "Światłą włączone!"; }
    }
    public class LightsOff extends Event {
        public LightsOff(long delayTime) { super(delayTime); }
        @Override
        public void action() {
            //fizyczne wyłączenie światła
            light = false;
        }
        public String toString() { return "Światła wyłączone!"; }
    }
    private boolean water = false;
    public class WaterOn extends Event {
        public WaterOn(long delayTime) { super(delayTime); }
        @Override
        public void action() {
            water = true;
        }
        public String toString() { return "Obieg wody w szkłarni włączony!"; }
    }
    public class WaterOff extends Event {
        public WaterOff(long delayTime) { super(delayTime); }
        @Override
        public void action() {
            water = false;
        }
        public String toString() { return "Obieg wody w szkłarni wyłączony!"; }
    }
    //Fan controls
    private boolean fan = false;
    public class FanOn extends Event {
        public FanOn(long delayTime) { super(delayTime); }
        @Override
        public void action() {
            //fizyczne włączenie wentylatora
            fan = true;
        }
        public String toString() { return "Wentylator włączony!"; }
    }
    public class FanOff extends Event {
        public FanOff(long delayTime) { super(delayTime); }
        @Override
        public void action() {
            //fizyczne wyłączenie wentylatora
            fan = false;
        }
        public String toString() { return "Wentylator wyłączony!"; }
    }
    public class Bell extends Event {
        public Bell(long delayTime) { super(delayTime); }
        @Override
        public void action() {
            addEvent(new Bell(delayTime));
        }
        public String toString() { return "Dzyń! " + new Date().getTime(); }
        
    }
    public class Restart extends Event {
        private Event[] eventList;
        public Restart(long delayTime, Event[] eventList) {
            super(delayTime);
            this.eventList = eventList;
            for(Event e: eventList) {
                addEvent(e);
            }
        }

        @Override
        public void action() {
            for(Event e: eventList) {
                e.start();
                addEvent(e);
            }
            start();
            addEvent(this);
        }
        public String toString() { return "Restart systemu"; }
        
    }
    public class Terminate extends Event {
        public Terminate(long delayTime) { super(delayTime); }
        @Override
        public void action() {
            System.exit(0);
        }
        public String toString() { return "Koniec"; }
    }
}
