package org.cyberpwn.clust.cluster;

public interface Configurable
{
	void onNewConfig();
	void onReadConfig();
	DataCluster getConfiguration();
	String getCodeName();
}
