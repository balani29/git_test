/**
 * This is the class connected to TInterface that creates and extends the exception.
 * 
 * @author (Adriano Balani) 
 * @version (10/14/2015)
 */
public class DeleteElementException extends RuntimeException
{
  public DeleteElementException()
  {
    super();
  }

  public DeleteElementException(String message)
  {
    super(message);
  }
}
