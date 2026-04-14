package plugins;

import core.Plugin;

public class LowercasePlugin implements Plugin {

    @Override
    public String getName() {
        return "Lowercase";
    }

    @Override
    public String execute(String input) {
        return input.toLowerCase();
    }
}