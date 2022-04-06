import com.datawiza.demo.vo.Animal;
import com.datawiza.demo.vo.Species;
import org.junit.Test;
import org.springframework.beans.BeanWrapper;
import org.springframework.beans.PropertyAccessorFactory;
import org.springframework.beans.PropertyValue;

public class BeanWrapperTest {

    @Test
    public void testBeanWrapper() {
        Animal animal = new Animal();
        BeanWrapper beanWrapperOfAnimal = PropertyAccessorFactory.forBeanPropertyAccess(animal);
        PropertyValue nameValue = new PropertyValue("name", "orca");
        PropertyValue speciesValue = new PropertyValue("species", new Species());
        PropertyValue speciesNameValue = new PropertyValue("species.name", "dolphins");
        PropertyValue distributionsValue = new PropertyValue("distributions", "North Africa");

        beanWrapperOfAnimal.setPropertyValue(nameValue);
        beanWrapperOfAnimal.setPropertyValue(speciesValue);
        beanWrapperOfAnimal.setPropertyValue(speciesNameValue);
        beanWrapperOfAnimal.setPropertyValue(distributionsValue);

        System.out.println(animal);
        System.out.println(beanWrapperOfAnimal.getPropertyValue("species.name"));
        System.out.println(beanWrapperOfAnimal.getPropertyValue("distributions[0]"));
        System.out.println(beanWrapperOfAnimal.getWrappedInstance());
    }
}
