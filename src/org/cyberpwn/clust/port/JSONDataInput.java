package org.cyberpwn.clust.port;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import org.cyberpwn.clust.cluster.DataCluster;
import org.cyberpwn.clust.cluster.DataInput;
import org.cyberpwn.clust.lib.json.JSONObject;

public class JSONDataInput extends DataInput
{
	public void load(DataCluster cluster, File file) throws IOException
	{
		super.load(cluster, file);
		
		BufferedReader br = new BufferedReader(new FileReader(file));
		StringBuilder sb = new StringBuilder();
		String line = null;
		JSONObject js = null;
		
		while((line = br.readLine()) != null)
		{
			sb.append(line);
		}
		
		br.close();
		js = new JSONObject(sb.toString());
		
		for(String i : js.keySet())
		{
			cluster.trySet(i, js.get(i));
		}
	}
}
