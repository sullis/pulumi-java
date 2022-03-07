// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.azurestackhci.inputs;

import io.pulumi.azurenative.azurestackhci.inputs.ClusterNodeResponse;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * Properties reported by cluster agent.
 * 
 */
public final class ClusterReportedPropertiesResponse extends io.pulumi.resources.InvokeArgs {

    public static final ClusterReportedPropertiesResponse Empty = new ClusterReportedPropertiesResponse();

    /**
     * Unique id generated by the on-prem cluster.
     * 
     */
    @InputImport(name="clusterId", required=true)
      private final String clusterId;

    public String getClusterId() {
        return this.clusterId;
    }

    /**
     * Name of the on-prem cluster connected to this resource.
     * 
     */
    @InputImport(name="clusterName", required=true)
      private final String clusterName;

    public String getClusterName() {
        return this.clusterName;
    }

    /**
     * Version of the cluster software.
     * 
     */
    @InputImport(name="clusterVersion", required=true)
      private final String clusterVersion;

    public String getClusterVersion() {
        return this.clusterVersion;
    }

    /**
     * Last time the cluster reported the data.
     * 
     */
    @InputImport(name="lastUpdated", required=true)
      private final String lastUpdated;

    public String getLastUpdated() {
        return this.lastUpdated;
    }

    /**
     * List of nodes reported by the cluster.
     * 
     */
    @InputImport(name="nodes", required=true)
      private final List<ClusterNodeResponse> nodes;

    public List<ClusterNodeResponse> getNodes() {
        return this.nodes;
    }

    public ClusterReportedPropertiesResponse(
        String clusterId,
        String clusterName,
        String clusterVersion,
        String lastUpdated,
        List<ClusterNodeResponse> nodes) {
        this.clusterId = Objects.requireNonNull(clusterId, "expected parameter 'clusterId' to be non-null");
        this.clusterName = Objects.requireNonNull(clusterName, "expected parameter 'clusterName' to be non-null");
        this.clusterVersion = Objects.requireNonNull(clusterVersion, "expected parameter 'clusterVersion' to be non-null");
        this.lastUpdated = Objects.requireNonNull(lastUpdated, "expected parameter 'lastUpdated' to be non-null");
        this.nodes = Objects.requireNonNull(nodes, "expected parameter 'nodes' to be non-null");
    }

    private ClusterReportedPropertiesResponse() {
        this.clusterId = null;
        this.clusterName = null;
        this.clusterVersion = null;
        this.lastUpdated = null;
        this.nodes = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterReportedPropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String clusterId;
        private String clusterName;
        private String clusterVersion;
        private String lastUpdated;
        private List<ClusterNodeResponse> nodes;

        public Builder() {
    	      // Empty
        }

        public Builder(ClusterReportedPropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clusterId = defaults.clusterId;
    	      this.clusterName = defaults.clusterName;
    	      this.clusterVersion = defaults.clusterVersion;
    	      this.lastUpdated = defaults.lastUpdated;
    	      this.nodes = defaults.nodes;
        }

        public Builder setClusterId(String clusterId) {
            this.clusterId = Objects.requireNonNull(clusterId);
            return this;
        }

        public Builder setClusterName(String clusterName) {
            this.clusterName = Objects.requireNonNull(clusterName);
            return this;
        }

        public Builder setClusterVersion(String clusterVersion) {
            this.clusterVersion = Objects.requireNonNull(clusterVersion);
            return this;
        }

        public Builder setLastUpdated(String lastUpdated) {
            this.lastUpdated = Objects.requireNonNull(lastUpdated);
            return this;
        }

        public Builder setNodes(List<ClusterNodeResponse> nodes) {
            this.nodes = Objects.requireNonNull(nodes);
            return this;
        }
        public ClusterReportedPropertiesResponse build() {
            return new ClusterReportedPropertiesResponse(clusterId, clusterName, clusterVersion, lastUpdated, nodes);
        }
    }
}