// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.lightsail.inputs;

import io.pulumi.awsnative.lightsail.inputs.ContainerEnvironmentVariableArgs;
import io.pulumi.awsnative.lightsail.inputs.ContainerPortInfoArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Describes the settings of a container that will be launched, or that is launched, to an Amazon Lightsail container service.
 * 
 */
public final class ContainerArgs extends io.pulumi.resources.ResourceArgs {

    public static final ContainerArgs Empty = new ContainerArgs();

    /**
     * The launch command for the container.
     * 
     */
    @Import(name="command")
      private final @Nullable Output<List<String>> command;

    public Output<List<String>> command() {
        return this.command == null ? Codegen.empty() : this.command;
    }

    /**
     * The name of the container.
     * 
     */
    @Import(name="containerName")
      private final @Nullable Output<String> containerName;

    public Output<String> containerName() {
        return this.containerName == null ? Codegen.empty() : this.containerName;
    }

    /**
     * The environment variables of the container.
     * 
     */
    @Import(name="environment")
      private final @Nullable Output<List<ContainerEnvironmentVariableArgs>> environment;

    public Output<List<ContainerEnvironmentVariableArgs>> environment() {
        return this.environment == null ? Codegen.empty() : this.environment;
    }

    /**
     * The name of the image used for the container.
     * 
     */
    @Import(name="image")
      private final @Nullable Output<String> image;

    public Output<String> image() {
        return this.image == null ? Codegen.empty() : this.image;
    }

    /**
     * The open firewall ports of the container.
     * 
     */
    @Import(name="ports")
      private final @Nullable Output<List<ContainerPortInfoArgs>> ports;

    public Output<List<ContainerPortInfoArgs>> ports() {
        return this.ports == null ? Codegen.empty() : this.ports;
    }

    public ContainerArgs(
        @Nullable Output<List<String>> command,
        @Nullable Output<String> containerName,
        @Nullable Output<List<ContainerEnvironmentVariableArgs>> environment,
        @Nullable Output<String> image,
        @Nullable Output<List<ContainerPortInfoArgs>> ports) {
        this.command = command;
        this.containerName = containerName;
        this.environment = environment;
        this.image = image;
        this.ports = ports;
    }

    private ContainerArgs() {
        this.command = Codegen.empty();
        this.containerName = Codegen.empty();
        this.environment = Codegen.empty();
        this.image = Codegen.empty();
        this.ports = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ContainerArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<String>> command;
        private @Nullable Output<String> containerName;
        private @Nullable Output<List<ContainerEnvironmentVariableArgs>> environment;
        private @Nullable Output<String> image;
        private @Nullable Output<List<ContainerPortInfoArgs>> ports;

        public Builder() {
    	      // Empty
        }

        public Builder(ContainerArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.command = defaults.command;
    	      this.containerName = defaults.containerName;
    	      this.environment = defaults.environment;
    	      this.image = defaults.image;
    	      this.ports = defaults.ports;
        }

        public Builder command(@Nullable Output<List<String>> command) {
            this.command = command;
            return this;
        }
        public Builder command(@Nullable List<String> command) {
            this.command = Codegen.ofNullable(command);
            return this;
        }
        public Builder command(String... command) {
            return command(List.of(command));
        }
        public Builder containerName(@Nullable Output<String> containerName) {
            this.containerName = containerName;
            return this;
        }
        public Builder containerName(@Nullable String containerName) {
            this.containerName = Codegen.ofNullable(containerName);
            return this;
        }
        public Builder environment(@Nullable Output<List<ContainerEnvironmentVariableArgs>> environment) {
            this.environment = environment;
            return this;
        }
        public Builder environment(@Nullable List<ContainerEnvironmentVariableArgs> environment) {
            this.environment = Codegen.ofNullable(environment);
            return this;
        }
        public Builder environment(ContainerEnvironmentVariableArgs... environment) {
            return environment(List.of(environment));
        }
        public Builder image(@Nullable Output<String> image) {
            this.image = image;
            return this;
        }
        public Builder image(@Nullable String image) {
            this.image = Codegen.ofNullable(image);
            return this;
        }
        public Builder ports(@Nullable Output<List<ContainerPortInfoArgs>> ports) {
            this.ports = ports;
            return this;
        }
        public Builder ports(@Nullable List<ContainerPortInfoArgs> ports) {
            this.ports = Codegen.ofNullable(ports);
            return this;
        }
        public Builder ports(ContainerPortInfoArgs... ports) {
            return ports(List.of(ports));
        }        public ContainerArgs build() {
            return new ContainerArgs(command, containerName, environment, image, ports);
        }
    }
}
