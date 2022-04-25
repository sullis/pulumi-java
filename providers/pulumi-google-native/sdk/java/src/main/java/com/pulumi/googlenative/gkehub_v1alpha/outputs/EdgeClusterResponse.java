// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.gkehub_v1alpha.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class EdgeClusterResponse {
    /**
     * @return Immutable. Self-link of the GCP resource for the Edge Cluster. For example: //edgecontainer.googleapis.com/projects/my-project/locations/us-west1-a/clusters/my-cluster
     * 
     */
    private final String resourceLink;

    @CustomType.Constructor
    private EdgeClusterResponse(@CustomType.Parameter("resourceLink") String resourceLink) {
        this.resourceLink = resourceLink;
    }

    /**
     * @return Immutable. Self-link of the GCP resource for the Edge Cluster. For example: //edgecontainer.googleapis.com/projects/my-project/locations/us-west1-a/clusters/my-cluster
     * 
     */
    public String resourceLink() {
        return this.resourceLink;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EdgeClusterResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String resourceLink;

        public Builder() {
    	      // Empty
        }

        public Builder(EdgeClusterResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.resourceLink = defaults.resourceLink;
        }

        public Builder resourceLink(String resourceLink) {
            this.resourceLink = Objects.requireNonNull(resourceLink);
            return this;
        }        public EdgeClusterResponse build() {
            return new EdgeClusterResponse(resourceLink);
        }
    }
}
