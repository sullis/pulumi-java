// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.eventarc_v1.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GKEResponse {
    /**
     * @return The name of the cluster the GKE service is running in. The cluster must be running in the same project as the trigger being created.
     * 
     */
    private final String cluster;
    /**
     * @return The name of the Google Compute Engine in which the cluster resides, which can either be compute zone (for example, us-central1-a) for the zonal clusters or region (for example, us-central1) for regional clusters.
     * 
     */
    private final String location;
    /**
     * @return The namespace the GKE service is running in.
     * 
     */
    private final String namespace;
    /**
     * @return Optional. The relative path on the GKE service the events should be sent to. The value must conform to the definition of a URI path segment (section 3.3 of RFC2396). Examples: &#34;/route&#34;, &#34;route&#34;, &#34;route/subroute&#34;.
     * 
     */
    private final String path;
    /**
     * @return Name of the GKE service.
     * 
     */
    private final String service;

    @CustomType.Constructor
    private GKEResponse(
        @CustomType.Parameter("cluster") String cluster,
        @CustomType.Parameter("location") String location,
        @CustomType.Parameter("namespace") String namespace,
        @CustomType.Parameter("path") String path,
        @CustomType.Parameter("service") String service) {
        this.cluster = cluster;
        this.location = location;
        this.namespace = namespace;
        this.path = path;
        this.service = service;
    }

    /**
     * @return The name of the cluster the GKE service is running in. The cluster must be running in the same project as the trigger being created.
     * 
     */
    public String cluster() {
        return this.cluster;
    }
    /**
     * @return The name of the Google Compute Engine in which the cluster resides, which can either be compute zone (for example, us-central1-a) for the zonal clusters or region (for example, us-central1) for regional clusters.
     * 
     */
    public String location() {
        return this.location;
    }
    /**
     * @return The namespace the GKE service is running in.
     * 
     */
    public String namespace() {
        return this.namespace;
    }
    /**
     * @return Optional. The relative path on the GKE service the events should be sent to. The value must conform to the definition of a URI path segment (section 3.3 of RFC2396). Examples: &#34;/route&#34;, &#34;route&#34;, &#34;route/subroute&#34;.
     * 
     */
    public String path() {
        return this.path;
    }
    /**
     * @return Name of the GKE service.
     * 
     */
    public String service() {
        return this.service;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GKEResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String cluster;
        private String location;
        private String namespace;
        private String path;
        private String service;

        public Builder() {
    	      // Empty
        }

        public Builder(GKEResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cluster = defaults.cluster;
    	      this.location = defaults.location;
    	      this.namespace = defaults.namespace;
    	      this.path = defaults.path;
    	      this.service = defaults.service;
        }

        public Builder cluster(String cluster) {
            this.cluster = Objects.requireNonNull(cluster);
            return this;
        }
        public Builder location(String location) {
            this.location = Objects.requireNonNull(location);
            return this;
        }
        public Builder namespace(String namespace) {
            this.namespace = Objects.requireNonNull(namespace);
            return this;
        }
        public Builder path(String path) {
            this.path = Objects.requireNonNull(path);
            return this;
        }
        public Builder service(String service) {
            this.service = Objects.requireNonNull(service);
            return this;
        }        public GKEResponse build() {
            return new GKEResponse(cluster, location, namespace, path, service);
        }
    }
}
