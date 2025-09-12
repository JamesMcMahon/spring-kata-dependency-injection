package sh.jfm.springbootdemos.dependencyinjection.n07_bean_scopes;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.junit.jupiter.api.Assertions.assertNotSame;
import static org.junit.jupiter.api.Assertions.assertSame;

/// This kata demonstrates the two main bean scopes in Spring:
///
/// Singleton scope (default):
/// - Only one instance of the bean is created for the entire application context
/// - The same instance is shared across all requests and injections
///
/// Prototype scope:
/// - A new instance is created every time the bean is requested
/// - Each injection point gets its own unique instance
///
/// In the case of our Coffee Shop, we want there to be a single Coffee Shop,
/// but each Cup of coffee served should be unique.
@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes = BeanScopesConfig.class)
class N07BeanScopesTest {

    @Autowired
    CoffeeShop coffeeShop;

    @Autowired
    ApplicationContext context;

    @Test
    void coffeeShopIsASingleton() {
        CoffeeShop anotherReference = context.getBean(CoffeeShop.class);
        assertSame(coffeeShop, anotherReference, "CoffeeShop should be a singleton bean");
    }

    @Test
    void pouringTwiceGivesDifferentCups() {
        Cup first = coffeeShop.pourCup();
        Cup second = coffeeShop.pourCup();
        assertNotSame(first, second, "Each cup should be a fresh instance");
    }
}
