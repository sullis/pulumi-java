// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.powerplatform.inputs;

import com.pulumi.azurenative.powerplatform.inputs.VirtualNetworkPropertiesResponse;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * A list of private link resources
 * 
 */
public final class VirtualNetworkPropertiesListResponse extends com.pulumi.resources.InvokeArgs {

    public static final VirtualNetworkPropertiesListResponse Empty = new VirtualNetworkPropertiesListResponse();

    /**
     * Next page link if any.
     * 
     */
    @Import(name="nextLink")
    private @Nullable String nextLink;

    /**
     * @return Next page link if any.
     * 
     */
    public Optional<String> nextLink() {
        return Optional.ofNullable(this.nextLink);
    }

    /**
     * Array of virtual networks.
     * 
     */
    @Import(name="value")
    private @Nullable List<VirtualNetworkPropertiesResponse> value;

    /**
     * @return Array of virtual networks.
     * 
     */
    public Optional<List<VirtualNetworkPropertiesResponse>> value() {
        return Optional.ofNullable(this.value);
    }

    private VirtualNetworkPropertiesListResponse() {}

    private VirtualNetworkPropertiesListResponse(VirtualNetworkPropertiesListResponse $) {
        this.nextLink = $.nextLink;
        this.value = $.value;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(VirtualNetworkPropertiesListResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private VirtualNetworkPropertiesListResponse $;

        public Builder() {
            $ = new VirtualNetworkPropertiesListResponse();
        }

        public Builder(VirtualNetworkPropertiesListResponse defaults) {
            $ = new VirtualNetworkPropertiesListResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param nextLink Next page link if any.
         * 
         * @return builder
         * 
         */
        public Builder nextLink(@Nullable String nextLink) {
            $.nextLink = nextLink;
            return this;
        }

        /**
         * @param value Array of virtual networks.
         * 
         * @return builder
         * 
         */
        public Builder value(@Nullable List<VirtualNetworkPropertiesResponse> value) {
            $.value = value;
            return this;
        }

        /**
         * @param value Array of virtual networks.
         * 
         * @return builder
         * 
         */
        public Builder value(VirtualNetworkPropertiesResponse... value) {
            return value(List.of(value));
        }

        public VirtualNetworkPropertiesListResponse build() {
            return $;
        }
    }

}
