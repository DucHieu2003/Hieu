package IO;

import java.io.IOException;  // Creates random-access file by writing  empty records to disk.
   import java.io.RandomAccessFile;
 
 
 
   public class CreateRandomFile
   {
     private static final int NUMBER_RECORDS = 100;

     // enable user to select file to open
     public void createFile()
     {
        RandomAccessFile file = null;

        try // open file for reading and writing
        {
           file = new RandomAccessFile( "clients.dat", "rw" );

           RandomAccessAccountRecord blankRecord =
              new RandomAccessAccountRecord();

           // write  blank records
           for ( int count = 0 ; count < NUMBER_RECORDS; count++ )
              blankRecord.write( file );

           // display message that file was created
           System.out.println( "Created file clients.dat." );

           System.exit( 0 ); // terminate program
        } // end try
        catch ( IOException ioException )
        {
           System.err.println( "Error processing file." );
           System.exit( 1 );
        } // end catch
        finally
        {
           try
           {
              if ( file != null )
                 file.close(); // close file
           } // end try
           catch ( IOException ioException )
           {
              System.err.println( "Error closing file." );
              System.exit( 1 );
           } // end catch
        } // end finally
     } // end method createFile
  } // end class CreateRandomFile
