// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.dataproc.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class WorkflowTemplatePlacementManagedClusterConfigWorkerConfigAcceleratorArgs extends io.pulumi.resources.ResourceArgs {

    public static final WorkflowTemplatePlacementManagedClusterConfigWorkerConfigAcceleratorArgs Empty = new WorkflowTemplatePlacementManagedClusterConfigWorkerConfigAcceleratorArgs();

    /**
     * The number of the accelerator cards of this type exposed to this instance.
     * 
     */
    @InputImport(name="acceleratorCount")
      private final @Nullable Input<Integer> acceleratorCount;

    public Input<Integer> getAcceleratorCount() {
        return this.acceleratorCount == null ? Input.empty() : this.acceleratorCount;
    }

    /**
     * Full URL, partial URI, or short name of the accelerator type resource to expose to this instance. See (https://cloud.google.com/dataproc/docs/concepts/configuring-clusters/auto-zone#using_auto_zone_placement) feature, you must use the short name of the accelerator type resource, for example, `nvidia-tesla-k80`.
     * 
     */
    @InputImport(name="acceleratorType")
      private final @Nullable Input<String> acceleratorType;

    public Input<String> getAcceleratorType() {
        return this.acceleratorType == null ? Input.empty() : this.acceleratorType;
    }

    public WorkflowTemplatePlacementManagedClusterConfigWorkerConfigAcceleratorArgs(
        @Nullable Input<Integer> acceleratorCount,
        @Nullable Input<String> acceleratorType) {
        this.acceleratorCount = acceleratorCount;
        this.acceleratorType = acceleratorType;
    }

    private WorkflowTemplatePlacementManagedClusterConfigWorkerConfigAcceleratorArgs() {
        this.acceleratorCount = Input.empty();
        this.acceleratorType = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WorkflowTemplatePlacementManagedClusterConfigWorkerConfigAcceleratorArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Integer> acceleratorCount;
        private @Nullable Input<String> acceleratorType;

        public Builder() {
    	      // Empty
        }

        public Builder(WorkflowTemplatePlacementManagedClusterConfigWorkerConfigAcceleratorArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.acceleratorCount = defaults.acceleratorCount;
    	      this.acceleratorType = defaults.acceleratorType;
        }

        public Builder setAcceleratorCount(@Nullable Input<Integer> acceleratorCount) {
            this.acceleratorCount = acceleratorCount;
            return this;
        }

        public Builder setAcceleratorCount(@Nullable Integer acceleratorCount) {
            this.acceleratorCount = Input.ofNullable(acceleratorCount);
            return this;
        }

        public Builder setAcceleratorType(@Nullable Input<String> acceleratorType) {
            this.acceleratorType = acceleratorType;
            return this;
        }

        public Builder setAcceleratorType(@Nullable String acceleratorType) {
            this.acceleratorType = Input.ofNullable(acceleratorType);
            return this;
        }
        public WorkflowTemplatePlacementManagedClusterConfigWorkerConfigAcceleratorArgs build() {
            return new WorkflowTemplatePlacementManagedClusterConfigWorkerConfigAcceleratorArgs(acceleratorCount, acceleratorType);
        }
    }
}