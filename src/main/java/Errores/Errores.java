/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Errores;

/**
 *
 * @author Edith Ramirez
 */
public class Errores {
        /**
     * Calcula el error absoluto
     * @param valorReal Valor real
     * @param valorAprox Valor aproximado
     * @return error absoluto
     */
    public static double errorAbsoluto(double valorReal, double valorAprox) {
        return Math.abs(valorReal - valorAprox);
    }
    
    /**
     * Calcula el error relativo en porcentaje
     * @param valorReal Valor real
     * @param valorAprox Valor aproximado
     * @return error relativo en %
     */
    public static double errorRelativo(double valorReal, double valorAprox) {
    double ea = errorAbsoluto(valorReal, valorAprox);
    return (ea / Math.abs(valorReal)) * 100; 
}

}
