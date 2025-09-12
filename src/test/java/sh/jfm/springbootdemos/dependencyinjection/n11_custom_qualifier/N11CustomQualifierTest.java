package sh.jfm.springbootdemos.dependencyinjection.n11_custom_qualifier;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

/// Spring's [Qualifier] annotation lets us choose between multiple candidate beans that share the same type.
///
/// When the built-in qualifier is not expressive enough, we can declare our *own* annotation and mark both
/// beans **and** injection points with it.  Any annotation annotated with `@Qualifier` becomes
/// a **custom qualifier** understood by Spring.
///
/// In this kata we create a [Berry] qualifier so that only *berry* flavors are injected into the
/// [Blender].
@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes = CustomQualifierConfig.class)
class N11CustomQualifierTest {

    @Autowired
    Blender blender;

    @Test
    void smoothieHasOnlyBerryFlavours() {
        var smoothie = blender.blend();
        assertTrue(smoothie.contains("Strawberry"), "Smoothie should contain Strawberry flavor");
        assertTrue(smoothie.contains("Blueberry"), "Smoothie should contain Blueberry flavor");
        assertFalse(smoothie.contains("Banana"), "Smoothie should not contain Banana flavor");
    }
}
