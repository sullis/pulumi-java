// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ecs.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.util.Objects;


public final class ServiceDeploymentCircuitBreakerGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final ServiceDeploymentCircuitBreakerGetArgs Empty = new ServiceDeploymentCircuitBreakerGetArgs();

    /**
     * Whether to enable the deployment circuit breaker logic for the service.
     * 
     */
    @Import(name="enable", required=true)
    private Output<Boolean> enable;

    /**
     * @return Whether to enable the deployment circuit breaker logic for the service.
     * 
     */
    public Output<Boolean> enable() {
        return this.enable;
    }

    /**
     * Whether to enable Amazon ECS to roll back the service if a service deployment fails. If rollback is enabled, when a service deployment fails, the service is rolled back to the last deployment that completed successfully.
     * 
     */
    @Import(name="rollback", required=true)
    private Output<Boolean> rollback;

    /**
     * @return Whether to enable Amazon ECS to roll back the service if a service deployment fails. If rollback is enabled, when a service deployment fails, the service is rolled back to the last deployment that completed successfully.
     * 
     */
    public Output<Boolean> rollback() {
        return this.rollback;
    }

    private ServiceDeploymentCircuitBreakerGetArgs() {}

    private ServiceDeploymentCircuitBreakerGetArgs(ServiceDeploymentCircuitBreakerGetArgs $) {
        this.enable = $.enable;
        this.rollback = $.rollback;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ServiceDeploymentCircuitBreakerGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ServiceDeploymentCircuitBreakerGetArgs $;

        public Builder() {
            $ = new ServiceDeploymentCircuitBreakerGetArgs();
        }

        public Builder(ServiceDeploymentCircuitBreakerGetArgs defaults) {
            $ = new ServiceDeploymentCircuitBreakerGetArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param enable Whether to enable the deployment circuit breaker logic for the service.
         * 
         * @return builder
         * 
         */
        public Builder enable(Output<Boolean> enable) {
            $.enable = enable;
            return this;
        }

        /**
         * @param enable Whether to enable the deployment circuit breaker logic for the service.
         * 
         * @return builder
         * 
         */
        public Builder enable(Boolean enable) {
            return enable(Output.of(enable));
        }

        /**
         * @param rollback Whether to enable Amazon ECS to roll back the service if a service deployment fails. If rollback is enabled, when a service deployment fails, the service is rolled back to the last deployment that completed successfully.
         * 
         * @return builder
         * 
         */
        public Builder rollback(Output<Boolean> rollback) {
            $.rollback = rollback;
            return this;
        }

        /**
         * @param rollback Whether to enable Amazon ECS to roll back the service if a service deployment fails. If rollback is enabled, when a service deployment fails, the service is rolled back to the last deployment that completed successfully.
         * 
         * @return builder
         * 
         */
        public Builder rollback(Boolean rollback) {
            return rollback(Output.of(rollback));
        }

        public ServiceDeploymentCircuitBreakerGetArgs build() {
            $.enable = Objects.requireNonNull($.enable, "expected parameter 'enable' to be non-null");
            $.rollback = Objects.requireNonNull($.rollback, "expected parameter 'rollback' to be non-null");
            return $;
        }
    }

}
