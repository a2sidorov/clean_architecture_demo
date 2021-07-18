package com.example.demo.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {

    private User testee;

    @Test
    void setGenerationBabyBoomerTest() {
        // given
        testee = new User("test", "test", 1946);

        // when
        testee.setGeneration();

        // then
        assertEquals(testee.getGeneration(), Generation.BABY_BOOMER);
    }

    @Test
    void setGenerationXTest() {
        // given
        testee = new User("test", "test", 1965);

        // when
        testee.setGeneration();

        // then
        assertEquals(testee.getGeneration(), Generation.X);
    }

    @Test
    void setGenerationMillenialsTest() {
        // given
        testee = new User("test", "test", 1981);

        // when
        testee.setGeneration();

        // then
        assertEquals(testee.getGeneration(), Generation.MILLENNIALS);
    }

    @Test
    void setGenerationZTest() {
        // given
        testee = new User("test", "test", 1997);

        // when
        testee.setGeneration();

        // then
        assertEquals(testee.getGeneration(), Generation.Z);
    }

    @Test
    void setGenerationAlphaTest() {
        // given
        testee = new User("test", "test", 2010);

        // when
        testee.setGeneration();

        // then
        assertEquals(testee.getGeneration(), Generation.ALPHA);
    }
}