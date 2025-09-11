package sh.jfm.springbootdemos.dependencyinjection.n09_profiles;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;

/// A Spring [Profile] is a named, logical grouping of bean definitions and configuration
/// that should only be loaded for a specific runtime environment – for example,
/// `dev`, `prod` or `test`.
///
/// Spring decides which beans to register by looking at the list of
/// **active profiles**.  When a bean (or a `@Configuration` class)
/// is annotated with `@Profile("dev")` it will only be instantiated if the
/// `dev` profile is active.  In tests we usually toggle the profile with the
/// [@ActiveProfiles][org.springframework.test.context.ActiveProfiles] annotation.
///
/// This test starts an application context twice – once with the `dev` profile
/// and once with the `prod` profile – and asserts that the correct implementation
/// of [MessageService] is wired each time:
///
/// Having both nested tests pass simultaneously demonstrates that profile-based
/// bean selection gives us environment-specific behavior without conditional code.
class N09ProfilesTest {

    @Nested
    @ExtendWith(SpringExtension.class)
    @ActiveProfiles("dev")
    @ContextConfiguration(classes = n09Config.class)
    class DevProfileTest {
        @Autowired
        MessageService messageService;

        @Test
        void devMessageIsInjected() {
            assertEquals("Hello from dev", messageService.message());
        }
    }

    @Nested
    @ExtendWith(SpringExtension.class)
    @ActiveProfiles("prod")
    @ContextConfiguration(classes = n09Config.class)
    class ProdProfileTest {
        @Autowired
        MessageService messageService;

        @Test
        void prodMessageIsInjected() {
            assertEquals("Hello from prod", messageService.message());
        }
    }
}
