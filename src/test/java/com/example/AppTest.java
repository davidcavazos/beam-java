package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AppTest {
    @Test
    public void appRuns() {
        App app = new App();
        app.main(new String[] {});
        assertEquals(1 + 1, 2);
    }
}
