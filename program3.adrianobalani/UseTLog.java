
/**
 * Example of how to use T list.
 * 
 * @author (Adriano Balani) 
 * @version (10/14/2015)
 */
public class UseTLog
{
    public static void main(String[] args)
    { 
        TLogInterface sample;
        sample = new LinkedTLog("Example Use");
        sample.insert("Elvis");
        sample.insert(5);
        sample.insert("King Louis XII");
        sample.insert("Yoda");
        sample.insert("Captain Kirk");
        System.out.println(sample);
        System.out.println("The size of the log is " + sample.size());
        System.out.println("Elvis is in the log: " + sample.contains("Elvis"));
        System.out.println("Santa is in the log: " + sample.contains("Santa"));
        sample.delete(5);
        System.out.println(sample);
        sample.delete("Captain Kirk");
        System.out.println(sample);
        try {
            sample.delete("yellow");
            sample.delete("red");
        } catch (Exception e) {
            System.out.println("yellow: This word cannot be found in the list.");  
            System.out.println("red: This word cannot be found in the list.");
        }
        
    }
}