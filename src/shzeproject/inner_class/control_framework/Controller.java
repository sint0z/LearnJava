package shzeproject.inner_class.control_framework;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Controller {
    private final List<Event> eventList = new LinkedList<>();
    private final Iterator<Event> it = eventList.iterator();

    public void addEvent(Event event){
        eventList.add(event);
    }

    public void run(){
        while(!eventList.isEmpty()){
            while(it.hasNext()){
                Event event = it.next();
                if(event.ready()){
                    System.out.println(event);
                    event.action();
                    eventList.remove(event);
                }
            }
        }
    }
}
