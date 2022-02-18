// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.ecs.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ServiceRegistryArgs extends io.pulumi.resources.ResourceArgs {

    public static final ServiceRegistryArgs Empty = new ServiceRegistryArgs();

    @InputImport(name="containerName")
    private final @Nullable Input<String> containerName;

    public Input<String> getContainerName() {
        return this.containerName == null ? Input.empty() : this.containerName;
    }

    @InputImport(name="containerPort")
    private final @Nullable Input<Integer> containerPort;

    public Input<Integer> getContainerPort() {
        return this.containerPort == null ? Input.empty() : this.containerPort;
    }

    @InputImport(name="port")
    private final @Nullable Input<Integer> port;

    public Input<Integer> getPort() {
        return this.port == null ? Input.empty() : this.port;
    }

    @InputImport(name="registryArn")
    private final @Nullable Input<String> registryArn;

    public Input<String> getRegistryArn() {
        return this.registryArn == null ? Input.empty() : this.registryArn;
    }

    public ServiceRegistryArgs(
        @Nullable Input<String> containerName,
        @Nullable Input<Integer> containerPort,
        @Nullable Input<Integer> port,
        @Nullable Input<String> registryArn) {
        this.containerName = containerName;
        this.containerPort = containerPort;
        this.port = port;
        this.registryArn = registryArn;
    }

    private ServiceRegistryArgs() {
        this.containerName = Input.empty();
        this.containerPort = Input.empty();
        this.port = Input.empty();
        this.registryArn = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceRegistryArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> containerName;
        private @Nullable Input<Integer> containerPort;
        private @Nullable Input<Integer> port;
        private @Nullable Input<String> registryArn;

        public Builder() {
    	      // Empty
        }

        public Builder(ServiceRegistryArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.containerName = defaults.containerName;
    	      this.containerPort = defaults.containerPort;
    	      this.port = defaults.port;
    	      this.registryArn = defaults.registryArn;
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

        public Builder setPort(@Nullable Input<Integer> port) {
            this.port = port;
            return this;
        }

        public Builder setPort(@Nullable Integer port) {
            this.port = Input.ofNullable(port);
            return this;
        }

        public Builder setRegistryArn(@Nullable Input<String> registryArn) {
            this.registryArn = registryArn;
            return this;
        }

        public Builder setRegistryArn(@Nullable String registryArn) {
            this.registryArn = Input.ofNullable(registryArn);
            return this;
        }

        public ServiceRegistryArgs build() {
            return new ServiceRegistryArgs(containerName, containerPort, port, registryArn);
        }
    }
}
