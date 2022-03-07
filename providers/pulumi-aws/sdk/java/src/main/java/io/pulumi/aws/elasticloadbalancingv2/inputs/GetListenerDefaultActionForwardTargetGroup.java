// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.elasticloadbalancingv2.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;


public final class GetListenerDefaultActionForwardTargetGroup extends io.pulumi.resources.InvokeArgs {

    public static final GetListenerDefaultActionForwardTargetGroup Empty = new GetListenerDefaultActionForwardTargetGroup();

    /**
     * ARN of the listener. Required if `load_balancer_arn` and `port` is not set.
     * 
     */
    @InputImport(name="arn", required=true)
      private final String arn;

    public String getArn() {
        return this.arn;
    }

    @InputImport(name="weight", required=true)
      private final Integer weight;

    public Integer getWeight() {
        return this.weight;
    }

    public GetListenerDefaultActionForwardTargetGroup(
        String arn,
        Integer weight) {
        this.arn = Objects.requireNonNull(arn, "expected parameter 'arn' to be non-null");
        this.weight = Objects.requireNonNull(weight, "expected parameter 'weight' to be non-null");
    }

    private GetListenerDefaultActionForwardTargetGroup() {
        this.arn = null;
        this.weight = null;
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

        public Builder setArn(String arn) {
            this.arn = Objects.requireNonNull(arn);
            return this;
        }

        public Builder setWeight(Integer weight) {
            this.weight = Objects.requireNonNull(weight);
            return this;
        }
        public GetListenerDefaultActionForwardTargetGroup build() {
            return new GetListenerDefaultActionForwardTargetGroup(arn, weight);
        }
    }
}