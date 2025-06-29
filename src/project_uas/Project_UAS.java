package project_uas;

import db.DBUtil;
import java.sql.Connection;
import javax.swing.UIManager;
import javax.swing.SwingUtilities;
import view.LoginForm;

public class Project_UAS {

    public static void main(String[] args) {
        // 1. Set Look and Feel ke Nimbus (agar tampilan sesuai preview NetBeans)
        try {
            for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (Exception e) {
            System.out.println("Gagal set Look and Feel, menggunakan default.");
        }

        // 2. Tes koneksi (opsional, bisa dihapus nanti)
        try {
            Connection conn = DBUtil.getConnection();
            System.out.println("✅ Koneksi ke MySQL BERHASIL!");
            conn.close();
        } catch (Exception e) {
            System.out.println("❌ Koneksi GAGAL!");
            e.printStackTrace();
        }

        // 3. Tampilkan form Login
        SwingUtilities.invokeLater(() -> {
            new LoginForm().setVisible(true);
        });
    }
}
