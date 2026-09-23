package texteditorproject;

import javax.swing.JTextArea;
import javax.swing.JFileChooser;
import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class DocumentManager {//dosya işlemlerini açar yönetir
    private JTextArea textArea; //editör metin alanı referansı 
    private File currentFile = null;
    
    public DocumentManager(JTextArea textArea){
        this.textArea=textArea;
    }
    
    //dosya seçim diyaloğu açar ,seçilen dosyayı textArea ya yükler
    public void openFile(){
        JFileChooser chooser = new JFileChooser();
        int result = chooser.showOpenDialog(null);
        if(result==JFileChooser.APPROVE_OPTION){
            currentFile = chooser.getSelectedFile();
            try(Scanner reader = new Scanner(currentFile)){
                textArea.setText("");//eski metni temizler
                while(reader.hasNextLine()){
                    textArea.append(reader.nextLine()+ "\n");
                }
            }catch(Exception e){
                System.out.println("Error occurred."+e.getMessage());
            }
        }
    }
    
    //dosya kaydetmeyi açar,seçilen konuma kaydeder.
    public void saveAsFile(){
        JFileChooser chooser = new JFileChooser();
        int result = chooser.showSaveDialog(null);
        if(result==JFileChooser.APPROVE_OPTION){
            currentFile = chooser.getSelectedFile();
            writeToFile(currentFile);
        }
        
    }
    
    //mevcut dosya varsa üzerine kaydeder,yoksa saveAs e yönlendirir
    public void saveFile(){
        if(currentFile!=null){
            writeToFile(currentFile);
        }else{
            saveAsFile();
        }
    }
    
    //textArea içeriğini verilen dosyaya yazar
    private void writeToFile(File file){
        try(FileWriter writer=new FileWriter(file)){
            writer.write(textArea.getText());
            
        }catch (Exception e){
            System.out.println("Error occurred."+e.getMessage());
        }
    }
}
