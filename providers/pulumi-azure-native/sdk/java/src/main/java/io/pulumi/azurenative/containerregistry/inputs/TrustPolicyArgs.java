// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.containerregistry.inputs;

import io.pulumi.azurenative.containerregistry.enums.PolicyStatus;
import io.pulumi.azurenative.containerregistry.enums.TrustPolicyType;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The content trust policy for a container registry.
 * 
 */
public final class TrustPolicyArgs extends io.pulumi.resources.ResourceArgs {

    public static final TrustPolicyArgs Empty = new TrustPolicyArgs();

    /**
     * The value that indicates whether the policy is enabled or not.
     * 
     */
    @InputImport(name="status")
    private final @Nullable Input<Either<String,PolicyStatus>> status;

    public Input<Either<String,PolicyStatus>> getStatus() {
        return this.status == null ? Input.empty() : this.status;
    }

    /**
     * The type of trust policy.
     * 
     */
    @InputImport(name="type")
    private final @Nullable Input<Either<String,TrustPolicyType>> type;

    public Input<Either<String,TrustPolicyType>> getType() {
        return this.type == null ? Input.empty() : this.type;
    }

    public TrustPolicyArgs(
        @Nullable Input<Either<String,PolicyStatus>> status,
        @Nullable Input<Either<String,TrustPolicyType>> type) {
        this.status = status == null ? Input.ofLeft("disabled") : status;
        this.type = type == null ? Input.ofLeft("Notary") : type;
    }

    private TrustPolicyArgs() {
        this.status = Input.empty();
        this.type = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TrustPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Either<String,PolicyStatus>> status;
        private @Nullable Input<Either<String,TrustPolicyType>> type;

        public Builder() {
    	      // Empty
        }

        public Builder(TrustPolicyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.status = defaults.status;
    	      this.type = defaults.type;
        }

        public Builder setStatus(@Nullable Input<Either<String,PolicyStatus>> status) {
            this.status = status;
            return this;
        }

        public Builder setStatus(@Nullable Either<String,PolicyStatus> status) {
            this.status = Input.ofNullable(status);
            return this;
        }

        public Builder setType(@Nullable Input<Either<String,TrustPolicyType>> type) {
            this.type = type;
            return this;
        }

        public Builder setType(@Nullable Either<String,TrustPolicyType> type) {
            this.type = Input.ofNullable(type);
            return this;
        }

        public TrustPolicyArgs build() {
            return new TrustPolicyArgs(status, type);
        }
    }
}
