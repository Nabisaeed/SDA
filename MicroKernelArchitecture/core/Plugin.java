package core;

public interface Plugin {
    String getName();
    String execute(String input);
}