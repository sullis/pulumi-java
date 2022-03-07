// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.machinelearningcompute.outputs;

import io.pulumi.azurenative.machinelearningcompute.outputs.ServicePrincipalPropertiesResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class KubernetesClusterPropertiesResponse {
    /**
     * The Azure Service Principal used by Kubernetes
     * 
     */
    private final @Nullable ServicePrincipalPropertiesResponse servicePrincipal;

    @OutputCustomType.Constructor({"servicePrincipal"})
    private KubernetesClusterPropertiesResponse(@Nullable ServicePrincipalPropertiesResponse servicePrincipal) {
        this.servicePrincipal = servicePrincipal;
    }

    /**
     * The Azure Service Principal used by Kubernetes
     * 
    */
    public Optional<ServicePrincipalPropertiesResponse> getServicePrincipal() {
        return Optional.ofNullable(this.servicePrincipal);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(KubernetesClusterPropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable ServicePrincipalPropertiesResponse servicePrincipal;

        public Builder() {
    	      // Empty
        }

        public Builder(KubernetesClusterPropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.servicePrincipal = defaults.servicePrincipal;
        }

        public Builder setServicePrincipal(@Nullable ServicePrincipalPropertiesResponse servicePrincipal) {
            this.servicePrincipal = servicePrincipal;
            return this;
        }
        public KubernetesClusterPropertiesResponse build() {
            return new KubernetesClusterPropertiesResponse(servicePrincipal);
        }
    }
}