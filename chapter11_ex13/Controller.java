package chapter11_ex13;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
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
    private List<Event> eventList = new LinkedList<>();
    public void addEvent(Event c) {eventList.add(c);}
    public void run() {
//        while(eventList.size() > 0) {
            
            List copyEventList =  new LinkedList<>(eventList);
            Iterator<Event> it = copyEventList.iterator();
            
            while(eventList.size() > 0) {
                while(it.hasNext()) {
                    Event e = it.next();
                    if(e.ready()) {
                        System.out.println(e);
                        e.action();
                        eventList.remove(e);
                    }
                }
                    it = new LinkedList<>(eventList).iterator();
            
            }
            
            
            
//            for(Event e: new LinkedList<Event>(eventList)) {
//                if(e.ready()) {
//                    System.out.println(e);
//                    e.action();
//                    eventList.remove(e);
//                }
//            }
//        }
    }
}
