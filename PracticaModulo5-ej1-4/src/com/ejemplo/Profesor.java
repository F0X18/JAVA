package com.ejemplo;

public interface Profesor {
	public abstract String getTarea();
	
	public abstract int getExperiencia();
	
	public String getEmail();
	public void setEmail(String email);
	
	public void init();
	public void destroy();
}
