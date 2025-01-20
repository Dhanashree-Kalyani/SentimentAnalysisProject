package com.sentiment;

import edu.stanford.nlp.pipeline.*;

import java.util.Properties;

public class SentimentAnalysis {
    public static void main(String[] args) {
        // Step 1: Set up Stanford CoreNLP Properties
        Properties props = new Properties();
        props.setProperty("annotators", "tokenize, ssplit, pos, lemma, ner, parse, sentiment");

        // Step 2: Initialize Stanford CoreNLP pipeline
        StanfordCoreNLP pipeline = new StanfordCoreNLP(props);

        // Step 3: Sample review text
        String review = "This product is amazing! It works perfectly!";

        // Step 4: Create CoreDocument and annotate it
        CoreDocument document = new CoreDocument(review); // CoreDocument is available in version 4.x
        pipeline.annotate(document);

        // Step 5: Analyze sentiment for each sentence
        for (CoreSentence sentence : document.sentences()) {
            // Get sentiment of the sentence
            String sentiment = sentence.sentiment();
            System.out.println("Sentiment: " + sentiment);
        }
    }
}
