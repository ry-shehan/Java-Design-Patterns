package org.shehan.ry.strategy;

public class RegexSearch implements Search {

    @Override
    public boolean search(String text) {
        return text.matches(".*a.*");
    }
}
