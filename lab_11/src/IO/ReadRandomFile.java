package IO;// This program reads a random-access file sequentially and
// displays the contents one record at a time in text fields.
import java.io.EOFException;
import java.io.IOException;
import java.io.RandomAccessFile;


public class ReadRandomFile
{
	private RandomAccessFile input;

	// enable user to select file to open
	public void openFile()
	{
		try // open file
		{
			input = new RandomAccessFile( "clients.dat", "r" );
		} // end try
		catch ( IOException ioException )
		{
			System.err.println( "File does not exist." );
		} // end catch
	} // end method openFile

	// read and display records
	public void readRecords()
	{
		RandomAccessAccountRecord record = new RandomAccessAccountRecord();

		System.out.printf( "%-10s%-15s%-15s%10s\n", "Account",
				"First Name", "Last Name", "Balance" );

		try // read a record and display
		{
			while ( true )
			{
				do
				{
					record.read( input );
				} while ( record.getAccount() == 0 );

				// display record contents
				System.out.printf( "%-10d%-12s%-12s%10.2f\n",
						record.getAccount(), record.getFirstName(),
						record.getLastName(), record.getBalance() );
			} // end while
		} // end try
		catch ( EOFException eofException ) // close file
		{
			return; // end of file was reached
		} // end catch
		catch ( IOException ioException )
		{
			System.err.println( "Error reading file." );
			System.exit( 1 );
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
} // end class ReadRandomFile
