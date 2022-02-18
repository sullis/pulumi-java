// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.wafv2.outputs;

import io.pulumi.awsnative.wafv2.enums.RuleGroupTextTransformationType;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Integer;
import java.util.Objects;

@OutputCustomType
public final class RuleGroupTextTransformation {
    private final Integer priority;
    private final RuleGroupTextTransformationType type;

    @OutputCustomType.Constructor({"priority","type"})
    private RuleGroupTextTransformation(
        Integer priority,
        RuleGroupTextTransformationType type) {
        this.priority = Objects.requireNonNull(priority);
        this.type = Objects.requireNonNull(type);
    }

    public Integer getPriority() {
        return this.priority;
    }
    public RuleGroupTextTransformationType getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RuleGroupTextTransformation defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer priority;
        private RuleGroupTextTransformationType type;

        public Builder() {
    	      // Empty
        }

        public Builder(RuleGroupTextTransformation defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.priority = defaults.priority;
    	      this.type = defaults.type;
        }

        public Builder setPriority(Integer priority) {
            this.priority = Objects.requireNonNull(priority);
            return this;
        }

        public Builder setType(RuleGroupTextTransformationType type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public RuleGroupTextTransformation build() {
            return new RuleGroupTextTransformation(priority, type);
        }
    }
}
