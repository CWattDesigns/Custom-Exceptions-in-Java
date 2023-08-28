# Custom-Exceptions-in-Java
This project puts to practice the concepts surrounding creating and throwing custom exceptions in Java using FM Radio Stations.
There are 3 main files to note:

FMRadioStation.java --> Creates the class FMRadioStation which throws a custom exception
FMRadioStationException.java --> A custom class that extends Exception
Output.java -->
  PART 1: Prompts user for 2 integers then checks if there is an ArithmeticException when those 2 integers are divided.
  PART 2: Scans for a user input CallSign and a user input Frequency, then creates an FMRadioStation object using the CallSign and Frequency if both are valid.
  PART 3: A loop is run to output all of the FMRadioStation elements contained within the FMRadioArray.

        The checks performed are as follows:
        CALLSIGN: If the entered CallSign is not in all uppercase, a custom exception is thrown for an FMRadioStationException (FMRSE) and the user is told the CallSign is invalid.
        FREQUENCY: If the entered Frequency is BELOW 88.0 or ABOVE 108.0, a custom exception is thrown for an FMRadioStationException (FMRSE) and the user gets a 404 error.
