package ru.rhyme.generator.parser;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;

public class RhymeParser {
    public void parse(String request) {
        Document doc = null;
        try{
            doc = Jsoup.connect("https://rifmu.ru/"+request).get();
        }catch (Exception e){
            System.out.println("Ошибка");
        }
        System.out.println("Успешно");
        System.out.println(doc.title());
        Elements elements = doc.getElementsByAttributeValue("class", "row");
        Element element = elements.get(elements.size()-1);
        Elements list = element.getElementsByAttribute("href");
        list.forEach(Rhyme ->{
            String l1 = Rhyme.attr("href");
                System.out.println(l1);
            });

    }
}
