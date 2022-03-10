// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.flowcontrol.apiserver.k8s.io_v1alpha1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.kubernetes.flowcontrol.apiserver.k8s.io_v1alpha1.outputs.PriorityLevelConfigurationCondition;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@OutputCustomType
public final class PriorityLevelConfigurationStatus {
    /**
     * `conditions` is the current state of "request-priority".
     * 
     */
    private final @Nullable List<PriorityLevelConfigurationCondition> conditions;

    @OutputCustomType.Constructor
    private PriorityLevelConfigurationStatus(@OutputCustomType.Parameter("conditions") @Nullable List<PriorityLevelConfigurationCondition> conditions) {
        this.conditions = conditions;
    }

    /**
     * `conditions` is the current state of "request-priority".
     * 
    */
    public List<PriorityLevelConfigurationCondition> getConditions() {
        return this.conditions == null ? List.of() : this.conditions;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PriorityLevelConfigurationStatus defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<PriorityLevelConfigurationCondition> conditions;

        public Builder() {
    	      // Empty
        }

        public Builder(PriorityLevelConfigurationStatus defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.conditions = defaults.conditions;
        }

        public Builder setConditions(@Nullable List<PriorityLevelConfigurationCondition> conditions) {
            this.conditions = conditions;
            return this;
        }
        public PriorityLevelConfigurationStatus build() {
            return new PriorityLevelConfigurationStatus(conditions);
        }
    }
}
