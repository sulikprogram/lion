import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
public class AnimalTest {

    public static Animal animal;

    @BeforeAll
    public static void createAnimal(){
        animal = new Animal(4, "Tom", false, 12.5, 40.7, 4);
    }

    @AfterAll
    public static void testNoArgsConstructor(){
        animal = new Animal();
    }

    @Test
    public void testNumOfLegs(){
        animal.setNumOfLegs(4);
        Assertions.assertEquals(4, animal.getNumOfLegs());
    }

    @Test
    public void testName(){
        animal.setName("John");
        Assertions.assertEquals("John", animal.getName());
    }

    @Test
    public void testWeight(){
        animal.setWeight(9.6);
        Assertions.assertEquals(9.6, animal.getWeight());
    }

    @Test
    public void testHeight(){
        animal.setHeight(40.3);
        Assertions.assertEquals(40.3, animal.getHeight());
    }

    @Test
    public void testAge(){
        animal.setAge(12);
        Assertions.assertEquals(12, animal.getAge());
    }

    @Test
    public void testToString(){
        animal = new Animal(4, "Tom", false, 12.5, 40.7, 4);
        Assertions.assertEquals("Animal{name='Tom', weight=12.5, height=40.7, age=4}", animal.toString());
    }

}
