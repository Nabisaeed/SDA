package core;

import plugins.*;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        PluginManager manager = new PluginManager();

        // Register plugins (simulating dynamic loading)
        manager.registerPlugin(new UppercasePlugin());
        manager.registerPlugin(new LowercasePlugin());
        manager.registerPlugin(new ReversePlugin());

        Scanner scanner = new Scanner(System.in);

        while (true) {
            manager.listPlugins();
            System.out.print("\nEnter plugin name (or 'exit'): ");
            String pluginName = scanner.nextLine();

            if (pluginName.equalsIgnoreCase("exit")) {
                break;
            }

            System.out.print("Enter text: ");
            String input = scanner.nextLine();

            String result = manager.runPlugin(pluginName, input);
            System.out.println("Result: " + result);
            System.out.println("-----------------------------");
        }

        scanner.close();
    }
}