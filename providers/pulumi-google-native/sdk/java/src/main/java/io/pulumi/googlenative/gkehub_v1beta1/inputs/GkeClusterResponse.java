// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.gkehub_v1beta1.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;


/**
 * GkeCluster contains information specific to GKE clusters.
 * 
 */
public final class GkeClusterResponse extends io.pulumi.resources.InvokeArgs {

    public static final GkeClusterResponse Empty = new GkeClusterResponse();

    /**
     * If cluster_missing is set then it denotes that the GKE cluster no longer exists in the GKE Control Plane.
     * 
     */
    @Import(name="clusterMissing", required=true)
      private final Boolean clusterMissing;

    public Boolean getClusterMissing() {
        return this.clusterMissing;
    }

    /**
     * Immutable. Self-link of the GCP resource for the GKE cluster. For example: //container.googleapis.com/projects/my-project/locations/us-west1-a/clusters/my-cluster Zonal clusters are also supported.
     * 
     */
    @Import(name="resourceLink", required=true)
      private final String resourceLink;

    public String getResourceLink() {
        return this.resourceLink;
    }

    public GkeClusterResponse(
        Boolean clusterMissing,
        String resourceLink) {
        this.clusterMissing = Objects.requireNonNull(clusterMissing, "expected parameter 'clusterMissing' to be non-null");
        this.resourceLink = Objects.requireNonNull(resourceLink, "expected parameter 'resourceLink' to be non-null");
    }

    private GkeClusterResponse() {
        this.clusterMissing = null;
        this.resourceLink = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GkeClusterResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean clusterMissing;
        private String resourceLink;

        public Builder() {
    	      // Empty
        }

        public Builder(GkeClusterResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clusterMissing = defaults.clusterMissing;
    	      this.resourceLink = defaults.resourceLink;
        }

        public Builder clusterMissing(Boolean clusterMissing) {
            this.clusterMissing = Objects.requireNonNull(clusterMissing);
            return this;
        }
        public Builder resourceLink(String resourceLink) {
            this.resourceLink = Objects.requireNonNull(resourceLink);
            return this;
        }        public GkeClusterResponse build() {
            return new GkeClusterResponse(clusterMissing, resourceLink);
        }
    }
}
