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


public class CalcController {
    public static double calcPerimeter( double aSide, double bSide) {
        return aSide + bSide;
    } 

    public static double calcArea(double aSide, double bSide) {
        return aSide * bSide; 
    }
}
