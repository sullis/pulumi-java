// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.databox.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class DcAccessSecurityCodeResponse {
    /**
     * Forward Dc access security code.
     * 
     */
    private final @Nullable String forwardDCAccessCode;
    /**
     * Reverse Dc access security code.
     * 
     */
    private final @Nullable String reverseDCAccessCode;

    @OutputCustomType.Constructor({"forwardDCAccessCode","reverseDCAccessCode"})
    private DcAccessSecurityCodeResponse(
        @Nullable String forwardDCAccessCode,
        @Nullable String reverseDCAccessCode) {
        this.forwardDCAccessCode = forwardDCAccessCode;
        this.reverseDCAccessCode = reverseDCAccessCode;
    }

    /**
     * Forward Dc access security code.
     * 
     */
    public Optional<String> getForwardDCAccessCode() {
        return Optional.ofNullable(this.forwardDCAccessCode);
    }
    /**
     * Reverse Dc access security code.
     * 
     */
    public Optional<String> getReverseDCAccessCode() {
        return Optional.ofNullable(this.reverseDCAccessCode);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DcAccessSecurityCodeResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String forwardDCAccessCode;
        private @Nullable String reverseDCAccessCode;

        public Builder() {
    	      // Empty
        }

        public Builder(DcAccessSecurityCodeResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.forwardDCAccessCode = defaults.forwardDCAccessCode;
    	      this.reverseDCAccessCode = defaults.reverseDCAccessCode;
        }

        public Builder setForwardDCAccessCode(@Nullable String forwardDCAccessCode) {
            this.forwardDCAccessCode = forwardDCAccessCode;
            return this;
        }

        public Builder setReverseDCAccessCode(@Nullable String reverseDCAccessCode) {
            this.reverseDCAccessCode = reverseDCAccessCode;
            return this;
        }

        public DcAccessSecurityCodeResponse build() {
            return new DcAccessSecurityCodeResponse(forwardDCAccessCode, reverseDCAccessCode);
        }
    }
}
