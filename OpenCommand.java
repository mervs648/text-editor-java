package texteditorproject;
//Command Pattern - Dosya açma işlemini bir komut nesnesine dönüştürür
public class OpenCommand implements Command{
    private DocumentManager docManager; //işlemin aktarılacağı yönetici
           
    public OpenCommand(DocumentManager dm){
        this.docManager=dm;
    }
           
    @Override
    public void execute(){ //dosya açmayı manager üzerinden yapar
        docManager.openFile();
    } 
}
