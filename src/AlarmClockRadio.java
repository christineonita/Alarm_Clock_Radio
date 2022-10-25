public class AlarmClockRadio {

    private AlarmClock alarmClock;
    private Radio radio;

    public AlarmClockRadio(AlarmClock al, Radio ra) {
        this.alarmClock = al;
        this.radio = ra;
    }

    public void setRadioStation(String station) {
        radio.setRadioStation(station);
    }

    public String getRadioStation() {
        return radio.getRadioStation();
    }

    public void setAlarm(int hour, int minute) {
        alarmClock.setAlarm(hour, minute);
    }
    public void turnAlarmOff(){
        alarmClock.turnAlarmOff();
    }

    public boolean isAlarmOn(){
        return alarmClock.isAlarmOn();
    }

    public void turnAlarmOn(){
        alarmClock.turnAlarmOn();
    }

    public void snooze() {
        alarmClock.snooze();
    }

    public void checkAlarm() {
        if (isAlarmOn() && (getCurrentTime().equalsIgnoreCase(alarmClock.getAlarm()) || getCurrentTime().equalsIgnoreCase(alarmClock.getNewAlarm()))) {
            System.out.println("The radio is playing " + getRadioStation());
        }
    }

    public void setCurrentTime(int hour, int minute) {
        alarmClock.setCurrentTime(hour, minute);
    }

    public String getCurrentTime() {
        return alarmClock.getCurrentTime();
    }

    public void tick() {
        alarmClock.tick();
    }

    public String getAlarm() {
        return alarmClock.getAlarm();
    }
}
