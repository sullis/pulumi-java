// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.security.inputs;

import com.pulumi.azurenative.security.inputs.DefenderForServersAwsOfferingServicePrincipalSecretMetadataArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The ARC autoprovisioning configuration
 * 
 */
public final class DefenderForServersAwsOfferingArcAutoProvisioningArgs extends com.pulumi.resources.ResourceArgs {

    public static final DefenderForServersAwsOfferingArcAutoProvisioningArgs Empty = new DefenderForServersAwsOfferingArcAutoProvisioningArgs();

    /**
     * Is arc auto provisioning enabled
     * 
     */
    @Import(name="enabled")
    private @Nullable Output<Boolean> enabled;

    /**
     * @return Is arc auto provisioning enabled
     * 
     */
    public Optional<Output<Boolean>> enabled() {
        return Optional.ofNullable(this.enabled);
    }

    /**
     * Metadata of Service Principal secret for autoprovisioning
     * 
     */
    @Import(name="servicePrincipalSecretMetadata")
    private @Nullable Output<DefenderForServersAwsOfferingServicePrincipalSecretMetadataArgs> servicePrincipalSecretMetadata;

    /**
     * @return Metadata of Service Principal secret for autoprovisioning
     * 
     */
    public Optional<Output<DefenderForServersAwsOfferingServicePrincipalSecretMetadataArgs>> servicePrincipalSecretMetadata() {
        return Optional.ofNullable(this.servicePrincipalSecretMetadata);
    }

    private DefenderForServersAwsOfferingArcAutoProvisioningArgs() {}

    private DefenderForServersAwsOfferingArcAutoProvisioningArgs(DefenderForServersAwsOfferingArcAutoProvisioningArgs $) {
        this.enabled = $.enabled;
        this.servicePrincipalSecretMetadata = $.servicePrincipalSecretMetadata;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DefenderForServersAwsOfferingArcAutoProvisioningArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DefenderForServersAwsOfferingArcAutoProvisioningArgs $;

        public Builder() {
            $ = new DefenderForServersAwsOfferingArcAutoProvisioningArgs();
        }

        public Builder(DefenderForServersAwsOfferingArcAutoProvisioningArgs defaults) {
            $ = new DefenderForServersAwsOfferingArcAutoProvisioningArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param enabled Is arc auto provisioning enabled
         * 
         * @return builder
         * 
         */
        public Builder enabled(@Nullable Output<Boolean> enabled) {
            $.enabled = enabled;
            return this;
        }

        /**
         * @param enabled Is arc auto provisioning enabled
         * 
         * @return builder
         * 
         */
        public Builder enabled(Boolean enabled) {
            return enabled(Output.of(enabled));
        }

        /**
         * @param servicePrincipalSecretMetadata Metadata of Service Principal secret for autoprovisioning
         * 
         * @return builder
         * 
         */
        public Builder servicePrincipalSecretMetadata(@Nullable Output<DefenderForServersAwsOfferingServicePrincipalSecretMetadataArgs> servicePrincipalSecretMetadata) {
            $.servicePrincipalSecretMetadata = servicePrincipalSecretMetadata;
            return this;
        }

        /**
         * @param servicePrincipalSecretMetadata Metadata of Service Principal secret for autoprovisioning
         * 
         * @return builder
         * 
         */
        public Builder servicePrincipalSecretMetadata(DefenderForServersAwsOfferingServicePrincipalSecretMetadataArgs servicePrincipalSecretMetadata) {
            return servicePrincipalSecretMetadata(Output.of(servicePrincipalSecretMetadata));
        }

        public DefenderForServersAwsOfferingArcAutoProvisioningArgs build() {
            return $;
        }
    }

}
