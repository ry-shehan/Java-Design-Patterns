package org.shehan.ry.strategy;

public class ContainsSearch implements Search {

    @Override
    public boolean search(String text) {

        if (text.contains("a")) {
            return true;
        }
        return false;
    }
}
