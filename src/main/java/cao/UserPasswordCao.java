package cao;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import model.User;


public class UserPasswordCao {
	// CSVファイルを読み込み1行ずつ出力
	  public List<User> readUserPassword(){
		  BufferedReader br = null;
		  Path p1 = Paths.get("");
		  Path p2 = p1.toAbsolutePath();
		  System.out.println(p2.toString());
		  String file_name = "/Applications/Eclipse_2022-03.app/Contents/workspace/sample/src/main/csv/user_pasword.csv"; // 入力ファイル
		  List <User> userList = new ArrayList<>();
		  
		  try {
			  File file = new File(file_name);
			  br = new BufferedReader(new FileReader(file));
			  // readLineで一行ずつ読み込む
			  String line; // 読み込み行
			  String[] data; // 分割後のデータを保持する配列
			  while ((line = br.readLine()) != null) {
				  // lineをカンマで分割し、配列dataに設定
				  data = line.split(",");
				  User user = new User(data[0],data[1]);
				  
				  
				  userList.add(user);
				  
			  }
		  } catch (Exception e) {
			  System.out.println(e.getMessage());
		  } finally {
			  try {
				  br.close();
			  } catch (Exception e) {
				  System.out.println(e.getMessage());
			  }
		  }
		  return userList;
	  }
}
