package IO;

public class WriteRandomFileTest
{
	public static void main( String args[] )
	{
		WriteRandomFile application = new WriteRandomFile();
		application.openFile();
		application.addRecords();
		application.closeFile();
	} // end main
} // end class WriteRandomFileTest
