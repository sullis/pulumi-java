// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.iam.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class RoleInlinePolicyGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final RoleInlinePolicyGetArgs Empty = new RoleInlinePolicyGetArgs();

    /**
     * Name of the role policy.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> name() {
        return this.name == null ? Codegen.empty() : this.name;
    }

    /**
     * Policy document as a JSON formatted string.
     * 
     */
    @Import(name="policy")
      private final @Nullable Output<String> policy;

    public Output<String> policy() {
        return this.policy == null ? Codegen.empty() : this.policy;
    }

    public RoleInlinePolicyGetArgs(
        @Nullable Output<String> name,
        @Nullable Output<String> policy) {
        this.name = name;
        this.policy = policy;
    }

    private RoleInlinePolicyGetArgs() {
        this.name = Codegen.empty();
        this.policy = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RoleInlinePolicyGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> name;
        private @Nullable Output<String> policy;

        public Builder() {
    	      // Empty
        }

        public Builder(RoleInlinePolicyGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.policy = defaults.policy;
        }

        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Codegen.ofNullable(name);
            return this;
        }
        public Builder policy(@Nullable Output<String> policy) {
            this.policy = policy;
            return this;
        }
        public Builder policy(@Nullable String policy) {
            this.policy = Codegen.ofNullable(policy);
            return this;
        }        public RoleInlinePolicyGetArgs build() {
            return new RoleInlinePolicyGetArgs(name, policy);
        }
    }
}
