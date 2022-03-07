// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.edgeorder.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Preferences related to the double encryption
 * 
 */
public final class EncryptionPreferencesResponse extends io.pulumi.resources.InvokeArgs {

    public static final EncryptionPreferencesResponse Empty = new EncryptionPreferencesResponse();

    /**
     * Double encryption status as entered by the customer. It is compulsory to give this parameter if the 'Deny' or 'Disabled' policy is configured.
     * 
     */
    @InputImport(name="doubleEncryptionStatus")
      private final @Nullable String doubleEncryptionStatus;

    public Optional<String> getDoubleEncryptionStatus() {
        return this.doubleEncryptionStatus == null ? Optional.empty() : Optional.ofNullable(this.doubleEncryptionStatus);
    }

    public EncryptionPreferencesResponse(@Nullable String doubleEncryptionStatus) {
        this.doubleEncryptionStatus = doubleEncryptionStatus;
    }

    private EncryptionPreferencesResponse() {
        this.doubleEncryptionStatus = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EncryptionPreferencesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String doubleEncryptionStatus;

        public Builder() {
    	      // Empty
        }

        public Builder(EncryptionPreferencesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.doubleEncryptionStatus = defaults.doubleEncryptionStatus;
        }

        public Builder setDoubleEncryptionStatus(@Nullable String doubleEncryptionStatus) {
            this.doubleEncryptionStatus = doubleEncryptionStatus;
            return this;
        }
        public EncryptionPreferencesResponse build() {
            return new EncryptionPreferencesResponse(doubleEncryptionStatus);
        }
    }
}