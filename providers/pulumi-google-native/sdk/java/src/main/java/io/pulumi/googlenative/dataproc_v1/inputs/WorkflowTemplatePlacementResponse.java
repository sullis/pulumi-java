// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dataproc_v1.inputs;

import io.pulumi.core.annotations.Import;
import io.pulumi.googlenative.dataproc_v1.inputs.ClusterSelectorResponse;
import io.pulumi.googlenative.dataproc_v1.inputs.ManagedClusterResponse;
import java.util.Objects;


/**
 * Specifies workflow execution target.Either managed_cluster or cluster_selector is required.
 * 
 */
public final class WorkflowTemplatePlacementResponse extends io.pulumi.resources.InvokeArgs {

    public static final WorkflowTemplatePlacementResponse Empty = new WorkflowTemplatePlacementResponse();

    /**
     * Optional. A selector that chooses target cluster for jobs based on metadata.The selector is evaluated at the time each job is submitted.
     * 
     */
    @Import(name="clusterSelector", required=true)
      private final ClusterSelectorResponse clusterSelector;

    public ClusterSelectorResponse getClusterSelector() {
        return this.clusterSelector;
    }

    /**
     * A cluster that is managed by the workflow.
     * 
     */
    @Import(name="managedCluster", required=true)
      private final ManagedClusterResponse managedCluster;

    public ManagedClusterResponse getManagedCluster() {
        return this.managedCluster;
    }

    public WorkflowTemplatePlacementResponse(
        ClusterSelectorResponse clusterSelector,
        ManagedClusterResponse managedCluster) {
        this.clusterSelector = Objects.requireNonNull(clusterSelector, "expected parameter 'clusterSelector' to be non-null");
        this.managedCluster = Objects.requireNonNull(managedCluster, "expected parameter 'managedCluster' to be non-null");
    }

    private WorkflowTemplatePlacementResponse() {
        this.clusterSelector = null;
        this.managedCluster = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WorkflowTemplatePlacementResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ClusterSelectorResponse clusterSelector;
        private ManagedClusterResponse managedCluster;

        public Builder() {
    	      // Empty
        }

        public Builder(WorkflowTemplatePlacementResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clusterSelector = defaults.clusterSelector;
    	      this.managedCluster = defaults.managedCluster;
        }

        public Builder clusterSelector(ClusterSelectorResponse clusterSelector) {
            this.clusterSelector = Objects.requireNonNull(clusterSelector);
            return this;
        }
        public Builder managedCluster(ManagedClusterResponse managedCluster) {
            this.managedCluster = Objects.requireNonNull(managedCluster);
            return this;
        }        public WorkflowTemplatePlacementResponse build() {
            return new WorkflowTemplatePlacementResponse(clusterSelector, managedCluster);
        }
    }
}
