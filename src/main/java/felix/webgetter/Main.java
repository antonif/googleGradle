package felix.webgetter;

import java.io.IOException;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        System.out.println("What's your name: ");
        //String name = scan.nextLine();
        //classToTest.writeName(name);

        //HTTP request to github
        SimpleRequest.simpleRequestToGithub();
    }
}
