// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.cdn.inputs;

import io.pulumi.azurenative.cdn.inputs.ResourceReferenceArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Url signing key parameters
 * 
 */
public final class UrlSigningKeyParametersArgs extends io.pulumi.resources.ResourceArgs {

    public static final UrlSigningKeyParametersArgs Empty = new UrlSigningKeyParametersArgs();

    /**
     * Defines the customer defined key Id. This id will exist in the incoming request to indicate the key used to form the hash.
     * 
     */
    @InputImport(name="keyId", required=true)
    private final Input<String> keyId;

    public Input<String> getKeyId() {
        return this.keyId;
    }

    /**
     * Resource reference to the KV secret
     * 
     */
    @InputImport(name="secretSource", required=true)
    private final Input<ResourceReferenceArgs> secretSource;

    public Input<ResourceReferenceArgs> getSecretSource() {
        return this.secretSource;
    }

    /**
     * Version of the secret to be used
     * 
     */
    @InputImport(name="secretVersion")
    private final @Nullable Input<String> secretVersion;

    public Input<String> getSecretVersion() {
        return this.secretVersion == null ? Input.empty() : this.secretVersion;
    }

    /**
     * The type of the Secret to create.
     * Expected value is 'UrlSigningKey'.
     * 
     */
    @InputImport(name="type", required=true)
    private final Input<String> type;

    public Input<String> getType() {
        return this.type;
    }

    public UrlSigningKeyParametersArgs(
        Input<String> keyId,
        Input<ResourceReferenceArgs> secretSource,
        @Nullable Input<String> secretVersion,
        Input<String> type) {
        this.keyId = Objects.requireNonNull(keyId, "expected parameter 'keyId' to be non-null");
        this.secretSource = Objects.requireNonNull(secretSource, "expected parameter 'secretSource' to be non-null");
        this.secretVersion = secretVersion;
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private UrlSigningKeyParametersArgs() {
        this.keyId = Input.empty();
        this.secretSource = Input.empty();
        this.secretVersion = Input.empty();
        this.type = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(UrlSigningKeyParametersArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> keyId;
        private Input<ResourceReferenceArgs> secretSource;
        private @Nullable Input<String> secretVersion;
        private Input<String> type;

        public Builder() {
    	      // Empty
        }

        public Builder(UrlSigningKeyParametersArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.keyId = defaults.keyId;
    	      this.secretSource = defaults.secretSource;
    	      this.secretVersion = defaults.secretVersion;
    	      this.type = defaults.type;
        }

        public Builder setKeyId(Input<String> keyId) {
            this.keyId = Objects.requireNonNull(keyId);
            return this;
        }

        public Builder setKeyId(String keyId) {
            this.keyId = Input.of(Objects.requireNonNull(keyId));
            return this;
        }

        public Builder setSecretSource(Input<ResourceReferenceArgs> secretSource) {
            this.secretSource = Objects.requireNonNull(secretSource);
            return this;
        }

        public Builder setSecretSource(ResourceReferenceArgs secretSource) {
            this.secretSource = Input.of(Objects.requireNonNull(secretSource));
            return this;
        }

        public Builder setSecretVersion(@Nullable Input<String> secretVersion) {
            this.secretVersion = secretVersion;
            return this;
        }

        public Builder setSecretVersion(@Nullable String secretVersion) {
            this.secretVersion = Input.ofNullable(secretVersion);
            return this;
        }

        public Builder setType(Input<String> type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder setType(String type) {
            this.type = Input.of(Objects.requireNonNull(type));
            return this;
        }

        public UrlSigningKeyParametersArgs build() {
            return new UrlSigningKeyParametersArgs(keyId, secretSource, secretVersion, type);
        }
    }
}
