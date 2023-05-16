import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
class StudentVersionTest {
StudentVersion cal = new StudentVersion();

@Test
    void TestTheSumMethod() {
    assertEquals(5, cal.sumMethod(2, 3));
    if (true) {
        System.out.println("The Sum method is working.");
    }
}
    @Test
            void TestTheSubtractMethod(){
        assertEquals(5,cal.subtractMethod(8,3));
        if(true){
            System.out.println("The subtraction method is working.");
        }
    }

    @Test
    void TestTheMultiplyMethod(){
    assertEquals(25, cal.multiplyMethod(5,5));
    if(true){
        System.out.println("The multiplication method is working.");
    }
    }

    @Test
    void TestTheDivisionMethod(){
    assertEquals(5,cal.divideMethod(25,5));
    if(true) {
        System.out.println("The division method is working.");
    }
    }
}