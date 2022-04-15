// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.kms.outputs;

import io.pulumi.awsnative.kms.enums.KeySpec;
import io.pulumi.awsnative.kms.enums.KeyUsage;
import io.pulumi.awsnative.kms.outputs.KeyTag;
import io.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetKeyResult {
    private final @Nullable String arn;
    /**
     * A description of the CMK. Use a description that helps you to distinguish this CMK from others in the account, such as its intended use.
     * 
     */
    private final @Nullable String description;
    /**
     * Enables automatic rotation of the key material for the specified customer master key (CMK). By default, automation key rotation is not enabled.
     * 
     */
    private final @Nullable Boolean enableKeyRotation;
    /**
     * Specifies whether the customer master key (CMK) is enabled. Disabled CMKs cannot be used in cryptographic operations.
     * 
     */
    private final @Nullable Boolean enabled;
    private final @Nullable String keyId;
    /**
     * The key policy that authorizes use of the CMK. The key policy must observe the following rules.
     * 
     */
    private final @Nullable Object keyPolicy;
    /**
     * Specifies the type of CMK to create. The default value is SYMMETRIC_DEFAULT. This property is required only for asymmetric CMKs. You can't change the KeySpec value after the CMK is created.
     * 
     */
    private final @Nullable KeySpec keySpec;
    /**
     * Determines the cryptographic operations for which you can use the CMK. The default value is ENCRYPT_DECRYPT. This property is required only for asymmetric CMKs. You can't change the KeyUsage value after the CMK is created.
     * 
     */
    private final @Nullable KeyUsage keyUsage;
    /**
     * Specifies whether the CMK should be Multi-Region. You can't change the MultiRegion value after the CMK is created.
     * 
     */
    private final @Nullable Boolean multiRegion;
    /**
     * An array of key-value pairs to apply to this resource.
     * 
     */
    private final @Nullable List<KeyTag> tags;

    @CustomType.Constructor
    private GetKeyResult(
        @CustomType.Parameter("arn") @Nullable String arn,
        @CustomType.Parameter("description") @Nullable String description,
        @CustomType.Parameter("enableKeyRotation") @Nullable Boolean enableKeyRotation,
        @CustomType.Parameter("enabled") @Nullable Boolean enabled,
        @CustomType.Parameter("keyId") @Nullable String keyId,
        @CustomType.Parameter("keyPolicy") @Nullable Object keyPolicy,
        @CustomType.Parameter("keySpec") @Nullable KeySpec keySpec,
        @CustomType.Parameter("keyUsage") @Nullable KeyUsage keyUsage,
        @CustomType.Parameter("multiRegion") @Nullable Boolean multiRegion,
        @CustomType.Parameter("tags") @Nullable List<KeyTag> tags) {
        this.arn = arn;
        this.description = description;
        this.enableKeyRotation = enableKeyRotation;
        this.enabled = enabled;
        this.keyId = keyId;
        this.keyPolicy = keyPolicy;
        this.keySpec = keySpec;
        this.keyUsage = keyUsage;
        this.multiRegion = multiRegion;
        this.tags = tags;
    }

    public Optional<String> arn() {
        return Optional.ofNullable(this.arn);
    }
    /**
     * A description of the CMK. Use a description that helps you to distinguish this CMK from others in the account, such as its intended use.
     * 
    */
    public Optional<String> description() {
        return Optional.ofNullable(this.description);
    }
    /**
     * Enables automatic rotation of the key material for the specified customer master key (CMK). By default, automation key rotation is not enabled.
     * 
    */
    public Optional<Boolean> enableKeyRotation() {
        return Optional.ofNullable(this.enableKeyRotation);
    }
    /**
     * Specifies whether the customer master key (CMK) is enabled. Disabled CMKs cannot be used in cryptographic operations.
     * 
    */
    public Optional<Boolean> enabled() {
        return Optional.ofNullable(this.enabled);
    }
    public Optional<String> keyId() {
        return Optional.ofNullable(this.keyId);
    }
    /**
     * The key policy that authorizes use of the CMK. The key policy must observe the following rules.
     * 
    */
    public Optional<Object> keyPolicy() {
        return Optional.ofNullable(this.keyPolicy);
    }
    /**
     * Specifies the type of CMK to create. The default value is SYMMETRIC_DEFAULT. This property is required only for asymmetric CMKs. You can't change the KeySpec value after the CMK is created.
     * 
    */
    public Optional<KeySpec> keySpec() {
        return Optional.ofNullable(this.keySpec);
    }
    /**
     * Determines the cryptographic operations for which you can use the CMK. The default value is ENCRYPT_DECRYPT. This property is required only for asymmetric CMKs. You can't change the KeyUsage value after the CMK is created.
     * 
    */
    public Optional<KeyUsage> keyUsage() {
        return Optional.ofNullable(this.keyUsage);
    }
    /**
     * Specifies whether the CMK should be Multi-Region. You can't change the MultiRegion value after the CMK is created.
     * 
    */
    public Optional<Boolean> multiRegion() {
        return Optional.ofNullable(this.multiRegion);
    }
    /**
     * An array of key-value pairs to apply to this resource.
     * 
    */
    public List<KeyTag> tags() {
        return this.tags == null ? List.of() : this.tags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetKeyResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String arn;
        private @Nullable String description;
        private @Nullable Boolean enableKeyRotation;
        private @Nullable Boolean enabled;
        private @Nullable String keyId;
        private @Nullable Object keyPolicy;
        private @Nullable KeySpec keySpec;
        private @Nullable KeyUsage keyUsage;
        private @Nullable Boolean multiRegion;
        private @Nullable List<KeyTag> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(GetKeyResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.description = defaults.description;
    	      this.enableKeyRotation = defaults.enableKeyRotation;
    	      this.enabled = defaults.enabled;
    	      this.keyId = defaults.keyId;
    	      this.keyPolicy = defaults.keyPolicy;
    	      this.keySpec = defaults.keySpec;
    	      this.keyUsage = defaults.keyUsage;
    	      this.multiRegion = defaults.multiRegion;
    	      this.tags = defaults.tags;
        }

        public Builder arn(@Nullable String arn) {
            this.arn = arn;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = description;
            return this;
        }
        public Builder enableKeyRotation(@Nullable Boolean enableKeyRotation) {
            this.enableKeyRotation = enableKeyRotation;
            return this;
        }
        public Builder enabled(@Nullable Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Builder keyId(@Nullable String keyId) {
            this.keyId = keyId;
            return this;
        }
        public Builder keyPolicy(@Nullable Object keyPolicy) {
            this.keyPolicy = keyPolicy;
            return this;
        }
        public Builder keySpec(@Nullable KeySpec keySpec) {
            this.keySpec = keySpec;
            return this;
        }
        public Builder keyUsage(@Nullable KeyUsage keyUsage) {
            this.keyUsage = keyUsage;
            return this;
        }
        public Builder multiRegion(@Nullable Boolean multiRegion) {
            this.multiRegion = multiRegion;
            return this;
        }
        public Builder tags(@Nullable List<KeyTag> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(KeyTag... tags) {
            return tags(List.of(tags));
        }        public GetKeyResult build() {
            return new GetKeyResult(arn, description, enableKeyRotation, enabled, keyId, keyPolicy, keySpec, keyUsage, multiRegion, tags);
        }
    }
}
