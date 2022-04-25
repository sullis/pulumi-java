// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.hdinsight.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Time and capacity request parameters
 * 
 */
public final class AutoscaleTimeAndCapacityArgs extends com.pulumi.resources.ResourceArgs {

    public static final AutoscaleTimeAndCapacityArgs Empty = new AutoscaleTimeAndCapacityArgs();

    /**
     * The maximum instance count of the cluster
     * 
     */
    @Import(name="maxInstanceCount")
    private @Nullable Output<Integer> maxInstanceCount;

    /**
     * @return The maximum instance count of the cluster
     * 
     */
    public Optional<Output<Integer>> maxInstanceCount() {
        return Optional.ofNullable(this.maxInstanceCount);
    }

    /**
     * The minimum instance count of the cluster
     * 
     */
    @Import(name="minInstanceCount")
    private @Nullable Output<Integer> minInstanceCount;

    /**
     * @return The minimum instance count of the cluster
     * 
     */
    public Optional<Output<Integer>> minInstanceCount() {
        return Optional.ofNullable(this.minInstanceCount);
    }

    /**
     * 24-hour time in the form xx:xx
     * 
     */
    @Import(name="time")
    private @Nullable Output<String> time;

    /**
     * @return 24-hour time in the form xx:xx
     * 
     */
    public Optional<Output<String>> time() {
        return Optional.ofNullable(this.time);
    }

    private AutoscaleTimeAndCapacityArgs() {}

    private AutoscaleTimeAndCapacityArgs(AutoscaleTimeAndCapacityArgs $) {
        this.maxInstanceCount = $.maxInstanceCount;
        this.minInstanceCount = $.minInstanceCount;
        this.time = $.time;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AutoscaleTimeAndCapacityArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AutoscaleTimeAndCapacityArgs $;

        public Builder() {
            $ = new AutoscaleTimeAndCapacityArgs();
        }

        public Builder(AutoscaleTimeAndCapacityArgs defaults) {
            $ = new AutoscaleTimeAndCapacityArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param maxInstanceCount The maximum instance count of the cluster
         * 
         * @return builder
         * 
         */
        public Builder maxInstanceCount(@Nullable Output<Integer> maxInstanceCount) {
            $.maxInstanceCount = maxInstanceCount;
            return this;
        }

        /**
         * @param maxInstanceCount The maximum instance count of the cluster
         * 
         * @return builder
         * 
         */
        public Builder maxInstanceCount(Integer maxInstanceCount) {
            return maxInstanceCount(Output.of(maxInstanceCount));
        }

        /**
         * @param minInstanceCount The minimum instance count of the cluster
         * 
         * @return builder
         * 
         */
        public Builder minInstanceCount(@Nullable Output<Integer> minInstanceCount) {
            $.minInstanceCount = minInstanceCount;
            return this;
        }

        /**
         * @param minInstanceCount The minimum instance count of the cluster
         * 
         * @return builder
         * 
         */
        public Builder minInstanceCount(Integer minInstanceCount) {
            return minInstanceCount(Output.of(minInstanceCount));
        }

        /**
         * @param time 24-hour time in the form xx:xx
         * 
         * @return builder
         * 
         */
        public Builder time(@Nullable Output<String> time) {
            $.time = time;
            return this;
        }

        /**
         * @param time 24-hour time in the form xx:xx
         * 
         * @return builder
         * 
         */
        public Builder time(String time) {
            return time(Output.of(time));
        }

        public AutoscaleTimeAndCapacityArgs build() {
            return $;
        }
    }

}
