package org.cyberpwn.clust.cluster;

import org.cyberpwn.clust.cluster.DataCluster.ClusterDataType;

public class ClusterDouble extends Cluster
{
	public ClusterDouble(Double value)
	{
		super(ClusterDataType.DOUBLE, value);
	}
	
	public double get()
	{
		return value.doubleValue();
	}
	
	public void set(double i)
	{
		value = i;
	}
}
