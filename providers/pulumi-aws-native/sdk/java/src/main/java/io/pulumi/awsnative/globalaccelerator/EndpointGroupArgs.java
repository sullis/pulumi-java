// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.globalaccelerator;

import io.pulumi.awsnative.globalaccelerator.enums.EndpointGroupHealthCheckProtocol;
import io.pulumi.awsnative.globalaccelerator.inputs.EndpointGroupEndpointConfigurationArgs;
import io.pulumi.awsnative.globalaccelerator.inputs.EndpointGroupPortOverrideArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class EndpointGroupArgs extends io.pulumi.resources.ResourceArgs {

    public static final EndpointGroupArgs Empty = new EndpointGroupArgs();

    /**
     * The list of endpoint objects.
     * 
     */
    @InputImport(name="endpointConfigurations")
      private final @Nullable Input<List<EndpointGroupEndpointConfigurationArgs>> endpointConfigurations;

    public Input<List<EndpointGroupEndpointConfigurationArgs>> getEndpointConfigurations() {
        return this.endpointConfigurations == null ? Input.empty() : this.endpointConfigurations;
    }

    /**
     * The name of the AWS Region where the endpoint group is located
     * 
     */
    @InputImport(name="endpointGroupRegion", required=true)
      private final Input<String> endpointGroupRegion;

    public Input<String> getEndpointGroupRegion() {
        return this.endpointGroupRegion;
    }

    /**
     * The time in seconds between each health check for an endpoint. Must be a value of 10 or 30
     * 
     */
    @InputImport(name="healthCheckIntervalSeconds")
      private final @Nullable Input<Integer> healthCheckIntervalSeconds;

    public Input<Integer> getHealthCheckIntervalSeconds() {
        return this.healthCheckIntervalSeconds == null ? Input.empty() : this.healthCheckIntervalSeconds;
    }

    @InputImport(name="healthCheckPath")
      private final @Nullable Input<String> healthCheckPath;

    public Input<String> getHealthCheckPath() {
        return this.healthCheckPath == null ? Input.empty() : this.healthCheckPath;
    }

    /**
     * The port that AWS Global Accelerator uses to check the health of endpoints in this endpoint group.
     * 
     */
    @InputImport(name="healthCheckPort")
      private final @Nullable Input<Integer> healthCheckPort;

    public Input<Integer> getHealthCheckPort() {
        return this.healthCheckPort == null ? Input.empty() : this.healthCheckPort;
    }

    /**
     * The protocol that AWS Global Accelerator uses to check the health of endpoints in this endpoint group.
     * 
     */
    @InputImport(name="healthCheckProtocol")
      private final @Nullable Input<EndpointGroupHealthCheckProtocol> healthCheckProtocol;

    public Input<EndpointGroupHealthCheckProtocol> getHealthCheckProtocol() {
        return this.healthCheckProtocol == null ? Input.empty() : this.healthCheckProtocol;
    }

    /**
     * The Amazon Resource Name (ARN) of the listener
     * 
     */
    @InputImport(name="listenerArn", required=true)
      private final Input<String> listenerArn;

    public Input<String> getListenerArn() {
        return this.listenerArn;
    }

    @InputImport(name="portOverrides")
      private final @Nullable Input<List<EndpointGroupPortOverrideArgs>> portOverrides;

    public Input<List<EndpointGroupPortOverrideArgs>> getPortOverrides() {
        return this.portOverrides == null ? Input.empty() : this.portOverrides;
    }

    /**
     * The number of consecutive health checks required to set the state of the endpoint to unhealthy.
     * 
     */
    @InputImport(name="thresholdCount")
      private final @Nullable Input<Integer> thresholdCount;

    public Input<Integer> getThresholdCount() {
        return this.thresholdCount == null ? Input.empty() : this.thresholdCount;
    }

    /**
     * The percentage of traffic to sent to an AWS Region
     * 
     */
    @InputImport(name="trafficDialPercentage")
      private final @Nullable Input<Double> trafficDialPercentage;

    public Input<Double> getTrafficDialPercentage() {
        return this.trafficDialPercentage == null ? Input.empty() : this.trafficDialPercentage;
    }

    public EndpointGroupArgs(
        @Nullable Input<List<EndpointGroupEndpointConfigurationArgs>> endpointConfigurations,
        Input<String> endpointGroupRegion,
        @Nullable Input<Integer> healthCheckIntervalSeconds,
        @Nullable Input<String> healthCheckPath,
        @Nullable Input<Integer> healthCheckPort,
        @Nullable Input<EndpointGroupHealthCheckProtocol> healthCheckProtocol,
        Input<String> listenerArn,
        @Nullable Input<List<EndpointGroupPortOverrideArgs>> portOverrides,
        @Nullable Input<Integer> thresholdCount,
        @Nullable Input<Double> trafficDialPercentage) {
        this.endpointConfigurations = endpointConfigurations;
        this.endpointGroupRegion = Objects.requireNonNull(endpointGroupRegion, "expected parameter 'endpointGroupRegion' to be non-null");
        this.healthCheckIntervalSeconds = healthCheckIntervalSeconds;
        this.healthCheckPath = healthCheckPath;
        this.healthCheckPort = healthCheckPort;
        this.healthCheckProtocol = healthCheckProtocol;
        this.listenerArn = Objects.requireNonNull(listenerArn, "expected parameter 'listenerArn' to be non-null");
        this.portOverrides = portOverrides;
        this.thresholdCount = thresholdCount;
        this.trafficDialPercentage = trafficDialPercentage;
    }

    private EndpointGroupArgs() {
        this.endpointConfigurations = Input.empty();
        this.endpointGroupRegion = Input.empty();
        this.healthCheckIntervalSeconds = Input.empty();
        this.healthCheckPath = Input.empty();
        this.healthCheckPort = Input.empty();
        this.healthCheckProtocol = Input.empty();
        this.listenerArn = Input.empty();
        this.portOverrides = Input.empty();
        this.thresholdCount = Input.empty();
        this.trafficDialPercentage = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EndpointGroupArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<EndpointGroupEndpointConfigurationArgs>> endpointConfigurations;
        private Input<String> endpointGroupRegion;
        private @Nullable Input<Integer> healthCheckIntervalSeconds;
        private @Nullable Input<String> healthCheckPath;
        private @Nullable Input<Integer> healthCheckPort;
        private @Nullable Input<EndpointGroupHealthCheckProtocol> healthCheckProtocol;
        private Input<String> listenerArn;
        private @Nullable Input<List<EndpointGroupPortOverrideArgs>> portOverrides;
        private @Nullable Input<Integer> thresholdCount;
        private @Nullable Input<Double> trafficDialPercentage;

        public Builder() {
    	      // Empty
        }

        public Builder(EndpointGroupArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.endpointConfigurations = defaults.endpointConfigurations;
    	      this.endpointGroupRegion = defaults.endpointGroupRegion;
    	      this.healthCheckIntervalSeconds = defaults.healthCheckIntervalSeconds;
    	      this.healthCheckPath = defaults.healthCheckPath;
    	      this.healthCheckPort = defaults.healthCheckPort;
    	      this.healthCheckProtocol = defaults.healthCheckProtocol;
    	      this.listenerArn = defaults.listenerArn;
    	      this.portOverrides = defaults.portOverrides;
    	      this.thresholdCount = defaults.thresholdCount;
    	      this.trafficDialPercentage = defaults.trafficDialPercentage;
        }

        public Builder setEndpointConfigurations(@Nullable Input<List<EndpointGroupEndpointConfigurationArgs>> endpointConfigurations) {
            this.endpointConfigurations = endpointConfigurations;
            return this;
        }

        public Builder setEndpointConfigurations(@Nullable List<EndpointGroupEndpointConfigurationArgs> endpointConfigurations) {
            this.endpointConfigurations = Input.ofNullable(endpointConfigurations);
            return this;
        }

        public Builder setEndpointGroupRegion(Input<String> endpointGroupRegion) {
            this.endpointGroupRegion = Objects.requireNonNull(endpointGroupRegion);
            return this;
        }

        public Builder setEndpointGroupRegion(String endpointGroupRegion) {
            this.endpointGroupRegion = Input.of(Objects.requireNonNull(endpointGroupRegion));
            return this;
        }

        public Builder setHealthCheckIntervalSeconds(@Nullable Input<Integer> healthCheckIntervalSeconds) {
            this.healthCheckIntervalSeconds = healthCheckIntervalSeconds;
            return this;
        }

        public Builder setHealthCheckIntervalSeconds(@Nullable Integer healthCheckIntervalSeconds) {
            this.healthCheckIntervalSeconds = Input.ofNullable(healthCheckIntervalSeconds);
            return this;
        }

        public Builder setHealthCheckPath(@Nullable Input<String> healthCheckPath) {
            this.healthCheckPath = healthCheckPath;
            return this;
        }

        public Builder setHealthCheckPath(@Nullable String healthCheckPath) {
            this.healthCheckPath = Input.ofNullable(healthCheckPath);
            return this;
        }

        public Builder setHealthCheckPort(@Nullable Input<Integer> healthCheckPort) {
            this.healthCheckPort = healthCheckPort;
            return this;
        }

        public Builder setHealthCheckPort(@Nullable Integer healthCheckPort) {
            this.healthCheckPort = Input.ofNullable(healthCheckPort);
            return this;
        }

        public Builder setHealthCheckProtocol(@Nullable Input<EndpointGroupHealthCheckProtocol> healthCheckProtocol) {
            this.healthCheckProtocol = healthCheckProtocol;
            return this;
        }

        public Builder setHealthCheckProtocol(@Nullable EndpointGroupHealthCheckProtocol healthCheckProtocol) {
            this.healthCheckProtocol = Input.ofNullable(healthCheckProtocol);
            return this;
        }

        public Builder setListenerArn(Input<String> listenerArn) {
            this.listenerArn = Objects.requireNonNull(listenerArn);
            return this;
        }

        public Builder setListenerArn(String listenerArn) {
            this.listenerArn = Input.of(Objects.requireNonNull(listenerArn));
            return this;
        }

        public Builder setPortOverrides(@Nullable Input<List<EndpointGroupPortOverrideArgs>> portOverrides) {
            this.portOverrides = portOverrides;
            return this;
        }

        public Builder setPortOverrides(@Nullable List<EndpointGroupPortOverrideArgs> portOverrides) {
            this.portOverrides = Input.ofNullable(portOverrides);
            return this;
        }

        public Builder setThresholdCount(@Nullable Input<Integer> thresholdCount) {
            this.thresholdCount = thresholdCount;
            return this;
        }

        public Builder setThresholdCount(@Nullable Integer thresholdCount) {
            this.thresholdCount = Input.ofNullable(thresholdCount);
            return this;
        }

        public Builder setTrafficDialPercentage(@Nullable Input<Double> trafficDialPercentage) {
            this.trafficDialPercentage = trafficDialPercentage;
            return this;
        }

        public Builder setTrafficDialPercentage(@Nullable Double trafficDialPercentage) {
            this.trafficDialPercentage = Input.ofNullable(trafficDialPercentage);
            return this;
        }
        public EndpointGroupArgs build() {
            return new EndpointGroupArgs(endpointConfigurations, endpointGroupRegion, healthCheckIntervalSeconds, healthCheckPath, healthCheckPort, healthCheckProtocol, listenerArn, portOverrides, thresholdCount, trafficDialPercentage);
        }
    }
}