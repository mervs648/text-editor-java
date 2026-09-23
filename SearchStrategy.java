package texteditorproject;
//Strategy Pattern - Arama algoritmalarının uygulaması gereken arayüz 
public interface SearchStrategy {
    int search(String text,String word);//metinde kelimeyi arar,bulunan indexi döndürür yoksa da -1
    
}
