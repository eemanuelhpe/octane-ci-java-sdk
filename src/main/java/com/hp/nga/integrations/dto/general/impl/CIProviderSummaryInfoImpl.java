package com.hp.nga.integrations.dto.general.impl;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.hp.nga.integrations.dto.general.CIProviderSummaryInfo;
import com.hp.nga.integrations.dto.general.CIPluginInfo;
import com.hp.nga.integrations.dto.general.CIServerInfo;

/**
 * Created by gullery on 03/01/2016.
 * <p/>
 * Description of Plugin Status
 */

@JsonIgnoreProperties(ignoreUnknown = true)
class CIProviderSummaryInfoImpl implements CIProviderSummaryInfo {
	private CIServerInfo server;
	private CIPluginInfo plugin;

	public CIServerInfo getServer() {
		return server;
	}

	public CIProviderSummaryInfo setServer(CIServerInfo server) {
		this.server = server;
		return this;
	}

	public CIPluginInfo getPlugin() {
		return plugin;
	}

	public CIProviderSummaryInfo setPlugin(CIPluginInfo plugin) {
		this.plugin = plugin;
		return this;
	}
}
