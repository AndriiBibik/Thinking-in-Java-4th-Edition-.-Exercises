/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter10_p319;

/**
 *
 * @author Fujitsu V6505
 */
public class GreenhouseController {
    public static void main(String[] args) {
        GreenHouseControlsExtended gce = new GreenHouseControlsExtended();
        gce.addEvent(gce.new Bell(1000));
        Event[] eventList = {
            gce.new LightsOn(1000),
            gce.new LightsOff(1800),
            gce.new WaterOn(1300),
            gce.new WaterOff(1400),
            gce.new FanOn(1500),
            gce.new FanOff(1600),
            gce.new FogOn(1650),
            gce.new FogOff(1700)
        };
        gce.addEvent(gce.new Restart(5000, eventList));
        gce.addEvent(gce.new Terminate(20000));
        gce.run();
    }
}
