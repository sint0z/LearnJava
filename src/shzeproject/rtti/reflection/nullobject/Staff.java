package shzeproject.rtti.reflection.nullobject;

import java.util.ArrayList;

public class Staff extends ArrayList<Position> {
    public void append(String title, Person person){
        add(new Position(title,person));
    }

    public void append(String ...titles){
        for(String title : titles){
            add(new Position(title));
        }
    }

    public Staff(String ...titles){
        append(titles);
    }

    private boolean isAvailable(Position position, String title){
        return position.getTitle().equals(title) && position.getPerson() instanceof Null;
    }

    public boolean positionAvailable(String title){
        for(Position position : this){
            if(isAvailable(position, title)){
                return true;
            }
        }
        return false;
    }

    public void fillPosition(String title, Person person){
        for(Position position : this){
            if(isAvailable(position, title)){
                position.setPerson(person);
            }

            throw new RuntimeException("Position " + title + "not available");
        }
    
    }
}
