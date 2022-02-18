// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.containerservice.inputs;

import io.pulumi.azurenative.containerservice.inputs.OpenShiftManagedClusterIdentityProviderArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Defines all possible authentication profiles for the OpenShift cluster.
 * 
 */
public final class OpenShiftManagedClusterAuthProfileArgs extends io.pulumi.resources.ResourceArgs {

    public static final OpenShiftManagedClusterAuthProfileArgs Empty = new OpenShiftManagedClusterAuthProfileArgs();

    /**
     * Type of authentication profile to use.
     * 
     */
    @InputImport(name="identityProviders")
    private final @Nullable Input<List<OpenShiftManagedClusterIdentityProviderArgs>> identityProviders;

    public Input<List<OpenShiftManagedClusterIdentityProviderArgs>> getIdentityProviders() {
        return this.identityProviders == null ? Input.empty() : this.identityProviders;
    }

    public OpenShiftManagedClusterAuthProfileArgs(@Nullable Input<List<OpenShiftManagedClusterIdentityProviderArgs>> identityProviders) {
        this.identityProviders = identityProviders;
    }

    private OpenShiftManagedClusterAuthProfileArgs() {
        this.identityProviders = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OpenShiftManagedClusterAuthProfileArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<OpenShiftManagedClusterIdentityProviderArgs>> identityProviders;

        public Builder() {
    	      // Empty
        }

        public Builder(OpenShiftManagedClusterAuthProfileArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.identityProviders = defaults.identityProviders;
        }

        public Builder setIdentityProviders(@Nullable Input<List<OpenShiftManagedClusterIdentityProviderArgs>> identityProviders) {
            this.identityProviders = identityProviders;
            return this;
        }

        public Builder setIdentityProviders(@Nullable List<OpenShiftManagedClusterIdentityProviderArgs> identityProviders) {
            this.identityProviders = Input.ofNullable(identityProviders);
            return this;
        }

        public OpenShiftManagedClusterAuthProfileArgs build() {
            return new OpenShiftManagedClusterAuthProfileArgs(identityProviders);
        }
    }
}
