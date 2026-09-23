package texteditorproject;

public class TextEditorProject {

    // Programın ana şalteri (Başlangıç noktası)
    public static void main(String[] args) {
        
        // Arayüzümüzü (EditorUI) güvenli bir şekilde ekranda gösteriyoruz
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                // EditorUI sınıfından yeni bir pencere oluştur ve görünür yap
                new EditorUI().setVisible(true);
            }
        });
        
    }
}