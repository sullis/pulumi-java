// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.web;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class WebAppPremierAddOnArgs extends com.pulumi.resources.ResourceArgs {

    public static final WebAppPremierAddOnArgs Empty = new WebAppPremierAddOnArgs();

    /**
     * Kind of resource.
     * 
     */
    @Import(name="kind")
    private @Nullable Output<String> kind;

    /**
     * @return Kind of resource.
     * 
     */
    public Optional<Output<String>> kind() {
        return Optional.ofNullable(this.kind);
    }

    /**
     * Resource Location.
     * 
     */
    @Import(name="location")
    private @Nullable Output<String> location;

    /**
     * @return Resource Location.
     * 
     */
    public Optional<Output<String>> location() {
        return Optional.ofNullable(this.location);
    }

    /**
     * Premier add on Marketplace offer.
     * 
     */
    @Import(name="marketplaceOffer")
    private @Nullable Output<String> marketplaceOffer;

    /**
     * @return Premier add on Marketplace offer.
     * 
     */
    public Optional<Output<String>> marketplaceOffer() {
        return Optional.ofNullable(this.marketplaceOffer);
    }

    /**
     * Premier add on Marketplace publisher.
     * 
     */
    @Import(name="marketplacePublisher")
    private @Nullable Output<String> marketplacePublisher;

    /**
     * @return Premier add on Marketplace publisher.
     * 
     */
    public Optional<Output<String>> marketplacePublisher() {
        return Optional.ofNullable(this.marketplacePublisher);
    }

    /**
     * Name of the app.
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return Name of the app.
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    /**
     * Add-on name.
     * 
     */
    @Import(name="premierAddOnName")
    private @Nullable Output<String> premierAddOnName;

    /**
     * @return Add-on name.
     * 
     */
    public Optional<Output<String>> premierAddOnName() {
        return Optional.ofNullable(this.premierAddOnName);
    }

    /**
     * Premier add on Product.
     * 
     */
    @Import(name="product")
    private @Nullable Output<String> product;

    /**
     * @return Premier add on Product.
     * 
     */
    public Optional<Output<String>> product() {
        return Optional.ofNullable(this.product);
    }

    /**
     * Name of the resource group to which the resource belongs.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    /**
     * @return Name of the resource group to which the resource belongs.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * Premier add on SKU.
     * 
     */
    @Import(name="sku")
    private @Nullable Output<String> sku;

    /**
     * @return Premier add on SKU.
     * 
     */
    public Optional<Output<String>> sku() {
        return Optional.ofNullable(this.sku);
    }

    /**
     * Resource tags.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    /**
     * @return Resource tags.
     * 
     */
    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    /**
     * Premier add on Vendor.
     * 
     */
    @Import(name="vendor")
    private @Nullable Output<String> vendor;

    /**
     * @return Premier add on Vendor.
     * 
     */
    public Optional<Output<String>> vendor() {
        return Optional.ofNullable(this.vendor);
    }

    private WebAppPremierAddOnArgs() {}

    private WebAppPremierAddOnArgs(WebAppPremierAddOnArgs $) {
        this.kind = $.kind;
        this.location = $.location;
        this.marketplaceOffer = $.marketplaceOffer;
        this.marketplacePublisher = $.marketplacePublisher;
        this.name = $.name;
        this.premierAddOnName = $.premierAddOnName;
        this.product = $.product;
        this.resourceGroupName = $.resourceGroupName;
        this.sku = $.sku;
        this.tags = $.tags;
        this.vendor = $.vendor;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(WebAppPremierAddOnArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private WebAppPremierAddOnArgs $;

        public Builder() {
            $ = new WebAppPremierAddOnArgs();
        }

        public Builder(WebAppPremierAddOnArgs defaults) {
            $ = new WebAppPremierAddOnArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param kind Kind of resource.
         * 
         * @return builder
         * 
         */
        public Builder kind(@Nullable Output<String> kind) {
            $.kind = kind;
            return this;
        }

        /**
         * @param kind Kind of resource.
         * 
         * @return builder
         * 
         */
        public Builder kind(String kind) {
            return kind(Output.of(kind));
        }

        /**
         * @param location Resource Location.
         * 
         * @return builder
         * 
         */
        public Builder location(@Nullable Output<String> location) {
            $.location = location;
            return this;
        }

        /**
         * @param location Resource Location.
         * 
         * @return builder
         * 
         */
        public Builder location(String location) {
            return location(Output.of(location));
        }

        /**
         * @param marketplaceOffer Premier add on Marketplace offer.
         * 
         * @return builder
         * 
         */
        public Builder marketplaceOffer(@Nullable Output<String> marketplaceOffer) {
            $.marketplaceOffer = marketplaceOffer;
            return this;
        }

        /**
         * @param marketplaceOffer Premier add on Marketplace offer.
         * 
         * @return builder
         * 
         */
        public Builder marketplaceOffer(String marketplaceOffer) {
            return marketplaceOffer(Output.of(marketplaceOffer));
        }

        /**
         * @param marketplacePublisher Premier add on Marketplace publisher.
         * 
         * @return builder
         * 
         */
        public Builder marketplacePublisher(@Nullable Output<String> marketplacePublisher) {
            $.marketplacePublisher = marketplacePublisher;
            return this;
        }

        /**
         * @param marketplacePublisher Premier add on Marketplace publisher.
         * 
         * @return builder
         * 
         */
        public Builder marketplacePublisher(String marketplacePublisher) {
            return marketplacePublisher(Output.of(marketplacePublisher));
        }

        /**
         * @param name Name of the app.
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Name of the app.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param premierAddOnName Add-on name.
         * 
         * @return builder
         * 
         */
        public Builder premierAddOnName(@Nullable Output<String> premierAddOnName) {
            $.premierAddOnName = premierAddOnName;
            return this;
        }

        /**
         * @param premierAddOnName Add-on name.
         * 
         * @return builder
         * 
         */
        public Builder premierAddOnName(String premierAddOnName) {
            return premierAddOnName(Output.of(premierAddOnName));
        }

        /**
         * @param product Premier add on Product.
         * 
         * @return builder
         * 
         */
        public Builder product(@Nullable Output<String> product) {
            $.product = product;
            return this;
        }

        /**
         * @param product Premier add on Product.
         * 
         * @return builder
         * 
         */
        public Builder product(String product) {
            return product(Output.of(product));
        }

        /**
         * @param resourceGroupName Name of the resource group to which the resource belongs.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName Name of the resource group to which the resource belongs.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        /**
         * @param sku Premier add on SKU.
         * 
         * @return builder
         * 
         */
        public Builder sku(@Nullable Output<String> sku) {
            $.sku = sku;
            return this;
        }

        /**
         * @param sku Premier add on SKU.
         * 
         * @return builder
         * 
         */
        public Builder sku(String sku) {
            return sku(Output.of(sku));
        }

        /**
         * @param tags Resource tags.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags Resource tags.
         * 
         * @return builder
         * 
         */
        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        /**
         * @param vendor Premier add on Vendor.
         * 
         * @return builder
         * 
         */
        public Builder vendor(@Nullable Output<String> vendor) {
            $.vendor = vendor;
            return this;
        }

        /**
         * @param vendor Premier add on Vendor.
         * 
         * @return builder
         * 
         */
        public Builder vendor(String vendor) {
            return vendor(Output.of(vendor));
        }

        public WebAppPremierAddOnArgs build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
