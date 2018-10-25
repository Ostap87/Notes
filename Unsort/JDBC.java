				=========== JDBC ===========
				
--> https://www.connectionstrings.com/sql-server/
JDBC 3 IMPORTANT CLASSES:

1) Connection -> helps connect to database
2) Statement -> helps write sql query and execute
3) ResultSet -> data that came from database will be stored in ResultSet format.

	String url = "jdbc:oracle:thin:@ec2-18-221-90-0.us-east-2.compute.amazonaws.com:1521:xe";
	String user = "hr"; 
	String password= "hr";
Connection connection = DriverManager.getConnection(url, user, pass); -> import from java sql
Statement statement = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,
												 				ResultSet.CONCUR_READ_ONLY);
ResultSet resultSet = statement.executeQuery(SELECT * FROM countries) 		
		
		-resultSet.close();
		-statement.close();
		-connection.close();

Connection > Statement > ResultSet > Columndata
______________________________________________________

next() -> moves to next row
getObject(colname/index) -> read data from column
last() -> goes to last row
first() -> goes to first row
getRow() -> current row number
beforeFirst() -> goes to row 0
afterLast() -> goes to after last row
absolute(rowNum) -> jumps to specified row
-------------------------------------------------------
		=====METADATA=====
DatabaseMetaData dbMetaData = connection.getMetaData();
---
ResultSetMetaData rsMetadata = resultSet.getMetaData(); 
//print all columns name
for (int i=1;i<=rsMetadata.getColumnCount();i++) {
	System.out.println(i+rsMetadata.getColumnName(i))
}













===========================================================
===========================================================

while(rs.next()) {
			for (int i = 1; i <=5; i++) {
				System.out.println(rs.getObject(i));
			}
		}








