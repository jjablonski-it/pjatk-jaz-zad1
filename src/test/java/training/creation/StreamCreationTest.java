package training.creation;

import org.junit.Test;

import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static training.TestUtils.tester;

public class StreamCreationTest {

    private final StreamCreationExercise instance = new StreamCreationExercise();

    @Test
    public void positiveDigitsUsingOfTest() {
        tester(
                instance,
                IntStream.of(1, 2, 3, 4, 5, 6, 7, 8, 9),
                StreamCreationExercise::positiveDigitsUsingOf,
                s -> s.boxed().collect(Collectors.toList())
        );
    }

    @Test
    public void positiveDigitsUsingRangeTest() {
        tester(
                instance,
                IntStream.of(1, 2, 3, 4, 5, 6, 7, 8, 9),
                StreamCreationExercise::positiveDigitsUsingRange,
                s -> s.boxed().collect(Collectors.toList())
        );
    }

    @Test
    public void positiveDigitsUsingIterateTest() {
        tester(
                instance,
                IntStream.of(1, 2, 3, 4, 5, 6, 7, 8, 9),
                StreamCreationExercise::positiveDigitsUsingIterate,
                s -> s.boxed().collect(Collectors.toList())
        );
    }

    @Test
    public void powersOfTwoTest() {
        tester(
                instance,
                IntStream.of(2, 4, 8, 16, 32, 64, 128, 256, 512, 1024),
                StreamCreationExercise::powersOfTwo,
                s -> s.boxed().collect(Collectors.toList())
        );
    }

    @Test
    public void from0to1withStepTest() {
        tester(
                instance,
                DoubleStream.of(0, 0.1, 0.2, 0.3, 0.4, 0.5, 0.6, 0.7, 0.8, 0.9),
                StreamCreationExercise::from0Till1WithTenSteps,
                s -> s.boxed().collect(Collectors.toList())
        );
    }

    @Test
    public void alphabetTest() {
        tester(
                instance,
                Stream.of("A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M",
                          "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"),
                StreamCreationExercise::alphabet,
                s -> s.collect(Collectors.toList())
        );
    }

}
