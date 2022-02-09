
public class MasteritemList {
	private int itemCount = 0;
	private GameObject[] objectList = null;
	
	public MasteritemList()
	{
		objectList = new GameObject[5];
	}
	
	public void addGameObject(GameObject obj) {
		if(itemCount == objectList.length) {
			GameObject[] temp = new GameObject[itemCount+1];
			for(int i = 0; i < itemCount; i++)
				temp[i] = objectList[i];
			objectList = temp;
		}
		objectList[itemCount] = obj;
		++itemCount;
	}
	private boolean verifyID(int index) {
		if(index < 0 || itemCount < index)
			return false;
		
		else if(objectList[index] == null)
			return false;
		
		return true;
	}
	public int getItemCount() {
		return itemCount;
	}
	
	public GameObject getObject(int id) {
		if(!verifyID(id))
			return null;
		return objectList[id];
	}

}