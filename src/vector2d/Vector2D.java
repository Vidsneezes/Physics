/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package vector2d;

/**
 *
 * @author Oscar
 */
public class Vector2D {

    private double iA;
    private double jA;
    private Vector2D normA;

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

    public Vector2D() {
        iA = 0.0;
        jA = 0.0;
    }

    public Vector2D(double x, double y) {
        iA = x;
        jA = y;
    }

    /**
     * Returns this Vectors Length
     *
     * @return
     */
    public double vectorLength2D() {
        return Math.sqrt((Math.pow(iA, 2)) + Math.pow(jA, 2));
    }

    /**
     * Returns the length in between this Vector and another
     *
     * @param B Must be a Vector2D
     * @return
     */
    public double vectorLength2D(Vector2D B, Vector2D A) {
        Vector2D D = new Vector2D();
        D.setiA(B.getiA() + A.getiA());
        D.setjA(B.getjA() + A.getjA());
        return Math.sqrt(Math.pow(D.iA, 2) + Math.pow(D.jA, 2));
    }

    /**
     * Returns Dot product of two Vectors
     *
     * @param B Must be a Vector2D
     * @return
     */
    public double vectorDotProLen2D(Vector2D B) {
        Vector2D C = new Vector2D();
        C.iA = iA * B.iA;
        C.jA = jA * B.jA;
        return C.iA + C.jA;
    }

    /**
     * Returns Angle Between to Vectors takes current vector as default to
     * compare to parameter B
     *
     * @param B Must be a Vector2D
     * @return Angle in degrees
     */
    public double vectorDotProAngle2D(Vector2D B) {
        double dotProduct = vectorDotProLen2D(B);
        return Math.toDegrees(Math.acos((dotProduct) / (vectorLength2D() * B.vectorLength2D())));
    }

    /**
     * Returns Cross Product takes current vector as default to compare to
     * parameter B
     *
     * @param B Must be a Vector2D
     * @return Positive/Negative number
     */
    public double vectorCrossPro2D(Vector2D B) {
        Vector2D C = new Vector2D();
        C.iA = iA * B.jA;
        C.jA = jA * B.iA;
        return C.iA + (C.jA);
    }

    /**
     * Adds to vectors
     *
     * @param B Must be a Vector2D
     * @return A Vector2D
     */
    public Vector2D vectorAdd2D(Vector2D B) {
        Vector2D C = new Vector2D();
        C.iA = iA + B.iA;
        C.jA = jA + B.jA;
        return C;
    }

    /**
     * Returns angle of this Vectors Components
     *
     * @return Angle in degrees
     */
    public double vectorAngle2D() {
        return Math.toDegrees(Math.atan(jA / iA));
    }

    /**
     * Disassembles a Vector with angle to its components parts. Stores them in
     * this iA and jA
     *
     * @param length Must be a double
     * @param angle Must be a double
     */
    public void compLength2D(double length, double angle) {
        iA = length * Math.cos(angle);
        jA = length * Math.sin(angle);
    }

    /**
     * Increases this Vectors components by a given Vector through addition
     * (Useful when having to add more than 2 Vector components)
     *
     * @param B Must be a Vector2D
     */
    public void vecToAdd2D(Vector2D B) {
        iA = iA + B.iA;
        jA = jA + B.jA;
    }

    /**
     * Decreases this Vectors components by a given Vector through subtraction
     * (Useful when having to subtract more than 2 Vector components)
     *
     * @param B Must be a Vector2D
     */
    public void vecToSubtract2D(Vector2D B) {
        iA = iA - B.iA;
        jA = jA - B.jA;
    }

    /**
     * Increase this Vectors components by a given Vector through multiplication
     * (Useful when having to multiply more than 2 Vector components)
     *
     * @param B Must be a Vector2D
     */
    public void vecToMultiply(Vector2D B) {//Need to change this once i include 3D
        iA = iA * B.iA;
        jA = jA * B.jA;
    }

    /**
     * Normalizes this Vector2D, variable in this Vector2D (normA) will now have
     * values iA,jA which will have a value between 0 and 1
     */
    public void vecNormalize() {//Normalizes Saves to this Vectors normA
        normA.iA = iA * ((1) / (normA.vectorLength2D()));
        normA.jA = jA * ((1) / (normA.vectorLength2D()));
    }

    /**
     * Increases this Vector2D by multiplying a constant number to its
     * components
     *
     * @param constant Must be a double
     */
    public void vecTimesConst(double constant) {
        iA = iA * constant;
        jA = jA * constant;
    }
}
