			======= Handling Multiple Windows =======

d.switchTo().window()
Set<String> idsName = new d.getWindowHandles;
Iterator<String> it = new idsName.iterator();
String parentId = it.next();
String childId = it.next();
d.switchTo().window(childId);
------------------------------------------------------
Set<String> list = d.getWindowHandles();
	for (String w : list) {
		if(!w.equals(list)) {
			d.switchTo().window(w);
			break;
		}
		System.out.println("Windows ->>>"+w);
	}
	String newTitle = d.getTitle();
	System.out.println("New Title : "+newTitle);
-------------------------------------------------------
--> Every single window or tab must be explicitly handled/switched for both new and previous tab.

--> close(); and quit();
-------------------------------------------------------
WINDOW HANDLING: 
1. window ID --> each window/tab has auto generated unique ID
2. driver.switchTo().window(“window ID”)
3. driver.getWindowHandle() --> returns window ID (String)
4. driver.getWindowHandles() -> return Set of window IDs. (Set<String>)
5. Loop throught the window IDs and switch to each window and put condition where you want to stop looping.


















