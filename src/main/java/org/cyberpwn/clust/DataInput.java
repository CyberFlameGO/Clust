package org.cyberpwn.clust;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

public class DataInput implements DataInputtable
{
	@Override
	public void load(DataCluster cluster, File file) throws IOException
	{
		if(file.exists())
		{
			if(file.isDirectory())
			{
				throw new IOException("Target Directory (" + file.getPath() + ") is not a file!");
			}
		}
		
		else
		{
			throw new FileNotFoundException();
		}
	}
}
