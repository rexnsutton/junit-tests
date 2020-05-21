import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class StudentTest {
  Student rex;
  @Before
  public void setUp(){
    rex = new Student(6666666,"rex");

  }

  @Test
    public void testGetId(){
      assertEquals(6666666, rex.getId());
  }
  @Test
  public void testGetName(){
    assertEquals("rex", rex.getName());
  }
  @Test
  public void testIfGradesWorks(){
    assertEquals(0, rex.getGrades().size());
  }
  @Test
  public void testIfAddGradeWorks(){
    rex.addGrade(80);
    assertTrue(80 == rex.getGrades().get(0));
  }



  @Test
  public void testGetAverage(){
    rex.addGrade(50);
    rex.addGrade(60);
    assertEquals(55, (rex.getGrades().get(0) + rex.getGrades().get(1)) / rex.getGrades().size());
  }

}



