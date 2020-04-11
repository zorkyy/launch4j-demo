package zorkyy.demo.main;

import java.util.Scanner;

public class App{

    public static void main(String[] args) throws InterruptedException {
        System.out.println("Hello World!");

        Scanner scanner = new Scanner(System.in);
        String result = scanner.nextLine();

        System.out.println("Echo: " + result + "!");
        System.out.println("Sleeping...");

        Thread.sleep(2000);

        System.exit(0);
    }

}
