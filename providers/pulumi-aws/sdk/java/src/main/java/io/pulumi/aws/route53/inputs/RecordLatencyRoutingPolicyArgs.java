// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.route53.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;


public final class RecordLatencyRoutingPolicyArgs extends io.pulumi.resources.ResourceArgs {

    public static final RecordLatencyRoutingPolicyArgs Empty = new RecordLatencyRoutingPolicyArgs();

    /**
     * An AWS region from which to measure latency. See http://docs.aws.amazon.com/Route53/latest/DeveloperGuide/routing-policy.html#routing-policy-latency
     * 
     */
    @Import(name="region", required=true)
      private final Output<String> region;

    public Output<String> region() {
        return this.region;
    }

    public RecordLatencyRoutingPolicyArgs(Output<String> region) {
        this.region = Objects.requireNonNull(region, "expected parameter 'region' to be non-null");
    }

    private RecordLatencyRoutingPolicyArgs() {
        this.region = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RecordLatencyRoutingPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> region;

        public Builder() {
    	      // Empty
        }

        public Builder(RecordLatencyRoutingPolicyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.region = defaults.region;
        }

        public Builder region(Output<String> region) {
            this.region = Objects.requireNonNull(region);
            return this;
        }
        public Builder region(String region) {
            this.region = Output.of(Objects.requireNonNull(region));
            return this;
        }        public RecordLatencyRoutingPolicyArgs build() {
            return new RecordLatencyRoutingPolicyArgs(region);
        }
    }
}
