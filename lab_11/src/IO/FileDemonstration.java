package IO;

import java.io.File;

public class FileDemonstration {
	// hiển thị thông tin tệp/thư mục cho bằng đường dẫn path
	public void analyzePath( String path ) {
		// tạo đối tượng File từ đường dẫn path
		File name = new File( path );

		if ( name.exists() ) // nếu tệp/thư mục name tồn tại, in thông tin 
		{
			// hiển thị thông tin tệp/thư mục
			System.out.printf(					"%s%s\n%s\n%s\n%s\n%s%s\n%s%s\n%s%s\n%s%s\n%s%s",
					name.getName(), " ton tai",
					( name.isFile() ? "la tep" : "khong phai la tep" ),
					( name.isDirectory() ? "la thu muc" :
							"khong phai la thu muc" ),
							( name.isAbsolute() ? "la duong dan tuyet doi" :
									"khong la duong dan tuyet doi" ), "Sua lan cuoi: ",
									name.lastModified(), "Kich thuoc: ", name.length(),
									"Duong dan: ", name.getPath(), "Duong dan tuyet doi: ",
									name.getAbsolutePath(), "Thu muc cha: ", name.getParent() );

			if ( name.isDirectory() ) // hiển thị nội dung thư mục
			{
				String directory[] = name.list();
				System.out.println( "\n\nNoi dung thu muc:\n" );

				for ( String directoryName : directory )
					System.out.printf( "%s\n", directoryName );
			}  
		}  
		else // tệp/thư mục không tồn tại, in thông báo lỗi
		{
			System.out.printf( "%s %s", path, "khong ton tai." );
		} 
	}  
}  
