// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.Identity.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetAvailabilityDomainPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetAvailabilityDomainPlainArgs Empty = new GetAvailabilityDomainPlainArgs();

    /**
     * The number of the Availability Domain. Required if `id` is not specified. This number corresponds to the integer in the Availability Domain `name`.
     * 
     */
    @Import(name="adNumber")
    private @Nullable Integer adNumber;

    /**
     * @return The number of the Availability Domain. Required if `id` is not specified. This number corresponds to the integer in the Availability Domain `name`.
     * 
     */
    public Optional<Integer> adNumber() {
        return Optional.ofNullable(this.adNumber);
    }

    /**
     * The OCID of the tenancy.
     * 
     */
    @Import(name="compartmentId", required=true)
    private String compartmentId;

    /**
     * @return The OCID of the tenancy.
     * 
     */
    public String compartmentId() {
        return this.compartmentId;
    }

    /**
     * The OCID of the Availability Domain. Required if `ad_number` is not specified.
     * 
     */
    @Import(name="id")
    private @Nullable String id;

    /**
     * @return The OCID of the Availability Domain. Required if `ad_number` is not specified.
     * 
     */
    public Optional<String> id() {
        return Optional.ofNullable(this.id);
    }

    private GetAvailabilityDomainPlainArgs() {}

    private GetAvailabilityDomainPlainArgs(GetAvailabilityDomainPlainArgs $) {
        this.adNumber = $.adNumber;
        this.compartmentId = $.compartmentId;
        this.id = $.id;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetAvailabilityDomainPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetAvailabilityDomainPlainArgs $;

        public Builder() {
            $ = new GetAvailabilityDomainPlainArgs();
        }

        public Builder(GetAvailabilityDomainPlainArgs defaults) {
            $ = new GetAvailabilityDomainPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param adNumber The number of the Availability Domain. Required if `id` is not specified. This number corresponds to the integer in the Availability Domain `name`.
         * 
         * @return builder
         * 
         */
        public Builder adNumber(@Nullable Integer adNumber) {
            $.adNumber = adNumber;
            return this;
        }

        /**
         * @param compartmentId The OCID of the tenancy.
         * 
         * @return builder
         * 
         */
        public Builder compartmentId(String compartmentId) {
            $.compartmentId = compartmentId;
            return this;
        }

        /**
         * @param id The OCID of the Availability Domain. Required if `ad_number` is not specified.
         * 
         * @return builder
         * 
         */
        public Builder id(@Nullable String id) {
            $.id = id;
            return this;
        }

        public GetAvailabilityDomainPlainArgs build() {
            $.compartmentId = Objects.requireNonNull($.compartmentId, "expected parameter 'compartmentId' to be non-null");
            return $;
        }
    }

}
