// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.servicediscovery.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ServiceHealthCheckCustomConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final ServiceHealthCheckCustomConfigArgs Empty = new ServiceHealthCheckCustomConfigArgs();

    /**
     * The number of 30-second intervals that you want service discovery to wait before it changes the health status of a service instance.  Maximum value of 10.
     * 
     */
    @Import(name="failureThreshold")
    private @Nullable Output<Integer> failureThreshold;

    /**
     * @return The number of 30-second intervals that you want service discovery to wait before it changes the health status of a service instance.  Maximum value of 10.
     * 
     */
    public Optional<Output<Integer>> failureThreshold() {
        return Optional.ofNullable(this.failureThreshold);
    }

    private ServiceHealthCheckCustomConfigArgs() {}

    private ServiceHealthCheckCustomConfigArgs(ServiceHealthCheckCustomConfigArgs $) {
        this.failureThreshold = $.failureThreshold;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ServiceHealthCheckCustomConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ServiceHealthCheckCustomConfigArgs $;

        public Builder() {
            $ = new ServiceHealthCheckCustomConfigArgs();
        }

        public Builder(ServiceHealthCheckCustomConfigArgs defaults) {
            $ = new ServiceHealthCheckCustomConfigArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param failureThreshold The number of 30-second intervals that you want service discovery to wait before it changes the health status of a service instance.  Maximum value of 10.
         * 
         * @return builder
         * 
         */
        public Builder failureThreshold(@Nullable Output<Integer> failureThreshold) {
            $.failureThreshold = failureThreshold;
            return this;
        }

        /**
         * @param failureThreshold The number of 30-second intervals that you want service discovery to wait before it changes the health status of a service instance.  Maximum value of 10.
         * 
         * @return builder
         * 
         */
        public Builder failureThreshold(Integer failureThreshold) {
            return failureThreshold(Output.of(failureThreshold));
        }

        public ServiceHealthCheckCustomConfigArgs build() {
            return $;
        }
    }

}
