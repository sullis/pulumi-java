// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.synapse.outputs;

import io.pulumi.azurenative.synapse.outputs.CustomerManagedKeyDetailsResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class EncryptionDetailsResponse {
    /**
     * Customer Managed Key Details
     * 
     */
    private final @Nullable CustomerManagedKeyDetailsResponse cmk;
    /**
     * Double Encryption enabled
     * 
     */
    private final Boolean doubleEncryptionEnabled;

    @OutputCustomType.Constructor({"cmk","doubleEncryptionEnabled"})
    private EncryptionDetailsResponse(
        @Nullable CustomerManagedKeyDetailsResponse cmk,
        Boolean doubleEncryptionEnabled) {
        this.cmk = cmk;
        this.doubleEncryptionEnabled = Objects.requireNonNull(doubleEncryptionEnabled);
    }

    /**
     * Customer Managed Key Details
     * 
    */
    public Optional<CustomerManagedKeyDetailsResponse> getCmk() {
        return Optional.ofNullable(this.cmk);
    }
    /**
     * Double Encryption enabled
     * 
    */
    public Boolean getDoubleEncryptionEnabled() {
        return this.doubleEncryptionEnabled;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EncryptionDetailsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable CustomerManagedKeyDetailsResponse cmk;
        private Boolean doubleEncryptionEnabled;

        public Builder() {
    	      // Empty
        }

        public Builder(EncryptionDetailsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cmk = defaults.cmk;
    	      this.doubleEncryptionEnabled = defaults.doubleEncryptionEnabled;
        }

        public Builder setCmk(@Nullable CustomerManagedKeyDetailsResponse cmk) {
            this.cmk = cmk;
            return this;
        }

        public Builder setDoubleEncryptionEnabled(Boolean doubleEncryptionEnabled) {
            this.doubleEncryptionEnabled = Objects.requireNonNull(doubleEncryptionEnabled);
            return this;
        }
        public EncryptionDetailsResponse build() {
            return new EncryptionDetailsResponse(cmk, doubleEncryptionEnabled);
        }
    }
}