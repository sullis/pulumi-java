// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.lb.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetListenerDefaultActionForwardTargetGroup {
    /**
     * @return ARN of the listener. Required if `load_balancer_arn` and `port` is not set.
     * 
     */
    private final String arn;
    private final Integer weight;

    @CustomType.Constructor
    private GetListenerDefaultActionForwardTargetGroup(
        @CustomType.Parameter("arn") String arn,
        @CustomType.Parameter("weight") Integer weight) {
        this.arn = arn;
        this.weight = weight;
    }

    /**
     * @return ARN of the listener. Required if `load_balancer_arn` and `port` is not set.
     * 
     */
    public String arn() {
        return this.arn;
    }
    public Integer weight() {
        return this.weight;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetListenerDefaultActionForwardTargetGroup defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String arn;
        private Integer weight;

        public Builder() {
    	      // Empty
        }

        public Builder(GetListenerDefaultActionForwardTargetGroup defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.weight = defaults.weight;
        }

        public Builder arn(String arn) {
            this.arn = Objects.requireNonNull(arn);
            return this;
        }
        public Builder weight(Integer weight) {
            this.weight = Objects.requireNonNull(weight);
            return this;
        }        public GetListenerDefaultActionForwardTargetGroup build() {
            return new GetListenerDefaultActionForwardTargetGroup(arn, weight);
        }
    }
}
