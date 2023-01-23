import java.sql.*
import java.util.*

//create table, search, insert data based on condition using JDBC
//crud operation must be in the form of switch(when statement) so user can select the choice until user exits the program has to run

class task1 {
    var conn: Connection? = null
    fun createConnection(){ //Create Connection
        try {
            Class.forName("com.mysql.cj.jdbc.Driver").newInstance()
            conn = DriverManager.getConnection("jdbc:mysql://localhost/banksystem","root","Shshetty1@")
            if(conn!=null){
                print("\nConnected! Welcome to the MySQL\n")
            }
        } catch (e: SQLException){
            print(e)
        }
    }

    fun createTable(){  //Function to create table or update table in existing database
        var prestat: PreparedStatement?=null
        var sql = "CREATE TABLE task(id int not null auto_increment, name varchar(255), age int not null,primary key(id));"
        try {
            prestat = conn!!.prepareStatement(sql)
            var status = prestat.executeUpdate()
            print(status)
            if(status==0){
                print("\nTable is created\n")
            }
        }catch (e:SQLException){
            print(e)
        }
    }

    fun insertIntoTable(){  //Insert values into existing table
        var preStat: PreparedStatement?= null;
        var sql = "INSERT INTO task1(name, age) values(?, ?);"   //
        try {
            preStat = conn!!.prepareStatement(sql)
            preStat.setString(1, readLine())
            preStat.setInt(2, readLine()!!.toInt())
            var status = preStat.executeUpdate()
            print(status)
            if(status==1){
                print("\nData inserted into table\n")
            }
        }catch (e: SQLException){
            print(e)
        }
    }

    fun searchData(){
        var prepStat: PreparedStatement?= null
        var sql = "SELECT age FROM task1 WHERE name=?;"
        try{
            prepStat = conn!!.prepareStatement(sql)
            prepStat.setString(1, readLine())
            var status = prepStat.executeQuery()
            print(status)
            print("\n")
            while (status!!.next()){
                print("${status.getInt("age")}")
            }

//            if(status==1) {
//                print("\nBelow is the data you have searched:\n")
//            }else{
//                print("\nNo such data in table\n")
//            }
        }catch(e:SQLException){
            print(e)
        }
    }

    fun executeQueryOfDataBase(){
        var stment: Statement?=null      //if var exist then null is initialized
        var sql = "SHOW TABLES;"
        var res: ResultSet?=null
        try {
            stment = conn!!.createStatement()   //connection is created then only create statement
            print(res)      //prints null
            print("\n")
            res = stment!!.executeQuery(sql)
            print(res)      //prints memory address?
            print("\n")
            //for actual res use iterator
            while(res!!.next()){
                print(res.getString("Tables_in_banksystem"))    //will hold 1 table at a time and print
                print("\n")
            }
        }catch (e:SQLException){
            print(e)
        }finally {  //Closing connection and result object
            if (res!=null){         //if there is value in result then close res and connection
                try{
                    res!!.close()
                    conn!!.close()
                }catch (e:SQLException){
                    print(e)
                }
            }
        }
    }

}
fun main(){
    var task1obj = task1()
    task1obj.createConnection()
    print("\nEnter the no for the following CRUD Operations:\n1.Create Table\n2.Insert Data\n3.Search Data\n4.Exit\n")
    val read = Scanner(System.`in`)
    val choice: Int  = read.nextInt()
    val result = when(choice){
        1->     task1obj.createTable()
        2->     task1obj.insertIntoTable()
        3->     task1obj.searchData()
        4->     task1obj.executeQueryOfDataBase()
        else -> "Wrong choice"
    }
}