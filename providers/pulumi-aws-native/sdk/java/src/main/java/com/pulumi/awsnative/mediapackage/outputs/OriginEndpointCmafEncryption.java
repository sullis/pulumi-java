// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.mediapackage.outputs;

import com.pulumi.awsnative.mediapackage.outputs.OriginEndpointSpekeKeyProvider;
import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class OriginEndpointCmafEncryption {
    /**
     * @return An optional 128-bit, 16-byte hex value represented by a 32-character string, used in conjunction with the key for encrypting blocks. If you don&#39;t specify a value, then MediaPackage creates the constant initialization vector (IV).
     * 
     */
    private final @Nullable String constantInitializationVector;
    /**
     * @return Time (in seconds) between each encryption key rotation.
     * 
     */
    private final @Nullable Integer keyRotationIntervalSeconds;
    private final OriginEndpointSpekeKeyProvider spekeKeyProvider;

    @CustomType.Constructor
    private OriginEndpointCmafEncryption(
        @CustomType.Parameter("constantInitializationVector") @Nullable String constantInitializationVector,
        @CustomType.Parameter("keyRotationIntervalSeconds") @Nullable Integer keyRotationIntervalSeconds,
        @CustomType.Parameter("spekeKeyProvider") OriginEndpointSpekeKeyProvider spekeKeyProvider) {
        this.constantInitializationVector = constantInitializationVector;
        this.keyRotationIntervalSeconds = keyRotationIntervalSeconds;
        this.spekeKeyProvider = spekeKeyProvider;
    }

    /**
     * @return An optional 128-bit, 16-byte hex value represented by a 32-character string, used in conjunction with the key for encrypting blocks. If you don&#39;t specify a value, then MediaPackage creates the constant initialization vector (IV).
     * 
     */
    public Optional<String> constantInitializationVector() {
        return Optional.ofNullable(this.constantInitializationVector);
    }
    /**
     * @return Time (in seconds) between each encryption key rotation.
     * 
     */
    public Optional<Integer> keyRotationIntervalSeconds() {
        return Optional.ofNullable(this.keyRotationIntervalSeconds);
    }
    public OriginEndpointSpekeKeyProvider spekeKeyProvider() {
        return this.spekeKeyProvider;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OriginEndpointCmafEncryption defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String constantInitializationVector;
        private @Nullable Integer keyRotationIntervalSeconds;
        private OriginEndpointSpekeKeyProvider spekeKeyProvider;

        public Builder() {
    	      // Empty
        }

        public Builder(OriginEndpointCmafEncryption defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.constantInitializationVector = defaults.constantInitializationVector;
    	      this.keyRotationIntervalSeconds = defaults.keyRotationIntervalSeconds;
    	      this.spekeKeyProvider = defaults.spekeKeyProvider;
        }

        public Builder constantInitializationVector(@Nullable String constantInitializationVector) {
            this.constantInitializationVector = constantInitializationVector;
            return this;
        }
        public Builder keyRotationIntervalSeconds(@Nullable Integer keyRotationIntervalSeconds) {
            this.keyRotationIntervalSeconds = keyRotationIntervalSeconds;
            return this;
        }
        public Builder spekeKeyProvider(OriginEndpointSpekeKeyProvider spekeKeyProvider) {
            this.spekeKeyProvider = Objects.requireNonNull(spekeKeyProvider);
            return this;
        }        public OriginEndpointCmafEncryption build() {
            return new OriginEndpointCmafEncryption(constantInitializationVector, keyRotationIntervalSeconds, spekeKeyProvider);
        }
    }
}
