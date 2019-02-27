package sample;

import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import javafx.event.ActionEvent;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import java.io.IOException;
import java.util.ArrayList;


public class Controller {
    private ListView line = new ListView();

    private void insertListView(Element headLine){
        ArrayList<String> lines = new ArrayList();

        line.getItems().add(headLine.text());
    }

    @FXML
    void searchPrincipal(ActionEvent event) throws IOException{
        Document doc = Jsoup.connect("https://archive.org/").get();
        String title = doc.title();

        System.out.println(title);

        Elements headLines = doc.select("div");
        for (Element headLine: headLines){
            insertListView(headLine);
        }
    }

    @FXML
    void searchSoftware(ActionEvent event) throws IOException{
        Document doc = Jsoup.connect("https://archive.org/details/open_source_software").get();
        String title = doc.title();

        System.out.println(title);

        Elements headLines = doc.select("div>ttl");
        for (Element headLine: headLines){
            insertListView(headLine);
        }
    }

    @FXML
    void searchVideos(ActionEvent event) throws IOException{
        Document doc = Jsoup.connect("https://archive.org/details/opensource_movies").get();
        String title = doc.title();

        System.out.println(title);

        Elements headLines = doc.select("div>ttl");
        for (Element headLine: headLines){
            insertListView(headLine);
        }
    }

}
