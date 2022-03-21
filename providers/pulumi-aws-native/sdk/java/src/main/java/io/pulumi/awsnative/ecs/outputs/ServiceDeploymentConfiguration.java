// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.ecs.outputs;

import io.pulumi.awsnative.ecs.outputs.ServiceDeploymentCircuitBreaker;
import io.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ServiceDeploymentConfiguration {
    private final @Nullable ServiceDeploymentCircuitBreaker deploymentCircuitBreaker;
    private final @Nullable Integer maximumPercent;
    private final @Nullable Integer minimumHealthyPercent;

    @CustomType.Constructor
    private ServiceDeploymentConfiguration(
        @CustomType.Parameter("deploymentCircuitBreaker") @Nullable ServiceDeploymentCircuitBreaker deploymentCircuitBreaker,
        @CustomType.Parameter("maximumPercent") @Nullable Integer maximumPercent,
        @CustomType.Parameter("minimumHealthyPercent") @Nullable Integer minimumHealthyPercent) {
        this.deploymentCircuitBreaker = deploymentCircuitBreaker;
        this.maximumPercent = maximumPercent;
        this.minimumHealthyPercent = minimumHealthyPercent;
    }

    public Optional<ServiceDeploymentCircuitBreaker> getDeploymentCircuitBreaker() {
        return Optional.ofNullable(this.deploymentCircuitBreaker);
    }
    public Optional<Integer> getMaximumPercent() {
        return Optional.ofNullable(this.maximumPercent);
    }
    public Optional<Integer> getMinimumHealthyPercent() {
        return Optional.ofNullable(this.minimumHealthyPercent);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceDeploymentConfiguration defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable ServiceDeploymentCircuitBreaker deploymentCircuitBreaker;
        private @Nullable Integer maximumPercent;
        private @Nullable Integer minimumHealthyPercent;

        public Builder() {
    	      // Empty
        }

        public Builder(ServiceDeploymentConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.deploymentCircuitBreaker = defaults.deploymentCircuitBreaker;
    	      this.maximumPercent = defaults.maximumPercent;
    	      this.minimumHealthyPercent = defaults.minimumHealthyPercent;
        }

        public Builder deploymentCircuitBreaker(@Nullable ServiceDeploymentCircuitBreaker deploymentCircuitBreaker) {
            this.deploymentCircuitBreaker = deploymentCircuitBreaker;
            return this;
        }
        public Builder maximumPercent(@Nullable Integer maximumPercent) {
            this.maximumPercent = maximumPercent;
            return this;
        }
        public Builder minimumHealthyPercent(@Nullable Integer minimumHealthyPercent) {
            this.minimumHealthyPercent = minimumHealthyPercent;
            return this;
        }        public ServiceDeploymentConfiguration build() {
            return new ServiceDeploymentConfiguration(deploymentCircuitBreaker, maximumPercent, minimumHealthyPercent);
        }
    }
}
