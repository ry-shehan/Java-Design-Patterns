package org.shehan.ry.strategy;

public class Main {

    public static void main(String[] args) {

        // Sample input string where all strategies will search for the letter 'a'
        String text = "Java";

        Context context = new Context();

        context.setSearch(new RegexSearch());
        context.useSearch(text);

        context.setSearch(new ContainsSearch());
        context.useSearch(text);

        context.setSearch(new ManualSearch());
        context.useSearch(text);
    }

}
