// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.networkfirewall.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class FirewallPolicyStatelessRuleGroupReference {
    private final Integer priority;
    private final String resourceArn;

    @CustomType.Constructor
    private FirewallPolicyStatelessRuleGroupReference(
        @CustomType.Parameter("priority") Integer priority,
        @CustomType.Parameter("resourceArn") String resourceArn) {
        this.priority = priority;
        this.resourceArn = resourceArn;
    }

    public Integer priority() {
        return this.priority;
    }
    public String resourceArn() {
        return this.resourceArn;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FirewallPolicyStatelessRuleGroupReference defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer priority;
        private String resourceArn;

        public Builder() {
    	      // Empty
        }

        public Builder(FirewallPolicyStatelessRuleGroupReference defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.priority = defaults.priority;
    	      this.resourceArn = defaults.resourceArn;
        }

        public Builder priority(Integer priority) {
            this.priority = Objects.requireNonNull(priority);
            return this;
        }
        public Builder resourceArn(String resourceArn) {
            this.resourceArn = Objects.requireNonNull(resourceArn);
            return this;
        }        public FirewallPolicyStatelessRuleGroupReference build() {
            return new FirewallPolicyStatelessRuleGroupReference(priority, resourceArn);
        }
    }
}
