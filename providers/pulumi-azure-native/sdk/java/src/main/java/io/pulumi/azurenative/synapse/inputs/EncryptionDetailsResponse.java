// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.synapse.inputs;

import io.pulumi.azurenative.synapse.inputs.CustomerManagedKeyDetailsResponse;
import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Details of the encryption associated with the workspace
 * 
 */
public final class EncryptionDetailsResponse extends io.pulumi.resources.InvokeArgs {

    public static final EncryptionDetailsResponse Empty = new EncryptionDetailsResponse();

    /**
     * Customer Managed Key Details
     * 
     */
    @Import(name="cmk")
      private final @Nullable CustomerManagedKeyDetailsResponse cmk;

    public Optional<CustomerManagedKeyDetailsResponse> getCmk() {
        return this.cmk == null ? Optional.empty() : Optional.ofNullable(this.cmk);
    }

    /**
     * Double Encryption enabled
     * 
     */
    @Import(name="doubleEncryptionEnabled", required=true)
      private final Boolean doubleEncryptionEnabled;

    public Boolean getDoubleEncryptionEnabled() {
        return this.doubleEncryptionEnabled;
    }

    public EncryptionDetailsResponse(
        @Nullable CustomerManagedKeyDetailsResponse cmk,
        Boolean doubleEncryptionEnabled) {
        this.cmk = cmk;
        this.doubleEncryptionEnabled = Objects.requireNonNull(doubleEncryptionEnabled, "expected parameter 'doubleEncryptionEnabled' to be non-null");
    }

    private EncryptionDetailsResponse() {
        this.cmk = null;
        this.doubleEncryptionEnabled = null;
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

        public Builder cmk(@Nullable CustomerManagedKeyDetailsResponse cmk) {
            this.cmk = cmk;
            return this;
        }
        public Builder doubleEncryptionEnabled(Boolean doubleEncryptionEnabled) {
            this.doubleEncryptionEnabled = Objects.requireNonNull(doubleEncryptionEnabled);
            return this;
        }        public EncryptionDetailsResponse build() {
            return new EncryptionDetailsResponse(cmk, doubleEncryptionEnabled);
        }
    }
}
