package dayeight;

public class Conditionalstatement {

	public static void main(String[] args) {
      String grade= null;
      int score=65;
      
      if (score >=90)
      {grade="A";
	}
      
      if (score >=80)
      {grade="B";
	}
      
      if (score >=70)
      {grade="C";
	}
      
      if (score <70)
      {grade="Fail";
	}
      
      System.out.println("My score is "+score );
      System.out.println("My grade is "+grade );
  
      
	}
}
