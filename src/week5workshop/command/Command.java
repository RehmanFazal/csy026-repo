package week5workshop.command;

/*
 * Command pattern is a data driven design pattern
 * it is a behavioral pattern category.
 * A request is wrapped under an object as command and passed to invoker object.
 * Invoker object looks for the appropriate object which can handle this command and passes
 * the command to the corresponding object which executes the command.
 */

/*
 *
 * The command interface is key to this pattern
 * The pattern exploits polymorphism to eliminate large switch statements, 
 * 
 */
public interface Command {
	public abstract void execute ();

}

/*
 * allows the complete decoupling between the sender and the receiver.
 * Sender -  an object that invokes an operation, 
 * Senders - are LightOnCommand, LightOffCommand, FanOnCommand & FanOffCommand
 * Receiver -  an object that receives the request to execute a certain operation. 
 * Receiver is the Switch class
 */

/*
 * Decoupling ensures that the sender has no knowledge of the Receiver's interface. 
 * 
 * request here refers to the command that is to be executed e.g., Light on, Light off
 */

