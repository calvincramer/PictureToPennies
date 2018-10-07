package picturetopennies;

public class Main {
    
    public Main() {
        imageWindow = new ImageWindow();
        window = new MainWindow2(this);
        
        imageWindow.setVisible(true);
        window.setVisible(true);
    }
    
    public ImageWindow getImageWindow() {
        return imageWindow;
    }
    
    private MainWindow2 window;
    private ImageWindow imageWindow;
    
    public static void main(String[] args) {
        Main m = new Main();
    }
}