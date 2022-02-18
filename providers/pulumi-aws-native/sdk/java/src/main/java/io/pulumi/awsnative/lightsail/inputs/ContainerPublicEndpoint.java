// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.lightsail.inputs;

import io.pulumi.awsnative.lightsail.inputs.ContainerHealthCheckConfig;
import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Describes the settings of a public endpoint for an Amazon Lightsail container service.
 * 
 */
public final class ContainerPublicEndpoint extends io.pulumi.resources.InvokeArgs {

    public static final ContainerPublicEndpoint Empty = new ContainerPublicEndpoint();

    /**
     * The name of the container for the endpoint.
     * 
     */
    @InputImport(name="containerName")
    private final @Nullable String containerName;

    public Optional<String> getContainerName() {
        return this.containerName == null ? Optional.empty() : Optional.ofNullable(this.containerName);
    }

    /**
     * The port of the container to which traffic is forwarded to.
     * 
     */
    @InputImport(name="containerPort")
    private final @Nullable Integer containerPort;

    public Optional<Integer> getContainerPort() {
        return this.containerPort == null ? Optional.empty() : Optional.ofNullable(this.containerPort);
    }

    /**
     * An object that describes the health check configuration of the container.
     * 
     */
    @InputImport(name="healthCheckConfig")
    private final @Nullable ContainerHealthCheckConfig healthCheckConfig;

    public Optional<ContainerHealthCheckConfig> getHealthCheckConfig() {
        return this.healthCheckConfig == null ? Optional.empty() : Optional.ofNullable(this.healthCheckConfig);
    }

    public ContainerPublicEndpoint(
        @Nullable String containerName,
        @Nullable Integer containerPort,
        @Nullable ContainerHealthCheckConfig healthCheckConfig) {
        this.containerName = containerName;
        this.containerPort = containerPort;
        this.healthCheckConfig = healthCheckConfig;
    }

    private ContainerPublicEndpoint() {
        this.containerName = null;
        this.containerPort = null;
        this.healthCheckConfig = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ContainerPublicEndpoint defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String containerName;
        private @Nullable Integer containerPort;
        private @Nullable ContainerHealthCheckConfig healthCheckConfig;

        public Builder() {
    	      // Empty
        }

        public Builder(ContainerPublicEndpoint defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.containerName = defaults.containerName;
    	      this.containerPort = defaults.containerPort;
    	      this.healthCheckConfig = defaults.healthCheckConfig;
        }

        public Builder setContainerName(@Nullable String containerName) {
            this.containerName = containerName;
            return this;
        }

        public Builder setContainerPort(@Nullable Integer containerPort) {
            this.containerPort = containerPort;
            return this;
        }

        public Builder setHealthCheckConfig(@Nullable ContainerHealthCheckConfig healthCheckConfig) {
            this.healthCheckConfig = healthCheckConfig;
            return this;
        }

        public ContainerPublicEndpoint build() {
            return new ContainerPublicEndpoint(containerName, containerPort, healthCheckConfig);
        }
    }
}
