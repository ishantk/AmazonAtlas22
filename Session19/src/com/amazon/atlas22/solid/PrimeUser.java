package com.amazon.atlas22.solid;

import java.util.Date;

public class PrimeUser extends User{

	private boolean isPrime;
	private Date expiryForMembership;
	private boolean videoAccess;
	private boolean musicAccess;
	private int freeDeliveries;

	public PrimeUser() {
		// TODO Auto-generated constructor stub
	}

	public PrimeUser(boolean isPrime, Date expiryForMembership, boolean videoAccess, boolean musicAccess,
			int freeDeliveries) {
		this.isPrime = isPrime;
		this.expiryForMembership = expiryForMembership;
		this.videoAccess = videoAccess;
		this.musicAccess = musicAccess;
		this.freeDeliveries = freeDeliveries;
	}

	public boolean isPrime() {
		return isPrime;
	}

	public void setPrime(boolean isPrime) {
		this.isPrime = isPrime;
	}

	public Date getExpiryForMembership() {
		return expiryForMembership;
	}

	public void setExpiryForMembership(Date expiryForMembership) {
		this.expiryForMembership = expiryForMembership;
	}

	public boolean isVideoAccess() {
		return videoAccess;
	}

	public void setVideoAccess(boolean videoAccess) {
		this.videoAccess = videoAccess;
	}

	public boolean isMusicAccess() {
		return musicAccess;
	}

	public void setMusicAccess(boolean musicAccess) {
		this.musicAccess = musicAccess;
	}

	public int getFreeDeliveries() {
		return freeDeliveries;
	}

	public void setFreeDeliveries(int freeDeliveries) {
		this.freeDeliveries = freeDeliveries;
	}

	@Override
	public String toString() {
		return "PrimeUser [isPrime=" + isPrime + ", expiryForMembership=" + expiryForMembership + ", videoAccess="
				+ videoAccess + ", musicAccess=" + musicAccess + ", freeDeliveries=" + freeDeliveries + "]";
	}
	
}


