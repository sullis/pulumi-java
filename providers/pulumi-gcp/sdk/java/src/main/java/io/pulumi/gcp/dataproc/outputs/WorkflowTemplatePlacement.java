// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.dataproc.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import io.pulumi.gcp.dataproc.outputs.WorkflowTemplatePlacementClusterSelector;
import io.pulumi.gcp.dataproc.outputs.WorkflowTemplatePlacementManagedCluster;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class WorkflowTemplatePlacement {
    /**
     * Optional. A selector that chooses target cluster for jobs based on metadata. The selector is evaluated at the time each job is submitted.
     * 
     */
    private final @Nullable WorkflowTemplatePlacementClusterSelector clusterSelector;
    /**
     * A cluster that is managed by the workflow.
     * 
     */
    private final @Nullable WorkflowTemplatePlacementManagedCluster managedCluster;

    @OutputCustomType.Constructor({"clusterSelector","managedCluster"})
    private WorkflowTemplatePlacement(
        @Nullable WorkflowTemplatePlacementClusterSelector clusterSelector,
        @Nullable WorkflowTemplatePlacementManagedCluster managedCluster) {
        this.clusterSelector = clusterSelector;
        this.managedCluster = managedCluster;
    }

    /**
     * Optional. A selector that chooses target cluster for jobs based on metadata. The selector is evaluated at the time each job is submitted.
     * 
     */
    public Optional<WorkflowTemplatePlacementClusterSelector> getClusterSelector() {
        return Optional.ofNullable(this.clusterSelector);
    }
    /**
     * A cluster that is managed by the workflow.
     * 
     */
    public Optional<WorkflowTemplatePlacementManagedCluster> getManagedCluster() {
        return Optional.ofNullable(this.managedCluster);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WorkflowTemplatePlacement defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable WorkflowTemplatePlacementClusterSelector clusterSelector;
        private @Nullable WorkflowTemplatePlacementManagedCluster managedCluster;

        public Builder() {
    	      // Empty
        }

        public Builder(WorkflowTemplatePlacement defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clusterSelector = defaults.clusterSelector;
    	      this.managedCluster = defaults.managedCluster;
        }

        public Builder setClusterSelector(@Nullable WorkflowTemplatePlacementClusterSelector clusterSelector) {
            this.clusterSelector = clusterSelector;
            return this;
        }

        public Builder setManagedCluster(@Nullable WorkflowTemplatePlacementManagedCluster managedCluster) {
            this.managedCluster = managedCluster;
            return this;
        }

        public WorkflowTemplatePlacement build() {
            return new WorkflowTemplatePlacement(clusterSelector, managedCluster);
        }
    }
}
