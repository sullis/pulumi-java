// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.lightsail.inputs;

import com.pulumi.awsnative.lightsail.inputs.Container;
import com.pulumi.awsnative.lightsail.inputs.ContainerPublicEndpoint;
import com.pulumi.core.annotations.Import;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Describes a container deployment configuration of an Amazon Lightsail container service.
 * 
 */
public final class ContainerServiceDeployment extends com.pulumi.resources.InvokeArgs {

    public static final ContainerServiceDeployment Empty = new ContainerServiceDeployment();

    /**
     * An object that describes the configuration for the containers of the deployment.
     * 
     */
    @Import(name="containers")
    private @Nullable List<Container> containers;

    /**
     * @return An object that describes the configuration for the containers of the deployment.
     * 
     */
    public Optional<List<Container>> containers() {
        return Optional.ofNullable(this.containers);
    }

    /**
     * An object that describes the endpoint of the deployment.
     * 
     */
    @Import(name="publicEndpoint")
    private @Nullable ContainerPublicEndpoint publicEndpoint;

    /**
     * @return An object that describes the endpoint of the deployment.
     * 
     */
    public Optional<ContainerPublicEndpoint> publicEndpoint() {
        return Optional.ofNullable(this.publicEndpoint);
    }

    private ContainerServiceDeployment() {}

    private ContainerServiceDeployment(ContainerServiceDeployment $) {
        this.containers = $.containers;
        this.publicEndpoint = $.publicEndpoint;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ContainerServiceDeployment defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ContainerServiceDeployment $;

        public Builder() {
            $ = new ContainerServiceDeployment();
        }

        public Builder(ContainerServiceDeployment defaults) {
            $ = new ContainerServiceDeployment(Objects.requireNonNull(defaults));
        }

        /**
         * @param containers An object that describes the configuration for the containers of the deployment.
         * 
         * @return builder
         * 
         */
        public Builder containers(@Nullable List<Container> containers) {
            $.containers = containers;
            return this;
        }

        /**
         * @param containers An object that describes the configuration for the containers of the deployment.
         * 
         * @return builder
         * 
         */
        public Builder containers(Container... containers) {
            return containers(List.of(containers));
        }

        /**
         * @param publicEndpoint An object that describes the endpoint of the deployment.
         * 
         * @return builder
         * 
         */
        public Builder publicEndpoint(@Nullable ContainerPublicEndpoint publicEndpoint) {
            $.publicEndpoint = publicEndpoint;
            return this;
        }

        public ContainerServiceDeployment build() {
            return $;
        }
    }

}
