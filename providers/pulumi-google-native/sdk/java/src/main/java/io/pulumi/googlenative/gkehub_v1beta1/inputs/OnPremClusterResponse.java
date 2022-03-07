// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.gkehub_v1beta1.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;


/**
 * OnPremCluster contains information specific to GKE On-Prem clusters.
 * 
 */
public final class OnPremClusterResponse extends io.pulumi.resources.InvokeArgs {

    public static final OnPremClusterResponse Empty = new OnPremClusterResponse();

    /**
     * Immutable. Whether the cluster is an admin cluster.
     * 
     */
    @InputImport(name="adminCluster", required=true)
      private final Boolean adminCluster;

    public Boolean getAdminCluster() {
        return this.adminCluster;
    }

    /**
     * If cluster_missing is set then it denotes that API(gkeonprem.googleapis.com) resource for this GKE On-Prem cluster no longer exists.
     * 
     */
    @InputImport(name="clusterMissing", required=true)
      private final Boolean clusterMissing;

    public Boolean getClusterMissing() {
        return this.clusterMissing;
    }

    /**
     * Immutable. Self-link of the GCP resource for the GKE On-Prem cluster. For example: //gkeonprem.googleapis.com/projects/my-project/locations/us-west1-a/vmwareClusters/my-cluster //gkeonprem.googleapis.com/projects/my-project/locations/us-west1-a/bareMetalClusters/my-cluster
     * 
     */
    @InputImport(name="resourceLink", required=true)
      private final String resourceLink;

    public String getResourceLink() {
        return this.resourceLink;
    }

    public OnPremClusterResponse(
        Boolean adminCluster,
        Boolean clusterMissing,
        String resourceLink) {
        this.adminCluster = Objects.requireNonNull(adminCluster, "expected parameter 'adminCluster' to be non-null");
        this.clusterMissing = Objects.requireNonNull(clusterMissing, "expected parameter 'clusterMissing' to be non-null");
        this.resourceLink = Objects.requireNonNull(resourceLink, "expected parameter 'resourceLink' to be non-null");
    }

    private OnPremClusterResponse() {
        this.adminCluster = null;
        this.clusterMissing = null;
        this.resourceLink = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OnPremClusterResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean adminCluster;
        private Boolean clusterMissing;
        private String resourceLink;

        public Builder() {
    	      // Empty
        }

        public Builder(OnPremClusterResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.adminCluster = defaults.adminCluster;
    	      this.clusterMissing = defaults.clusterMissing;
    	      this.resourceLink = defaults.resourceLink;
        }

        public Builder setAdminCluster(Boolean adminCluster) {
            this.adminCluster = Objects.requireNonNull(adminCluster);
            return this;
        }

        public Builder setClusterMissing(Boolean clusterMissing) {
            this.clusterMissing = Objects.requireNonNull(clusterMissing);
            return this;
        }

        public Builder setResourceLink(String resourceLink) {
            this.resourceLink = Objects.requireNonNull(resourceLink);
            return this;
        }
        public OnPremClusterResponse build() {
            return new OnPremClusterResponse(adminCluster, clusterMissing, resourceLink);
        }
    }
}