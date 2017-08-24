
/**
 * This program generates a clock.
 *
 * @Joe Diaz
 * @version 1.0 (8/23/2017)
 */
public class Clock
{
    // instance variables - replace the example below with your own
    private int hours;
    private int minutes;
    private int tickTock;

    /**
     * Constructor for objects of class Clock
     */
    public Clock(int Inihr, int Inimin)
    {
        // initialise instance variables
        hours = Inihr;
        minutes = Inimin;
        tickTock = 01;
    }

    /**
     * creates a string concatenate
     */
    public String actualTime()
    {
        String cadResult = "";
        cadResult += hours;
        cadResult += " : ";
        cadResult += minutes;
        return cadResult;
    }
    
    /**
     * creates the tickTock method
     */
    void ticToc()
    {
        minutes += tickTock;
        if(minutes > 59)
        {
            hours += 1;
            minutes = 00;
        }
        if(hours > 23)
            {
                hours = 00;
            }
    }
}
