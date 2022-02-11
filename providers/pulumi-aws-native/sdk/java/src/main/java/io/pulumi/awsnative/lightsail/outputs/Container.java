// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.lightsail.outputs;

import io.pulumi.awsnative.lightsail.outputs.ContainerEnvironmentVariable;
import io.pulumi.awsnative.lightsail.outputs.ContainerPortInfo;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class Container {
    private final @Nullable List<String> command;
    private final @Nullable String containerName;
    private final @Nullable List<ContainerEnvironmentVariable> environment;
    private final @Nullable String image;
    private final @Nullable List<ContainerPortInfo> ports;

    @OutputCustomType.Constructor({"command","containerName","environment","image","ports"})
    private Container(
        @Nullable List<String> command,
        @Nullable String containerName,
        @Nullable List<ContainerEnvironmentVariable> environment,
        @Nullable String image,
        @Nullable List<ContainerPortInfo> ports) {
        this.command = command;
        this.containerName = containerName;
        this.environment = environment;
        this.image = image;
        this.ports = ports;
    }

    public List<String> getCommand() {
        return this.command == null ? List.of() : this.command;
    }
    public Optional<String> getContainerName() {
        return Optional.ofNullable(this.containerName);
    }
    public List<ContainerEnvironmentVariable> getEnvironment() {
        return this.environment == null ? List.of() : this.environment;
    }
    public Optional<String> getImage() {
        return Optional.ofNullable(this.image);
    }
    public List<ContainerPortInfo> getPorts() {
        return this.ports == null ? List.of() : this.ports;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(Container defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<String> command;
        private @Nullable String containerName;
        private @Nullable List<ContainerEnvironmentVariable> environment;
        private @Nullable String image;
        private @Nullable List<ContainerPortInfo> ports;

        public Builder() {
    	      // Empty
        }

        public Builder(Container defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.command = defaults.command;
    	      this.containerName = defaults.containerName;
    	      this.environment = defaults.environment;
    	      this.image = defaults.image;
    	      this.ports = defaults.ports;
        }

        public Builder setCommand(@Nullable List<String> command) {
            this.command = command;
            return this;
        }

        public Builder setContainerName(@Nullable String containerName) {
            this.containerName = containerName;
            return this;
        }

        public Builder setEnvironment(@Nullable List<ContainerEnvironmentVariable> environment) {
            this.environment = environment;
            return this;
        }

        public Builder setImage(@Nullable String image) {
            this.image = image;
            return this;
        }

        public Builder setPorts(@Nullable List<ContainerPortInfo> ports) {
            this.ports = ports;
            return this;
        }

        public Container build() {
            return new Container(command, containerName, environment, image, ports);
        }
    }
}
