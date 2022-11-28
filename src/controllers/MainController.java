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

package controllers;

import models.FileHandler;
import views.MainWindow;

public class MainController {
    MainWindow mainWindow;
    public MainController() {
        this.mainWindow = new MainWindow();
        this.mainWindow.calcButton.addActionListener(e -> {
            this.onClickCalcButton();
        });
    }
    public void onClickCalcButton() {
        double aSide = Double.parseDouble(this.mainWindow.asideField.getText());
        double bSide = Double.parseDouble(this.mainWindow.bsideField.getText());

        Double perimeter = CalcController.calcPerimeter(a, b);
        Double area = CalcController.calcArea(a, b);

        this.mainWindow.perimeterField.setText(p.toString());
        this.mainWindow.areaField.setText(ar.toString());
        String line = perimeter.toString() + ":" + ar.toString();
        FileHandler handler = new FileHandler();
        handler.writeFile(line);
        //TODO: adatbázisba írás
    }
    
}

