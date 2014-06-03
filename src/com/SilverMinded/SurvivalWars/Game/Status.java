package com.SilverMinded.SurvivalWars.Game;

public enum Status {
	IN_LOBBY(true), IN_GAME(false), POST_GAME(false), RESETTING(false);
	
	private boolean canJoin;
	
	private static Status currentStatus;
	
	Status(boolean canJoin) {
		this.canJoin = canJoin;
		
	}
	public boolean canJoin() {
		return canJoin;
	}
	
	public static void setStatus(Status status){
		Status.currentStatus = status;
	}
	
	public static boolean isStatus(Status status){
		return Status.currentStatus == status;
	}
	
	public static Status getStatus(){
		return currentStatus;
	}
	

}
