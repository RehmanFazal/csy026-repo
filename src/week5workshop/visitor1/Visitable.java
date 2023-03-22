package week5workshop.visitor1;
/**
 * a behavioural pattern used to manage algorithms, 
 * relationships and responsibilities between objects
 * it separates data from the different operations on it
 */

/**
 * Example - consider a postage system
 * Data - the item being posted whose cost depends on weight, and type of item
 * and where it is being shipped to.
 * 
 *we create a seperate visitor for each postal region. 
 *This seperates the logic of calculating the total postage cost 
 *from the items themselves. 
 *individual elements don't need to know anything about the postal cost policy
 * 
 */

/**
 * The general visitable  interface
 */ 
public interface Visitable
{
   
     public void accept(Visitor visitor);
}


