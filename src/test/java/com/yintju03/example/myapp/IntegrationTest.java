package com.yintju03.example.myapp;

import com.yintju03.example.myapp.MyApp;
import com.yintju03.example.myapp.RedisTestContainerExtension;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * Base composite annotation for integration tests.
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@SpringBootTest(classes = MyApp.class)
@ExtendWith(RedisTestContainerExtension.class)
public @interface IntegrationTest {
}
