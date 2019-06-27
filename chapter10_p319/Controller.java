package chapter10_p319;


import java.util.ArrayList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Fujitsu V6505
 */
public class Controller {
    private List<Event> eventList = new ArrayList<>();
    public void addEvent(Event c) {eventList.add(c);}
    public void run() {
        while(eventList.size() > 0) {
            for(Event e: new ArrayList<Event>(eventList)) {
                if(e.ready()) {
                    System.out.println(e);
                    e.action();
                    eventList.remove(e);
                }
            }
        }
    }
}
