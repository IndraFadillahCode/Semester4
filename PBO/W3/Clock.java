package W3;

public class Clock
{
    public static void main (String[] args)
    {
        ClockDisplay jam = new ClockDisplay (11, 19);
        System.out.println(jam.getTime());
    }
}