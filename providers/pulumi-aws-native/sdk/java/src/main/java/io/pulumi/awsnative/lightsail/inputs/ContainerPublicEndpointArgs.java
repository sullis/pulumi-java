// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.lightsail.inputs;

import io.pulumi.awsnative.lightsail.inputs.ContainerHealthCheckConfigArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Describes the settings of a public endpoint for an Amazon Lightsail container service.
 * 
 */
public final class ContainerPublicEndpointArgs extends io.pulumi.resources.ResourceArgs {

    public static final ContainerPublicEndpointArgs Empty = new ContainerPublicEndpointArgs();

    /**
     * The name of the container for the endpoint.
     * 
     */
    @InputImport(name="containerName")
    private final @Nullable Input<String> containerName;

    public Input<String> getContainerName() {
        return this.containerName == null ? Input.empty() : this.containerName;
    }

    /**
     * The port of the container to which traffic is forwarded to.
     * 
     */
    @InputImport(name="containerPort")
    private final @Nullable Input<Integer> containerPort;

    public Input<Integer> getContainerPort() {
        return this.containerPort == null ? Input.empty() : this.containerPort;
    }

    /**
     * An object that describes the health check configuration of the container.
     * 
     */
    @InputImport(name="healthCheckConfig")
    private final @Nullable Input<ContainerHealthCheckConfigArgs> healthCheckConfig;

    public Input<ContainerHealthCheckConfigArgs> getHealthCheckConfig() {
        return this.healthCheckConfig == null ? Input.empty() : this.healthCheckConfig;
    }

    public ContainerPublicEndpointArgs(
        @Nullable Input<String> containerName,
        @Nullable Input<Integer> containerPort,
        @Nullable Input<ContainerHealthCheckConfigArgs> healthCheckConfig) {
        this.containerName = containerName;
        this.containerPort = containerPort;
        this.healthCheckConfig = healthCheckConfig;
    }

    private ContainerPublicEndpointArgs() {
        this.containerName = Input.empty();
        this.containerPort = Input.empty();
        this.healthCheckConfig = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ContainerPublicEndpointArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> containerName;
        private @Nullable Input<Integer> containerPort;
        private @Nullable Input<ContainerHealthCheckConfigArgs> healthCheckConfig;

        public Builder() {
    	      // Empty
        }

        public Builder(ContainerPublicEndpointArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.containerName = defaults.containerName;
    	      this.containerPort = defaults.containerPort;
    	      this.healthCheckConfig = defaults.healthCheckConfig;
        }

        public Builder setContainerName(@Nullable Input<String> containerName) {
            this.containerName = containerName;
            return this;
        }

        public Builder setContainerName(@Nullable String containerName) {
            this.containerName = Input.ofNullable(containerName);
            return this;
        }

        public Builder setContainerPort(@Nullable Input<Integer> containerPort) {
            this.containerPort = containerPort;
            return this;
        }

        public Builder setContainerPort(@Nullable Integer containerPort) {
            this.containerPort = Input.ofNullable(containerPort);
            return this;
        }

        public Builder setHealthCheckConfig(@Nullable Input<ContainerHealthCheckConfigArgs> healthCheckConfig) {
            this.healthCheckConfig = healthCheckConfig;
            return this;
        }

        public Builder setHealthCheckConfig(@Nullable ContainerHealthCheckConfigArgs healthCheckConfig) {
            this.healthCheckConfig = Input.ofNullable(healthCheckConfig);
            return this;
        }

        public ContainerPublicEndpointArgs build() {
            return new ContainerPublicEndpointArgs(containerName, containerPort, healthCheckConfig);
        }
    }
}
