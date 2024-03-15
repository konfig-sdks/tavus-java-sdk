package com.konfigthis.client;

import com.konfigthis.client.api.ReplicasApi;
import com.konfigthis.client.api.VideosApi;

public class Tavus {
    private ApiClient apiClient;
    public final ReplicasApi replicas;
    public final VideosApi videos;

    public Tavus() {
        this(null);
    }

    public Tavus(Configuration configuration) {
        this.apiClient = new ApiClient(null, configuration);
        this.replicas = new ReplicasApi(this.apiClient);
        this.videos = new VideosApi(this.apiClient);
    }

}
