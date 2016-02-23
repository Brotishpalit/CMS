
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


public abstract class LoginProcessBase {
	Connection con;
	PreparedStatement ps;
	ResultSet rs;
	String UserName;
	String UserPassword;
	String SecurityQuestion;
	String QuestionAnswer;
}
