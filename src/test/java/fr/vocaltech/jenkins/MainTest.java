package fr.vocaltech.jenkins;

import fr.vocaltech.jenkins.models.Position;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    @Test
    void givenLatLg_whenNewPos_thenOk() {
        var position = new Position(45.5, 1.4);
        assertEquals(45.5, position.latitude());
        assertEquals(1.4, position.longitude());
        assertTrue(position.toString().startsWith("Position"));
    }
}