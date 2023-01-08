package IO;

public class ReadRandomFileTest
{
	public static void main( String args[] )
	{
		ReadRandomFile application = new ReadRandomFile();
		application.openFile();
		application.readRecords();
		application.closeFile();
	} // end main
} // end class ReadRandomFileTest
