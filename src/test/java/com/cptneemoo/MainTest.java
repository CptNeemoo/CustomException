package com.cptneemoo;

import com.cptneemoo.exception.DivisionByZeroException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MainTest {

    @Test
    void main() {
        Assertions.assertThrows(DivisionByZeroException.class, () -> Main.main(null));
    }
}