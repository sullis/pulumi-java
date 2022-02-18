// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.security.outputs;

import io.pulumi.azurenative.security.outputs.DefenderForServersAwsOfferingResponseServicePrincipalSecretMetadata;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class DefenderForServersAwsOfferingResponseArcAutoProvisioning {
    /**
     * Is arc auto provisioning enabled
     * 
     */
    private final @Nullable Boolean enabled;
    /**
     * Metadata of Service Principal secret for autoprovisioning
     * 
     */
    private final @Nullable DefenderForServersAwsOfferingResponseServicePrincipalSecretMetadata servicePrincipalSecretMetadata;

    @OutputCustomType.Constructor({"enabled","servicePrincipalSecretMetadata"})
    private DefenderForServersAwsOfferingResponseArcAutoProvisioning(
        @Nullable Boolean enabled,
        @Nullable DefenderForServersAwsOfferingResponseServicePrincipalSecretMetadata servicePrincipalSecretMetadata) {
        this.enabled = enabled;
        this.servicePrincipalSecretMetadata = servicePrincipalSecretMetadata;
    }

    /**
     * Is arc auto provisioning enabled
     * 
     */
    public Optional<Boolean> getEnabled() {
        return Optional.ofNullable(this.enabled);
    }
    /**
     * Metadata of Service Principal secret for autoprovisioning
     * 
     */
    public Optional<DefenderForServersAwsOfferingResponseServicePrincipalSecretMetadata> getServicePrincipalSecretMetadata() {
        return Optional.ofNullable(this.servicePrincipalSecretMetadata);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DefenderForServersAwsOfferingResponseArcAutoProvisioning defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean enabled;
        private @Nullable DefenderForServersAwsOfferingResponseServicePrincipalSecretMetadata servicePrincipalSecretMetadata;

        public Builder() {
    	      // Empty
        }

        public Builder(DefenderForServersAwsOfferingResponseArcAutoProvisioning defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enabled = defaults.enabled;
    	      this.servicePrincipalSecretMetadata = defaults.servicePrincipalSecretMetadata;
        }

        public Builder setEnabled(@Nullable Boolean enabled) {
            this.enabled = enabled;
            return this;
        }

        public Builder setServicePrincipalSecretMetadata(@Nullable DefenderForServersAwsOfferingResponseServicePrincipalSecretMetadata servicePrincipalSecretMetadata) {
            this.servicePrincipalSecretMetadata = servicePrincipalSecretMetadata;
            return this;
        }

        public DefenderForServersAwsOfferingResponseArcAutoProvisioning build() {
            return new DefenderForServersAwsOfferingResponseArcAutoProvisioning(enabled, servicePrincipalSecretMetadata);
        }
    }
}
