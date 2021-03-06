package edu.ycp.cs320.stocksimulation.client;

import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;

import edu.ycp.cs320.stocksimulation.shared.Search;

@RemoteServiceRelativePath("login")
public interface SearchService extends RemoteService {
	public Search search(String symbol);
}
