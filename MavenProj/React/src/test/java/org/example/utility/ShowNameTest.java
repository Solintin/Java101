package org.example.utility;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class ShowNameTest {

    @Test
    void show() {
//        ShowName showName = new ShowName();
        assertEquals("Alley", ShowName.show("Alley"));
    }
}

