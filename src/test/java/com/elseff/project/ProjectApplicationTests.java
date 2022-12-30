package com.elseff.project;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

class ProjectApplicationTests {

    @Test
    void contextLoads() {
        int number1 = 5;
        int number2 = 10;
        int sum = number1 + number2;
        Assertions.assertEquals(17, sum);
    }

}
