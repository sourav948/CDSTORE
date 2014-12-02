"Online CD STORE" 
+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
Locations:
- contains following folders/files:
    |--cdshop_client
       |-- src
       |-- WebContent  
       
    |--cdshop_server
       |-- src
       |-- WebContent
       
|---Testing
    |--Readme(WebService).txt
    |--TestCase.docx
    |--Webservices.zip
|---Design Specification
|---Readme.txt
|---References.txt
|--Dbschema(new cdstore.sql)
1.    Source code folder contains two projects: cdshop_client and  cdserver_server
2.    Test cases folder includes screenshots of frontend and backend testing.
3.    Design Secification

+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
Environment:
-------------------------------------------------------------------------------------------------------------------------------------------------------------------

1).JDK 7
2).Tomcat 7 or 8 (open source Java web server which supports servlets)
3).MySQL 5.6 (open source SQL database)
4).Connector J 5.1 (JDBC driver for MySQL)
5).In addition it is recommended that you use NetBeans 8 for your IDE (or possibly Eclipse)
6) SoapUI (For Testing Web services)
7) Web Browser-Google Chrome

++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
Instruction for Installation:
--------------------------------------------------------------------------------------------------------------------------------------------------------------------


      
Installation:

1.     Create  the two dynamic web projects in IDE with the name cdstore_client and cdstore_server and then replace the contents
       of cdstore_client and cdstore_server except .classpath and .project from the cdstore.zip to these dynamic project in your IDE workspace.
2.    Extract Database schema from the following location in cdstore_Server: 
             cdstore_Server\Dbschema\cdstore.sql. This file willcreate  cdstore schema in database with all tables.
3.    Download the following Jar files :
      

        Download the zip file for the following jars from https://jax-ws.java.net/2.2.8/.then unzip and copy above to /Cdshop_client/\Tomcat 7.0\lib\;

        . gmbal-api-only.jar
        . ha-api.jar
        . jaxb-impl.jar
        . jaxws-api.jar
        . jaxws-rt.jar
        . management-api.jar
        . policy.jar
        . stax-ex.jar
        . streambuffer.jar
      

      Log4j related jars to be placed /Cdshop_Server/WebContent/WEB-INF/lib: 
      Download zip file from http://logging.apache.org/log4j/2.x/download.html, then unzip and copy above to Cdshop_Server\WebContent\WEB-INF\lib\;
        . log4j-api-2.0-beta9.jar; 
        . log4j-core-2.0-beta9.jar; 
       
      Download zip file from    http://www.java2s.com/Code/Jar/h/Downloadhibernate3jar.htm, then unzip and copy above to Cdshop_Server\WebContent\WEB-INF\lib\;
     
         > hibernate-commons-annotations-4.0.3.final.jar
         >lib\hibernate-core-4.3.6.Final.jar
      

      JSP Standard Tag Library to be placed under Cdshop_Server\WebContent\WEB-INF\lib\;
        Download from http://download.java.net/maven/1/jstl/jars/jstl-1.2.jar
         . Jstl-1.2.jar
     
4.    For each project check their Java Build Path -> Libraries and make sure there are no errors.
      Also make sure the system environment variables are set to the following:
	SET CLASSPATH=%CLASSPATH%;C:\jakarta-tomcat-5\dist\common\lib\servlet-api.jar
	SET PATH=%PATH%;C:\MySQL\Bin;
	SET CLASSPATH = %CLASSPATH%;C:\lib\mysql-connector-java-3.0.9-stable-bin.jar
      Deploy both the projects on the apache server.
	
5.    Make sure database username, password and url configuration are all right in /Cdshop_Server/WebContent/META-INF/context.xml:
      a.    url="jdbc:mysql://localhost:3306/music_zone"
      b.    username="root", password="admin"
6.    Right click the project name cdshop_client -> Run as -> Run on server, choose tomcat 7,  add cdshop_server and click Finish.
+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
