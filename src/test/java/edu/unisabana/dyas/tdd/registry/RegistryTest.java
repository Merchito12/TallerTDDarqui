package edu.unisabana.dyas.tdd.registry;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class RegistryTest {

    private Registry registry = new Registry();

    @Test
    public void shouldReturnValidWhenPersonIsEligible() {
        Person person = new Person("Laura", 1, 25, Gender.FEMALE, true);
        RegisterResult result = registry.registerVoter(person);
        assertEquals(RegisterResult.VALID, result);
    }

    @Test
    public void shouldReturnDeadWhenPersonIsNotAlive() {
        Person person = new Person("Carlos", 2, 40, Gender.MALE, false);
        RegisterResult result = registry.registerVoter(person);
        assertEquals(RegisterResult.DEAD, result);
    }

    @Test
    public void shouldReturnUnderageWhenPersonIsYoungerThan18() {
        Person person = new Person("Ana", 3, 16, Gender.FEMALE, true);
        RegisterResult result = registry.registerVoter(person);
        assertEquals(RegisterResult.UNDERAGE, result);
    }

    @Test
    public void shouldReturnInvalidAgeWhenPersonHasNegativeAge() {
        Person person = new Person("Pedro", 4, -5, Gender.MALE, true);
        RegisterResult result = registry.registerVoter(person);
        assertEquals(RegisterResult.INVALID_AGE, result);
    }

    @Test
    public void shouldReturnDuplicatedWhenPersonRegistersTwice() {
        Person person = new Person("María", 5, 30, Gender.FEMALE, true);
        registry.registerVoter(person); // primera vez
        RegisterResult result = registry.registerVoter(person); // duplicado
        assertEquals(RegisterResult.DUPLICATED, result);
    }
}
