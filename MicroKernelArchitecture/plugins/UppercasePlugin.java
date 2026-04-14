package plugins;

import core.Plugin;

public class UppercasePlugin implements Plugin {

    @Override
    public String getName() {
        return "Uppercase";
    }

    @Override
    public String execute(String input) {
        return input.toUpperCase();
    }
}