# developer-coffee
A simple microservices example (developer/coffee) built with JavaEE, Docker and Maven following the screencast by Adam Bien: https://www.youtube.com/watch?v=QO2321eMNYE.

I developed the "coffee" and "developer" microservices, build them with maven and docker, ran them on 2 different instances of Wildfly 10, and eventually let them communicate.

Check out Adam Bien resources here: Also checkout http://javaeemicro.services or http://airhacks.com .

# how to use the project
The project is a great starting point for learning about microservices, docker and maven integration plugin by Fabric8. 

1- Download/clone the repository project.

2- From parent directory type: 

`mvn clean install`

At the end of the build 2 docker images will be created.

3- To start the containers simply type:

`mvn docker run`

Two containers named coffee and developer are now running on your host machine. To check that type:

`docker ps -a`

4- Check that you can query the rest 'micro' service:

`curl -i http://localhost:8080/developer/resources/developer`



