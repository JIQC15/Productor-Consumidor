/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Frontend;

import javax.swing.JLabel;

/**
 *
 * @author Dell
 */
public class EspacioLabel{
    private boolean lleno;
    private final int id;
    private final JLabel label;

    public EspacioLabel(boolean lleno, Integer id, JLabel label) {
        this.lleno = lleno;
        this.id = id;
        this.label = label;
        //as
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
