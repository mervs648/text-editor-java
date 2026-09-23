package texteditorproject;
//Command Pattern - Farklı konuma kaydetme işlemini komut nesnesine dönüştürür
public class SaveAsCommand implements Command{
    private DocumentManager docManager;
    
    public SaveAsCommand(DocumentManager dm){
        this.docManager=dm;
    }
    
    @Override
    public void execute(){
        docManager.saveAsFile();
    }
}
