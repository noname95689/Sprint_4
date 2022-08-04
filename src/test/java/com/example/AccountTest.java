package com.example;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class AccountTest {

    @Before
    public void beforeTests() {

    }

    @Test
    public void nameShorterThenThreeSymbolsReturnsFalse() {
        String name = "Аа";
        Boolean ExceptedValue = false;
        Account account = new Account(name);
        Assert.assertEquals("Имя из 2 символов возвращает не false", ExceptedValue , account.checkNameToEmboss());
    }

    @Test
    public void nameShorterThenThreeSymbolsPrintCorrectMessage() {

    }

    @Test
    public void nameLargerThenNineteenSymbolsReturnsFalse() {
        String name = "Аааааааааа ааааааааа";
        Boolean ExceptedValue = false;
        Account account = new Account(name);
        Assert.assertEquals("Имя из 20 символов возвращает не false", ExceptedValue , account.checkNameToEmboss());
    }

    @Test
    public void nameLargerThenNineteenSymbolsPrintCorrectMessage() {

    }

    @Test
    public void nameStartsWithSpaceReturnsFalse() {
        String name = " Аа";
        Boolean ExceptedValue = false;
        Account account = new Account(name);
        Assert.assertEquals("Имя начинающееся пробелом возвращает не false", ExceptedValue , account.checkNameToEmboss());
    }

    @Test
    public void nameStartsWithSpacePrintCorrectMessage() {

    }

    @Test
    public void nameEndsWithSpaceReturnsFalse() {
        String name = "Ааааааааааа ";
        Boolean ExceptedValue = false;
        Account account = new Account(name);
        Assert.assertEquals("Имя заканчивающееся пробелом возвращает не false", ExceptedValue , account.checkNameToEmboss());
    }

    @Test
    public void nameEndsWithSpacePrintCorrectMessage() {

    }

    @Test
    public void nameWithoutSpaceReturnsFalse() {
        String name = "ЕвгенийИванов";
        Boolean ExceptedValue = false;
        Account account = new Account(name);
        Assert.assertEquals("Имя начинающееся с пробела возвращает не false", ExceptedValue , account.checkNameToEmboss());
    }

    @Test
    public void nameWithoutSpacePrintCorrectMessage() {

    }

    @Test
    public void correctNameReturnsTrue() {
        String name = "Евгении Иванов";
        Boolean ExceptedValue = true;
        Account account = new Account(name);
        Assert.assertEquals("Удовлетворяющее условиям имя возвращает не true", ExceptedValue , account.checkNameToEmboss());
    }

    @Test
    public void correctNamePrintCorrectMessage() {

    }
}
