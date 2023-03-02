package org.example.sprint_3.a_09_pesel;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class PeselTest {
    @Test
    void shouldReturnTruePesel() {
        String pesel = "02070803628";
        boolean result = Pesel.validatePesel(pesel);
        assertTrue(result);
    }

    @Test
    void shouldReturnFalsePesel() {
        String pesel = "02070803621";
        boolean result = Pesel.validatePesel(pesel);
        assertFalse(result);
    }
}