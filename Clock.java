/**
 * This program generates a clock.
 *
 * @Joe Diaz
 * @version 1.0 (8/23/2017)
 */
public class Clock
{
    private int hours;
    private int minutes;
    private int tickTock;

    /**
     * Constructor for objects of class Clock
     * @Inihr Is a stand-in for the hours variable
     * @Inimin Is a stand-in for the minutes variable
     */
    public Clock(int Inihr, int Inimin)
    {
        hours = Inihr;
        minutes = Inimin;
        tickTock = 01;
    }

    /**
     * creates a string concatenate to properly show a 24-hr clock.
     */
    public String actualTime()
    {
        String cadResult = "";
        if(hours < 10 && minutes < 10)
        {
            cadResult += "0";
            cadResult += hours;
            cadResult += ":0";
            cadResult += minutes;
        }
        if(hours < 10 && minutes >= 10)
        {
            cadResult += "0";
            cadResult += hours;
            cadResult += ":";
            cadResult += minutes;
        }
        if(hours >= 10 && minutes < 10)
        {
            cadResult += hours;
            cadResult += ":0";
            cadResult += minutes;
        }
        if(hours >= 10 && minutes >=10)
        {
            cadResult += hours;
            cadResult += ":";
            cadResult += minutes;
        }
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
            hours += 01;
            minutes = 00;
        }
        if(hours > 23)
            {
                hours = 00;
            }
    }
    
    /**
     * sets a new time without having to delete clock or generate a new one.
     * @param hrs Is a stand-in for the variable hours.
     * @param min Is a stand-in for the variable minutes.
     */
    void setNewTime(int hrs, int min)
    {
        if(hrs < 24){
            hours = hrs;
        }
        if(min < 60){
            minutes = min;
        }
    }
}
