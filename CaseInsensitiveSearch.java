package texteditorproject;

public class CaseInsensitiveSearch implements SearchStrategy{
    //Strategy Pattern - büyük küçük harf duyarsız arama stratejisi
    @Override
    //her iki metni de küçük harfe çevirerek 
    public int search(String text,String word){
        return text.toLowerCase().indexOf(word.toLowerCase());
        
    }
    
}