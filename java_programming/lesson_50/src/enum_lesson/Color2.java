package enum_lesson;

public enum Color2 {
    GREEN(10, "зел."),
    BLUE(20, "син."),
    RED(30, "кр."),
    BLACK(0, "ч.");
    private int intValue;
    private String stringValue;

    Color2(int intValue, String stringValue) {
        this.intValue = intValue;
        this.stringValue = stringValue;
    }

    public int getIntValue() {
        return intValue;
    }

    public String getStringValue() {
        return stringValue;
    }
}
