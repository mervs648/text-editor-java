package texteditorproject;

import java.awt.Color;
import javax.swing.JTextArea;

public class SettingsManager {
    
    // Singleton nesnemiz
    private static SettingsManager instance;
    
    // Ayarlarımız
    private int fontSize = 14;
    private boolean isDarkMode = false; // Karanlık mod kapalı başlıyor
    
    private SettingsManager() {}
    
    public static SettingsManager getInstance() {
        if (instance == null) {
            instance = new SettingsManager();
        }
        return instance;
    }
    
    // --- Font Ayarları ---
    public int getFontSize() { return fontSize; }
    public void setFontSize(int size) { this.fontSize = size; }
    
    // --- Tema Ayarları ---
    public void setDarkMode(boolean darkMode) { 
        this.isDarkMode = darkMode; 
    }
    
    // Temayı uygulayan metodumuz
    public void applyTheme(JTextArea textArea) {
        if (isDarkMode) {
            textArea.setBackground(new Color(43, 43, 43)); // Koyu gri arka plan
            textArea.setForeground(Color.WHITE);           // Beyaz yazılar
            textArea.setCaretColor(Color.WHITE);           // Beyaz imleç
        } else {
            textArea.setBackground(Color.WHITE);           // Beyaz arka plan
            textArea.setForeground(Color.BLACK);           // Siyah yazılar
            textArea.setCaretColor(Color.BLACK);           // Siyah imleç
        }
    }
}