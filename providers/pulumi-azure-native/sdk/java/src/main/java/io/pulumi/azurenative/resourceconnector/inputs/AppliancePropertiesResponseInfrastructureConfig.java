// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.resourceconnector.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Contains infrastructure information about the Appliance
 * 
 */
public final class AppliancePropertiesResponseInfrastructureConfig extends io.pulumi.resources.InvokeArgs {

    public static final AppliancePropertiesResponseInfrastructureConfig Empty = new AppliancePropertiesResponseInfrastructureConfig();

    /**
     * Information about the connected appliance.
     * 
     */
    @InputImport(name="provider")
      private final @Nullable String provider;

    public Optional<String> getProvider() {
        return this.provider == null ? Optional.empty() : Optional.ofNullable(this.provider);
    }

    public AppliancePropertiesResponseInfrastructureConfig(@Nullable String provider) {
        this.provider = provider;
    }

    private AppliancePropertiesResponseInfrastructureConfig() {
        this.provider = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AppliancePropertiesResponseInfrastructureConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String provider;

        public Builder() {
    	      // Empty
        }

        public Builder(AppliancePropertiesResponseInfrastructureConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.provider = defaults.provider;
        }

        public Builder setProvider(@Nullable String provider) {
            this.provider = provider;
            return this;
        }
        public AppliancePropertiesResponseInfrastructureConfig build() {
            return new AppliancePropertiesResponseInfrastructureConfig(provider);
        }
    }
}