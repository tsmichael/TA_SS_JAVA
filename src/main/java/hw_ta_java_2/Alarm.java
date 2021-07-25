package hw_ta_java_2;

public interface Alarm {

    default String turnAlarmOn() {
        return "Wiu-wiu-wiiiii";
    }

    default String turnAlarmOff() {
        return "Pook-up";
    }
}
