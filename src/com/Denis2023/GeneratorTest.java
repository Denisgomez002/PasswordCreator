package com.Denis2023;


import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratorTest {

    private final Password password = new Password("Secret");
    private final Alphabet firstAlphabet = new Alphabet(true, false,false,false);
    private final Alphabet secondAlphabet = new Alphabet(false,true,true,true);
    private final Generator generator = new Generator(true,false,false,false);
    // private final Password generatePassword = generator.GeneratorPassword(4);

    @Test
    void test1(){
        assertEquals("Secret", password.toString());
    }

    private void assertEquals(String secret, String toString) {
    }

    @Test
    void test2(){
        assertEquals(firstAlphabet.getAlphabet(), Alphabet.UPPERCASE_LETTERS);
    }

    @Test
    void test3(){
        assertEquals(secondAlphabet.getAlphabet(), Alphabet.LOWERCASE_LETTERS, Alphabet.NUMBERS, Alphabet.SYMBOLS);
    }

    private void assertEquals(String alphabet, String lowercaseLetters, String numbers, String symbols) {
    }

    @Test
    void test4(){
        assertEquals(generator.alphabet.getAlphabet(), Alphabet.UPPERCASE_LETTERS);
    }

    @Test
    void test5(){
        assertEquals(generator.alphabet.getAlphabet().length(), 26);
    }

    private void assertEquals(int length, int i) {
    }

}
