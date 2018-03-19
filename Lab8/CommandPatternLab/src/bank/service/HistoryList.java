package bank.service;
import java.util.ArrayList;
import java.util.Collection;


public class HistoryList {

	private Collection<iCommand> commandList = new ArrayList();
	private Collection<iCommand> undoList = new ArrayList();

	public void undo(){	
		if (commandList.size()>0){
		iCommand commandObj = (iCommand)((ArrayList)commandList).get(commandList.size()-1);
		((ArrayList)commandList).remove(commandObj);
		commandObj.unExecute();
		undoList.add(commandObj);
		}
	}
   
	public void redo(){
		if (undoList.size()>0){
		iCommand commandObj = (iCommand)((ArrayList)undoList).get(undoList.size()-1);
		commandObj.execute();
		((ArrayList)undoList).remove(commandObj);
		commandList.add(commandObj);
		}
	}



	public void addCommand(iCommand commandObj){
		commandList.add(commandObj);
	}

}
