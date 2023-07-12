public class ReflectionClass extends Parent {

    public static Parent myMethod(int date){
        if (date == 1) {
            return new Heir1();
        } else if (date == 3) {
            return new Heir2();
        }
        else {
            return null;
        }
    }

    public static int getWeekdayDate(Class<?> clazz) {
        Weekday weekdayAnnotation = clazz.getAnnotation(Weekday.class);
            return weekdayAnnotation.weekday();
    }

}
