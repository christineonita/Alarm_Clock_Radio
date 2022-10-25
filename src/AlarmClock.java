import java.text.SimpleDateFormat;
import java.util.Calendar;

public class AlarmClock extends Clock{
    protected String alarmTime;
    protected String newAlarmTime;
    private int hour;
    private int minute;
    Calendar cal;
    SimpleDateFormat ft = new SimpleDateFormat ("h:mm a");

    AlarmClock (Calendar c){
        this.cal = Calendar.getInstance();

    }

    public void setAlarm(int hour, int minute) {
        this.hour = hour;
        this.minute = minute;

        cal.set(Calendar.HOUR_OF_DAY,hour);
        cal.set(Calendar.MINUTE,minute);

        this.alarmTime = ft.format(cal.getTime());
    }

    public String getAlarm() {
        return this.alarmTime;
    }

    public void turnAlarmOn(){
        setAlarm(this.hour, this.minute);
    }
    public void turnAlarmOff(){
        this.alarmTime = null;
        System.out.println("The alarm was shut off.");
    }

    public boolean isAlarmOn(){
        return getAlarm() != null;
    }
    public void snooze() {
        cal.set(Calendar.MINUTE,minute+9);

        this.newAlarmTime = ft.format(cal.getTime());

        System.out.println("Snooze was pressed");
    }

    public String getNewAlarm() {
        return this.newAlarmTime;
    }
}
