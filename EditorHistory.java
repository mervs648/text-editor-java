package texteditorproject;

import java.util.Stack;
//Memento Pattern - Memento nesnelerini stack yapısında tutar.
public class EditorHistory {
    private Stack<EditorMemento> history=new Stack<>(); //geri alma stack i
    
    public void pushMemento(EditorMemento em){//yeni bir durum anlık görüntüyü stack e ekler 
        history.push(em);
    }
    
    public EditorMemento undoMemento(){//en son kaydedilen durumu stack ten çıkartır ve döner
        if(!history.isEmpty()){
            return history.pop();
        }else{
            return null;//geri alınacak durum yoksa
        }
    }
    
    
}
