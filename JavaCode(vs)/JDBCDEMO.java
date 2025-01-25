import java.sql.*;
public class JDBCDEMO {
    private static final String url = "jdbc:mysql://localhost:3306/books";
    private static final String username = "root";
    private static final String pwd = "123456";

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection connection = DriverManager.getConnection(url, username, pwd);//connection interface ,statement interface,Resultset class
        Statement statement = connection.createStatement();
        statement.execute("create table book(id int,name varchar(50))");
        statement.execute("insert into book values(2,'raman')");
        statement.execute("insert into book values(3,'gagan')");
        statement.execute("update book set name='chaman' where id=3");
        statement.execute("delete from book where id=2");
        String query="Select * from book";
        ResultSet resultSet=statement.executeQuery(query);//resultset gives the data in tabular form
        System.out.println("id"+" "+"name");
        while(resultSet.next()){
            int id=resultSet.getInt("id");
            String name=resultSet.getString("name");
            System.out.println(id+" "+name);
        }

        statement.close();
        connection.close();
    }
}