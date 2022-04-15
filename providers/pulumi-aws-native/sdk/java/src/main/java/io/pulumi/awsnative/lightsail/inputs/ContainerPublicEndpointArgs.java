// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.lightsail.inputs;

import io.pulumi.awsnative.lightsail.inputs.ContainerHealthCheckConfigArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
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
    @Import(name="containerName")
      private final @Nullable Output<String> containerName;

    public Output<String> containerName() {
        return this.containerName == null ? Codegen.empty() : this.containerName;
    }

    /**
     * The port of the container to which traffic is forwarded to.
     * 
     */
    @Import(name="containerPort")
      private final @Nullable Output<Integer> containerPort;

    public Output<Integer> containerPort() {
        return this.containerPort == null ? Codegen.empty() : this.containerPort;
    }

    /**
     * An object that describes the health check configuration of the container.
     * 
     */
    @Import(name="healthCheckConfig")
      private final @Nullable Output<ContainerHealthCheckConfigArgs> healthCheckConfig;

    public Output<ContainerHealthCheckConfigArgs> healthCheckConfig() {
        return this.healthCheckConfig == null ? Codegen.empty() : this.healthCheckConfig;
    }

    public ContainerPublicEndpointArgs(
        @Nullable Output<String> containerName,
        @Nullable Output<Integer> containerPort,
        @Nullable Output<ContainerHealthCheckConfigArgs> healthCheckConfig) {
        this.containerName = containerName;
        this.containerPort = containerPort;
        this.healthCheckConfig = healthCheckConfig;
    }

    private ContainerPublicEndpointArgs() {
        this.containerName = Codegen.empty();
        this.containerPort = Codegen.empty();
        this.healthCheckConfig = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ContainerPublicEndpointArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> containerName;
        private @Nullable Output<Integer> containerPort;
        private @Nullable Output<ContainerHealthCheckConfigArgs> healthCheckConfig;

        public Builder() {
    	      // Empty
        }

        public Builder(ContainerPublicEndpointArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.containerName = defaults.containerName;
    	      this.containerPort = defaults.containerPort;
    	      this.healthCheckConfig = defaults.healthCheckConfig;
        }

        public Builder containerName(@Nullable Output<String> containerName) {
            this.containerName = containerName;
            return this;
        }
        public Builder containerName(@Nullable String containerName) {
            this.containerName = Codegen.ofNullable(containerName);
            return this;
        }
        public Builder containerPort(@Nullable Output<Integer> containerPort) {
            this.containerPort = containerPort;
            return this;
        }
        public Builder containerPort(@Nullable Integer containerPort) {
            this.containerPort = Codegen.ofNullable(containerPort);
            return this;
        }
        public Builder healthCheckConfig(@Nullable Output<ContainerHealthCheckConfigArgs> healthCheckConfig) {
            this.healthCheckConfig = healthCheckConfig;
            return this;
        }
        public Builder healthCheckConfig(@Nullable ContainerHealthCheckConfigArgs healthCheckConfig) {
            this.healthCheckConfig = Codegen.ofNullable(healthCheckConfig);
            return this;
        }        public ContainerPublicEndpointArgs build() {
            return new ContainerPublicEndpointArgs(containerName, containerPort, healthCheckConfig);
        }
    }
}
