package com.example.oop.cook;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThatCode;

/**
 * 도메인을 구성하는 객체에는 어떤 것들이 있는지 고민
 * ㄴ손님, 메뉴판(0), 돈까스/냉면/만두(0), 요리사(0), 요리(0)
 * 객체들 간의 관계를 고민
 * ㄴ 손님 -- 메뉴판
 * ㄴ 손님 -- 요리사
 * ㄴ 요리사 -- 요리
 * 동적인 객체를 정적인 타입으로 추상화해서 도메인 모델링 하기
 * 협력을 설계
 * 객체들을 포괄하는 타입에 적절한 책임을 할당
 * 구현하기
 */
public class CustomerTest {

    @DisplayName("메뉴이름에 해당하는 메뉴를 주문한다.")
    @Test
    void orderTest(){
        Customer customer = new Customer();
        Menu menu = new Menu(List.of(new MenuItem("돈까스",5000), new MenuItem("냉면", 7000)));
        Cooking cooking = new Cooking();

        assertThatCode(() -> customer.order("돈까스", menu, cooking))
                .doesNotThrowAnyException();
    }
}
