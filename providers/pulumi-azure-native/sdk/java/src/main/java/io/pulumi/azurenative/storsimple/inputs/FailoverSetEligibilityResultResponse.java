// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.storsimple.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The eligibility result of failover set, for failover.
 * 
 */
public final class FailoverSetEligibilityResultResponse extends io.pulumi.resources.InvokeArgs {

    public static final FailoverSetEligibilityResultResponse Empty = new FailoverSetEligibilityResultResponse();

    /**
     * The error message, if the failover set is not eligible for failover.
     * 
     */
    @InputImport(name="errorMessage")
    private final @Nullable String errorMessage;

    public Optional<String> getErrorMessage() {
        return this.errorMessage == null ? Optional.empty() : Optional.ofNullable(this.errorMessage);
    }

    /**
     * Represents if this failover set is eligible for failover or not.
     * 
     */
    @InputImport(name="isEligibleForFailover")
    private final @Nullable Boolean isEligibleForFailover;

    public Optional<Boolean> getIsEligibleForFailover() {
        return this.isEligibleForFailover == null ? Optional.empty() : Optional.ofNullable(this.isEligibleForFailover);
    }

    public FailoverSetEligibilityResultResponse(
        @Nullable String errorMessage,
        @Nullable Boolean isEligibleForFailover) {
        this.errorMessage = errorMessage;
        this.isEligibleForFailover = isEligibleForFailover;
    }

    private FailoverSetEligibilityResultResponse() {
        this.errorMessage = null;
        this.isEligibleForFailover = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FailoverSetEligibilityResultResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String errorMessage;
        private @Nullable Boolean isEligibleForFailover;

        public Builder() {
    	      // Empty
        }

        public Builder(FailoverSetEligibilityResultResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.errorMessage = defaults.errorMessage;
    	      this.isEligibleForFailover = defaults.isEligibleForFailover;
        }

        public Builder setErrorMessage(@Nullable String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        public Builder setIsEligibleForFailover(@Nullable Boolean isEligibleForFailover) {
            this.isEligibleForFailover = isEligibleForFailover;
            return this;
        }

        public FailoverSetEligibilityResultResponse build() {
            return new FailoverSetEligibilityResultResponse(errorMessage, isEligibleForFailover);
        }
    }
}
