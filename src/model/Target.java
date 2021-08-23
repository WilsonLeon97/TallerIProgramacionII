package model;

import java.util.*;

public class Target {
	
    private String IdTarget;

    private String nameTarget;
    
    private double valueTicket;

    private float distance;

	public Target(String IdTarget, String nameTraget, double valueTicket, float distance) {
		
		this.IdTarget = IdTarget;
		this.nameTarget = nameTarget;
		this.valueTicket = valueTicket;
		this.distance = distance;
    
	}

    /**
     * @param String 
     * @return
     */
    public void setIdTarget(String IdTarget) {
        // TODO implement here
        return;
    }

    /**
     * @param String 
     * @return
     */
    public void setNameTarget(String nameTarget) {
        // TODO implement here
        return;
    }

    /**
     * @param double 
     * @return
     */
    public void setValueTicket(double valueTicket) {
        // TODO implement here
        return;
    }

    /**
     * @return
     */
    public String getIdTarget() {
        // TODO implement here
        return "";
    }

    /**
     * @return
     */
    public String getNameTarget() {
        // TODO implement here
        return "";
    }

    /**
     * @return
     */
    public double getValueTicket() {
        // TODO implement here
        return 0.0d;
    }

    /**
     * @param float 
     * @return
     */
    public void setDistance(float distance) {
        // TODO implement here
        return;
    }

    /**
     * @return
     */
    public float getDistance() {
        // TODO implement here
        return 0.0f;
    }

    /**
     * @return
     */
    public String toString() {
        // TODO implement here
        return "";
    }

}