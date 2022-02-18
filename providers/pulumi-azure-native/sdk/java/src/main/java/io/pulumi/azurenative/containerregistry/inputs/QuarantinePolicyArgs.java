// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.containerregistry.inputs;

import io.pulumi.azurenative.containerregistry.enums.PolicyStatus;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The quarantine policy for a container registry.
 * 
 */
public final class QuarantinePolicyArgs extends io.pulumi.resources.ResourceArgs {

    public static final QuarantinePolicyArgs Empty = new QuarantinePolicyArgs();

    /**
     * The value that indicates whether the policy is enabled or not.
     * 
     */
    @InputImport(name="status")
    private final @Nullable Input<Either<String,PolicyStatus>> status;

    public Input<Either<String,PolicyStatus>> getStatus() {
        return this.status == null ? Input.empty() : this.status;
    }

    public QuarantinePolicyArgs(@Nullable Input<Either<String,PolicyStatus>> status) {
        this.status = status == null ? Input.ofLeft("disabled") : status;
    }

    private QuarantinePolicyArgs() {
        this.status = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(QuarantinePolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Either<String,PolicyStatus>> status;

        public Builder() {
    	      // Empty
        }

        public Builder(QuarantinePolicyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.status = defaults.status;
        }

        public Builder setStatus(@Nullable Input<Either<String,PolicyStatus>> status) {
            this.status = status;
            return this;
        }

        public Builder setStatus(@Nullable Either<String,PolicyStatus> status) {
            this.status = Input.ofNullable(status);
            return this;
        }

        public QuarantinePolicyArgs build() {
            return new QuarantinePolicyArgs(status);
        }
    }
}
