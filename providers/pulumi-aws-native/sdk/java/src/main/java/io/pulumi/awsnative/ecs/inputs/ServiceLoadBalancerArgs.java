// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.ecs.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ServiceLoadBalancerArgs extends io.pulumi.resources.ResourceArgs {

    public static final ServiceLoadBalancerArgs Empty = new ServiceLoadBalancerArgs();

    @Import(name="containerName")
      private final @Nullable Output<String> containerName;

    public Output<String> getContainerName() {
        return this.containerName == null ? Output.empty() : this.containerName;
    }

    @Import(name="containerPort")
      private final @Nullable Output<Integer> containerPort;

    public Output<Integer> getContainerPort() {
        return this.containerPort == null ? Output.empty() : this.containerPort;
    }

    @Import(name="loadBalancerName")
      private final @Nullable Output<String> loadBalancerName;

    public Output<String> getLoadBalancerName() {
        return this.loadBalancerName == null ? Output.empty() : this.loadBalancerName;
    }

    @Import(name="targetGroupArn")
      private final @Nullable Output<String> targetGroupArn;

    public Output<String> getTargetGroupArn() {
        return this.targetGroupArn == null ? Output.empty() : this.targetGroupArn;
    }

    public ServiceLoadBalancerArgs(
        @Nullable Output<String> containerName,
        @Nullable Output<Integer> containerPort,
        @Nullable Output<String> loadBalancerName,
        @Nullable Output<String> targetGroupArn) {
        this.containerName = containerName;
        this.containerPort = containerPort;
        this.loadBalancerName = loadBalancerName;
        this.targetGroupArn = targetGroupArn;
    }

    private ServiceLoadBalancerArgs() {
        this.containerName = Output.empty();
        this.containerPort = Output.empty();
        this.loadBalancerName = Output.empty();
        this.targetGroupArn = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceLoadBalancerArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> containerName;
        private @Nullable Output<Integer> containerPort;
        private @Nullable Output<String> loadBalancerName;
        private @Nullable Output<String> targetGroupArn;

        public Builder() {
    	      // Empty
        }

        public Builder(ServiceLoadBalancerArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.containerName = defaults.containerName;
    	      this.containerPort = defaults.containerPort;
    	      this.loadBalancerName = defaults.loadBalancerName;
    	      this.targetGroupArn = defaults.targetGroupArn;
        }

        public Builder containerName(@Nullable Output<String> containerName) {
            this.containerName = containerName;
            return this;
        }
        public Builder containerName(@Nullable String containerName) {
            this.containerName = Output.ofNullable(containerName);
            return this;
        }
        public Builder containerPort(@Nullable Output<Integer> containerPort) {
            this.containerPort = containerPort;
            return this;
        }
        public Builder containerPort(@Nullable Integer containerPort) {
            this.containerPort = Output.ofNullable(containerPort);
            return this;
        }
        public Builder loadBalancerName(@Nullable Output<String> loadBalancerName) {
            this.loadBalancerName = loadBalancerName;
            return this;
        }
        public Builder loadBalancerName(@Nullable String loadBalancerName) {
            this.loadBalancerName = Output.ofNullable(loadBalancerName);
            return this;
        }
        public Builder targetGroupArn(@Nullable Output<String> targetGroupArn) {
            this.targetGroupArn = targetGroupArn;
            return this;
        }
        public Builder targetGroupArn(@Nullable String targetGroupArn) {
            this.targetGroupArn = Output.ofNullable(targetGroupArn);
            return this;
        }        public ServiceLoadBalancerArgs build() {
            return new ServiceLoadBalancerArgs(containerName, containerPort, loadBalancerName, targetGroupArn);
        }
    }
}
