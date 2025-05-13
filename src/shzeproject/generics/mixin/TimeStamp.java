package shzeproject.generics.mixin;

import java.util.Date;

public class TimeStamp implements ITimeStamp{
    private final long timeStamp;

    public TimeStamp() {
        Date date = new Date();
        this.timeStamp = date.getTime();
    }

    @Override
    public long getStamp() {
        return timeStamp;
    }
}
