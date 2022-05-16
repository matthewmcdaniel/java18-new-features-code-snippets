package me.matthewmcdaniel;

public class Main {
    public static void main(String[] args) {
        Main.foo("Hello World");
    }

    /**
     * Inline Snippet: Example of how to use {@code Main.foo(String baz).}
     * {@snippet :
     * Main.foo("Hello World");
     * }
     */
    public static void foo(String baz) {
        System.out.println(baz);
    }

    /**
     * Inline Snippet: Example with lang attribute.
     * <p>
     * {@snippet lan g = "java":
     * Main.fooTwo("Hello World");
     *}
     */
    public static void fooTwo(String baz) {
        System.out.println(baz);
    }

    /**
     * Inline Snippet: Example with regex.
     * <p>
     * {@snippet :
     * Main.foo("Hello World"); // @highlight regex='".*"'*}
     */

    public static void fooThree(String baz) {
        System.out.println(baz);
    }

    /**
     * Inline Snippet: Example with replacement.
     * {@snippet :
     * Main.foo("Hello World"); // @replace substring='Hello World' replacement="..."
     * }
     */
    public static void fooFour(String baz) {
        System.out.println(baz);
    }

    /**
     * Inline Snippet: Example with linking.
     * <p>
     * {@snippet :
     * clone(); // @link substring="clone" target="Object#clone()"
     *}
     */

    @Override
    public Object clone() {
        return new Object();
    }

}