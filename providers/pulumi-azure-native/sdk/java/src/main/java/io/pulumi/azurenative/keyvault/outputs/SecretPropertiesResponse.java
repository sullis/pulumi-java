// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.keyvault.outputs;

import io.pulumi.azurenative.keyvault.outputs.SecretAttributesResponse;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class SecretPropertiesResponse {
    /**
     * The attributes of the secret.
     * 
     */
    private final @Nullable SecretAttributesResponse attributes;
    /**
     * The content type of the secret.
     * 
     */
    private final @Nullable String contentType;
    /**
     * The URI to retrieve the current version of the secret.
     * 
     */
    private final String secretUri;
    /**
     * The URI to retrieve the specific version of the secret.
     * 
     */
    private final String secretUriWithVersion;
    /**
     * The value of the secret. NOTE: 'value' will never be returned from the service, as APIs using this model are is intended for internal use in ARM deployments. Users should use the data-plane REST service for interaction with vault secrets.
     * 
     */
    private final @Nullable String value;

    @OutputCustomType.Constructor({"attributes","contentType","secretUri","secretUriWithVersion","value"})
    private SecretPropertiesResponse(
        @Nullable SecretAttributesResponse attributes,
        @Nullable String contentType,
        String secretUri,
        String secretUriWithVersion,
        @Nullable String value) {
        this.attributes = attributes;
        this.contentType = contentType;
        this.secretUri = Objects.requireNonNull(secretUri);
        this.secretUriWithVersion = Objects.requireNonNull(secretUriWithVersion);
        this.value = value;
    }

    /**
     * The attributes of the secret.
     * 
     */
    public Optional<SecretAttributesResponse> getAttributes() {
        return Optional.ofNullable(this.attributes);
    }
    /**
     * The content type of the secret.
     * 
     */
    public Optional<String> getContentType() {
        return Optional.ofNullable(this.contentType);
    }
    /**
     * The URI to retrieve the current version of the secret.
     * 
     */
    public String getSecretUri() {
        return this.secretUri;
    }
    /**
     * The URI to retrieve the specific version of the secret.
     * 
     */
    public String getSecretUriWithVersion() {
        return this.secretUriWithVersion;
    }
    /**
     * The value of the secret. NOTE: 'value' will never be returned from the service, as APIs using this model are is intended for internal use in ARM deployments. Users should use the data-plane REST service for interaction with vault secrets.
     * 
     */
    public Optional<String> getValue() {
        return Optional.ofNullable(this.value);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SecretPropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable SecretAttributesResponse attributes;
        private @Nullable String contentType;
        private String secretUri;
        private String secretUriWithVersion;
        private @Nullable String value;

        public Builder() {
    	      // Empty
        }

        public Builder(SecretPropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.attributes = defaults.attributes;
    	      this.contentType = defaults.contentType;
    	      this.secretUri = defaults.secretUri;
    	      this.secretUriWithVersion = defaults.secretUriWithVersion;
    	      this.value = defaults.value;
        }

        public Builder setAttributes(@Nullable SecretAttributesResponse attributes) {
            this.attributes = attributes;
            return this;
        }

        public Builder setContentType(@Nullable String contentType) {
            this.contentType = contentType;
            return this;
        }

        public Builder setSecretUri(String secretUri) {
            this.secretUri = Objects.requireNonNull(secretUri);
            return this;
        }

        public Builder setSecretUriWithVersion(String secretUriWithVersion) {
            this.secretUriWithVersion = Objects.requireNonNull(secretUriWithVersion);
            return this;
        }

        public Builder setValue(@Nullable String value) {
            this.value = value;
            return this;
        }

        public SecretPropertiesResponse build() {
            return new SecretPropertiesResponse(attributes, contentType, secretUri, secretUriWithVersion, value);
        }
    }
}
