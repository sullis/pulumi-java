// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ecr;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;


public final class RepositoryPolicyArgs extends io.pulumi.resources.ResourceArgs {

    public static final RepositoryPolicyArgs Empty = new RepositoryPolicyArgs();

    /**
     * The policy document. This is a JSON formatted string.
     * 
     */
    @Import(name="policy", required=true)
      private final Output<String> policy;

    public Output<String> policy() {
        return this.policy;
    }

    /**
     * Name of the repository to apply the policy.
     * 
     */
    @Import(name="repository", required=true)
      private final Output<String> repository;

    public Output<String> repository() {
        return this.repository;
    }

    public RepositoryPolicyArgs(
        Output<String> policy,
        Output<String> repository) {
        this.policy = Objects.requireNonNull(policy, "expected parameter 'policy' to be non-null");
        this.repository = Objects.requireNonNull(repository, "expected parameter 'repository' to be non-null");
    }

    private RepositoryPolicyArgs() {
        this.policy = Codegen.empty();
        this.repository = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RepositoryPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> policy;
        private Output<String> repository;

        public Builder() {
    	      // Empty
        }

        public Builder(RepositoryPolicyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.policy = defaults.policy;
    	      this.repository = defaults.repository;
        }

        public Builder policy(Output<String> policy) {
            this.policy = Objects.requireNonNull(policy);
            return this;
        }
        public Builder repository(Output<String> repository) {
            this.repository = Objects.requireNonNull(repository);
            return this;
        }
        public Builder repository(String repository) {
            this.repository = Output.of(Objects.requireNonNull(repository));
            return this;
        }        public RepositoryPolicyArgs build() {
            return new RepositoryPolicyArgs(policy, repository);
        }
    }
}
