#EIP Dynamic Router implementation

## Description
Sample of implementation of EIP Dynamic Router based on 
Apache Camel 2.15.1, Spark Rest services and ActiveMQ

You will need to package this example first:
  mvn package

Spark requires Java 8, so you will need to use Java 8.

To run the example deploy it in Apache Tomcat by copying the .war to the
deploy folder of Apache Tomcat.

You can also try the example from Maven using
   mvn jetty:run
   
## REST invocations
### HTTP GET Requests:
* Get Company List: 	[http://localhost:8080/company/list](http://localhost:8080/company/list)
* Get Company 100: 		[http://localhost:8080/company/view/100](http://localhost:8080/company/view/100)
* Get Ratio:			[http://localhost:8080/company/ratio](http://localhost:8080/company/ratio)

### HTTP PUT Requests:
* New Company:			[http://localhost:8080/company/new](http://localhost:8080/company/new) 

|Input data with ratio <= 10|Input data with ratio > 10|
|---------------------------|--------------------------|
|{							|{						   |
|"id": 300,					|"id": 400,				   |
|"name": "Unisys",			|"name": "IBM",			   |
|"debt": 1000,				|"debt": 100000,		   |
|"equity": 2000				|"equity": 2000			   |
|} 							|}						   |

* Set Ratio: 			[http://localhost:8080/company/ratio](http://localhost:8080/company/ratio)
|Input data|
|----------|
|25		   |

[@jcanomedina](https://twitter.com/jcanomedina)

