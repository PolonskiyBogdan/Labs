import ReflectionAnalyzer.ReflectionAnalyzer;

/**
 *  Main is a class where Analyze methods are summoned <br>
 * @author Polonskiy
 * @version 1.2
 */

public class Main {
     /**
     * Main Method used for summoning Analyze methods <br>
     * @param args command line values
     */
    public static void main(String[] args) {

        ReflectionAnalyzer reflectionAnalyzer = new ReflectionAnalyzer();
        reflectionAnalyzer.analyzer();
    }
}
