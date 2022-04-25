// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.resourceconnector.inputs;

import com.pulumi.azurenative.resourceconnector.enums.Provider;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Contains infrastructure information about the Appliance
 * 
 */
public final class AppliancePropertiesInfrastructureConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final AppliancePropertiesInfrastructureConfigArgs Empty = new AppliancePropertiesInfrastructureConfigArgs();

    /**
     * Information about the connected appliance.
     * 
     */
    @Import(name="provider")
    private @Nullable Output<Either<String,Provider>> provider;

    /**
     * @return Information about the connected appliance.
     * 
     */
    public Optional<Output<Either<String,Provider>>> provider() {
        return Optional.ofNullable(this.provider);
    }

    private AppliancePropertiesInfrastructureConfigArgs() {}

    private AppliancePropertiesInfrastructureConfigArgs(AppliancePropertiesInfrastructureConfigArgs $) {
        this.provider = $.provider;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AppliancePropertiesInfrastructureConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AppliancePropertiesInfrastructureConfigArgs $;

        public Builder() {
            $ = new AppliancePropertiesInfrastructureConfigArgs();
        }

        public Builder(AppliancePropertiesInfrastructureConfigArgs defaults) {
            $ = new AppliancePropertiesInfrastructureConfigArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param provider Information about the connected appliance.
         * 
         * @return builder
         * 
         */
        public Builder provider(@Nullable Output<Either<String,Provider>> provider) {
            $.provider = provider;
            return this;
        }

        /**
         * @param provider Information about the connected appliance.
         * 
         * @return builder
         * 
         */
        public Builder provider(Either<String,Provider> provider) {
            return provider(Output.of(provider));
        }

        /**
         * @param provider Information about the connected appliance.
         * 
         * @return builder
         * 
         */
        public Builder provider(String provider) {
            return provider(Either.ofLeft(provider));
        }

        /**
         * @param provider Information about the connected appliance.
         * 
         * @return builder
         * 
         */
        public Builder provider(Provider provider) {
            return provider(Either.ofRight(provider));
        }

        public AppliancePropertiesInfrastructureConfigArgs build() {
            return $;
        }
    }

}
