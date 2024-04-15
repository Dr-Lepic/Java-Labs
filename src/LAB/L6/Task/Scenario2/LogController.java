package LAB.L6.Task.Scenario2;

public class LogController implements Logger{

    private Logger logger;

    public void setLogger(Logger logger1)
    {
        this.logger=logger1;
    }
    public void log(String logger1)
    {
        if (logger !=null)
        {
            logger.log(logger1);
        }
        else
        {
            System.out.println("Enter a valid logger");
        }
    }
}
