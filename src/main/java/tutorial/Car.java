package tutorial;

/**
 * Created by IT on 09.07.2015.
 */
public class Car {
    private  Engine engine;
    private String warningMessage;
    public Car(Engine engine)
    {
        this.engine=engine;
    }

    public String getWarningMessage() {
        return warningMessage;
    }

    public void accelerate()
    {
     engine.increaseRpm();
        if(engine.getRpm()>5000)
        warningMessage="Slow Down!";
    }
    public void setWarningMessage(String warningMessage) {
        this.warningMessage = warningMessage;
    }
}
