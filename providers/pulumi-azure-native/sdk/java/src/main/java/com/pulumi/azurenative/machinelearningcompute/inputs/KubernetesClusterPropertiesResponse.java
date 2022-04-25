// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.machinelearningcompute.inputs;

import com.pulumi.azurenative.machinelearningcompute.inputs.ServicePrincipalPropertiesResponse;
import com.pulumi.core.annotations.Import;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Kubernetes cluster specific properties
 * 
 */
public final class KubernetesClusterPropertiesResponse extends com.pulumi.resources.InvokeArgs {

    public static final KubernetesClusterPropertiesResponse Empty = new KubernetesClusterPropertiesResponse();

    /**
     * The Azure Service Principal used by Kubernetes
     * 
     */
    @Import(name="servicePrincipal")
    private @Nullable ServicePrincipalPropertiesResponse servicePrincipal;

    /**
     * @return The Azure Service Principal used by Kubernetes
     * 
     */
    public Optional<ServicePrincipalPropertiesResponse> servicePrincipal() {
        return Optional.ofNullable(this.servicePrincipal);
    }

    private KubernetesClusterPropertiesResponse() {}

    private KubernetesClusterPropertiesResponse(KubernetesClusterPropertiesResponse $) {
        this.servicePrincipal = $.servicePrincipal;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(KubernetesClusterPropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private KubernetesClusterPropertiesResponse $;

        public Builder() {
            $ = new KubernetesClusterPropertiesResponse();
        }

        public Builder(KubernetesClusterPropertiesResponse defaults) {
            $ = new KubernetesClusterPropertiesResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param servicePrincipal The Azure Service Principal used by Kubernetes
         * 
         * @return builder
         * 
         */
        public Builder servicePrincipal(@Nullable ServicePrincipalPropertiesResponse servicePrincipal) {
            $.servicePrincipal = servicePrincipal;
            return this;
        }

        public KubernetesClusterPropertiesResponse build() {
            return $;
        }
    }

}
