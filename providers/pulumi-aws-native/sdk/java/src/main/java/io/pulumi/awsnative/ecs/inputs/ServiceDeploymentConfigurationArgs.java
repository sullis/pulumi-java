// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.ecs.inputs;

import io.pulumi.awsnative.ecs.inputs.ServiceDeploymentCircuitBreakerArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ServiceDeploymentConfigurationArgs extends io.pulumi.resources.ResourceArgs {

    public static final ServiceDeploymentConfigurationArgs Empty = new ServiceDeploymentConfigurationArgs();

    @Import(name="deploymentCircuitBreaker")
      private final @Nullable Output<ServiceDeploymentCircuitBreakerArgs> deploymentCircuitBreaker;

    public Output<ServiceDeploymentCircuitBreakerArgs> getDeploymentCircuitBreaker() {
        return this.deploymentCircuitBreaker == null ? Output.empty() : this.deploymentCircuitBreaker;
    }

    @Import(name="maximumPercent")
      private final @Nullable Output<Integer> maximumPercent;

    public Output<Integer> getMaximumPercent() {
        return this.maximumPercent == null ? Output.empty() : this.maximumPercent;
    }

    @Import(name="minimumHealthyPercent")
      private final @Nullable Output<Integer> minimumHealthyPercent;

    public Output<Integer> getMinimumHealthyPercent() {
        return this.minimumHealthyPercent == null ? Output.empty() : this.minimumHealthyPercent;
    }

    public ServiceDeploymentConfigurationArgs(
        @Nullable Output<ServiceDeploymentCircuitBreakerArgs> deploymentCircuitBreaker,
        @Nullable Output<Integer> maximumPercent,
        @Nullable Output<Integer> minimumHealthyPercent) {
        this.deploymentCircuitBreaker = deploymentCircuitBreaker;
        this.maximumPercent = maximumPercent;
        this.minimumHealthyPercent = minimumHealthyPercent;
    }

    private ServiceDeploymentConfigurationArgs() {
        this.deploymentCircuitBreaker = Output.empty();
        this.maximumPercent = Output.empty();
        this.minimumHealthyPercent = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceDeploymentConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<ServiceDeploymentCircuitBreakerArgs> deploymentCircuitBreaker;
        private @Nullable Output<Integer> maximumPercent;
        private @Nullable Output<Integer> minimumHealthyPercent;

        public Builder() {
    	      // Empty
        }

        public Builder(ServiceDeploymentConfigurationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.deploymentCircuitBreaker = defaults.deploymentCircuitBreaker;
    	      this.maximumPercent = defaults.maximumPercent;
    	      this.minimumHealthyPercent = defaults.minimumHealthyPercent;
        }

        public Builder deploymentCircuitBreaker(@Nullable Output<ServiceDeploymentCircuitBreakerArgs> deploymentCircuitBreaker) {
            this.deploymentCircuitBreaker = deploymentCircuitBreaker;
            return this;
        }
        public Builder deploymentCircuitBreaker(@Nullable ServiceDeploymentCircuitBreakerArgs deploymentCircuitBreaker) {
            this.deploymentCircuitBreaker = Output.ofNullable(deploymentCircuitBreaker);
            return this;
        }
        public Builder maximumPercent(@Nullable Output<Integer> maximumPercent) {
            this.maximumPercent = maximumPercent;
            return this;
        }
        public Builder maximumPercent(@Nullable Integer maximumPercent) {
            this.maximumPercent = Output.ofNullable(maximumPercent);
            return this;
        }
        public Builder minimumHealthyPercent(@Nullable Output<Integer> minimumHealthyPercent) {
            this.minimumHealthyPercent = minimumHealthyPercent;
            return this;
        }
        public Builder minimumHealthyPercent(@Nullable Integer minimumHealthyPercent) {
            this.minimumHealthyPercent = Output.ofNullable(minimumHealthyPercent);
            return this;
        }        public ServiceDeploymentConfigurationArgs build() {
            return new ServiceDeploymentConfigurationArgs(deploymentCircuitBreaker, maximumPercent, minimumHealthyPercent);
        }
    }
}
