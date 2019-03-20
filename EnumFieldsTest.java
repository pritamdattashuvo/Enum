

import org.junit.jupiter.api.Test;

import org.junit.After;
import org.junit.Before;
import java.util.ArrayList;
import java.util.Iterator;
import static org.junit.Assert.assertTrue;
public class EnumFieldsTest {
   private EnumFields enumFields;
   @Before
   public void setUp() {
       enumFields = new EnumFields();
   }
   @After
   public void tearDown() {
       enumFields = null;
   }
   @Test
   public void enumFieldsTest() {
       ArrayList<String> result = enumFields.enumFields();
       Iterator iterator = result.iterator();
       while (iterator.hasNext()){
           System.out.println(iterator.next());
       }
       assertTrue(result.contains("SUN"));
   }
}
