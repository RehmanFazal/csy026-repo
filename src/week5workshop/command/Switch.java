package week5workshop.command;

/*
 * This Switch class is the invoker
 * it comprises an aggregation of Command objects
 * has two operations flipup and flipdown
 * performs callbacks to the execute() method of command interface
 */

public class Switch {

	private Command UpCommand, DownCommand;
    public Switch( Command up, Command down) {
            UpCommand = up; // concrete Command registers itself with the invoker 
            DownCommand = down;
    }
 // invoker calls back concrete Command, which executes the Command on the receiver 
    public void flipUp() { 
              UpCommand.execute() ;                           
    }
    public  void flipDown() {
              DownCommand.execute();
    }
}


/*
 * Command pattern decouples invoker from the receiver
 * 
 */
