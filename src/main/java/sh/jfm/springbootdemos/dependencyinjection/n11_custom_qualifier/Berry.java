package sh.jfm.springbootdemos.dependencyinjection.n11_custom_qualifier;

import org.springframework.beans.factory.annotation.Qualifier;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/// Marks beans and injection points that represent *berry* flavours.
///
/// Any annotation that itself carries [org.springframework.beans.factory.annotation.Qualifier]
/// becomes a **custom qualifier** understood by Spring.
@Target({ElementType.TYPE, ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
@Qualifier
public @interface Berry {
}
