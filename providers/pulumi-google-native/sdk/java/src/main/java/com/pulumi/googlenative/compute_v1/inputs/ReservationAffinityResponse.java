// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute_v1.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * Specifies the reservations that this instance can consume from.
 * 
 */
public final class ReservationAffinityResponse extends com.pulumi.resources.InvokeArgs {

    public static final ReservationAffinityResponse Empty = new ReservationAffinityResponse();

    /**
     * Specifies the type of reservation from which this instance can consume resources: ANY_RESERVATION (default), SPECIFIC_RESERVATION, or NO_RESERVATION. See Consuming reserved instances for examples.
     * 
     */
    @Import(name="consumeReservationType", required=true)
    private String consumeReservationType;

    /**
     * @return Specifies the type of reservation from which this instance can consume resources: ANY_RESERVATION (default), SPECIFIC_RESERVATION, or NO_RESERVATION. See Consuming reserved instances for examples.
     * 
     */
    public String consumeReservationType() {
        return this.consumeReservationType;
    }

    /**
     * Corresponds to the label key of a reservation resource. To target a SPECIFIC_RESERVATION by name, specify googleapis.com/reservation-name as the key and specify the name of your reservation as its value.
     * 
     */
    @Import(name="key", required=true)
    private String key;

    /**
     * @return Corresponds to the label key of a reservation resource. To target a SPECIFIC_RESERVATION by name, specify googleapis.com/reservation-name as the key and specify the name of your reservation as its value.
     * 
     */
    public String key() {
        return this.key;
    }

    /**
     * Corresponds to the label values of a reservation resource. This can be either a name to a reservation in the same project or &#34;projects/different-project/reservations/some-reservation-name&#34; to target a shared reservation in the same zone but in a different project.
     * 
     */
    @Import(name="values", required=true)
    private List<String> values;

    /**
     * @return Corresponds to the label values of a reservation resource. This can be either a name to a reservation in the same project or &#34;projects/different-project/reservations/some-reservation-name&#34; to target a shared reservation in the same zone but in a different project.
     * 
     */
    public List<String> values() {
        return this.values;
    }

    private ReservationAffinityResponse() {}

    private ReservationAffinityResponse(ReservationAffinityResponse $) {
        this.consumeReservationType = $.consumeReservationType;
        this.key = $.key;
        this.values = $.values;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ReservationAffinityResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ReservationAffinityResponse $;

        public Builder() {
            $ = new ReservationAffinityResponse();
        }

        public Builder(ReservationAffinityResponse defaults) {
            $ = new ReservationAffinityResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param consumeReservationType Specifies the type of reservation from which this instance can consume resources: ANY_RESERVATION (default), SPECIFIC_RESERVATION, or NO_RESERVATION. See Consuming reserved instances for examples.
         * 
         * @return builder
         * 
         */
        public Builder consumeReservationType(String consumeReservationType) {
            $.consumeReservationType = consumeReservationType;
            return this;
        }

        /**
         * @param key Corresponds to the label key of a reservation resource. To target a SPECIFIC_RESERVATION by name, specify googleapis.com/reservation-name as the key and specify the name of your reservation as its value.
         * 
         * @return builder
         * 
         */
        public Builder key(String key) {
            $.key = key;
            return this;
        }

        /**
         * @param values Corresponds to the label values of a reservation resource. This can be either a name to a reservation in the same project or &#34;projects/different-project/reservations/some-reservation-name&#34; to target a shared reservation in the same zone but in a different project.
         * 
         * @return builder
         * 
         */
        public Builder values(List<String> values) {
            $.values = values;
            return this;
        }

        /**
         * @param values Corresponds to the label values of a reservation resource. This can be either a name to a reservation in the same project or &#34;projects/different-project/reservations/some-reservation-name&#34; to target a shared reservation in the same zone but in a different project.
         * 
         * @return builder
         * 
         */
        public Builder values(String... values) {
            return values(List.of(values));
        }

        public ReservationAffinityResponse build() {
            $.consumeReservationType = Objects.requireNonNull($.consumeReservationType, "expected parameter 'consumeReservationType' to be non-null");
            $.key = Objects.requireNonNull($.key, "expected parameter 'key' to be non-null");
            $.values = Objects.requireNonNull($.values, "expected parameter 'values' to be non-null");
            return $;
        }
    }

}
