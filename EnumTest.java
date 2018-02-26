public class EnumTest {
    Day day;

    public EnumTest(Day day){
        this.day=day;
    }

    public void print(){
        switch(day){
            case MONDAY:
                System.out.println("Que flojera.");
                break;
            case FRIDAY:
                System.out.println("Mejoro la semana.");
                break;
            case SATURDAY: case SUNDAY:
                System.out.println("Los fines de semana son lo mejor.");
                break;
            default:
                System.out.println("Media semana no me gusta.");
                break;
        }
    }
}
