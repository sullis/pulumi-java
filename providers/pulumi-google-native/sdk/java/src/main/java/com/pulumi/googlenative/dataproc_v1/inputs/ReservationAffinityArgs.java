// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dataproc_v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.dataproc_v1.enums.ReservationAffinityConsumeReservationType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Reservation Affinity for consuming Zonal reservation.
 * 
 */
public final class ReservationAffinityArgs extends com.pulumi.resources.ResourceArgs {

    public static final ReservationAffinityArgs Empty = new ReservationAffinityArgs();

    /**
     * Optional. Type of reservation to consume
     * 
     */
    @Import(name="consumeReservationType")
    private @Nullable Output<ReservationAffinityConsumeReservationType> consumeReservationType;

    /**
     * @return Optional. Type of reservation to consume
     * 
     */
    public Optional<Output<ReservationAffinityConsumeReservationType>> consumeReservationType() {
        return Optional.ofNullable(this.consumeReservationType);
    }

    /**
     * Optional. Corresponds to the label key of reservation resource.
     * 
     */
    @Import(name="key")
    private @Nullable Output<String> key;

    /**
     * @return Optional. Corresponds to the label key of reservation resource.
     * 
     */
    public Optional<Output<String>> key() {
        return Optional.ofNullable(this.key);
    }

    /**
     * Optional. Corresponds to the label values of reservation resource.
     * 
     */
    @Import(name="values")
    private @Nullable Output<List<String>> values;

    /**
     * @return Optional. Corresponds to the label values of reservation resource.
     * 
     */
    public Optional<Output<List<String>>> values() {
        return Optional.ofNullable(this.values);
    }

    private ReservationAffinityArgs() {}

    private ReservationAffinityArgs(ReservationAffinityArgs $) {
        this.consumeReservationType = $.consumeReservationType;
        this.key = $.key;
        this.values = $.values;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ReservationAffinityArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ReservationAffinityArgs $;

        public Builder() {
            $ = new ReservationAffinityArgs();
        }

        public Builder(ReservationAffinityArgs defaults) {
            $ = new ReservationAffinityArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param consumeReservationType Optional. Type of reservation to consume
         * 
         * @return builder
         * 
         */
        public Builder consumeReservationType(@Nullable Output<ReservationAffinityConsumeReservationType> consumeReservationType) {
            $.consumeReservationType = consumeReservationType;
            return this;
        }

        /**
         * @param consumeReservationType Optional. Type of reservation to consume
         * 
         * @return builder
         * 
         */
        public Builder consumeReservationType(ReservationAffinityConsumeReservationType consumeReservationType) {
            return consumeReservationType(Output.of(consumeReservationType));
        }

        /**
         * @param key Optional. Corresponds to the label key of reservation resource.
         * 
         * @return builder
         * 
         */
        public Builder key(@Nullable Output<String> key) {
            $.key = key;
            return this;
        }

        /**
         * @param key Optional. Corresponds to the label key of reservation resource.
         * 
         * @return builder
         * 
         */
        public Builder key(String key) {
            return key(Output.of(key));
        }

        /**
         * @param values Optional. Corresponds to the label values of reservation resource.
         * 
         * @return builder
         * 
         */
        public Builder values(@Nullable Output<List<String>> values) {
            $.values = values;
            return this;
        }

        /**
         * @param values Optional. Corresponds to the label values of reservation resource.
         * 
         * @return builder
         * 
         */
        public Builder values(List<String> values) {
            return values(Output.of(values));
        }

        /**
         * @param values Optional. Corresponds to the label values of reservation resource.
         * 
         * @return builder
         * 
         */
        public Builder values(String... values) {
            return values(List.of(values));
        }

        public ReservationAffinityArgs build() {
            return $;
        }
    }

}
