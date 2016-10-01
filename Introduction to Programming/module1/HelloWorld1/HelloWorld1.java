package HelloWorld1;
import java.io.PrintStream;
class HelloWorld1 {
    // Name       : W.J.R. Budding
    // Assignment : HelloWorld1
    // Date       : 12-09-2016
    PrintStream out;
    HelloWorld1() {
        out = new PrintStream(System.out);
}
    void start() {
        out.printf("Hello world!! ");
        out.printf("written by: %s\n", "Wesley Budding");
}
    public static void main(String[] argv) {
        new HelloWorld1().start();
} }