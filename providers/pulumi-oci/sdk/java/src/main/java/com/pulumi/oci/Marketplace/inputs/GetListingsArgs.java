// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.Marketplace.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.oci.Marketplace.inputs.GetListingsFilterArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetListingsArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetListingsArgs Empty = new GetListingsArgs();

    /**
     * Name of the product category or categories. If you specify multiple categories, then Marketplace returns any listing with one or more matching categories.
     * 
     */
    @Import(name="categories")
    private @Nullable Output<List<String>> categories;

    /**
     * @return Name of the product category or categories. If you specify multiple categories, then Marketplace returns any listing with one or more matching categories.
     * 
     */
    public Optional<Output<List<String>>> categories() {
        return Optional.ofNullable(this.categories);
    }

    /**
     * The unique identifier for the compartment.
     * 
     */
    @Import(name="compartmentId")
    private @Nullable Output<String> compartmentId;

    /**
     * @return The unique identifier for the compartment.
     * 
     */
    public Optional<Output<String>> compartmentId() {
        return Optional.ofNullable(this.compartmentId);
    }

    @Import(name="filters")
    private @Nullable Output<List<GetListingsFilterArgs>> filters;

    public Optional<Output<List<GetListingsFilterArgs>>> filters() {
        return Optional.ofNullable(this.filters);
    }

    /**
     * The image identifier of the listing.
     * 
     */
    @Import(name="imageId")
    private @Nullable Output<String> imageId;

    /**
     * @return The image identifier of the listing.
     * 
     */
    public Optional<Output<String>> imageId() {
        return Optional.ofNullable(this.imageId);
    }

    /**
     * Indicates whether to show only featured listings. If this is set to `false` or is omitted, then all listings will be returned.
     * 
     */
    @Import(name="isFeatured")
    private @Nullable Output<Boolean> isFeatured;

    /**
     * @return Indicates whether to show only featured listings. If this is set to `false` or is omitted, then all listings will be returned.
     * 
     */
    public Optional<Output<Boolean>> isFeatured() {
        return Optional.ofNullable(this.isFeatured);
    }

    /**
     * The unique identifier for the listing.
     * 
     */
    @Import(name="listingId")
    private @Nullable Output<String> listingId;

    /**
     * @return The unique identifier for the listing.
     * 
     */
    public Optional<Output<String>> listingId() {
        return Optional.ofNullable(this.listingId);
    }

    /**
     * The type of the listing.
     * 
     */
    @Import(name="listingTypes")
    private @Nullable Output<List<String>> listingTypes;

    /**
     * @return The type of the listing.
     * 
     */
    public Optional<Output<List<String>>> listingTypes() {
        return Optional.ofNullable(this.listingTypes);
    }

    /**
     * The name of the listing.
     * 
     */
    @Import(name="names")
    private @Nullable Output<List<String>> names;

    /**
     * @return The name of the listing.
     * 
     */
    public Optional<Output<List<String>>> names() {
        return Optional.ofNullable(this.names);
    }

    /**
     * The operating system of the listing.
     * 
     */
    @Import(name="operatingSystems")
    private @Nullable Output<List<String>> operatingSystems;

    /**
     * @return The operating system of the listing.
     * 
     */
    public Optional<Output<List<String>>> operatingSystems() {
        return Optional.ofNullable(this.operatingSystems);
    }

    /**
     * A filter to return only packages that match the given package type exactly.
     * 
     */
    @Import(name="packageType")
    private @Nullable Output<String> packageType;

    /**
     * @return A filter to return only packages that match the given package type exactly.
     * 
     */
    public Optional<Output<String>> packageType() {
        return Optional.ofNullable(this.packageType);
    }

    /**
     * Name of the pricing type. If multiple pricing types are provided, then any listing with one or more matching pricing models will be returned.
     * 
     */
    @Import(name="pricings")
    private @Nullable Output<List<String>> pricings;

    /**
     * @return Name of the pricing type. If multiple pricing types are provided, then any listing with one or more matching pricing models will be returned.
     * 
     */
    public Optional<Output<List<String>>> pricings() {
        return Optional.ofNullable(this.pricings);
    }

    /**
     * Limit results to just this publisher.
     * 
     */
    @Import(name="publisherId")
    private @Nullable Output<String> publisherId;

    /**
     * @return Limit results to just this publisher.
     * 
     */
    public Optional<Output<String>> publisherId() {
        return Optional.ofNullable(this.publisherId);
    }

    private GetListingsArgs() {}

    private GetListingsArgs(GetListingsArgs $) {
        this.categories = $.categories;
        this.compartmentId = $.compartmentId;
        this.filters = $.filters;
        this.imageId = $.imageId;
        this.isFeatured = $.isFeatured;
        this.listingId = $.listingId;
        this.listingTypes = $.listingTypes;
        this.names = $.names;
        this.operatingSystems = $.operatingSystems;
        this.packageType = $.packageType;
        this.pricings = $.pricings;
        this.publisherId = $.publisherId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetListingsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetListingsArgs $;

        public Builder() {
            $ = new GetListingsArgs();
        }

        public Builder(GetListingsArgs defaults) {
            $ = new GetListingsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param categories Name of the product category or categories. If you specify multiple categories, then Marketplace returns any listing with one or more matching categories.
         * 
         * @return builder
         * 
         */
        public Builder categories(@Nullable Output<List<String>> categories) {
            $.categories = categories;
            return this;
        }

        /**
         * @param categories Name of the product category or categories. If you specify multiple categories, then Marketplace returns any listing with one or more matching categories.
         * 
         * @return builder
         * 
         */
        public Builder categories(List<String> categories) {
            return categories(Output.of(categories));
        }

        /**
         * @param categories Name of the product category or categories. If you specify multiple categories, then Marketplace returns any listing with one or more matching categories.
         * 
         * @return builder
         * 
         */
        public Builder categories(String... categories) {
            return categories(List.of(categories));
        }

        /**
         * @param compartmentId The unique identifier for the compartment.
         * 
         * @return builder
         * 
         */
        public Builder compartmentId(@Nullable Output<String> compartmentId) {
            $.compartmentId = compartmentId;
            return this;
        }

        /**
         * @param compartmentId The unique identifier for the compartment.
         * 
         * @return builder
         * 
         */
        public Builder compartmentId(String compartmentId) {
            return compartmentId(Output.of(compartmentId));
        }

        public Builder filters(@Nullable Output<List<GetListingsFilterArgs>> filters) {
            $.filters = filters;
            return this;
        }

        public Builder filters(List<GetListingsFilterArgs> filters) {
            return filters(Output.of(filters));
        }

        public Builder filters(GetListingsFilterArgs... filters) {
            return filters(List.of(filters));
        }

        /**
         * @param imageId The image identifier of the listing.
         * 
         * @return builder
         * 
         */
        public Builder imageId(@Nullable Output<String> imageId) {
            $.imageId = imageId;
            return this;
        }

        /**
         * @param imageId The image identifier of the listing.
         * 
         * @return builder
         * 
         */
        public Builder imageId(String imageId) {
            return imageId(Output.of(imageId));
        }

        /**
         * @param isFeatured Indicates whether to show only featured listings. If this is set to `false` or is omitted, then all listings will be returned.
         * 
         * @return builder
         * 
         */
        public Builder isFeatured(@Nullable Output<Boolean> isFeatured) {
            $.isFeatured = isFeatured;
            return this;
        }

        /**
         * @param isFeatured Indicates whether to show only featured listings. If this is set to `false` or is omitted, then all listings will be returned.
         * 
         * @return builder
         * 
         */
        public Builder isFeatured(Boolean isFeatured) {
            return isFeatured(Output.of(isFeatured));
        }

        /**
         * @param listingId The unique identifier for the listing.
         * 
         * @return builder
         * 
         */
        public Builder listingId(@Nullable Output<String> listingId) {
            $.listingId = listingId;
            return this;
        }

        /**
         * @param listingId The unique identifier for the listing.
         * 
         * @return builder
         * 
         */
        public Builder listingId(String listingId) {
            return listingId(Output.of(listingId));
        }

        /**
         * @param listingTypes The type of the listing.
         * 
         * @return builder
         * 
         */
        public Builder listingTypes(@Nullable Output<List<String>> listingTypes) {
            $.listingTypes = listingTypes;
            return this;
        }

        /**
         * @param listingTypes The type of the listing.
         * 
         * @return builder
         * 
         */
        public Builder listingTypes(List<String> listingTypes) {
            return listingTypes(Output.of(listingTypes));
        }

        /**
         * @param listingTypes The type of the listing.
         * 
         * @return builder
         * 
         */
        public Builder listingTypes(String... listingTypes) {
            return listingTypes(List.of(listingTypes));
        }

        /**
         * @param names The name of the listing.
         * 
         * @return builder
         * 
         */
        public Builder names(@Nullable Output<List<String>> names) {
            $.names = names;
            return this;
        }

        /**
         * @param names The name of the listing.
         * 
         * @return builder
         * 
         */
        public Builder names(List<String> names) {
            return names(Output.of(names));
        }

        /**
         * @param names The name of the listing.
         * 
         * @return builder
         * 
         */
        public Builder names(String... names) {
            return names(List.of(names));
        }

        /**
         * @param operatingSystems The operating system of the listing.
         * 
         * @return builder
         * 
         */
        public Builder operatingSystems(@Nullable Output<List<String>> operatingSystems) {
            $.operatingSystems = operatingSystems;
            return this;
        }

        /**
         * @param operatingSystems The operating system of the listing.
         * 
         * @return builder
         * 
         */
        public Builder operatingSystems(List<String> operatingSystems) {
            return operatingSystems(Output.of(operatingSystems));
        }

        /**
         * @param operatingSystems The operating system of the listing.
         * 
         * @return builder
         * 
         */
        public Builder operatingSystems(String... operatingSystems) {
            return operatingSystems(List.of(operatingSystems));
        }

        /**
         * @param packageType A filter to return only packages that match the given package type exactly.
         * 
         * @return builder
         * 
         */
        public Builder packageType(@Nullable Output<String> packageType) {
            $.packageType = packageType;
            return this;
        }

        /**
         * @param packageType A filter to return only packages that match the given package type exactly.
         * 
         * @return builder
         * 
         */
        public Builder packageType(String packageType) {
            return packageType(Output.of(packageType));
        }

        /**
         * @param pricings Name of the pricing type. If multiple pricing types are provided, then any listing with one or more matching pricing models will be returned.
         * 
         * @return builder
         * 
         */
        public Builder pricings(@Nullable Output<List<String>> pricings) {
            $.pricings = pricings;
            return this;
        }

        /**
         * @param pricings Name of the pricing type. If multiple pricing types are provided, then any listing with one or more matching pricing models will be returned.
         * 
         * @return builder
         * 
         */
        public Builder pricings(List<String> pricings) {
            return pricings(Output.of(pricings));
        }

        /**
         * @param pricings Name of the pricing type. If multiple pricing types are provided, then any listing with one or more matching pricing models will be returned.
         * 
         * @return builder
         * 
         */
        public Builder pricings(String... pricings) {
            return pricings(List.of(pricings));
        }

        /**
         * @param publisherId Limit results to just this publisher.
         * 
         * @return builder
         * 
         */
        public Builder publisherId(@Nullable Output<String> publisherId) {
            $.publisherId = publisherId;
            return this;
        }

        /**
         * @param publisherId Limit results to just this publisher.
         * 
         * @return builder
         * 
         */
        public Builder publisherId(String publisherId) {
            return publisherId(Output.of(publisherId));
        }

        public GetListingsArgs build() {
            return $;
        }
    }

}
