
By Rahel Ephrem.

A side note I used mac so I will be mostly talking about working on mac/terminal. Please just or email me with questions if you have questions for different operating systems. 

Requirements:

Java 1.8
Apache tomcat 8 (or any server you like to use)
grade 2.X 
Eclipse java EE IDE Luna 
jersey 2.X 
jersey mvc
angularJs

Choosing tools and technologies were based on fit, futures, flexibility, latest greatest tools, easy to build, easy to deploy, reusability, technology support, funds(which in this case all are free) and so on. 

This project demonstrate end to end development(I used https://restcountries.eu/rest/v1/all as a data provider and implemented restful APIS. It demonstrates. https://restcountries.eu/rest/v1/all api data provider(model), jersey web services middle tier data providers (communicating rest api through rest api(model), angularJs mvc framework to render the data))

To run the App :
http://localhost:8080/JerseyJson-1.0/   (port depends on which port your server is running. Please just accordingly)

Restful web service resources:
http://localhost:8080/JerseyJson-1.0/rest/countries/ + any region (to see countries in a given region. This is added to implement spacial features. Example for this feature a user will provide a region name and the app will return all countries in that region. Example urls are:
 http://localhost:8080/JerseyJson-1.0/rest/countries/africa
 http://localhost:8080/JerseyJson-1.0/rest/countries/asia and so on for all valid regions in the world)


http://localhost:8080/JerseyJson-1.0/rest/countries/islands (responds all countries that are also islands in json format)

http://localhost:8080/JerseyJson-1.0/rest/countries/mostBordingCountries/borders (will respond the most bordering country/countries and their bordering countries)

http://localhost:8080/JerseyJson-1.0/rest/countries/mostBordingCountries (to get most bordering country/countries only)

http://localhost:8080/JerseyJson-1.0/rest/countries/all (incase you want to get all the countries in your local machine)


to run this project:
1 - download Apache tomcat(I use tomcat 8) or your choice of server
2 - install gradle
3 - download eclipse or intellij (I used eclipse)
4 - extract the project
5 - go to command line or terminal and cd to the extracted project folder(/programingSolution/JerseyJson)
6 - compile and build the project from a command line/eclipse your choice (to run from command line ‘gradle clean build' or 'gradle clean war') 
7 - a war file will be create under /programingSolution/JerseyJson/build/libs/
8 - to deploy the project, simplly copy the JerseyJson-1.0.war file that was created under /programingSolution/                   JerseyJson/build/libs/ in to apache tomcat webapps folder in my case it is: 
from command line ‘cp /programingSolution/JerseyJson/build/libs/JerseyJson-1.0.war /Applications/apache-tomcat-8.0.28/webapps’
9 - restart the server
4 - go to the browser  of your choice and navigate to the urls given above.  

Note : to run all urls given from a command line simple use curl  + url (if you are using windows you need to install curl)
example : curl http://localhost:8080/JerseyJson-1.0/rest/countries/africa will give all countries with in Africa region.

If you want to work in eclipse IDE from command/terminal run :
gradle clean eclipse 
gradle jar eclipseClasspath 
this two command lines will import all dependencies to eclipse die
next you can import the project to eclipse. 

If you are working on Eclipse you can set up tomcat and build it from eclipse framework(you don’t need to copy the war file to the webapps folder).

Please feel free to reach out at my email address or phone number:
raheph@gmail.com
 

have fun !




