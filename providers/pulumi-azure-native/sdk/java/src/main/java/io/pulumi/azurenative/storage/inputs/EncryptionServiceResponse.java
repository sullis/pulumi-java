// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.storage.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * A service that allows server-side encryption to be used.
 * 
 */
public final class EncryptionServiceResponse extends io.pulumi.resources.InvokeArgs {

    public static final EncryptionServiceResponse Empty = new EncryptionServiceResponse();

    /**
     * A boolean indicating whether or not the service encrypts the data as it is stored.
     * 
     */
    @InputImport(name="enabled")
    private final @Nullable Boolean enabled;

    public Optional<Boolean> getEnabled() {
        return this.enabled == null ? Optional.empty() : Optional.ofNullable(this.enabled);
    }

    /**
     * Encryption key type to be used for the encryption service. 'Account' key type implies that an account-scoped encryption key will be used. 'Service' key type implies that a default service key is used.
     * 
     */
    @InputImport(name="keyType")
    private final @Nullable String keyType;

    public Optional<String> getKeyType() {
        return this.keyType == null ? Optional.empty() : Optional.ofNullable(this.keyType);
    }

    /**
     * Gets a rough estimate of the date/time when the encryption was last enabled by the user. Only returned when encryption is enabled. There might be some unencrypted blobs which were written after this time, as it is just a rough estimate.
     * 
     */
    @InputImport(name="lastEnabledTime", required=true)
    private final String lastEnabledTime;

    public String getLastEnabledTime() {
        return this.lastEnabledTime;
    }

    public EncryptionServiceResponse(
        @Nullable Boolean enabled,
        @Nullable String keyType,
        String lastEnabledTime) {
        this.enabled = enabled;
        this.keyType = keyType;
        this.lastEnabledTime = Objects.requireNonNull(lastEnabledTime, "expected parameter 'lastEnabledTime' to be non-null");
    }

    private EncryptionServiceResponse() {
        this.enabled = null;
        this.keyType = null;
        this.lastEnabledTime = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EncryptionServiceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean enabled;
        private @Nullable String keyType;
        private String lastEnabledTime;

        public Builder() {
    	      // Empty
        }

        public Builder(EncryptionServiceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enabled = defaults.enabled;
    	      this.keyType = defaults.keyType;
    	      this.lastEnabledTime = defaults.lastEnabledTime;
        }

        public Builder setEnabled(@Nullable Boolean enabled) {
            this.enabled = enabled;
            return this;
        }

        public Builder setKeyType(@Nullable String keyType) {
            this.keyType = keyType;
            return this;
        }

        public Builder setLastEnabledTime(String lastEnabledTime) {
            this.lastEnabledTime = Objects.requireNonNull(lastEnabledTime);
            return this;
        }

        public EncryptionServiceResponse build() {
            return new EncryptionServiceResponse(enabled, keyType, lastEnabledTime);
        }
    }
}
