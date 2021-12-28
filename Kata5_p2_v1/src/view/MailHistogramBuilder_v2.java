package view;

import java.util.List;
import model.Histogram_v2;
import model.Mail_v2;

public class MailHistogramBuilder_v2 {
    
    /**
     * Método que lee los emails del fichero de texto. Los correos válidos se
     * guardan en una lista.
     * 
     * @param mailList
     * @return histogram
     */
    public static Histogram_v2<String> build(List<Mail_v2> mailList) {
        
        Histogram_v2<String> histogram = new Histogram_v2<>();
        
        for(Mail_v2 mail: mailList) {
            histogram.increment(mail.getDomain());
        }
        
        return histogram;        
    }
}