// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.dataproc.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class WorkflowTemplatePlacementManagedClusterConfigWorkerConfigAccelerator {
    /**
     * The number of the accelerator cards of this type exposed to this instance.
     * 
     */
    private final @Nullable Integer acceleratorCount;
    /**
     * Full URL, partial URI, or short name of the accelerator type resource to expose to this instance. See (https://cloud.google.com/dataproc/docs/concepts/configuring-clusters/auto-zone#using_auto_zone_placement) feature, you must use the short name of the accelerator type resource, for example, `nvidia-tesla-k80`.
     * 
     */
    private final @Nullable String acceleratorType;

    @OutputCustomType.Constructor({"acceleratorCount","acceleratorType"})
    private WorkflowTemplatePlacementManagedClusterConfigWorkerConfigAccelerator(
        @Nullable Integer acceleratorCount,
        @Nullable String acceleratorType) {
        this.acceleratorCount = acceleratorCount;
        this.acceleratorType = acceleratorType;
    }

    /**
     * The number of the accelerator cards of this type exposed to this instance.
     * 
     */
    public Optional<Integer> getAcceleratorCount() {
        return Optional.ofNullable(this.acceleratorCount);
    }
    /**
     * Full URL, partial URI, or short name of the accelerator type resource to expose to this instance. See (https://cloud.google.com/dataproc/docs/concepts/configuring-clusters/auto-zone#using_auto_zone_placement) feature, you must use the short name of the accelerator type resource, for example, `nvidia-tesla-k80`.
     * 
     */
    public Optional<String> getAcceleratorType() {
        return Optional.ofNullable(this.acceleratorType);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WorkflowTemplatePlacementManagedClusterConfigWorkerConfigAccelerator defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer acceleratorCount;
        private @Nullable String acceleratorType;

        public Builder() {
    	      // Empty
        }

        public Builder(WorkflowTemplatePlacementManagedClusterConfigWorkerConfigAccelerator defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.acceleratorCount = defaults.acceleratorCount;
    	      this.acceleratorType = defaults.acceleratorType;
        }

        public Builder setAcceleratorCount(@Nullable Integer acceleratorCount) {
            this.acceleratorCount = acceleratorCount;
            return this;
        }

        public Builder setAcceleratorType(@Nullable String acceleratorType) {
            this.acceleratorType = acceleratorType;
            return this;
        }

        public WorkflowTemplatePlacementManagedClusterConfigWorkerConfigAccelerator build() {
            return new WorkflowTemplatePlacementManagedClusterConfigWorkerConfigAccelerator(acceleratorCount, acceleratorType);
        }
    }
}
