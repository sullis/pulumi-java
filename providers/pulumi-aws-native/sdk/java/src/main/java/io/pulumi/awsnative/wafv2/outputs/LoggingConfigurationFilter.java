// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.wafv2.outputs;

import io.pulumi.awsnative.wafv2.enums.LoggingConfigurationFilterBehavior;
import io.pulumi.awsnative.wafv2.enums.LoggingConfigurationFilterRequirement;
import io.pulumi.awsnative.wafv2.outputs.LoggingConfigurationCondition;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class LoggingConfigurationFilter {
    private final LoggingConfigurationFilterBehavior behavior;
    private final List<LoggingConfigurationCondition> conditions;
    private final LoggingConfigurationFilterRequirement requirement;

    @OutputCustomType.Constructor({"behavior","conditions","requirement"})
    private LoggingConfigurationFilter(
        LoggingConfigurationFilterBehavior behavior,
        List<LoggingConfigurationCondition> conditions,
        LoggingConfigurationFilterRequirement requirement) {
        this.behavior = Objects.requireNonNull(behavior);
        this.conditions = Objects.requireNonNull(conditions);
        this.requirement = Objects.requireNonNull(requirement);
    }

    public LoggingConfigurationFilterBehavior getBehavior() {
        return this.behavior;
    }
    public List<LoggingConfigurationCondition> getConditions() {
        return this.conditions;
    }
    public LoggingConfigurationFilterRequirement getRequirement() {
        return this.requirement;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LoggingConfigurationFilter defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private LoggingConfigurationFilterBehavior behavior;
        private List<LoggingConfigurationCondition> conditions;
        private LoggingConfigurationFilterRequirement requirement;

        public Builder() {
    	      // Empty
        }

        public Builder(LoggingConfigurationFilter defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.behavior = defaults.behavior;
    	      this.conditions = defaults.conditions;
    	      this.requirement = defaults.requirement;
        }

        public Builder setBehavior(LoggingConfigurationFilterBehavior behavior) {
            this.behavior = Objects.requireNonNull(behavior);
            return this;
        }

        public Builder setConditions(List<LoggingConfigurationCondition> conditions) {
            this.conditions = Objects.requireNonNull(conditions);
            return this;
        }

        public Builder setRequirement(LoggingConfigurationFilterRequirement requirement) {
            this.requirement = Objects.requireNonNull(requirement);
            return this;
        }

        public LoggingConfigurationFilter build() {
            return new LoggingConfigurationFilter(behavior, conditions, requirement);
        }
    }
}
