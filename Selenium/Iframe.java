				============== IFRAME ==============

--> independent HTML code inside the another HTML code

=> Flow: In order to do any actions in iframe,we have to switch the iframe.

	driver.switchTo().frame()
	3 Ways by:
	=> Index --> switching by index that iframe order in HTML code.
	=> ID or NAME 'it is looks for name first'
	=> WebElement


driver.switch().parantFrame(); -> switching back only to parent.
driver.switch().defaultContent(); -> switching back to main page.






















