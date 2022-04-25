// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.tpu_v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Sets the scheduling options for this node.
 * 
 */
public final class SchedulingConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final SchedulingConfigArgs Empty = new SchedulingConfigArgs();

    /**
     * Defines whether the node is preemptible.
     * 
     */
    @Import(name="preemptible")
    private @Nullable Output<Boolean> preemptible;

    /**
     * @return Defines whether the node is preemptible.
     * 
     */
    public Optional<Output<Boolean>> preemptible() {
        return Optional.ofNullable(this.preemptible);
    }

    /**
     * Whether the node is created under a reservation.
     * 
     */
    @Import(name="reserved")
    private @Nullable Output<Boolean> reserved;

    /**
     * @return Whether the node is created under a reservation.
     * 
     */
    public Optional<Output<Boolean>> reserved() {
        return Optional.ofNullable(this.reserved);
    }

    private SchedulingConfigArgs() {}

    private SchedulingConfigArgs(SchedulingConfigArgs $) {
        this.preemptible = $.preemptible;
        this.reserved = $.reserved;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SchedulingConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SchedulingConfigArgs $;

        public Builder() {
            $ = new SchedulingConfigArgs();
        }

        public Builder(SchedulingConfigArgs defaults) {
            $ = new SchedulingConfigArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param preemptible Defines whether the node is preemptible.
         * 
         * @return builder
         * 
         */
        public Builder preemptible(@Nullable Output<Boolean> preemptible) {
            $.preemptible = preemptible;
            return this;
        }

        /**
         * @param preemptible Defines whether the node is preemptible.
         * 
         * @return builder
         * 
         */
        public Builder preemptible(Boolean preemptible) {
            return preemptible(Output.of(preemptible));
        }

        /**
         * @param reserved Whether the node is created under a reservation.
         * 
         * @return builder
         * 
         */
        public Builder reserved(@Nullable Output<Boolean> reserved) {
            $.reserved = reserved;
            return this;
        }

        /**
         * @param reserved Whether the node is created under a reservation.
         * 
         * @return builder
         * 
         */
        public Builder reserved(Boolean reserved) {
            return reserved(Output.of(reserved));
        }

        public SchedulingConfigArgs build() {
            return $;
        }
    }

}
