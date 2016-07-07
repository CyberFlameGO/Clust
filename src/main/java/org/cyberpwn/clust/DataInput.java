package org.cyberpwn.clust;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

public class DataInput implements Input
{
	protected DataCluster cluster;
	protected File file;
	
	public DataInput(DataCluster cluster, File file)
	{
		this.cluster = cluster;
		this.file = file;
	}
	
	@Override
	public void load() throws IOException
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
