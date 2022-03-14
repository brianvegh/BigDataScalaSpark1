package com.Revature

import java.sql.DriverManager
import java.sql.Connection
import java.sql.PreparedStatement
import java.sql.SQLException

object JDBC1 {

  def main(args: Array[String]) {
    // connect to the database named "test" on the localhost

    val driver = "com.mysql.cj.jdbc.Driver"
    val url = "jdbc:mysql://localhost:3306/test"
    val username = "root"
    val password = "p4ssword"

    var connection:Connection = DriverManager.getConnection(url, username, password)
    val statement = connection.createStatement()
    val resultSet = statement.executeQuery("SELECT * FROM users;")



    while ( resultSet.next() ) {
      println(resultSet.getString(1)+", " +resultSet.getString(2) +", " +resultSet.getString(3))
    }

    //connection.close()
    //Class.forName(driver)
    //val connection2 = DriverManager.getConnection(url, username, password)
    val statement2=connection.createStatement()
    statement2.executeUpdate("INSERT INTO users VALUES(6, 'start', '2000-01-06');")

    connection.close()
  }

}