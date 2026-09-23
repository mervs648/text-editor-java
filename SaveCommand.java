package texteditorproject;
//Command Pattern - dosya kaydetme işlemini komut nesnesine dönüştürür.
public class SaveCommand implements Command{
    private DocumentManager docManager;
    
    public SaveCommand(DocumentManager dm){
        this.docManager=dm;
    }
    
    @Override
    public void execute(){
        docManager.saveFile();
    }
}
