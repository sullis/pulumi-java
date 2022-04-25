// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.gkehub_v1alpha2.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;


/**
 * MultiCloudCluster contains information specific to GKE Multi-Cloud clusters.
 * 
 */
public final class MultiCloudClusterResponse extends com.pulumi.resources.InvokeArgs {

    public static final MultiCloudClusterResponse Empty = new MultiCloudClusterResponse();

    /**
     * If cluster_missing is set then it denotes that API(gkemulticloud.googleapis.com) resource for this GKE Multi-Cloud cluster no longer exists.
     * 
     */
    @Import(name="clusterMissing", required=true)
    private Boolean clusterMissing;

    /**
     * @return If cluster_missing is set then it denotes that API(gkemulticloud.googleapis.com) resource for this GKE Multi-Cloud cluster no longer exists.
     * 
     */
    public Boolean clusterMissing() {
        return this.clusterMissing;
    }

    /**
     * Immutable. Self-link of the GCP resource for the GKE Multi-Cloud cluster. For example: //gkemulticloud.googleapis.com/projects/my-project/locations/us-west1-a/awsClusters/my-cluster //gkemulticloud.googleapis.com/projects/my-project/locations/us-west1-a/azureClusters/my-cluster
     * 
     */
    @Import(name="resourceLink", required=true)
    private String resourceLink;

    /**
     * @return Immutable. Self-link of the GCP resource for the GKE Multi-Cloud cluster. For example: //gkemulticloud.googleapis.com/projects/my-project/locations/us-west1-a/awsClusters/my-cluster //gkemulticloud.googleapis.com/projects/my-project/locations/us-west1-a/azureClusters/my-cluster
     * 
     */
    public String resourceLink() {
        return this.resourceLink;
    }

    private MultiCloudClusterResponse() {}

    private MultiCloudClusterResponse(MultiCloudClusterResponse $) {
        this.clusterMissing = $.clusterMissing;
        this.resourceLink = $.resourceLink;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(MultiCloudClusterResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private MultiCloudClusterResponse $;

        public Builder() {
            $ = new MultiCloudClusterResponse();
        }

        public Builder(MultiCloudClusterResponse defaults) {
            $ = new MultiCloudClusterResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param clusterMissing If cluster_missing is set then it denotes that API(gkemulticloud.googleapis.com) resource for this GKE Multi-Cloud cluster no longer exists.
         * 
         * @return builder
         * 
         */
        public Builder clusterMissing(Boolean clusterMissing) {
            $.clusterMissing = clusterMissing;
            return this;
        }

        /**
         * @param resourceLink Immutable. Self-link of the GCP resource for the GKE Multi-Cloud cluster. For example: //gkemulticloud.googleapis.com/projects/my-project/locations/us-west1-a/awsClusters/my-cluster //gkemulticloud.googleapis.com/projects/my-project/locations/us-west1-a/azureClusters/my-cluster
         * 
         * @return builder
         * 
         */
        public Builder resourceLink(String resourceLink) {
            $.resourceLink = resourceLink;
            return this;
        }

        public MultiCloudClusterResponse build() {
            $.clusterMissing = Objects.requireNonNull($.clusterMissing, "expected parameter 'clusterMissing' to be non-null");
            $.resourceLink = Objects.requireNonNull($.resourceLink, "expected parameter 'resourceLink' to be non-null");
            return $;
        }
    }

}
