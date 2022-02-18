// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.ecs.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class TaskDefinitionPortMappingArgs extends io.pulumi.resources.ResourceArgs {

    public static final TaskDefinitionPortMappingArgs Empty = new TaskDefinitionPortMappingArgs();

    @InputImport(name="containerPort")
    private final @Nullable Input<Integer> containerPort;

    public Input<Integer> getContainerPort() {
        return this.containerPort == null ? Input.empty() : this.containerPort;
    }

    @InputImport(name="hostPort")
    private final @Nullable Input<Integer> hostPort;

    public Input<Integer> getHostPort() {
        return this.hostPort == null ? Input.empty() : this.hostPort;
    }

    @InputImport(name="protocol")
    private final @Nullable Input<String> protocol;

    public Input<String> getProtocol() {
        return this.protocol == null ? Input.empty() : this.protocol;
    }

    public TaskDefinitionPortMappingArgs(
        @Nullable Input<Integer> containerPort,
        @Nullable Input<Integer> hostPort,
        @Nullable Input<String> protocol) {
        this.containerPort = containerPort;
        this.hostPort = hostPort;
        this.protocol = protocol;
    }

    private TaskDefinitionPortMappingArgs() {
        this.containerPort = Input.empty();
        this.hostPort = Input.empty();
        this.protocol = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TaskDefinitionPortMappingArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Integer> containerPort;
        private @Nullable Input<Integer> hostPort;
        private @Nullable Input<String> protocol;

        public Builder() {
    	      // Empty
        }

        public Builder(TaskDefinitionPortMappingArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.containerPort = defaults.containerPort;
    	      this.hostPort = defaults.hostPort;
    	      this.protocol = defaults.protocol;
        }

        public Builder setContainerPort(@Nullable Input<Integer> containerPort) {
            this.containerPort = containerPort;
            return this;
        }

        public Builder setContainerPort(@Nullable Integer containerPort) {
            this.containerPort = Input.ofNullable(containerPort);
            return this;
        }

        public Builder setHostPort(@Nullable Input<Integer> hostPort) {
            this.hostPort = hostPort;
            return this;
        }

        public Builder setHostPort(@Nullable Integer hostPort) {
            this.hostPort = Input.ofNullable(hostPort);
            return this;
        }

        public Builder setProtocol(@Nullable Input<String> protocol) {
            this.protocol = protocol;
            return this;
        }

        public Builder setProtocol(@Nullable String protocol) {
            this.protocol = Input.ofNullable(protocol);
            return this;
        }

        public TaskDefinitionPortMappingArgs build() {
            return new TaskDefinitionPortMappingArgs(containerPort, hostPort, protocol);
        }
    }
}
