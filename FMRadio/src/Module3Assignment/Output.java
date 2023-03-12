package Module3Assignment;
import java.util.Arrays;
import java.util.Scanner;

public class Output {

	//Checks if the CallSign is valid length and starts with a valid letter
	public static String checkCallSign(String callSign){
		try {
			if ((callSign.length() == 4) && callSign.startsWith("A") || callSign.startsWith("K") || callSign.startsWith("N") || callSign.startsWith("W")){
				return callSign;
			} else {
				throw new FMRadioStationException();
			}
		} catch(FMRadioStationException FMRSE) {
			return "Not Valid";
			}
	}
	//Checks if the CallSign is uppercase
	public static String checkIfUpper(String callSign) {
		try {
			if(callSign.toUpperCase().equals(callSign)) {
				return callSign;
			} else {
				throw new FMRadioStationException();
			}
		} catch (FMRadioStationException FMRSE) {
			return "Not Uppercase";
		}
	}
	//Checks if the frequency is in the correct range
	public static float checkFreq(float freq) throws FMRadioStationException{
		try {
			if (freq < 88.0 || freq > 108.0) {
				throw new FMRadioStationException();
			} else {
				return freq;
			}
		}catch(FMRadioStationException FMRSE) {
			return 404;
		}
	}
	
	public static void main(String[] args) throws FMRadioStationException{
		//
		//		PART 1 Of Module 3 Assignment
		//
		Scanner num1 = new Scanner(System.in);						//Prompts, scans, and assigns for the first integer
		System.out.println("Enter the first value: ");
		int first = num1.nextInt();
		
		Scanner num2 = new Scanner(System.in);
		System.out.println("Enter the second value: ");				//Prompts, scans, and assigns for the second integer
		int second = num2.nextInt();
		
		try {
			double results = first / second;						//Tries the equation first as integers to catch an ArithmeticException 
			double result = (double) first / second;				//Tries the equation cast as a double to include a wider range of output
			System.out.println((first)+" / "+second+" = "+result);	//Outputs the results of the double-casted equation
		} catch (ArithmeticException ae) {							//Catches the ArithmeticException
			System.out.println("Whoops! You can't divide by 0!\r\n");	//Prints the error for the ArithmeticException
		};
		//
		//		PART 2 Of Module 3 Assignment
		//
		FMRadioStation[] FMRadioArray = new FMRadioStation[8];
		for(int i = 0; i<8; i++) {
			
			Scanner sign = new Scanner(System.in);							//Scans for user input for CallSign
			System.out.println("Enter a radio station call sign: ");
			String callSign = sign.next();
			
			
			Scanner frequency = new Scanner(System.in);						//Scans for user input of Frequency
			System.out.println("Enter a radio station frequency: ");
			float freq = frequency.nextFloat();

			FMRadioArray[i] = new FMRadioStation(checkCallSign(checkIfUpper(callSign)), checkFreq(freq)); //Creates object with inputs
		};
		System.out.println(); //Formatting
		
		//Prints the array of objects neatly
		for(int i=0; i<FMRadioArray.length; i++) {
			System.out.println("FMRadioStation #" + i + ": " + FMRadioArray[i]);
		}
	}
}
