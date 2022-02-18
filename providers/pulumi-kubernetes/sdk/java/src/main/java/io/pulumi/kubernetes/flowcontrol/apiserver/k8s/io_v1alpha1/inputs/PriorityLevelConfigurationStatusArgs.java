// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.flowcontrol.apiserver.k8s.io_v1alpha1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.kubernetes.flowcontrol.apiserver.k8s.io_v1alpha1.inputs.PriorityLevelConfigurationConditionArgs;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * PriorityLevelConfigurationStatus represents the current state of a "request-priority".
 * 
 */
public final class PriorityLevelConfigurationStatusArgs extends io.pulumi.resources.ResourceArgs {

    public static final PriorityLevelConfigurationStatusArgs Empty = new PriorityLevelConfigurationStatusArgs();

    /**
     * `conditions` is the current state of "request-priority".
     * 
     */
    @InputImport(name="conditions")
    private final @Nullable Input<List<PriorityLevelConfigurationConditionArgs>> conditions;

    public Input<List<PriorityLevelConfigurationConditionArgs>> getConditions() {
        return this.conditions == null ? Input.empty() : this.conditions;
    }

    public PriorityLevelConfigurationStatusArgs(@Nullable Input<List<PriorityLevelConfigurationConditionArgs>> conditions) {
        this.conditions = conditions;
    }

    private PriorityLevelConfigurationStatusArgs() {
        this.conditions = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PriorityLevelConfigurationStatusArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<PriorityLevelConfigurationConditionArgs>> conditions;

        public Builder() {
    	      // Empty
        }

        public Builder(PriorityLevelConfigurationStatusArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.conditions = defaults.conditions;
        }

        public Builder setConditions(@Nullable Input<List<PriorityLevelConfigurationConditionArgs>> conditions) {
            this.conditions = conditions;
            return this;
        }

        public Builder setConditions(@Nullable List<PriorityLevelConfigurationConditionArgs> conditions) {
            this.conditions = Input.ofNullable(conditions);
            return this;
        }

        public PriorityLevelConfigurationStatusArgs build() {
            return new PriorityLevelConfigurationStatusArgs(conditions);
        }
    }
}
