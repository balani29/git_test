
/**
 * This is the class Implements TLogInterface using a linked list 
 * of LLNode to hold the log elements.
 * @author (Adriano Balani) 
 * @version (10/14/2015)
 */
 

public class LinkedTLog<T> implements TLogInterface<T>
{
  protected LLNode log; // reference to first node of linked 
                              // list that holds the StringLog strings
  protected String name;      // name of this StringLog
  
  public LinkedTLog(String name)
  // Instantiates and returns a reference to an empty StringLog object 
  // with name "name".
  {
    log = null;
    this.name = name;
  }

  public void insert(T element)
  // Precondition:   This StringLog is not full.
  //
  // Places element into this StringLog.
  {      
    LLNode<T> newNode = new LLNode<T>(element);
    newNode.setLink(log);
    log = newNode;
  }

  public boolean isFull()
  // Returns true if this StringLog is full, false otherwise.
  {              
    return false;
  }
  
  public int size()
  // Returns the number of Strings in this StringLog.
  {
    int count = 0;
    LLNode<T> node;
    node = log;
    while (node != null)
    {
      count++;
      node = node.getLink();
    }
    return count;
  }
  
  public boolean contains(T element)
  // Returns true if element is in this StringLog,
  // otherwise returns false.
  // Ignores case difference when doing string comparison.
  {                 
    LLNode node;
    node = log;

    while (node != null) 
    {
      if (element.equals(node.getInfo()))  // if they match
        return true;
      else
        node = node.getLink();
    }

   return false;
  }
  
  public void clear()
  // Makes this StringLog empty.
  { 
    log = null;
  }

  public String getName()
  // Returns the name of this StringLog.
  {
    return name;
  }

  public String toString()
  // Returns a nicely formatted string representing this StringLog.
  {
    String logString = "Log: " + name + "\n\n";
    LLNode node;
    node = log;
    int count = 0;
    
    while (node != null)
    {
      count++;
      logString = logString + count + ". " + node.getInfo() + "\n";
      node = node.getLink();
    }
      
    return logString;
  }
  
  public void delete(T element){
      if(!contains(element)){
          throw new DeleteElementException();
        }
        LLNode mNode;
        mNode = log;
        int i = 0;
        for(i =0; i <size(); i++){
              if(mNode.getInfo() == element){
              mNode.setInfo(log.getInfo());
              log = log.getLink();
              
            }
            else { 
                mNode = mNode.getLink();
            }
        }
    }
  
  // from section 4.5

}