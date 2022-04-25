// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ecs.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ServiceCapacityProviderStrategyGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final ServiceCapacityProviderStrategyGetArgs Empty = new ServiceCapacityProviderStrategyGetArgs();

    /**
     * Number of tasks, at a minimum, to run on the specified capacity provider. Only one capacity provider in a capacity provider strategy can have a base defined.
     * 
     */
    @Import(name="base")
    private @Nullable Output<Integer> base;

    /**
     * @return Number of tasks, at a minimum, to run on the specified capacity provider. Only one capacity provider in a capacity provider strategy can have a base defined.
     * 
     */
    public Optional<Output<Integer>> base() {
        return Optional.ofNullable(this.base);
    }

    /**
     * Short name of the capacity provider.
     * 
     */
    @Import(name="capacityProvider", required=true)
    private Output<String> capacityProvider;

    /**
     * @return Short name of the capacity provider.
     * 
     */
    public Output<String> capacityProvider() {
        return this.capacityProvider;
    }

    /**
     * Relative percentage of the total number of launched tasks that should use the specified capacity provider.
     * 
     */
    @Import(name="weight")
    private @Nullable Output<Integer> weight;

    /**
     * @return Relative percentage of the total number of launched tasks that should use the specified capacity provider.
     * 
     */
    public Optional<Output<Integer>> weight() {
        return Optional.ofNullable(this.weight);
    }

    private ServiceCapacityProviderStrategyGetArgs() {}

    private ServiceCapacityProviderStrategyGetArgs(ServiceCapacityProviderStrategyGetArgs $) {
        this.base = $.base;
        this.capacityProvider = $.capacityProvider;
        this.weight = $.weight;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ServiceCapacityProviderStrategyGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ServiceCapacityProviderStrategyGetArgs $;

        public Builder() {
            $ = new ServiceCapacityProviderStrategyGetArgs();
        }

        public Builder(ServiceCapacityProviderStrategyGetArgs defaults) {
            $ = new ServiceCapacityProviderStrategyGetArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param base Number of tasks, at a minimum, to run on the specified capacity provider. Only one capacity provider in a capacity provider strategy can have a base defined.
         * 
         * @return builder
         * 
         */
        public Builder base(@Nullable Output<Integer> base) {
            $.base = base;
            return this;
        }

        /**
         * @param base Number of tasks, at a minimum, to run on the specified capacity provider. Only one capacity provider in a capacity provider strategy can have a base defined.
         * 
         * @return builder
         * 
         */
        public Builder base(Integer base) {
            return base(Output.of(base));
        }

        /**
         * @param capacityProvider Short name of the capacity provider.
         * 
         * @return builder
         * 
         */
        public Builder capacityProvider(Output<String> capacityProvider) {
            $.capacityProvider = capacityProvider;
            return this;
        }

        /**
         * @param capacityProvider Short name of the capacity provider.
         * 
         * @return builder
         * 
         */
        public Builder capacityProvider(String capacityProvider) {
            return capacityProvider(Output.of(capacityProvider));
        }

        /**
         * @param weight Relative percentage of the total number of launched tasks that should use the specified capacity provider.
         * 
         * @return builder
         * 
         */
        public Builder weight(@Nullable Output<Integer> weight) {
            $.weight = weight;
            return this;
        }

        /**
         * @param weight Relative percentage of the total number of launched tasks that should use the specified capacity provider.
         * 
         * @return builder
         * 
         */
        public Builder weight(Integer weight) {
            return weight(Output.of(weight));
        }

        public ServiceCapacityProviderStrategyGetArgs build() {
            $.capacityProvider = Objects.requireNonNull($.capacityProvider, "expected parameter 'capacityProvider' to be non-null");
            return $;
        }
    }

}
