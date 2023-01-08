package IO;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.NoSuchElementException;
import java.util.Scanner;



public class WriteRandomFile
{
	private RandomAccessFile output;

	private static final int NUMBER_RECORDS = 100;

	// enable user to choose file to open
	public void openFile()
	{
		try // open file
		{
			output = new RandomAccessFile( "clients.dat", "rw" );
		} // end try
		catch ( IOException ioException )
		{
			System.err.println( "File does not exist." );
		} // end catch
	} // end method openFile

	// close file and terminate application
	public void closeFile()
	{
		try // close file and exit
		{
			if ( output != null )
				output.close();
		} // end try
		catch ( IOException ioException )
		{
			System.err.println( "Error closing file." );
			System.exit( 1 );
		} // end catch
	} // end method closeFile

	// add records to file
	public void addRecords()
	{
		// object to be written to file
		RandomAccessAccountRecord record = new RandomAccessAccountRecord();

		int accountNumber = 0 ; // account number for AccountRecord object
		String firstName; // first name for AccountRecord object
		String lastName; // last name for AccountRecord object
		double balance; // balance for AccountRecord object

		Scanner input = new Scanner( System.in );

		System.out.printf( "%s\n%s\n%s\n%s\n\n",
				"To terminate input, type the end-of-file indicator ",
				"when you are prompted to enter input.",
				"On UNIX/Linux/Mac OS X type <ctrl> d then press Enter",
				"On Windows type <ctrl> z then press Enter" );

		System.out.printf( "%s %s\n%s", "Enter account number (1-100),",
				"first name, last name and balance.", "? " );

		while ( input.hasNext() ) // loop until end-of-file indicator
		{
			try // output values to file
			{
				accountNumber = input.nextInt(); // read account number
				firstName = input.next(); // read first name
				lastName = input.next(); // read last name
				balance = input.nextDouble(); // read balance

				if ( accountNumber > 0 && accountNumber <= NUMBER_RECORDS )
				{
					record.setAccount( accountNumber );
					record.setFirstName( firstName );  
					record.setLastName( lastName );    
					record.setBalance( balance );      

					output.seek( ( accountNumber - 1 ) * // position to proper
							RandomAccessAccountRecord.SIZE ); // location for file 
					record.write( output );                                   
				} // end if
				else
					System.out.println( "Account must be between  and ." );
			} // end try
			catch ( IOException ioException )
			{
				System.err.println( "Error writing to file." );
				return;
			} // end catch
			catch ( NoSuchElementException elementException )
			{
				System.err.println( "Invalid input. Please try again." );
				input.nextLine(); // discard input so user can try again
			} // end catch

			System.out.printf( "%s %s\n%s", "Enter account number (1-100),",
					"first name, last name and balance.", "? " );
		} // end while
	} // end method addRecords
} // end class WriteRandomFile
