/*
 * File: App.java
 * Created Date: 2020-09-15
 * Author: Sallai Andras
 * Github: https://github.com/andteki
 * -----
 * Last Modified: 2022-11-28
 * Modified By: Sallai Andras
 * -----
 * Copyright (c) 2021 Sallai Andras
 * 
 * GNU GPL v2
 * 
 * 
 *  Refaktorálta Orosz Levente
 * 
 * 
 * 2022.11.28
 */

package models;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;


public class FileHandler {
    String fileName;
    public FileHandler() {
        this.fileName = "adat.txt";
    }
    public void writeFile(String line) {
        
        try {
            FileWriter f = new FileWriter(this.fileName, true);
            PrintWriter p = new PrintWriter(f);
            p.println(line);
            p.close();
        } catch (IOException e) {
            System.err.println("Hiba! A fájlbaírás sikertelen!");
        }
    }
}
