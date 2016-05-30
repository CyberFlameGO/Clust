package org.cyberpwn.clust.cluster;

import java.io.File;
import java.io.IOException;

public interface DataInputtable
{
	public void load(DataCluster cluster, File file) throws IOException;
}
