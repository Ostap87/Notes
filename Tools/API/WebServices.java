				========== WebServices ==========

WebServices (WS) is a method comunications between 2 applications or electronic devices(mobile and web apps)
	over the WWW World Wide Web. Using languages XML(software service) and JSON(all or rest)
_______________________________________

Two types of comunications:

1. Simple Object Access Protocol - SOAP -> using XML -> protocol for sending and receiving msg
	between WebServices without confronting interoperability issue
2. Representation State Transfer - REST -> JSON

Structure of SOAP(XML document consisting:
	<Envelop> -> contain 
			optional  <Header>
			mandatory <Body> -> contain
							<Fault> - for reporting errors
WebServices Definition Language - WSDL -> is a XML document that describe WS(What operation services 
		is supporting, parameters...).(WSDL - contract for WS). With no WSDL - you can not testing anything.























