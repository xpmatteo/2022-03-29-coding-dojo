package com.thoughtworks.italy;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class FooTest {
    private FizzBuzzGame fizzBuzzGame;

    @BeforeEach
    void setUp() {
        fizzBuzzGame = new FizzBuzzGame();
    }

    @Test
    void fizzBuzz2shouldBe1() {
        assertThat(fizzBuzzGame.say(1)).isEqualTo("1");
    }

    @Test
    void fizzBuzz2shouldBe2() {
        assertThat(fizzBuzzGame.say(2)).isEqualTo("2");
    }

    @Test
    void fizzBuzz3shouldBeFizz() {
        assertThat(fizzBuzzGame.say(3)).isEqualTo("Fizz");
    }

    @Test
    void fizzBuzz5shouldBeBuzz() {
        assertThat(fizzBuzzGame.say(5)).isEqualTo("Buzz");
    }

    @Test
    void fizzBuzz15shouldBeFizzBuzz() {
        assertThat(fizzBuzzGame.say(15)).isEqualTo("FizzBuzz");
    }

    @Test
    void fizzBuzz6shouldBeFizz() {
        assertThat(fizzBuzzGame.say(6)).isEqualTo("Fizz");
    }

    @Test
    void fizzBuzz10shouldBeBuzz() {
        assertThat(fizzBuzzGame.say(10)).isEqualTo("Buzz");
    }

    @Test
    void fizzBuzz0shouldBeFizzBuzz() {
        assertThat(fizzBuzzGame.say(0)).isEqualTo("FizzBuzz");
    }

    @Test
    void fizzBuzzNegative1ShouldBeNegative1() {
        assertThat(fizzBuzzGame.say(-1)).isEqualTo("-1");
    }

    @Test
    void fizzBuzz30ShouldBeFizzBuzz() {
        assertThat(fizzBuzzGame.say(30)).isEqualTo("FizzBuzz");
    }

    @Test
    void fizzBuzz13ShouldBeFizz(){
        assertThat(fizzBuzzGame.say(13)).isEqualTo("Fizz");
    }

    @Test
    void fizzBuzz300ShouldBeFizz(){
        assertThat(fizzBuzzGame.say(300)).isEqualTo("FizzBuzz");
    }

    @Test
    void fizzBuzz35ShouldBeFizz(){
        assertThat(fizzBuzzGame.say(35)).isEqualTo("FizzBuzz");
    }
}
