# springboot-crud-customer-rest-api-mysql
### Things todo list:
> I assume that you have installed Gradle & MySQL Database on your environment
1. Clone this repository: `git clone https://github.com/hendisantika/springboot-crud-customer-rest-api-mysql.git`.
2. Change MySQL credentials base on your system in `application.properties` file (No Need to create DB. It will be created automatically). 
3. Go inside cloned folder: `cd springboot-crud-customer-rest-api-mysql`.
4. Run your application: `gradle clean bootRun --info` or you can use gradlle wrapper: `/gradlew clean bootRun --info`.
5. Open POSTMAN App then import my POSTMAN Collection.

### Screen shot

Add New Customer

![Add New Customer](img/add.png "Add New Customer")

Get All Customers

![Get All Customers](img/list.png "Get All Customers")

Get Customer By ID

![Get Customer By ID](img/find.png "Get Customer By ID")

Not Found Customer Data

![Not Found Customer Data](img/get0.png "Not Found Customer Data")

Update Customer Data

![Update Customer Data](img/update.png "Update Customer Data")

Delete Customer Data

![Delete Customer Data](img/delete.png "Delete Customer Data")

Delete Customer Data Not Found

![Delete Customer Data Not Found](img/delete0.png "Delete Customer Data Not Found")

