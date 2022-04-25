// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.applicationloadbalancing.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ListenerRuleActionForwardTargetGroup {
    /**
     * @return The Amazon Resource Name (ARN) of the target group.
     * 
     */
    private final String arn;
    /**
     * @return The weight. The range is 0 to 999.
     * 
     */
    private final @Nullable Integer weight;

    @CustomType.Constructor
    private ListenerRuleActionForwardTargetGroup(
        @CustomType.Parameter("arn") String arn,
        @CustomType.Parameter("weight") @Nullable Integer weight) {
        this.arn = arn;
        this.weight = weight;
    }

    /**
     * @return The Amazon Resource Name (ARN) of the target group.
     * 
     */
    public String arn() {
        return this.arn;
    }
    /**
     * @return The weight. The range is 0 to 999.
     * 
     */
    public Optional<Integer> weight() {
        return Optional.ofNullable(this.weight);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ListenerRuleActionForwardTargetGroup defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String arn;
        private @Nullable Integer weight;

        public Builder() {
    	      // Empty
        }

        public Builder(ListenerRuleActionForwardTargetGroup defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.weight = defaults.weight;
        }

        public Builder arn(String arn) {
            this.arn = Objects.requireNonNull(arn);
            return this;
        }
        public Builder weight(@Nullable Integer weight) {
            this.weight = weight;
            return this;
        }        public ListenerRuleActionForwardTargetGroup build() {
            return new ListenerRuleActionForwardTargetGroup(arn, weight);
        }
    }
}
