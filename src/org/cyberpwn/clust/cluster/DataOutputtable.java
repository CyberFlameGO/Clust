package org.cyberpwn.clust.cluster;

import java.io.File;
import java.io.IOException;

public interface DataOutputtable
{
	public void save(DataCluster cluster, File file) throws IOException;
}
