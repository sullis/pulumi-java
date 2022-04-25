// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.labservices.inputs;

import com.pulumi.azurenative.labservices.inputs.SizeInfoResponse;
import com.pulumi.core.annotations.Import;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Represents a size category supported by this Lab Account (small, medium or large)
 * 
 */
public final class EnvironmentSizeResponse extends com.pulumi.resources.InvokeArgs {

    public static final EnvironmentSizeResponse Empty = new EnvironmentSizeResponse();

    /**
     * The pay-as-you-go dollar price per hour this size will cost. It does not include discounts and may not reflect the actual price the size will cost. This is the maximum price of all prices within this tier.
     * 
     */
    @Import(name="maxPrice", required=true)
    private Double maxPrice;

    /**
     * @return The pay-as-you-go dollar price per hour this size will cost. It does not include discounts and may not reflect the actual price the size will cost. This is the maximum price of all prices within this tier.
     * 
     */
    public Double maxPrice() {
        return this.maxPrice;
    }

    /**
     * The amount of memory available (in GB). This is the minimum amount of memory within this tier.
     * 
     */
    @Import(name="minMemory", required=true)
    private Double minMemory;

    /**
     * @return The amount of memory available (in GB). This is the minimum amount of memory within this tier.
     * 
     */
    public Double minMemory() {
        return this.minMemory;
    }

    /**
     * The number of cores a VM of this size has. This is the minimum number of cores within this tier.
     * 
     */
    @Import(name="minNumberOfCores", required=true)
    private Integer minNumberOfCores;

    /**
     * @return The number of cores a VM of this size has. This is the minimum number of cores within this tier.
     * 
     */
    public Integer minNumberOfCores() {
        return this.minNumberOfCores;
    }

    /**
     * The size category
     * 
     */
    @Import(name="name")
    private @Nullable String name;

    /**
     * @return The size category
     * 
     */
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Represents a set of compute sizes that can serve this given size type
     * 
     */
    @Import(name="vmSizes")
    private @Nullable List<SizeInfoResponse> vmSizes;

    /**
     * @return Represents a set of compute sizes that can serve this given size type
     * 
     */
    public Optional<List<SizeInfoResponse>> vmSizes() {
        return Optional.ofNullable(this.vmSizes);
    }

    private EnvironmentSizeResponse() {}

    private EnvironmentSizeResponse(EnvironmentSizeResponse $) {
        this.maxPrice = $.maxPrice;
        this.minMemory = $.minMemory;
        this.minNumberOfCores = $.minNumberOfCores;
        this.name = $.name;
        this.vmSizes = $.vmSizes;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(EnvironmentSizeResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private EnvironmentSizeResponse $;

        public Builder() {
            $ = new EnvironmentSizeResponse();
        }

        public Builder(EnvironmentSizeResponse defaults) {
            $ = new EnvironmentSizeResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param maxPrice The pay-as-you-go dollar price per hour this size will cost. It does not include discounts and may not reflect the actual price the size will cost. This is the maximum price of all prices within this tier.
         * 
         * @return builder
         * 
         */
        public Builder maxPrice(Double maxPrice) {
            $.maxPrice = maxPrice;
            return this;
        }

        /**
         * @param minMemory The amount of memory available (in GB). This is the minimum amount of memory within this tier.
         * 
         * @return builder
         * 
         */
        public Builder minMemory(Double minMemory) {
            $.minMemory = minMemory;
            return this;
        }

        /**
         * @param minNumberOfCores The number of cores a VM of this size has. This is the minimum number of cores within this tier.
         * 
         * @return builder
         * 
         */
        public Builder minNumberOfCores(Integer minNumberOfCores) {
            $.minNumberOfCores = minNumberOfCores;
            return this;
        }

        /**
         * @param name The size category
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable String name) {
            $.name = name;
            return this;
        }

        /**
         * @param vmSizes Represents a set of compute sizes that can serve this given size type
         * 
         * @return builder
         * 
         */
        public Builder vmSizes(@Nullable List<SizeInfoResponse> vmSizes) {
            $.vmSizes = vmSizes;
            return this;
        }

        /**
         * @param vmSizes Represents a set of compute sizes that can serve this given size type
         * 
         * @return builder
         * 
         */
        public Builder vmSizes(SizeInfoResponse... vmSizes) {
            return vmSizes(List.of(vmSizes));
        }

        public EnvironmentSizeResponse build() {
            $.maxPrice = Objects.requireNonNull($.maxPrice, "expected parameter 'maxPrice' to be non-null");
            $.minMemory = Objects.requireNonNull($.minMemory, "expected parameter 'minMemory' to be non-null");
            $.minNumberOfCores = Objects.requireNonNull($.minNumberOfCores, "expected parameter 'minNumberOfCores' to be non-null");
            return $;
        }
    }

}
