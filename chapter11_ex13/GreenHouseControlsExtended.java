/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter11_ex13;


/**
 *
 * @author Fujitsu V6505
 */
public class GreenHouseControlsExtended extends GreenHouseControls {
    private boolean fog = false;
    public class FogOn extends Event {
        public FogOn(long delayTime) {
            super(delayTime);
        }
        @Override
        public void action() {
            //wł. mgły
            fog = true;
        }
        public String toString() { return "Mgła włączona!"; }
    }
    public class FogOff extends Event {
        public FogOff(long delayTime) { super(delayTime); }
        @Override
        public void action() {
            //wyłączenie mgły
            fog = false;
        }
        public String toString() { return "Mgła wyłączona!"; }
    }
}
