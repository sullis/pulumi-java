// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.cdn.inputs;

import com.pulumi.azurenative.cdn.inputs.ResourceReferenceArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Url signing key parameters
 * 
 */
public final class UrlSigningKeyParametersArgs extends com.pulumi.resources.ResourceArgs {

    public static final UrlSigningKeyParametersArgs Empty = new UrlSigningKeyParametersArgs();

    /**
     * Defines the customer defined key Id. This id will exist in the incoming request to indicate the key used to form the hash.
     * 
     */
    @Import(name="keyId", required=true)
      private final Output<String> keyId;

    public Output<String> keyId() {
        return this.keyId;
    }

    /**
     * Resource reference to the KV secret
     * 
     */
    @Import(name="secretSource", required=true)
      private final Output<ResourceReferenceArgs> secretSource;

    public Output<ResourceReferenceArgs> secretSource() {
        return this.secretSource;
    }

    /**
     * Version of the secret to be used
     * 
     */
    @Import(name="secretVersion")
      private final @Nullable Output<String> secretVersion;

    public Output<String> secretVersion() {
        return this.secretVersion == null ? Codegen.empty() : this.secretVersion;
    }

    /**
     * The type of the Secret to create.
     * Expected value is 'UrlSigningKey'.
     * 
     */
    @Import(name="type", required=true)
      private final Output<String> type;

    public Output<String> type() {
        return this.type;
    }

    public UrlSigningKeyParametersArgs(
        Output<String> keyId,
        Output<ResourceReferenceArgs> secretSource,
        @Nullable Output<String> secretVersion,
        Output<String> type) {
        this.keyId = Objects.requireNonNull(keyId, "expected parameter 'keyId' to be non-null");
        this.secretSource = Objects.requireNonNull(secretSource, "expected parameter 'secretSource' to be non-null");
        this.secretVersion = secretVersion;
        this.type = Codegen.stringProp("type").output().arg(type).require();
    }

    private UrlSigningKeyParametersArgs() {
        this.keyId = Codegen.empty();
        this.secretSource = Codegen.empty();
        this.secretVersion = Codegen.empty();
        this.type = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(UrlSigningKeyParametersArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> keyId;
        private Output<ResourceReferenceArgs> secretSource;
        private @Nullable Output<String> secretVersion;
        private Output<String> type;

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

        public Builder keyId(Output<String> keyId) {
            this.keyId = Objects.requireNonNull(keyId);
            return this;
        }
        public Builder keyId(String keyId) {
            this.keyId = Output.of(Objects.requireNonNull(keyId));
            return this;
        }
        public Builder secretSource(Output<ResourceReferenceArgs> secretSource) {
            this.secretSource = Objects.requireNonNull(secretSource);
            return this;
        }
        public Builder secretSource(ResourceReferenceArgs secretSource) {
            this.secretSource = Output.of(Objects.requireNonNull(secretSource));
            return this;
        }
        public Builder secretVersion(@Nullable Output<String> secretVersion) {
            this.secretVersion = secretVersion;
            return this;
        }
        public Builder secretVersion(@Nullable String secretVersion) {
            this.secretVersion = Codegen.ofNullable(secretVersion);
            return this;
        }
        public Builder type(Output<String> type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public Builder type(String type) {
            this.type = Output.of(Objects.requireNonNull(type));
            return this;
        }        public UrlSigningKeyParametersArgs build() {
            return new UrlSigningKeyParametersArgs(keyId, secretSource, secretVersion, type);
        }
    }
}
