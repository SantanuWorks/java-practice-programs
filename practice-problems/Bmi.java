// calculate the body mass index  ( weight / height^2 )
// based on the following table find the BMI category
// < 15 Starvation
// 15.1 - 17.5 Anorexic 
// 17.6 - 18.5 Underweight
// 18.6 - 24.9 Ideal
// 25 - 29.9 Overweight
// 30 - 39.9 Obese 
// >= 40 Morbidly Obese 
// Enter weight in kgs and height in meters through command line
public class Bmi{
	public static void main(String[] args){
	float w = Float.parseFloat(args[0]);
	float h = Float.parseFloat(args[1]);
	float bmi = w / (h*h) ;
	if ( bmi < 15.0f ) System.out.print("Starvation");
	else if( bmi >= 15.1f && bmi <= 17.5f ) System.out.print("Anorexic");
	else if( bmi >= 17.6f && bmi <= 18.5f ) System.out.print("Underweight");
	else if( bmi >= 18.6f && bmi <= 24.9f ) System.out.print("Ideal");
	else if( bmi >= 25.0f && bmi <= 29.9f ) System.out.print("Overweight");
	else if( bmi >= 30.0f && bmi <= 39.9f ) System.out.print("Obese");
	else if( bmi >= 40.0f ) System.out.print("Morbidly Obese");
	
	}
}