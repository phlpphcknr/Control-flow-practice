public class ControlFlowApp {

    public static String personCapacityAlarm(int personNum, String alarmLevel) {

        int threshold = alarmLevelToThreshold(alarmLevel);

        if (personNum > threshold) {
            return "Maximum number of persons is exceeded";
        }
        return "Maximum number of persons not exceeded";
    }

    public static int alarmLevelToThreshold(String alarmLevel) {
        switch (alarmLevel) {
            case "green":
                return 60;
            case "yellow":
                return 30;
            default:
                return 0;
        }

    }
}