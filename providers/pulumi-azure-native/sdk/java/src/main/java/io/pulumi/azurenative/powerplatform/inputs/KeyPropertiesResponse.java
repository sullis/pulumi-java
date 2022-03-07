// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.powerplatform.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Url and version of the KeyVault Secret
 * 
 */
public final class KeyPropertiesResponse extends io.pulumi.resources.InvokeArgs {

    public static final KeyPropertiesResponse Empty = new KeyPropertiesResponse();

    /**
     * The identifier of the key vault key used to encrypt data.
     * 
     */
    @InputImport(name="name")
      private final @Nullable String name;

    public Optional<String> getName() {
        return this.name == null ? Optional.empty() : Optional.ofNullable(this.name);
    }

    /**
     * The version of the identity which will be used to access key vault.
     * 
     */
    @InputImport(name="version")
      private final @Nullable String version;

    public Optional<String> getVersion() {
        return this.version == null ? Optional.empty() : Optional.ofNullable(this.version);
    }

    public KeyPropertiesResponse(
        @Nullable String name,
        @Nullable String version) {
        this.name = name;
        this.version = version;
    }

    private KeyPropertiesResponse() {
        this.name = null;
        this.version = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(KeyPropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String name;
        private @Nullable String version;

        public Builder() {
    	      // Empty
        }

        public Builder(KeyPropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.version = defaults.version;
        }

        public Builder setName(@Nullable String name) {
            this.name = name;
            return this;
        }

        public Builder setVersion(@Nullable String version) {
            this.version = version;
            return this;
        }
        public KeyPropertiesResponse build() {
            return new KeyPropertiesResponse(name, version);
        }
    }
}