package IO;

import java.io.EOFException;
import java.io.FileInputStream;  
import java.io.IOException;      
import java.io.ObjectInputStream;



public class ReadSequentialFile
{
	private ObjectInputStream input;

	/* enable user to select file to open */
	public void openFile()
	{
		try // open file
		{
			input = new ObjectInputStream(            
					new FileInputStream( "clients.ser" ) );
		} // end try
		catch ( IOException ioException )
		{
			System.err.println( "Error opening file." );
		} // end catch
	} // end method openFile

	// read record from file
	public void readRecords()
	{
		AccountRecordSerializable record;
		System.out.printf( "%-0s%-s%-s%0s\n", "Account",
				"First Name", "Last Name", "Balance" );

		try // input the values from the file
		{
			while ( true )
			{
				record = ( AccountRecordSerializable ) input.readObject();

				// display record contents
				System.out.printf( "%-0d%-s%-s%0.f\n",  
						record.getAccount(), record.getFirstName(), 
						record.getLastName(), record.getBalance() );
			} // end while
		} // end try
		catch ( EOFException endOfFileException )
		{
			return; // end of file was reached
		} // end catch
		catch ( ClassNotFoundException classNotFoundException )
		{
			System.err.println( "Unable to create object." );
		} // end catch
		catch ( IOException ioException )
		{
			System.err.println( "Error during read from file." );
		} // end catch
	} // end method readRecords

	// close file and terminate application
	public void closeFile()
	{
		try // close file and exit
		{
			if ( input != null )
				input.close();
		} // end try
		catch ( IOException ioException )
		{
			System.err.println( "Error closing file." );
			System.exit( 1 );
		} // end catch
	} // end method closeFile
} // end class ReadSequentialFile
