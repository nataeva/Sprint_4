import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
class AccountTest {

    public static Stream<Arguments> testCheckNameToEmboss() {
        return Stream.of(
                Arguments.of("Тимоти Шаламе", true),
                Arguments.of("Elena Nataeva", true),
                Arguments.of("ТимотейШевроле", false),
                Arguments.of("Elena Nataeva ", false),
                Arguments.of(" Elena Nataeva", false),
                Arguments.of(" Elena Nataeva ", false),
                Arguments.of("Elena  Nataeva", false),
                Arguments.of("El", false),
                Arguments.of("Elena IgorevnaNataeva", false)
        );
    }

    @ParameterizedTest
    @MethodSource
    void testCheckNameToEmboss(String nameToCheck, boolean expected) {
        Account account = new Account(nameToCheck);

        boolean result = account.checkNameToEmboss();

        assertEquals(expected, result, "Name '" + nameToCheck + "' should have " + (expected ? "passed " : "failed ") + " the test!");
    }
}