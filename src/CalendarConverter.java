public class CalendarConverter {

    public static final int MONDAY = 1;
    public static final int TUESDAY = 2;
    public static final int WEDNESDAY = 3;
    public static final int THURSDAY = 4;
    public static final int FRIDAY = 5;
    public static final int SATURDAY = 6;
    public static final int SUNDAY = 7;

    public static String convertDayToString(int dayNumber){
        String dayName = "";
        switch(dayNumber){
            case MONDAY:
                dayName = "Poniedziałek";
                break;
            case TUESDAY:
                dayName = "Wtorek";
                break;
            case WEDNESDAY:
                dayName = "Sroda";
                break;
            case THURSDAY:
                dayName = "Czwartek";
                break;
            case FRIDAY:
                dayName = "Piątek";
                break;
            case SATURDAY:
                dayName = "Sobota";
                break;
            case SUNDAY:
                dayName = "Niedziela";
                break;
            default:
                return "Błąd";
        }
        return dayName;
    }
}
