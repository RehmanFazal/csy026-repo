package week5workshop.command;

/*
 * Concrete Command
 * Stores Receiver and the action to be executed
 * Receiver here is Light object 
 * Receiver has the knowledge to carry out the request
 * Action is implementation of execute() method
 *
 */

public class LightOnCommand implements Command{
	private Light myLight;
    
	public LightOnCommand (Light L) { 
            myLight  =  L;
    }
    public void execute() {
            myLight.turnOn( );
    }

}

/*
 * LightOffCommand, implements the execute operation of the command interface. 
 * It has the knowledge to call the appropriate Receiver object's operation...turnOn()
 */