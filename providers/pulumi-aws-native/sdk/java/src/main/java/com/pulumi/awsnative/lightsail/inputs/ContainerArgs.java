// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.lightsail.inputs;

import com.pulumi.awsnative.lightsail.inputs.ContainerEnvironmentVariableArgs;
import com.pulumi.awsnative.lightsail.inputs.ContainerPortInfoArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Describes the settings of a container that will be launched, or that is launched, to an Amazon Lightsail container service.
 * 
 */
public final class ContainerArgs extends com.pulumi.resources.ResourceArgs {

    public static final ContainerArgs Empty = new ContainerArgs();

    /**
     * The launch command for the container.
     * 
     */
    @Import(name="command")
    private @Nullable Output<List<String>> command;

    /**
     * @return The launch command for the container.
     * 
     */
    public Optional<Output<List<String>>> command() {
        return Optional.ofNullable(this.command);
    }

    /**
     * The name of the container.
     * 
     */
    @Import(name="containerName")
    private @Nullable Output<String> containerName;

    /**
     * @return The name of the container.
     * 
     */
    public Optional<Output<String>> containerName() {
        return Optional.ofNullable(this.containerName);
    }

    /**
     * The environment variables of the container.
     * 
     */
    @Import(name="environment")
    private @Nullable Output<List<ContainerEnvironmentVariableArgs>> environment;

    /**
     * @return The environment variables of the container.
     * 
     */
    public Optional<Output<List<ContainerEnvironmentVariableArgs>>> environment() {
        return Optional.ofNullable(this.environment);
    }

    /**
     * The name of the image used for the container.
     * 
     */
    @Import(name="image")
    private @Nullable Output<String> image;

    /**
     * @return The name of the image used for the container.
     * 
     */
    public Optional<Output<String>> image() {
        return Optional.ofNullable(this.image);
    }

    /**
     * The open firewall ports of the container.
     * 
     */
    @Import(name="ports")
    private @Nullable Output<List<ContainerPortInfoArgs>> ports;

    /**
     * @return The open firewall ports of the container.
     * 
     */
    public Optional<Output<List<ContainerPortInfoArgs>>> ports() {
        return Optional.ofNullable(this.ports);
    }

    private ContainerArgs() {}

    private ContainerArgs(ContainerArgs $) {
        this.command = $.command;
        this.containerName = $.containerName;
        this.environment = $.environment;
        this.image = $.image;
        this.ports = $.ports;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ContainerArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ContainerArgs $;

        public Builder() {
            $ = new ContainerArgs();
        }

        public Builder(ContainerArgs defaults) {
            $ = new ContainerArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param command The launch command for the container.
         * 
         * @return builder
         * 
         */
        public Builder command(@Nullable Output<List<String>> command) {
            $.command = command;
            return this;
        }

        /**
         * @param command The launch command for the container.
         * 
         * @return builder
         * 
         */
        public Builder command(List<String> command) {
            return command(Output.of(command));
        }

        /**
         * @param command The launch command for the container.
         * 
         * @return builder
         * 
         */
        public Builder command(String... command) {
            return command(List.of(command));
        }

        /**
         * @param containerName The name of the container.
         * 
         * @return builder
         * 
         */
        public Builder containerName(@Nullable Output<String> containerName) {
            $.containerName = containerName;
            return this;
        }

        /**
         * @param containerName The name of the container.
         * 
         * @return builder
         * 
         */
        public Builder containerName(String containerName) {
            return containerName(Output.of(containerName));
        }

        /**
         * @param environment The environment variables of the container.
         * 
         * @return builder
         * 
         */
        public Builder environment(@Nullable Output<List<ContainerEnvironmentVariableArgs>> environment) {
            $.environment = environment;
            return this;
        }

        /**
         * @param environment The environment variables of the container.
         * 
         * @return builder
         * 
         */
        public Builder environment(List<ContainerEnvironmentVariableArgs> environment) {
            return environment(Output.of(environment));
        }

        /**
         * @param environment The environment variables of the container.
         * 
         * @return builder
         * 
         */
        public Builder environment(ContainerEnvironmentVariableArgs... environment) {
            return environment(List.of(environment));
        }

        /**
         * @param image The name of the image used for the container.
         * 
         * @return builder
         * 
         */
        public Builder image(@Nullable Output<String> image) {
            $.image = image;
            return this;
        }

        /**
         * @param image The name of the image used for the container.
         * 
         * @return builder
         * 
         */
        public Builder image(String image) {
            return image(Output.of(image));
        }

        /**
         * @param ports The open firewall ports of the container.
         * 
         * @return builder
         * 
         */
        public Builder ports(@Nullable Output<List<ContainerPortInfoArgs>> ports) {
            $.ports = ports;
            return this;
        }

        /**
         * @param ports The open firewall ports of the container.
         * 
         * @return builder
         * 
         */
        public Builder ports(List<ContainerPortInfoArgs> ports) {
            return ports(Output.of(ports));
        }

        /**
         * @param ports The open firewall ports of the container.
         * 
         * @return builder
         * 
         */
        public Builder ports(ContainerPortInfoArgs... ports) {
            return ports(List.of(ports));
        }

        public ContainerArgs build() {
            return $;
        }
    }

}
