// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.ecs.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Boolean;
import java.util.Objects;

@OutputCustomType
public final class ServiceDeploymentCircuitBreaker {
    private final Boolean enable;
    private final Boolean rollback;

    @OutputCustomType.Constructor({"enable","rollback"})
    private ServiceDeploymentCircuitBreaker(
        Boolean enable,
        Boolean rollback) {
        this.enable = Objects.requireNonNull(enable);
        this.rollback = Objects.requireNonNull(rollback);
    }

    public Boolean getEnable() {
        return this.enable;
    }
    public Boolean getRollback() {
        return this.rollback;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceDeploymentCircuitBreaker defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean enable;
        private Boolean rollback;

        public Builder() {
    	      // Empty
        }

        public Builder(ServiceDeploymentCircuitBreaker defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enable = defaults.enable;
    	      this.rollback = defaults.rollback;
        }

        public Builder setEnable(Boolean enable) {
            this.enable = Objects.requireNonNull(enable);
            return this;
        }

        public Builder setRollback(Boolean rollback) {
            this.rollback = Objects.requireNonNull(rollback);
            return this;
        }

        public ServiceDeploymentCircuitBreaker build() {
            return new ServiceDeploymentCircuitBreaker(enable, rollback);
        }
    }
}
