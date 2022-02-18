// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Object;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Compute properties for data flow activity.
 * 
 */
public final class ExecuteDataFlowActivityTypePropertiesComputeArgs extends io.pulumi.resources.ResourceArgs {

    public static final ExecuteDataFlowActivityTypePropertiesComputeArgs Empty = new ExecuteDataFlowActivityTypePropertiesComputeArgs();

    /**
     * Compute type of the cluster which will execute data flow job. Possible values include: 'General', 'MemoryOptimized', 'ComputeOptimized'. Type: string (or Expression with resultType string)
     * 
     */
    @InputImport(name="computeType")
    private final @Nullable Input<Object> computeType;

    public Input<Object> getComputeType() {
        return this.computeType == null ? Input.empty() : this.computeType;
    }

    /**
     * Core count of the cluster which will execute data flow job. Supported values are: 8, 16, 32, 48, 80, 144 and 272. Type: integer (or Expression with resultType integer)
     * 
     */
    @InputImport(name="coreCount")
    private final @Nullable Input<Object> coreCount;

    public Input<Object> getCoreCount() {
        return this.coreCount == null ? Input.empty() : this.coreCount;
    }

    public ExecuteDataFlowActivityTypePropertiesComputeArgs(
        @Nullable Input<Object> computeType,
        @Nullable Input<Object> coreCount) {
        this.computeType = computeType;
        this.coreCount = coreCount;
    }

    private ExecuteDataFlowActivityTypePropertiesComputeArgs() {
        this.computeType = Input.empty();
        this.coreCount = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ExecuteDataFlowActivityTypePropertiesComputeArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Object> computeType;
        private @Nullable Input<Object> coreCount;

        public Builder() {
    	      // Empty
        }

        public Builder(ExecuteDataFlowActivityTypePropertiesComputeArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.computeType = defaults.computeType;
    	      this.coreCount = defaults.coreCount;
        }

        public Builder setComputeType(@Nullable Input<Object> computeType) {
            this.computeType = computeType;
            return this;
        }

        public Builder setComputeType(@Nullable Object computeType) {
            this.computeType = Input.ofNullable(computeType);
            return this;
        }

        public Builder setCoreCount(@Nullable Input<Object> coreCount) {
            this.coreCount = coreCount;
            return this;
        }

        public Builder setCoreCount(@Nullable Object coreCount) {
            this.coreCount = Input.ofNullable(coreCount);
            return this;
        }

        public ExecuteDataFlowActivityTypePropertiesComputeArgs build() {
            return new ExecuteDataFlowActivityTypePropertiesComputeArgs(computeType, coreCount);
        }
    }
}
