package users;

import com.intuit.karate.Results;
import com.intuit.karate.Runner;
import org.junit.jupiter.api.Test;

public class TestRunner {

    @Test
    void testParallel(){
        Results results = Runner.path("classpath:users").tags("~@ignore").parallel(4);
    }

}
