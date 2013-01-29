/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package vector3d;

/**
 *
 * @author Oscar
 */
public class Vector3D {

    private double iA;
    private double jA;
    private double kA;
    private Vector3D normA;

    public Vector3D() {
        this.iA = 0;
        this.jA = 0;
        this.kA = 0;
        this.normA = null;
    }

    public Vector3D(double iA, double jA, double kA, Vector3D normA) {
        this.iA = iA;
        this.jA = jA;
        this.kA = kA;
        this.normA = normA;
    }

    public double vectorLength() {
        return Math.sqrt((iA * iA) + (jA * jA) + (kA * kA));
    }

    public double vectorLengthOther(Vector3D B) {
        Vector3D D = new Vector3D();
        D.setiA(iA + B.getiA());
        D.setjA(jA + B.getjA());
        D.setkA(kA + B.getkA());
        return Math.sqrt((D.getiA() * D.getiA()) + (D.getjA() * D.getjA()) + (D.getkA() * D.getkA()));
    }

    public double vectorDot(Vector3D B) {
        Vector3D D = new Vector3D();
        D.setiA(iA * B.getiA());
        D.setjA(jA * B.getjA());
        D.setkA(kA * B.getkA());
        return D.getiA() + D.getjA() + D.getkA();
    }

    public double vectorAngleBetween(Vector3D B) {
        return Math.acos((vectorDot(B)) / (B.vectorLength() * vectorLength()));
    }

    public Vector3D vectorAdd(Vector3D B) {
        Vector3D C = new Vector3D();
        C.setiA(iA + B.iA);
        C.setjA(jA + B.jA);
        C.setkA(kA + B.kA);
        return C;
    }

    public Vector3D vectorSubtractOne(Vector3D B) {
        Vector3D C = new Vector3D();
        C.setiA(iA-B.iA);
        C.setjA(jA-B.jA);
        C.setkA(kA-B.kA);
        return C;
    }

    public double getiA() {
        return iA;
    }

    public void setiA(double iA) {
        this.iA = iA;
    }

    public double getjA() {
        return jA;
    }

    public void setjA(double jA) {
        this.jA = jA;
    }

    public double getkA() {
        return kA;
    }

    public void setkA(double kA) {
        this.kA = kA;
    }

    public Vector3D getNormA() {
        return normA;
    }

    public void setNormA(Vector3D normA) {
        this.normA = normA;
    }
}
