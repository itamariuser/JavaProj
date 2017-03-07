package controller.commands;

import java.util.LinkedList;
import java.util.List;

public abstract class Command {
	protected LinkedList<String> params;
	
	
	public void execute() throws Exception{}
	
	public void setParams(LinkedList<String> params2)
	{
		this.params=params2;
	}
}
