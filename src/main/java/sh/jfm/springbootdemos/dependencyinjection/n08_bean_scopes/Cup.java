package sh.jfm.springbootdemos.dependencyinjection.n08_bean_scopes;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/// Bean that represents a single cup of coffee.
/// Each request for this bean should create a new instance.
@Component
// Scope defaults to singleton, so you won't often see this annotation written in the case a singleton is needed.
@Scope("singleton")
public class Cup {
}
