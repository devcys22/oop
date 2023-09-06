package com.example.oop.cook;

import com.example.oop.cook.Cook;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThatCode;

public class CookTest {

    @DisplayName("요리를 생성한다.")
    @Test
    void createTest(){
        assertThatCode(() -> new Cook("만두", 3000))
                .doesNotThrowAnyException();
    }
}
