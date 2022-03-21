// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.glue;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ResourcePolicyArgs extends io.pulumi.resources.ResourceArgs {

    public static final ResourcePolicyArgs Empty = new ResourcePolicyArgs();

    @Import(name="enableHybrid")
      private final @Nullable Output<String> enableHybrid;

    public Output<String> getEnableHybrid() {
        return this.enableHybrid == null ? Output.empty() : this.enableHybrid;
    }

    /**
     * The policy to be applied to the aws glue data catalog.
     * 
     */
    @Import(name="policy", required=true)
      private final Output<String> policy;

    public Output<String> getPolicy() {
        return this.policy;
    }

    public ResourcePolicyArgs(
        @Nullable Output<String> enableHybrid,
        Output<String> policy) {
        this.enableHybrid = enableHybrid;
        this.policy = Objects.requireNonNull(policy, "expected parameter 'policy' to be non-null");
    }

    private ResourcePolicyArgs() {
        this.enableHybrid = Output.empty();
        this.policy = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ResourcePolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> enableHybrid;
        private Output<String> policy;

        public Builder() {
    	      // Empty
        }

        public Builder(ResourcePolicyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enableHybrid = defaults.enableHybrid;
    	      this.policy = defaults.policy;
        }

        public Builder enableHybrid(@Nullable Output<String> enableHybrid) {
            this.enableHybrid = enableHybrid;
            return this;
        }
        public Builder enableHybrid(@Nullable String enableHybrid) {
            this.enableHybrid = Output.ofNullable(enableHybrid);
            return this;
        }
        public Builder policy(Output<String> policy) {
            this.policy = Objects.requireNonNull(policy);
            return this;
        }
        public Builder policy(String policy) {
            this.policy = Output.of(Objects.requireNonNull(policy));
            return this;
        }        public ResourcePolicyArgs build() {
            return new ResourcePolicyArgs(enableHybrid, policy);
        }
    }
}
