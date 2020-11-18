package training.creation;

import java.math.BigDecimal;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamCreationExercise implements StreamCreator {

    @Override
    public IntStream positiveDigitsUsingOf() {
        return IntStream.of(-5, -4, -3, -2, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9).filter(val -> val > 0);
    }

    @Override
    public IntStream positiveDigitsUsingRange() {
        return IntStream.range(-9, 10).filter(val -> val > 0);
    }

    @Override
    public IntStream positiveDigitsUsingIterate() {
        return IntStream.iterate(-9, val -> val + 1).limit(19).filter(val -> val > 0);
    }

    @Override
    public IntStream powersOfTwo() {
        return IntStream.range(1, 11).map(pow -> (int) Math.pow(2, pow));
    }

    @Override
    public DoubleStream from0Till1WithTenSteps() {
        return DoubleStream.iterate(0, val -> val + 0.1).limit(10).map(val -> (double) Math.round(val * 10) / 10);
    }

    @Override
    public Stream<String> alphabet() {
        IntStream chars = IntStream.range(65, 91);
        return chars.mapToObj(Character::toString);
    }

}
