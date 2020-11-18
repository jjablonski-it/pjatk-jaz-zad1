package javachanges.java10.general;

public class Exercise0 {
//    var globalString = "Test";

    public static void main(String[] args) {
        var str = "Hello World";

        for (var i = 0; i < 10; i++) {
            var y = 2 + i;
            System.out.println(y);
        }
    }

//    public void test(var test) {
//        var i = 2;
//    }

    //wprowadzili tez poprawki do Garbage Collectora G1 GC wprowadzonego w Javie 9
}
