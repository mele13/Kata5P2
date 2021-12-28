package main;

import view.MailListReader_v2;
import view.MailHistogramBuilder_v2;
import view.HistogramDisplay_v2;
import model.Mail_v2;
import model.Histogram_v2;
import java.util.List;

/**
 * @author Mele13
 * 
 * Segunda versión de Kata4.
 * Crea y muestra un histograma de dominios de una lista de correos electrónicos
 * almacenados en un archivo de texto.
 */
public class Kata4_v2 {

    /**
     * @param args
     */
    public static void main(String[] args) {
        execute();    
    }
    
    public static void execute() {
        List<Mail_v2> mailList = input();
        Histogram_v2 histogram = process(mailList);
        output(histogram);
    }
    
    public static List<Mail_v2> input(){
            String fileName = new String("email.txt");
            List<Mail_v2> mailList = MailListReader_v2.read(fileName);
            return mailList;
        }

        public static Histogram_v2 process(List<Mail_v2> mailList){
            Histogram_v2<String> histogram = MailHistogramBuilder_v2.build(mailList);
            return histogram;
        }

        public static void output(Histogram_v2 histogram){
            HistogramDisplay_v2 histogramDisplay = new HistogramDisplay_v2("Histogram", histogram);//o
            histogramDisplay.execute();
        }    
}