package main;

import java.util.List;
import view.MailHistogramBuilder_v2;
import view.HistogramDisplay_v2;
import model.Histogram_v2;
import view.MailListReaderBD_p2_v2;

/**
 * @author Mele13
 * 
 * Segunda versión de Kata4.
 * Crea y muestra un histograma de dominios de una lista de correos electrónicos
 * almacenados en un archivo de texto.
 */
public class Kata4_v2 {
    
    private static List<String> mailList;
    private static Histogram_v2<String> histogram;

    /**
     * @param args
     */
    public static void main(String[] args) {
        execute();    
    }    
    
    public static void execute() {
        input();
        process();
        output();
    }
    
    public static void input(){
        mailList = MailListReaderBD_p2_v2.read();
    }
    
    public static void process() {
        histogram = MailHistogramBuilder_v2.build(mailList);
    }

    public static void output(){
        HistogramDisplay_v2 histoDisplay = new HistogramDisplay_v2(histogram);
        histoDisplay.execute();
    }   
}