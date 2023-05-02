import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

/**
* This program will read a list of strings
* then reverse the string and print it.
*
*
* @author Titwech Wal
* @version 1.0
* @since   2023-06-01
*/

public final class ReverseString {

        /**
         * This is a private constructor used to satisfy the
         * style checker.
         *
         * @exception IllegalStateException Utility class.
         * @see IllegalStateException
         */
        private ReverseString() {
            throw new IllegalStateException("Utility class");
        }

        /**
         * This is the main method.
         *
         * @param args Unused.
         */
        public static void main(String[] args) {

            // Pass path to file as parameter.
            // And display it on the file.
            final File input = new File("input.txt");
            final File output = new File("output.txt");

            try {
                // Create FileWriter object to write to file.
                final FileWriter fW = new FileWriter(output);
                // Create Scanner object to read from file.
                final Scanner sc = new Scanner(input);
                // Create PrintWriter object to write to file.
                final PrintWriter write = new PrintWriter(fW);

                while (sc.hasNextLine()) {
                    // Read line as string.
                    final String str = sc.nextLine();
                    final String strLine = str;
                    // Call the function.
                    final String reversed = RecReverse(strLine);

                    // Print to console and file.
                    System.out.println("the reversed string is: " + reversed);
                    write.println("the reversed string is: " + reversed);
                }
                // Closes scanner & writer.
                write.close();
                sc.close();

            } catch (IOException error) {
            System.out.println("An error occurred: "
                    + error.getMessage());
            }

        }

    /**
     * This function returns n.
     *
     * @param line
     *
     * @return n
     *
     */
    public static String RecReverse(String line) {

        // See if the line is empty.
        // If it is return the line.
        if (line.isEmpty()) {

            return line;
        } else {

            // Re-call the function with all characters but the first.
            return RecReverse(line.substring(1)) + line.charAt(0);
        }
    }
}
