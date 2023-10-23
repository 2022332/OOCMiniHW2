/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package vehicle;

/**
 *
 * @author sweis
 */
public interface Flyable extends Drivable {
    public void changeAltitude(double change);
    public double getAltitude();
}
