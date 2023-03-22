package week5workshop.command;

/*
 * concrete command
 * Receiver again is Light object
 * Knows what to do
 * Action to be done is in implemented execute() method
 * 
 * 
 */
public class LightOffCommand implements Command{

	private Light myLight;
    
	public LightOffCommand (Light L) {
            myLight  =  L;
    }
    public void execute() {
            myLight.turnOff();
    }

}


/*
 * LightOnCommand, implements the execute operation of the command interface. 
 * It has the knowledge to call the appropriate Receiver object's operation...turnOff()
 */
