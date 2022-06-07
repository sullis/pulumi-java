// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.kubernetesconfiguration.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetSourceControlConfigurationArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetSourceControlConfigurationArgs Empty = new GetSourceControlConfigurationArgs();

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
     * The name of the resource group.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    /**
     * @return The name of the resource group.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * Name of the Source Control Configuration.
     * 
     */
    @Import(name="sourceControlConfigurationName", required=true)
    private Output<String> sourceControlConfigurationName;

    /**
     * @return Name of the Source Control Configuration.
     * 
     */
    public Output<String> sourceControlConfigurationName() {
        return this.sourceControlConfigurationName;
    }

    private GetSourceControlConfigurationArgs() {}

    private GetSourceControlConfigurationArgs(GetSourceControlConfigurationArgs $) {
        this.clusterName = $.clusterName;
        this.clusterResourceName = $.clusterResourceName;
        this.clusterRp = $.clusterRp;
        this.resourceGroupName = $.resourceGroupName;
        this.sourceControlConfigurationName = $.sourceControlConfigurationName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetSourceControlConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetSourceControlConfigurationArgs $;

        public Builder() {
            $ = new GetSourceControlConfigurationArgs();
        }

        public Builder(GetSourceControlConfigurationArgs defaults) {
            $ = new GetSourceControlConfigurationArgs(Objects.requireNonNull(defaults));
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
         * @param resourceGroupName The name of the resource group.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName The name of the resource group.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        /**
         * @param sourceControlConfigurationName Name of the Source Control Configuration.
         * 
         * @return builder
         * 
         */
        public Builder sourceControlConfigurationName(Output<String> sourceControlConfigurationName) {
            $.sourceControlConfigurationName = sourceControlConfigurationName;
            return this;
        }

        /**
         * @param sourceControlConfigurationName Name of the Source Control Configuration.
         * 
         * @return builder
         * 
         */
        public Builder sourceControlConfigurationName(String sourceControlConfigurationName) {
            return sourceControlConfigurationName(Output.of(sourceControlConfigurationName));
        }

        public GetSourceControlConfigurationArgs build() {
            $.clusterName = Objects.requireNonNull($.clusterName, "expected parameter 'clusterName' to be non-null");
            $.clusterResourceName = Objects.requireNonNull($.clusterResourceName, "expected parameter 'clusterResourceName' to be non-null");
            $.clusterRp = Objects.requireNonNull($.clusterRp, "expected parameter 'clusterRp' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.sourceControlConfigurationName = Objects.requireNonNull($.sourceControlConfigurationName, "expected parameter 'sourceControlConfigurationName' to be non-null");
            return $;
        }
    }

}
