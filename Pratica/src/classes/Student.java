package classes;

public class Student 
{
	
	private String name;
	private double average;
	
	//construtor inicializa variáveis de instância
	public Student(String name, double average)
	{
	this.name = name;
	
	//valida que a média é > 0.0 e <= 100.0; caso contrário,
	//armazena o valor padrão da média da variável de instância (0.0)
	if (average > 0.0)
		if (average <= 100.0)
			this.average = average; //atribui variável de instância 
	}
	
	//define o nome de Student
	public void setName(String name) 
	{
		this.name = name;
	}
	
	//recupera o nome do Student
	public String getName() 
	{
		return name;
	}
	
	//define a média de Student
	public void setAverage(double studentAverage) 
	{
		//valida que a média é > 0.0 e <= 100.0; caso contrário,
		//armazena o valor atual da média da variável instância
		if (average > 0.0)
			if (average <= 100.0)
				this.average = average; //atribui variável de instância 
	}
	
	//recupera média de Student
	public double getAverage()
	{
		return average;
	}
	
	//determina e retorna a letra da nota de Student
	public String getLetterGrade() 
	{
		String letterGrade = ""; //inicializando como uma String vazia
		
		if (average >= 90.0)
			letterGrade = "A";
		else if (average >= 80.0)
			letterGrade = "B";
		else if (average >= 70.0)
			letterGrade = "C";
		else if (average >= 60.0)
			letterGrade = "D";
		else
			letterGrade = "F";
		
		return letterGrade;
	}
}// finaliza a vlass Student