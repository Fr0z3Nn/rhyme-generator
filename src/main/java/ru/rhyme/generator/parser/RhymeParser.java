package ru.rhyme.generator.parser;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class RhymeParser {

    private String result;

    public String getResult() {
        return result;
    }

    public void parse(String request) {

        StringBuilder string = new StringBuilder();

        Document doc = null;
        try{
            doc = Jsoup.connect("https://rifmu.ru/"+request).get();
        }catch (Exception e){
            string.append("Ошибка поиска");
        }
        string.append("Рифмы к слову ").append(request).append(":\n\n");
        Elements elements = doc.getElementsByAttributeValue("class", "row");
        Element element = elements.get(elements.size()-1);
        Elements list = element.getElementsByAttribute("href");
        list.forEach(Rhyme ->{
            String l1 = Rhyme.attr("href");
                string.append(l1).append("\n");
            });
        result = string.toString();
    }
}
