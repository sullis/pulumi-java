// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.mediaconvert.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;


public final class QueueReservationPlanSettingsGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final QueueReservationPlanSettingsGetArgs Empty = new QueueReservationPlanSettingsGetArgs();

    /**
     * The length of the term of your reserved queue pricing plan commitment. Valid value is `ONE_YEAR`.
     * 
     */
    @Import(name="commitment", required=true)
    private Output<String> commitment;

    /**
     * @return The length of the term of your reserved queue pricing plan commitment. Valid value is `ONE_YEAR`.
     * 
     */
    public Output<String> commitment() {
        return this.commitment;
    }

    /**
     * Specifies whether the term of your reserved queue pricing plan. Valid values are `AUTO_RENEW` or `EXPIRE`.
     * 
     */
    @Import(name="renewalType", required=true)
    private Output<String> renewalType;

    /**
     * @return Specifies whether the term of your reserved queue pricing plan. Valid values are `AUTO_RENEW` or `EXPIRE`.
     * 
     */
    public Output<String> renewalType() {
        return this.renewalType;
    }

    /**
     * Specifies the number of reserved transcode slots (RTS) for queue.
     * 
     */
    @Import(name="reservedSlots", required=true)
    private Output<Integer> reservedSlots;

    /**
     * @return Specifies the number of reserved transcode slots (RTS) for queue.
     * 
     */
    public Output<Integer> reservedSlots() {
        return this.reservedSlots;
    }

    private QueueReservationPlanSettingsGetArgs() {}

    private QueueReservationPlanSettingsGetArgs(QueueReservationPlanSettingsGetArgs $) {
        this.commitment = $.commitment;
        this.renewalType = $.renewalType;
        this.reservedSlots = $.reservedSlots;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(QueueReservationPlanSettingsGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private QueueReservationPlanSettingsGetArgs $;

        public Builder() {
            $ = new QueueReservationPlanSettingsGetArgs();
        }

        public Builder(QueueReservationPlanSettingsGetArgs defaults) {
            $ = new QueueReservationPlanSettingsGetArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param commitment The length of the term of your reserved queue pricing plan commitment. Valid value is `ONE_YEAR`.
         * 
         * @return builder
         * 
         */
        public Builder commitment(Output<String> commitment) {
            $.commitment = commitment;
            return this;
        }

        /**
         * @param commitment The length of the term of your reserved queue pricing plan commitment. Valid value is `ONE_YEAR`.
         * 
         * @return builder
         * 
         */
        public Builder commitment(String commitment) {
            return commitment(Output.of(commitment));
        }

        /**
         * @param renewalType Specifies whether the term of your reserved queue pricing plan. Valid values are `AUTO_RENEW` or `EXPIRE`.
         * 
         * @return builder
         * 
         */
        public Builder renewalType(Output<String> renewalType) {
            $.renewalType = renewalType;
            return this;
        }

        /**
         * @param renewalType Specifies whether the term of your reserved queue pricing plan. Valid values are `AUTO_RENEW` or `EXPIRE`.
         * 
         * @return builder
         * 
         */
        public Builder renewalType(String renewalType) {
            return renewalType(Output.of(renewalType));
        }

        /**
         * @param reservedSlots Specifies the number of reserved transcode slots (RTS) for queue.
         * 
         * @return builder
         * 
         */
        public Builder reservedSlots(Output<Integer> reservedSlots) {
            $.reservedSlots = reservedSlots;
            return this;
        }

        /**
         * @param reservedSlots Specifies the number of reserved transcode slots (RTS) for queue.
         * 
         * @return builder
         * 
         */
        public Builder reservedSlots(Integer reservedSlots) {
            return reservedSlots(Output.of(reservedSlots));
        }

        public QueueReservationPlanSettingsGetArgs build() {
            $.commitment = Objects.requireNonNull($.commitment, "expected parameter 'commitment' to be non-null");
            $.renewalType = Objects.requireNonNull($.renewalType, "expected parameter 'renewalType' to be non-null");
            $.reservedSlots = Objects.requireNonNull($.reservedSlots, "expected parameter 'reservedSlots' to be non-null");
            return $;
        }
    }

}
