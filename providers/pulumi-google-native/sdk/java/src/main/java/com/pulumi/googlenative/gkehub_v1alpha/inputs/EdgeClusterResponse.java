// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.gkehub_v1alpha.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * EdgeCluster contains information specific to Google Edge Clusters.
 * 
 */
public final class EdgeClusterResponse extends com.pulumi.resources.InvokeArgs {

    public static final EdgeClusterResponse Empty = new EdgeClusterResponse();

    /**
     * Immutable. Self-link of the GCP resource for the Edge Cluster. For example: //edgecontainer.googleapis.com/projects/my-project/locations/us-west1-a/clusters/my-cluster
     * 
     */
    @Import(name="resourceLink", required=true)
    private String resourceLink;

    /**
     * @return Immutable. Self-link of the GCP resource for the Edge Cluster. For example: //edgecontainer.googleapis.com/projects/my-project/locations/us-west1-a/clusters/my-cluster
     * 
     */
    public String resourceLink() {
        return this.resourceLink;
    }

    private EdgeClusterResponse() {}

    private EdgeClusterResponse(EdgeClusterResponse $) {
        this.resourceLink = $.resourceLink;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(EdgeClusterResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private EdgeClusterResponse $;

        public Builder() {
            $ = new EdgeClusterResponse();
        }

        public Builder(EdgeClusterResponse defaults) {
            $ = new EdgeClusterResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param resourceLink Immutable. Self-link of the GCP resource for the Edge Cluster. For example: //edgecontainer.googleapis.com/projects/my-project/locations/us-west1-a/clusters/my-cluster
         * 
         * @return builder
         * 
         */
        public Builder resourceLink(String resourceLink) {
            $.resourceLink = resourceLink;
            return this;
        }

        public EdgeClusterResponse build() {
            $.resourceLink = Objects.requireNonNull($.resourceLink, "expected parameter 'resourceLink' to be non-null");
            return $;
        }
    }

}
