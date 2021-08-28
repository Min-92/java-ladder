package nextstep.ladder.domain.participant;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;

class NameTest {

    @ParameterizedTest
    @DisplayName("이름은 1~5글자여야 한다")
    @ValueSource(strings = {"a", "ab", "abc", "abcd", "abcde"})
    void validLengthTest(String value) {
        assertDoesNotThrow(() -> new Name(value));
    }

    @ParameterizedTest
    @DisplayName("이름은 5글자를 넘을 수 없다")
    @ValueSource(strings = {"aaaaaa", "aaaaaaa"})
    void invalidLengthTest(String value) {
        assertThrows(IllegalStateException.class, () -> new Name(value));
    }

}