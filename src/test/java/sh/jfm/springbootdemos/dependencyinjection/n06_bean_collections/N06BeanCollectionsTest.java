package sh.jfm.springbootdemos.dependencyinjection.n06_bean_collections;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.junit.jupiter.api.Assertions.assertTrue;

/// Spring supports multiple beans being injected as a [java.util.Collection]
@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes = BeanCollectionsConfig.class)
public class N06BeanCollectionsTest {

    @Autowired
    private Pizza pizza;

    @Test
    void hasAllTheToppings() {
        assertTrue(pizza.toppings().contains("peppers"), "Pizza should have peppers");
        assertTrue(pizza.toppings().contains("onions"), "Pizza should have onions");
        assertTrue(pizza.toppings().contains("sausage"), "Pizza should have sausage");
    }
}
