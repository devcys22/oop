package com.example.oop.cook;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThatCode;

public class MenuItemTest {

    @DisplayName("메뉴를 생성한다.")
    @Test
    void createTest(){
        assertThatCode(() -> new MenuItem("만두", 3000))
                .doesNotThrowAnyException();
    }
}
