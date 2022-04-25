// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.storsimple.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The eligibility result of failover set, for failover.
 * 
 */
public final class FailoverSetEligibilityResultResponse extends com.pulumi.resources.InvokeArgs {

    public static final FailoverSetEligibilityResultResponse Empty = new FailoverSetEligibilityResultResponse();

    /**
     * The error message, if the failover set is not eligible for failover.
     * 
     */
    @Import(name="errorMessage")
    private @Nullable String errorMessage;

    /**
     * @return The error message, if the failover set is not eligible for failover.
     * 
     */
    public Optional<String> errorMessage() {
        return Optional.ofNullable(this.errorMessage);
    }

    /**
     * Represents if this failover set is eligible for failover or not.
     * 
     */
    @Import(name="isEligibleForFailover")
    private @Nullable Boolean isEligibleForFailover;

    /**
     * @return Represents if this failover set is eligible for failover or not.
     * 
     */
    public Optional<Boolean> isEligibleForFailover() {
        return Optional.ofNullable(this.isEligibleForFailover);
    }

    private FailoverSetEligibilityResultResponse() {}

    private FailoverSetEligibilityResultResponse(FailoverSetEligibilityResultResponse $) {
        this.errorMessage = $.errorMessage;
        this.isEligibleForFailover = $.isEligibleForFailover;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(FailoverSetEligibilityResultResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private FailoverSetEligibilityResultResponse $;

        public Builder() {
            $ = new FailoverSetEligibilityResultResponse();
        }

        public Builder(FailoverSetEligibilityResultResponse defaults) {
            $ = new FailoverSetEligibilityResultResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param errorMessage The error message, if the failover set is not eligible for failover.
         * 
         * @return builder
         * 
         */
        public Builder errorMessage(@Nullable String errorMessage) {
            $.errorMessage = errorMessage;
            return this;
        }

        /**
         * @param isEligibleForFailover Represents if this failover set is eligible for failover or not.
         * 
         * @return builder
         * 
         */
        public Builder isEligibleForFailover(@Nullable Boolean isEligibleForFailover) {
            $.isEligibleForFailover = isEligibleForFailover;
            return this;
        }

        public FailoverSetEligibilityResultResponse build() {
            return $;
        }
    }

}
