package edu.smith.cs.csc212.spooky;

public class secretExit extends Exit{
	private boolean hidden;
	
	public secretExit (String target, String description) {
			super(target, description);
			this.hidden = true;
	}
	
	public boolean isSecret() {
		return this.hidden;
	}
	
	public void search() {
		this.hidden = false;
	}
}
