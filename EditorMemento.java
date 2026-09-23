package texteditorproject;
//Memento Pattern - Editörün belirli andaki metin durumunu saklar (değiştirilemez.)
public class EditorMemento {
    private final String text; //kaydedilen metin anlık görüntüsü 
    
    public EditorMemento(String text){
        this.text=text;
    }
    
    public String getText(){
        return text;
    }
    
}
