/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package util;

import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectInputStream;
import java.io.IOException;


/**
 *
 * @author LENOVO
 */
public class SerializationUtil {
    // ✅ Menyimpan objek ke file
    public static void saveObject(Object obj,String filename) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filename))) {
            oos.writeObject(obj);
            System.out.println("✅ Data berhasil disimpan ke" + filename);
        } catch (IOException e) {
            System.err.println("❌ Gagal menyimpan data:" + e.getMessage());
        }
    }
       
    // ✅ Memuat objek dari file
    public static Object loadObject(String filename) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filename))) {
            return ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            System.err.println("❌ Gagal membaca data: " + e.getMessage());
                return null;
        }
    }
}
