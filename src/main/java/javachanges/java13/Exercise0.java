package javachanges.java13;

public class Exercise0 {
    public static void main(String[] args) {
        var str = """
                  NaNaNaNaNa
                  Batman!        
                  """;
    }

    public int switchWithYield(int i) {
        return switch (i) {
            case 1, 2, 3: {
                if (i == 1) {
                    yield 1;
                } else {
                    yield 2;
                }
            }
            default:
                yield -1;
        };
    }
}
