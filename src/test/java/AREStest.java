import static org.junit.jupiter.api.Assertions.assertNotNull;
import org.junit.jupiter.api.Test;

public class AREStest{
    @Test 
    void canCreateAresApplication(){
        ARES application = new ARES();

        assertNotNull(application);
    }
}