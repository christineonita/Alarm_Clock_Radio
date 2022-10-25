import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Clock {
    protected String currentTime;
    int hour;
    int minute;

    public void setCurrentTime(int hour, int minute) {
        this.hour = hour;
        this.minute = minute;

        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.HOUR_OF_DAY,hour);
        cal.set(Calendar.MINUTE,minute);
        SimpleDateFormat ft = new SimpleDateFormat ("h:mm a");

        this.currentTime = ft.format(cal.getTime());
    }

    public String getCurrentTime() {
        return this.currentTime;
    }

    public void tick() {
        setCurrentTime(hour, minute+1);
    }
}
