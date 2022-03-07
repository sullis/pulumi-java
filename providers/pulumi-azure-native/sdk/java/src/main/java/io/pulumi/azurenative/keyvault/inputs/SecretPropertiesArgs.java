// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.keyvault.inputs;

import io.pulumi.azurenative.keyvault.inputs.SecretAttributesArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Properties of the secret
 * 
 */
public final class SecretPropertiesArgs extends io.pulumi.resources.ResourceArgs {

    public static final SecretPropertiesArgs Empty = new SecretPropertiesArgs();

    /**
     * The attributes of the secret.
     * 
     */
    @InputImport(name="attributes")
      private final @Nullable Input<SecretAttributesArgs> attributes;

    public Input<SecretAttributesArgs> getAttributes() {
        return this.attributes == null ? Input.empty() : this.attributes;
    }

    /**
     * The content type of the secret.
     * 
     */
    @InputImport(name="contentType")
      private final @Nullable Input<String> contentType;

    public Input<String> getContentType() {
        return this.contentType == null ? Input.empty() : this.contentType;
    }

    /**
     * The value of the secret. NOTE: 'value' will never be returned from the service, as APIs using this model are is intended for internal use in ARM deployments. Users should use the data-plane REST service for interaction with vault secrets.
     * 
     */
    @InputImport(name="value")
      private final @Nullable Input<String> value;

    public Input<String> getValue() {
        return this.value == null ? Input.empty() : this.value;
    }

    public SecretPropertiesArgs(
        @Nullable Input<SecretAttributesArgs> attributes,
        @Nullable Input<String> contentType,
        @Nullable Input<String> value) {
        this.attributes = attributes;
        this.contentType = contentType;
        this.value = value;
    }

    private SecretPropertiesArgs() {
        this.attributes = Input.empty();
        this.contentType = Input.empty();
        this.value = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SecretPropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<SecretAttributesArgs> attributes;
        private @Nullable Input<String> contentType;
        private @Nullable Input<String> value;

        public Builder() {
    	      // Empty
        }

        public Builder(SecretPropertiesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.attributes = defaults.attributes;
    	      this.contentType = defaults.contentType;
    	      this.value = defaults.value;
        }

        public Builder setAttributes(@Nullable Input<SecretAttributesArgs> attributes) {
            this.attributes = attributes;
            return this;
        }

        public Builder setAttributes(@Nullable SecretAttributesArgs attributes) {
            this.attributes = Input.ofNullable(attributes);
            return this;
        }

        public Builder setContentType(@Nullable Input<String> contentType) {
            this.contentType = contentType;
            return this;
        }

        public Builder setContentType(@Nullable String contentType) {
            this.contentType = Input.ofNullable(contentType);
            return this;
        }

        public Builder setValue(@Nullable Input<String> value) {
            this.value = value;
            return this;
        }

        public Builder setValue(@Nullable String value) {
            this.value = Input.ofNullable(value);
            return this;
        }
        public SecretPropertiesArgs build() {
            return new SecretPropertiesArgs(attributes, contentType, value);
        }
    }
}