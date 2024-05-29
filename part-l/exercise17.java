import java.io.Console;

import javax.management.RuntimeErrorException;

public class exercise17 {
    public static void main(String[] args) {
        Console cons;

        if ((cons = System.console()) != null) {
            char[] pass_word = null;

            try {
                pass_word = cons.readPassword("Input your password: ");

                System.out.println("Your password is -> " + new String(pass_word));
            } catch (Exception e) {
                // TODO: handle exception
                if (pass_word != null) {
                    java.util.Arrays.fill(pass_word, ' ');
                }
            }
        } else {
            throw new RuntimeErrorException(null, "Can't get the password");
        }
    }
}
