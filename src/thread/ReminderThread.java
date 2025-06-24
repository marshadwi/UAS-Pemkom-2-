/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thread;

import javax.swing.JOptionPane;

/**
 *
 * @author LENOVO
 */
public class ReminderThread extends Thread{
    
    private String message;
    private int delaySeconds;
    
    public ReminderThread(String message, int delaySecond){
        this.message = message;
        this.delaySeconds = delaySecond;
    }
    
    public void run(){
        try {
            Thread.sleep(delaySeconds * 1000);
            JOptionPane.showMessageDialog(null, message, "Reminder", JOptionPane.INFORMATION_MESSAGE);
        } catch (InterruptedException e) {
            System.err.println("Thread reminder dihentikan.");
        }
    }
}
