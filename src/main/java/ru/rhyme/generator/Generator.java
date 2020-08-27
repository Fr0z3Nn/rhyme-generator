package ru.rhyme.generator;

import ru.rhyme.generator.parser.RhymeParser;

import java.io.IOException;
import java.util.Scanner;

public class Generator {

    public static void main(String[] args) throws IOException {
        RhymeParser rhymeParser = new RhymeParser();
        Scanner scanner = new Scanner(System.in);
        while (true){
            rhymeParser.parse(scanner.nextLine());
        }
    }
}
