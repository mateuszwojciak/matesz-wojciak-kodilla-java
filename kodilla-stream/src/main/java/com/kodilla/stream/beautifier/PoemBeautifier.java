package com.kodilla.stream.beautifier;

public class PoemBeautifier {
    public void beautify(String textToBeautifier , PoemDecorator poemDecorator) {
        String moderatedText = poemDecorator.decorate(textToBeautifier);
        System.out.println("Moderated text: " + moderatedText);
    }
}
