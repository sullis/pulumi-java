// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.kubernetesconfiguration.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetFluxConfigurationArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetFluxConfigurationArgs Empty = new GetFluxConfigurationArgs();

    /**
     * The name of the kubernetes cluster.
     * 
     */
    @Import(name="clusterName", required=true)
    private Output<String> clusterName;

    /**
     * @return The name of the kubernetes cluster.
     * 
     */
    public Output<String> clusterName() {
        return this.clusterName;
    }

    /**
     * The Kubernetes cluster resource name - either managedClusters (for AKS clusters) or connectedClusters (for OnPrem K8S clusters).
     * 
     */
    @Import(name="clusterResourceName", required=true)
    private Output<String> clusterResourceName;

    /**
     * @return The Kubernetes cluster resource name - either managedClusters (for AKS clusters) or connectedClusters (for OnPrem K8S clusters).
     * 
     */
    public Output<String> clusterResourceName() {
        return this.clusterResourceName;
    }

    /**
     * The Kubernetes cluster RP - either Microsoft.ContainerService (for AKS clusters) or Microsoft.Kubernetes (for OnPrem K8S clusters).
     * 
     */
    @Import(name="clusterRp", required=true)
    private Output<String> clusterRp;

    /**
     * @return The Kubernetes cluster RP - either Microsoft.ContainerService (for AKS clusters) or Microsoft.Kubernetes (for OnPrem K8S clusters).
     * 
     */
    public Output<String> clusterRp() {
        return this.clusterRp;
    }

    /**
     * Name of the Flux Configuration.
     * 
     */
    @Import(name="fluxConfigurationName", required=true)
    private Output<String> fluxConfigurationName;

    /**
     * @return Name of the Flux Configuration.
     * 
     */
    public Output<String> fluxConfigurationName() {
        return this.fluxConfigurationName;
    }

    /**
     * The name of the resource group. The name is case insensitive.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    /**
     * @return The name of the resource group. The name is case insensitive.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    private GetFluxConfigurationArgs() {}

    private GetFluxConfigurationArgs(GetFluxConfigurationArgs $) {
        this.clusterName = $.clusterName;
        this.clusterResourceName = $.clusterResourceName;
        this.clusterRp = $.clusterRp;
        this.fluxConfigurationName = $.fluxConfigurationName;
        this.resourceGroupName = $.resourceGroupName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetFluxConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetFluxConfigurationArgs $;

        public Builder() {
            $ = new GetFluxConfigurationArgs();
        }

        public Builder(GetFluxConfigurationArgs defaults) {
            $ = new GetFluxConfigurationArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param clusterName The name of the kubernetes cluster.
         * 
         * @return builder
         * 
         */
        public Builder clusterName(Output<String> clusterName) {
            $.clusterName = clusterName;
            return this;
        }

        /**
         * @param clusterName The name of the kubernetes cluster.
         * 
         * @return builder
         * 
         */
        public Builder clusterName(String clusterName) {
            return clusterName(Output.of(clusterName));
        }

        /**
         * @param clusterResourceName The Kubernetes cluster resource name - either managedClusters (for AKS clusters) or connectedClusters (for OnPrem K8S clusters).
         * 
         * @return builder
         * 
         */
        public Builder clusterResourceName(Output<String> clusterResourceName) {
            $.clusterResourceName = clusterResourceName;
            return this;
        }

        /**
         * @param clusterResourceName The Kubernetes cluster resource name - either managedClusters (for AKS clusters) or connectedClusters (for OnPrem K8S clusters).
         * 
         * @return builder
         * 
         */
        public Builder clusterResourceName(String clusterResourceName) {
            return clusterResourceName(Output.of(clusterResourceName));
        }

        /**
         * @param clusterRp The Kubernetes cluster RP - either Microsoft.ContainerService (for AKS clusters) or Microsoft.Kubernetes (for OnPrem K8S clusters).
         * 
         * @return builder
         * 
         */
        public Builder clusterRp(Output<String> clusterRp) {
            $.clusterRp = clusterRp;
            return this;
        }

        /**
         * @param clusterRp The Kubernetes cluster RP - either Microsoft.ContainerService (for AKS clusters) or Microsoft.Kubernetes (for OnPrem K8S clusters).
         * 
         * @return builder
         * 
         */
        public Builder clusterRp(String clusterRp) {
            return clusterRp(Output.of(clusterRp));
        }

        /**
         * @param fluxConfigurationName Name of the Flux Configuration.
         * 
         * @return builder
         * 
         */
        public Builder fluxConfigurationName(Output<String> fluxConfigurationName) {
            $.fluxConfigurationName = fluxConfigurationName;
            return this;
        }

        /**
         * @param fluxConfigurationName Name of the Flux Configuration.
         * 
         * @return builder
         * 
         */
        public Builder fluxConfigurationName(String fluxConfigurationName) {
            return fluxConfigurationName(Output.of(fluxConfigurationName));
        }

        /**
         * @param resourceGroupName The name of the resource group. The name is case insensitive.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName The name of the resource group. The name is case insensitive.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        public GetFluxConfigurationArgs build() {
            $.clusterName = Objects.requireNonNull($.clusterName, "expected parameter 'clusterName' to be non-null");
            $.clusterResourceName = Objects.requireNonNull($.clusterResourceName, "expected parameter 'clusterResourceName' to be non-null");
            $.clusterRp = Objects.requireNonNull($.clusterRp, "expected parameter 'clusterRp' to be non-null");
            $.fluxConfigurationName = Objects.requireNonNull($.fluxConfigurationName, "expected parameter 'fluxConfigurationName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
