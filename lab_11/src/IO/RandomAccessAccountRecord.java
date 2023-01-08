package IO;

import java.io.RandomAccessFile;
import java.io.IOException;     

public class RandomAccessAccountRecord extends AccountRecord
{
	public static final int SIZE = 72;

	// no-argument constructor calls other constructor with default values
	public RandomAccessAccountRecord()
	{
		this (0, "", "", 0.0);

	} // end no-argument RandomAccessAccountRecord constructor
	// initialize a RandomAccessAccountRecord
	public RandomAccessAccountRecord( int account, String firstName,
			String lastName, double balance )
	{
		super( account, firstName, lastName, balance );
	} // end four-argument RandomAccessAccountRecord constructor

	// read a record from specified RandomAccessFile
	public void read( RandomAccessFile file ) throws IOException
	{
		setAccount( file.readInt() );
		setFirstName( readName( file ) );
		setLastName( readName( file ) );
		setBalance( file.readDouble() );
	} // end method read

	// ensure that name is proper length
	private String readName( RandomAccessFile file ) throws IOException
	{
		char name[] = new char[15], temp;

		for ( int count = 0; count < name.length; count++ )
		{
			temp = file.readChar();
			name[ count ] = temp;
		} // end for

		return new String( name ).replace( '\0', ' ' );
	} // end method readName

	// write a record to specified RandomAccessFile
	public void write( RandomAccessFile file ) throws IOException
	{
		file.writeInt( getAccount() );
		writeName( file, getFirstName() );
		writeName( file, getLastName() );
		file.writeDouble( getBalance() );
	} // end method write

	// write a name to file; maximum of 15 characters
	private void writeName( RandomAccessFile file, String name )
			throws IOException  {
		StringBuffer buffer = null;

		if ( name != null )
			buffer = new StringBuffer( name );
		else
			buffer = new StringBuffer(15);

		buffer.setLength(15);
		file.writeChars( buffer.toString() );
	} // end method writeName
} // end class RandomAccessAccountRecord
