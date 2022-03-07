// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.containerservice.outputs;

import io.pulumi.azurenative.containerservice.outputs.OpenShiftManagedClusterAADIdentityProviderResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class OpenShiftManagedClusterIdentityProviderResponse {
    /**
     * Name of the provider.
     * 
     */
    private final @Nullable String name;
    /**
     * Configuration of the provider.
     * 
     */
    private final @Nullable OpenShiftManagedClusterAADIdentityProviderResponse provider;

    @OutputCustomType.Constructor({"name","provider"})
    private OpenShiftManagedClusterIdentityProviderResponse(
        @Nullable String name,
        @Nullable OpenShiftManagedClusterAADIdentityProviderResponse provider) {
        this.name = name;
        this.provider = provider;
    }

    /**
     * Name of the provider.
     * 
    */
    public Optional<String> getName() {
        return Optional.ofNullable(this.name);
    }
    /**
     * Configuration of the provider.
     * 
    */
    public Optional<OpenShiftManagedClusterAADIdentityProviderResponse> getProvider() {
        return Optional.ofNullable(this.provider);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OpenShiftManagedClusterIdentityProviderResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String name;
        private @Nullable OpenShiftManagedClusterAADIdentityProviderResponse provider;

        public Builder() {
    	      // Empty
        }

        public Builder(OpenShiftManagedClusterIdentityProviderResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.provider = defaults.provider;
        }

        public Builder setName(@Nullable String name) {
            this.name = name;
            return this;
        }

        public Builder setProvider(@Nullable OpenShiftManagedClusterAADIdentityProviderResponse provider) {
            this.provider = provider;
            return this;
        }
        public OpenShiftManagedClusterIdentityProviderResponse build() {
            return new OpenShiftManagedClusterIdentityProviderResponse(name, provider);
        }
    }
}