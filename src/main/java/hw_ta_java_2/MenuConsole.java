package hw_ta_java_2;

public enum MenuConsole {

    ADD("1) ADD new object"),
    REMOVE("2) REMOVE old object"),
    SHOW("3) SHOW list of objects"),
    SORT("4) SORT list of objects"),
    EXIT("5) EXIT from program");

    String option;

    MenuConsole(String option) {
        this.option = option;
    }

    @Override
    public String toString() {

        return option;
    }
}
