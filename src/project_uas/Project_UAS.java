/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package project_uas;

import db.DBUtil;
import java.sql.Connection;

/**
 *
 * @author LENOVO
 */
public class Project_UAS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            Connection conn = DBUtil.getConnection();
            System.out.println("✅ Koneksi ke MySQL BERHASIL!");
            conn.close();
        } catch (Exception e) {
            System.out.println("❌ Koneksi GAGAL!");
            e.printStackTrace();
        }
    }
}
