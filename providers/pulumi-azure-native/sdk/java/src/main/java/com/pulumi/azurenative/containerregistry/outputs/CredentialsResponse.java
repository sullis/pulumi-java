// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.containerregistry.outputs;

import com.pulumi.azurenative.containerregistry.outputs.CustomRegistryCredentialsResponse;
import com.pulumi.azurenative.containerregistry.outputs.SourceRegistryCredentialsResponse;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class CredentialsResponse {
    /**
     * @return Describes the credential parameters for accessing other custom registries. The key
     * for the dictionary item will be the registry login server (myregistry.azurecr.io) and
     * the value of the item will be the registry credentials for accessing the registry.
     * 
     */
    private final @Nullable Map<String,CustomRegistryCredentialsResponse> customRegistries;
    /**
     * @return Describes the credential parameters for accessing the source registry.
     * 
     */
    private final @Nullable SourceRegistryCredentialsResponse sourceRegistry;

    @CustomType.Constructor
    private CredentialsResponse(
        @CustomType.Parameter("customRegistries") @Nullable Map<String,CustomRegistryCredentialsResponse> customRegistries,
        @CustomType.Parameter("sourceRegistry") @Nullable SourceRegistryCredentialsResponse sourceRegistry) {
        this.customRegistries = customRegistries;
        this.sourceRegistry = sourceRegistry;
    }

    /**
     * @return Describes the credential parameters for accessing other custom registries. The key
     * for the dictionary item will be the registry login server (myregistry.azurecr.io) and
     * the value of the item will be the registry credentials for accessing the registry.
     * 
     */
    public Map<String,CustomRegistryCredentialsResponse> customRegistries() {
        return this.customRegistries == null ? Map.of() : this.customRegistries;
    }
    /**
     * @return Describes the credential parameters for accessing the source registry.
     * 
     */
    public Optional<SourceRegistryCredentialsResponse> sourceRegistry() {
        return Optional.ofNullable(this.sourceRegistry);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CredentialsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Map<String,CustomRegistryCredentialsResponse> customRegistries;
        private @Nullable SourceRegistryCredentialsResponse sourceRegistry;

        public Builder() {
    	      // Empty
        }

        public Builder(CredentialsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.customRegistries = defaults.customRegistries;
    	      this.sourceRegistry = defaults.sourceRegistry;
        }

        public Builder customRegistries(@Nullable Map<String,CustomRegistryCredentialsResponse> customRegistries) {
            this.customRegistries = customRegistries;
            return this;
        }
        public Builder sourceRegistry(@Nullable SourceRegistryCredentialsResponse sourceRegistry) {
            this.sourceRegistry = sourceRegistry;
            return this;
        }        public CredentialsResponse build() {
            return new CredentialsResponse(customRegistries, sourceRegistry);
        }
    }
}
