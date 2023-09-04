
package Frontend;

import javax.swing.JLabel;

public class EspacioLabel{
    private boolean lleno;
    private final int id;
    private final JLabel label;

    public EspacioLabel(boolean lleno, Integer id, JLabel label) {
        this.lleno = lleno;
        this.id = id;
        this.label = label;
    }

    public JLabel getLabel() {
        return label;
    }
    
    public synchronized boolean isLleno() {
        return lleno;
    }

    public synchronized void setLleno(boolean lleno) {
        this.lleno = lleno;
    }

    public int getId() {
        return id;
    }    
}
