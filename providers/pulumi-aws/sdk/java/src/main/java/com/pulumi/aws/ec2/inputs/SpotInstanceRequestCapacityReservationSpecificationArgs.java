// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ec2.inputs;

import com.pulumi.aws.ec2.inputs.SpotInstanceRequestCapacityReservationSpecificationCapacityReservationTargetArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SpotInstanceRequestCapacityReservationSpecificationArgs extends com.pulumi.resources.ResourceArgs {

    public static final SpotInstanceRequestCapacityReservationSpecificationArgs Empty = new SpotInstanceRequestCapacityReservationSpecificationArgs();

    /**
     * Indicates the instance&#39;s Capacity Reservation preferences. Can be `&#34;open&#34;` or `&#34;none&#34;`. (Default: `&#34;open&#34;`).
     * 
     */
    @Import(name="capacityReservationPreference")
    private @Nullable Output<String> capacityReservationPreference;

    /**
     * @return Indicates the instance&#39;s Capacity Reservation preferences. Can be `&#34;open&#34;` or `&#34;none&#34;`. (Default: `&#34;open&#34;`).
     * 
     */
    public Optional<Output<String>> capacityReservationPreference() {
        return Optional.ofNullable(this.capacityReservationPreference);
    }

    /**
     * Information about the target Capacity Reservation. See Capacity Reservation Target below for more details.
     * 
     */
    @Import(name="capacityReservationTarget")
    private @Nullable Output<SpotInstanceRequestCapacityReservationSpecificationCapacityReservationTargetArgs> capacityReservationTarget;

    /**
     * @return Information about the target Capacity Reservation. See Capacity Reservation Target below for more details.
     * 
     */
    public Optional<Output<SpotInstanceRequestCapacityReservationSpecificationCapacityReservationTargetArgs>> capacityReservationTarget() {
        return Optional.ofNullable(this.capacityReservationTarget);
    }

    private SpotInstanceRequestCapacityReservationSpecificationArgs() {}

    private SpotInstanceRequestCapacityReservationSpecificationArgs(SpotInstanceRequestCapacityReservationSpecificationArgs $) {
        this.capacityReservationPreference = $.capacityReservationPreference;
        this.capacityReservationTarget = $.capacityReservationTarget;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SpotInstanceRequestCapacityReservationSpecificationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SpotInstanceRequestCapacityReservationSpecificationArgs $;

        public Builder() {
            $ = new SpotInstanceRequestCapacityReservationSpecificationArgs();
        }

        public Builder(SpotInstanceRequestCapacityReservationSpecificationArgs defaults) {
            $ = new SpotInstanceRequestCapacityReservationSpecificationArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param capacityReservationPreference Indicates the instance&#39;s Capacity Reservation preferences. Can be `&#34;open&#34;` or `&#34;none&#34;`. (Default: `&#34;open&#34;`).
         * 
         * @return builder
         * 
         */
        public Builder capacityReservationPreference(@Nullable Output<String> capacityReservationPreference) {
            $.capacityReservationPreference = capacityReservationPreference;
            return this;
        }

        /**
         * @param capacityReservationPreference Indicates the instance&#39;s Capacity Reservation preferences. Can be `&#34;open&#34;` or `&#34;none&#34;`. (Default: `&#34;open&#34;`).
         * 
         * @return builder
         * 
         */
        public Builder capacityReservationPreference(String capacityReservationPreference) {
            return capacityReservationPreference(Output.of(capacityReservationPreference));
        }

        /**
         * @param capacityReservationTarget Information about the target Capacity Reservation. See Capacity Reservation Target below for more details.
         * 
         * @return builder
         * 
         */
        public Builder capacityReservationTarget(@Nullable Output<SpotInstanceRequestCapacityReservationSpecificationCapacityReservationTargetArgs> capacityReservationTarget) {
            $.capacityReservationTarget = capacityReservationTarget;
            return this;
        }

        /**
         * @param capacityReservationTarget Information about the target Capacity Reservation. See Capacity Reservation Target below for more details.
         * 
         * @return builder
         * 
         */
        public Builder capacityReservationTarget(SpotInstanceRequestCapacityReservationSpecificationCapacityReservationTargetArgs capacityReservationTarget) {
            return capacityReservationTarget(Output.of(capacityReservationTarget));
        }

        public SpotInstanceRequestCapacityReservationSpecificationArgs build() {
            return $;
        }
    }

}
