package com.prowings.cloning.deepex2;

public class Engine implements Cloneable{
	
	private int engineId;
	private String engineType;
	
	public Engine() {
	}
	
	public Engine(int engineId, String engineType) {
		super();
		this.engineId = engineId;
		this.engineType = engineType;
	}

	public int getEngineId() {
		return engineId;
	}

	public void setEngineId(int engineId) {
		this.engineId = engineId;
	}

	public String getEngineType() {
		return engineType;
	}

	public void setEngineType(String engineType) {
		this.engineType = engineType;
	}

	@Override
	public String toString() {
		return "Engine [engineId=" + engineId + ", engineType=" + engineType + "]";
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	
	
}
