package texteditorproject;
//Strategy Pattern - büyük küçük harf duyarlı arama stratejisi
public class CaseSensitiveSearch implements SearchStrategy{
    //metnin içinde kelimeyi birebir (case-sensitive) arar,bulunan ilk indekse döner 
    @Override
    public int search(String text,String word){
        return text.indexOf(word);
    }
    
}
