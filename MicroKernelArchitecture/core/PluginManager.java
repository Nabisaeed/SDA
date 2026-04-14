package core;

import java.util.ArrayList;
import java.util.List;

public class PluginManager {
    private List<Plugin> plugins = new ArrayList<>();

    public void registerPlugin(Plugin plugin) {
        plugins.add(plugin);
    }

    public void listPlugins() {
        System.out.println("Available Plugins:");
        for (Plugin plugin : plugins) {
            System.out.println("- " + plugin.getName());
        }
    }

    public String runPlugin(String pluginName, String input) {
        for (Plugin plugin : plugins) {
            if (plugin.getName().equalsIgnoreCase(pluginName)) {
                return plugin.execute(input);
            }
        }
        return "Plugin not found!";
    }
}