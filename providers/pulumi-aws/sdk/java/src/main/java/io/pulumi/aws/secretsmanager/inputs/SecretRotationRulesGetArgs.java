// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.secretsmanager.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.util.Objects;


public final class SecretRotationRulesGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final SecretRotationRulesGetArgs Empty = new SecretRotationRulesGetArgs();

    /**
     * Specifies the number of days between automatic scheduled rotations of the secret.
     * 
     */
    @Import(name="automaticallyAfterDays", required=true)
      private final Output<Integer> automaticallyAfterDays;

    public Output<Integer> getAutomaticallyAfterDays() {
        return this.automaticallyAfterDays;
    }

    public SecretRotationRulesGetArgs(Output<Integer> automaticallyAfterDays) {
        this.automaticallyAfterDays = Objects.requireNonNull(automaticallyAfterDays, "expected parameter 'automaticallyAfterDays' to be non-null");
    }

    private SecretRotationRulesGetArgs() {
        this.automaticallyAfterDays = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SecretRotationRulesGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<Integer> automaticallyAfterDays;

        public Builder() {
    	      // Empty
        }

        public Builder(SecretRotationRulesGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.automaticallyAfterDays = defaults.automaticallyAfterDays;
        }

        public Builder automaticallyAfterDays(Output<Integer> automaticallyAfterDays) {
            this.automaticallyAfterDays = Objects.requireNonNull(automaticallyAfterDays);
            return this;
        }
        public Builder automaticallyAfterDays(Integer automaticallyAfterDays) {
            this.automaticallyAfterDays = Output.of(Objects.requireNonNull(automaticallyAfterDays));
            return this;
        }        public SecretRotationRulesGetArgs build() {
            return new SecretRotationRulesGetArgs(automaticallyAfterDays);
        }
    }
}
