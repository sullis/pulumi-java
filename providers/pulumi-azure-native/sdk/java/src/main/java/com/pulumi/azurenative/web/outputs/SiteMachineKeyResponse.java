// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.web.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class SiteMachineKeyResponse {
    /**
     * @return Algorithm used for decryption.
     * 
     */
    private final @Nullable String decryption;
    /**
     * @return Decryption key.
     * 
     */
    private final @Nullable String decryptionKey;
    /**
     * @return MachineKey validation.
     * 
     */
    private final @Nullable String validation;
    /**
     * @return Validation key.
     * 
     */
    private final @Nullable String validationKey;

    @CustomType.Constructor
    private SiteMachineKeyResponse(
        @CustomType.Parameter("decryption") @Nullable String decryption,
        @CustomType.Parameter("decryptionKey") @Nullable String decryptionKey,
        @CustomType.Parameter("validation") @Nullable String validation,
        @CustomType.Parameter("validationKey") @Nullable String validationKey) {
        this.decryption = decryption;
        this.decryptionKey = decryptionKey;
        this.validation = validation;
        this.validationKey = validationKey;
    }

    /**
     * @return Algorithm used for decryption.
     * 
     */
    public Optional<String> decryption() {
        return Optional.ofNullable(this.decryption);
    }
    /**
     * @return Decryption key.
     * 
     */
    public Optional<String> decryptionKey() {
        return Optional.ofNullable(this.decryptionKey);
    }
    /**
     * @return MachineKey validation.
     * 
     */
    public Optional<String> validation() {
        return Optional.ofNullable(this.validation);
    }
    /**
     * @return Validation key.
     * 
     */
    public Optional<String> validationKey() {
        return Optional.ofNullable(this.validationKey);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SiteMachineKeyResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String decryption;
        private @Nullable String decryptionKey;
        private @Nullable String validation;
        private @Nullable String validationKey;

        public Builder() {
    	      // Empty
        }

        public Builder(SiteMachineKeyResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.decryption = defaults.decryption;
    	      this.decryptionKey = defaults.decryptionKey;
    	      this.validation = defaults.validation;
    	      this.validationKey = defaults.validationKey;
        }

        public Builder decryption(@Nullable String decryption) {
            this.decryption = decryption;
            return this;
        }
        public Builder decryptionKey(@Nullable String decryptionKey) {
            this.decryptionKey = decryptionKey;
            return this;
        }
        public Builder validation(@Nullable String validation) {
            this.validation = validation;
            return this;
        }
        public Builder validationKey(@Nullable String validationKey) {
            this.validationKey = validationKey;
            return this;
        }        public SiteMachineKeyResponse build() {
            return new SiteMachineKeyResponse(decryption, decryptionKey, validation, validationKey);
        }
    }
}
