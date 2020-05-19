Instructions to run project in docker.

1. Go to project root folder in command prompt

2. Pull mysql image from www.hub.docker.com using following command
   > docker pull mysql
   
3. Run Mysql image using following command
   > docker run --name localhost -e MYSQL_ROOT_PASSWORD=root -e MYSQL_DATABASE=test -d mysql
  
   Here, --name localhost --- > Gives name to container
         -e MYSQL_ROOT_PASSWORD ---> environment variable for Root Password
         -e MYSQL_DATABASE ---> environment variable for Database Name
         -d mysql ---> name of image

4. Check MySql container is running or not using following command
   > docker container ls
   
5. Build docker image of Spring Boot Application from Dockerfile.
   > docker build -f Dockerfile -t springbootdockerapp .
   
   Here, -f Dockerfile ---> Name of file we created in spring boot project
         -t springbootdockerapp ---> Tag Name(Image Name) given
         .  ---> dot represents current directory of docker engine.
         
6. Check springbootdockerapp image is created using following command.
   > docker images
   
7. Run spring boot application and link to Mysql server.

  > docker run -p 8080:8080 --name springbootdockerapp --link localhost -d springbootdockerapp
  
  Here, -p 8080:8080 --- > This maps local Computer's 8080 port request to 8080 port of spring boot app running in docker engine.
        --name springbootdockerapp --> Gives name to docker container
        --link localhost --> This links spring boot to application to Mysql Server(named localhost)
        -d springbootdockerapp ---> Name of image file
        
8. Check how many containers are running in docker engine using either following command.
   > docker ps -a
         OR
   > docker container ls
  
9. To see logs of Mysql Server
   > docker logs localhost
   
10. To see logs of Spring Application
   > docker logs springbootdockerapp
   
11. Open Browser and type localhost:8080/api/users to get api's response



	Others docker's useful commands
	
	1. To stop running container
	 > docker container stop springbootdockerapp
	 
	2. To start stopped container
	 > docker container start springbootdockerapp
	 
	3. To remove container container
	 > docker container rm springbootdockerapp
	 
	4. To remove image
	 > docker image rm <IMAGEID>
	 
	
	 
	  
         