import java.io.File;
import java.io.Serializable;
import java.util.Date;


public class RepositoryFile
{
public Date lastmodtime;
public byte[] content_hash;
public int path_hash;
public File file; 
public User owner;

public RepositoryFile(String path)
	{
	file= new File(path);
	lastmodtime= new Date(file.lastModified());
	path_hash=file.hashCode();
	}

}
