// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.hybridcompute.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Metadata pertaining to the geographic location of the resource.
 * 
 */
public final class LocationDataArgs extends com.pulumi.resources.ResourceArgs {

    public static final LocationDataArgs Empty = new LocationDataArgs();

    /**
     * The city or locality where the resource is located.
     * 
     */
    @Import(name="city")
    private @Nullable Output<String> city;

    /**
     * @return The city or locality where the resource is located.
     * 
     */
    public Optional<Output<String>> city() {
        return Optional.ofNullable(this.city);
    }

    /**
     * The country or region where the resource is located
     * 
     */
    @Import(name="countryOrRegion")
    private @Nullable Output<String> countryOrRegion;

    /**
     * @return The country or region where the resource is located
     * 
     */
    public Optional<Output<String>> countryOrRegion() {
        return Optional.ofNullable(this.countryOrRegion);
    }

    /**
     * The district, state, or province where the resource is located.
     * 
     */
    @Import(name="district")
    private @Nullable Output<String> district;

    /**
     * @return The district, state, or province where the resource is located.
     * 
     */
    public Optional<Output<String>> district() {
        return Optional.ofNullable(this.district);
    }

    /**
     * A canonical name for the geographic or physical location.
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return A canonical name for the geographic or physical location.
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    private LocationDataArgs() {}

    private LocationDataArgs(LocationDataArgs $) {
        this.city = $.city;
        this.countryOrRegion = $.countryOrRegion;
        this.district = $.district;
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(LocationDataArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private LocationDataArgs $;

        public Builder() {
            $ = new LocationDataArgs();
        }

        public Builder(LocationDataArgs defaults) {
            $ = new LocationDataArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param city The city or locality where the resource is located.
         * 
         * @return builder
         * 
         */
        public Builder city(@Nullable Output<String> city) {
            $.city = city;
            return this;
        }

        /**
         * @param city The city or locality where the resource is located.
         * 
         * @return builder
         * 
         */
        public Builder city(String city) {
            return city(Output.of(city));
        }

        /**
         * @param countryOrRegion The country or region where the resource is located
         * 
         * @return builder
         * 
         */
        public Builder countryOrRegion(@Nullable Output<String> countryOrRegion) {
            $.countryOrRegion = countryOrRegion;
            return this;
        }

        /**
         * @param countryOrRegion The country or region where the resource is located
         * 
         * @return builder
         * 
         */
        public Builder countryOrRegion(String countryOrRegion) {
            return countryOrRegion(Output.of(countryOrRegion));
        }

        /**
         * @param district The district, state, or province where the resource is located.
         * 
         * @return builder
         * 
         */
        public Builder district(@Nullable Output<String> district) {
            $.district = district;
            return this;
        }

        /**
         * @param district The district, state, or province where the resource is located.
         * 
         * @return builder
         * 
         */
        public Builder district(String district) {
            return district(Output.of(district));
        }

        /**
         * @param name A canonical name for the geographic or physical location.
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name A canonical name for the geographic or physical location.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        public LocationDataArgs build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            return $;
        }
    }

}
