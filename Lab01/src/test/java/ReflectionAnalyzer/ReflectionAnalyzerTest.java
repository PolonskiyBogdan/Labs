package ReflectionAnalyzer;

import org.junit.Test;

public class ReflectionAnalyzerTest {
    ReflectionAnalyzer rf = new ReflectionAnalyzer();
    @Test(timeout = 1000)
    public void analyzer_Time() {
        rf.analyzer();
    }
}