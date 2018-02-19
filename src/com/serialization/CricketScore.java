package com.serialization;

import java.io.Serializable;

public class CricketScore implements Serializable{

	private int currentScore;
	private int fallenWickets;
	private double overs;
	
	public int getCurrentScore() {
		return currentScore;
	}
	public void setCurrentScore(int currentScore) {
		this.currentScore = currentScore;
	}
	public double getOvers() {
		return overs;
	}
	public void setOvers(double overs) {
		this.overs = overs;
	}
	public int getFallenWickets() {
		return fallenWickets;
	}
	public void setFallenWickets(int fallenWickets) {
		this.fallenWickets = fallenWickets;
	}
	@Override
	public String toString() {
		return "CricketScore [currentScore=" + currentScore + ", fallenWickets=" + fallenWickets + ", overs=" + overs
				+ "]";
	}
	
	
}
