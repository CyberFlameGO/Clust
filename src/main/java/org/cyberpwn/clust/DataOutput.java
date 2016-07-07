package org.cyberpwn.clust;

import java.io.File;
import java.io.IOException;

public class DataOutput implements Output
{
	protected DataCluster cluster;
	protected File file;
	
	public DataOutput(DataCluster cluster, File file)
	{
		this.cluster = cluster;
		this.file = file;
	}
	
	@Override
	public void save() throws IOException
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
			file.getParentFile().mkdirs();
			file.createNewFile();
		}
	}
}
