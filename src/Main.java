import java.util.Calendar;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        AlarmClock alarm = new AlarmClock(Calendar.getInstance());
        Radio radio = new Radio();


        AlarmClockRadio cl = new AlarmClockRadio(alarm, radio);

        cl.setCurrentTime(8,0);
        cl.turnAlarmOn();
        cl.setAlarm(8,5);
        String alarmTime = cl.getAlarm();
        cl.setRadioStation("1060 AM");

        System.out.println("Time: " + cl.getCurrentTime() + " The radio was turned on and is playing " + cl.getRadioStation() + ".");

        TimeUnit.SECONDS.sleep(1);
        cl.tick();

        for (int i = 0; i < 5; i++) {
            System.out.println("Time: " + cl.getCurrentTime());
            cl.checkAlarm();
            for (int sec = 0; sec < 1; sec++) {
                TimeUnit.SECONDS.sleep(1);
            }
            cl.tick();
        }

        cl.snooze();

        for (int j = 0; j < 9; j++) {
            System.out.println("Time: " + cl.getCurrentTime());
            cl.checkAlarm();
            for (int secs = 0; secs < 1; secs++) {
                TimeUnit.SECONDS.sleep(1);
            }
            cl.tick();
        }

        cl.turnAlarmOff();
        System.out.println("The alarm time is " + alarmTime);
    }
}