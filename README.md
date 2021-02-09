# SpringBoot Json Parser using Thymeleaf

  Json Parser Application is responsible for making API call to external endpoint to get the json corresponding to various      
  Channels and displaying the results using Thymeleaf template.

# Tech Stack Versions

  Java -1.8
  SpringBoot -2.3.4.RELEASE


## Installation

  Clone the repository from Git.
  Ensure that JAVA_HOME and MAVEN_HOME are set up in the machine.

  To build the project via command prompt, from inside the project directory,execute command - mvn clean install
  To run the application via command prompt, from inside the project directory,execute command - mvn spring-boot:run


  If an IDE such as Eclipse or STS is being used, import the application as Maven project.
  Make sure Java Installed JREs is set to JDK path in Eclipse->Preferences.
  To build the project, right click on the project -> Run As -> Maven Install
  To Run the application after building it , go to ChannelParserApplication.java under com.channel.org package,
  Right click on the file -> Run As -> Java Application


## Usage/Assumptions

   1. To Access the application after deployment, enter below url in browser

   http://{hostname}:{port}/channels?id=3

   Replace hostname with localhost and port with 8081 if application is running in local machine.
   For eg: http://localhost:8081/channels?id=3

   The Query parameter passed in url (id=3) in above example will be appended to the endpoint
   call to fetch the result Json like shown below

   Endpoint used inside the application to fetch Json: /nearsight.io/payload.html?id=3
   
   2. The date format for lastSeen field in Json will be in format "2021-02-04T10:45:28.997+00:00"
   
   3. The end point address for fetching the json should be updated as value for key channelApiurl in application.properties file under    
      src-main-resources.
      For eg:channelApiurl=/nearsight.io/payload.html



 



