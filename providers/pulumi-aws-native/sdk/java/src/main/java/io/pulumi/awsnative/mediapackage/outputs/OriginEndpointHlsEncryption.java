// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.mediapackage.outputs;

import io.pulumi.awsnative.mediapackage.enums.OriginEndpointHlsEncryptionEncryptionMethod;
import io.pulumi.awsnative.mediapackage.outputs.OriginEndpointSpekeKeyProvider;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class OriginEndpointHlsEncryption {
    /**
     * A constant initialization vector for encryption (optional). When not specified the initialization vector will be periodically rotated.
     * 
     */
    private final @Nullable String constantInitializationVector;
    /**
     * The encryption method to use.
     * 
     */
    private final @Nullable OriginEndpointHlsEncryptionEncryptionMethod encryptionMethod;
    /**
     * Interval (in seconds) between each encryption key rotation.
     * 
     */
    private final @Nullable Integer keyRotationIntervalSeconds;
    /**
     * When enabled, the EXT-X-KEY tag will be repeated in output manifests.
     * 
     */
    private final @Nullable Boolean repeatExtXKey;
    private final OriginEndpointSpekeKeyProvider spekeKeyProvider;

    @OutputCustomType.Constructor({"constantInitializationVector","encryptionMethod","keyRotationIntervalSeconds","repeatExtXKey","spekeKeyProvider"})
    private OriginEndpointHlsEncryption(
        @Nullable String constantInitializationVector,
        @Nullable OriginEndpointHlsEncryptionEncryptionMethod encryptionMethod,
        @Nullable Integer keyRotationIntervalSeconds,
        @Nullable Boolean repeatExtXKey,
        OriginEndpointSpekeKeyProvider spekeKeyProvider) {
        this.constantInitializationVector = constantInitializationVector;
        this.encryptionMethod = encryptionMethod;
        this.keyRotationIntervalSeconds = keyRotationIntervalSeconds;
        this.repeatExtXKey = repeatExtXKey;
        this.spekeKeyProvider = Objects.requireNonNull(spekeKeyProvider);
    }

    /**
     * A constant initialization vector for encryption (optional). When not specified the initialization vector will be periodically rotated.
     * 
     */
    public Optional<String> getConstantInitializationVector() {
        return Optional.ofNullable(this.constantInitializationVector);
    }
    /**
     * The encryption method to use.
     * 
     */
    public Optional<OriginEndpointHlsEncryptionEncryptionMethod> getEncryptionMethod() {
        return Optional.ofNullable(this.encryptionMethod);
    }
    /**
     * Interval (in seconds) between each encryption key rotation.
     * 
     */
    public Optional<Integer> getKeyRotationIntervalSeconds() {
        return Optional.ofNullable(this.keyRotationIntervalSeconds);
    }
    /**
     * When enabled, the EXT-X-KEY tag will be repeated in output manifests.
     * 
     */
    public Optional<Boolean> getRepeatExtXKey() {
        return Optional.ofNullable(this.repeatExtXKey);
    }
    public OriginEndpointSpekeKeyProvider getSpekeKeyProvider() {
        return this.spekeKeyProvider;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OriginEndpointHlsEncryption defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String constantInitializationVector;
        private @Nullable OriginEndpointHlsEncryptionEncryptionMethod encryptionMethod;
        private @Nullable Integer keyRotationIntervalSeconds;
        private @Nullable Boolean repeatExtXKey;
        private OriginEndpointSpekeKeyProvider spekeKeyProvider;

        public Builder() {
    	      // Empty
        }

        public Builder(OriginEndpointHlsEncryption defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.constantInitializationVector = defaults.constantInitializationVector;
    	      this.encryptionMethod = defaults.encryptionMethod;
    	      this.keyRotationIntervalSeconds = defaults.keyRotationIntervalSeconds;
    	      this.repeatExtXKey = defaults.repeatExtXKey;
    	      this.spekeKeyProvider = defaults.spekeKeyProvider;
        }

        public Builder setConstantInitializationVector(@Nullable String constantInitializationVector) {
            this.constantInitializationVector = constantInitializationVector;
            return this;
        }

        public Builder setEncryptionMethod(@Nullable OriginEndpointHlsEncryptionEncryptionMethod encryptionMethod) {
            this.encryptionMethod = encryptionMethod;
            return this;
        }

        public Builder setKeyRotationIntervalSeconds(@Nullable Integer keyRotationIntervalSeconds) {
            this.keyRotationIntervalSeconds = keyRotationIntervalSeconds;
            return this;
        }

        public Builder setRepeatExtXKey(@Nullable Boolean repeatExtXKey) {
            this.repeatExtXKey = repeatExtXKey;
            return this;
        }

        public Builder setSpekeKeyProvider(OriginEndpointSpekeKeyProvider spekeKeyProvider) {
            this.spekeKeyProvider = Objects.requireNonNull(spekeKeyProvider);
            return this;
        }

        public OriginEndpointHlsEncryption build() {
            return new OriginEndpointHlsEncryption(constantInitializationVector, encryptionMethod, keyRotationIntervalSeconds, repeatExtXKey, spekeKeyProvider);
        }
    }
}
