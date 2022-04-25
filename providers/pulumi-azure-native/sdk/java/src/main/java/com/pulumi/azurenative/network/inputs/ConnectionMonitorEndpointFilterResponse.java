// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.network.inputs;

import com.pulumi.azurenative.network.inputs.ConnectionMonitorEndpointFilterItemResponse;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Describes the connection monitor endpoint filter.
 * 
 */
public final class ConnectionMonitorEndpointFilterResponse extends com.pulumi.resources.InvokeArgs {

    public static final ConnectionMonitorEndpointFilterResponse Empty = new ConnectionMonitorEndpointFilterResponse();

    /**
     * List of items in the filter.
     * 
     */
    @Import(name="items")
    private @Nullable List<ConnectionMonitorEndpointFilterItemResponse> items;

    /**
     * @return List of items in the filter.
     * 
     */
    public Optional<List<ConnectionMonitorEndpointFilterItemResponse>> items() {
        return Optional.ofNullable(this.items);
    }

    /**
     * The behavior of the endpoint filter. Currently only &#39;Include&#39; is supported.
     * 
     */
    @Import(name="type")
    private @Nullable String type;

    /**
     * @return The behavior of the endpoint filter. Currently only &#39;Include&#39; is supported.
     * 
     */
    public Optional<String> type() {
        return Optional.ofNullable(this.type);
    }

    private ConnectionMonitorEndpointFilterResponse() {}

    private ConnectionMonitorEndpointFilterResponse(ConnectionMonitorEndpointFilterResponse $) {
        this.items = $.items;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ConnectionMonitorEndpointFilterResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ConnectionMonitorEndpointFilterResponse $;

        public Builder() {
            $ = new ConnectionMonitorEndpointFilterResponse();
        }

        public Builder(ConnectionMonitorEndpointFilterResponse defaults) {
            $ = new ConnectionMonitorEndpointFilterResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param items List of items in the filter.
         * 
         * @return builder
         * 
         */
        public Builder items(@Nullable List<ConnectionMonitorEndpointFilterItemResponse> items) {
            $.items = items;
            return this;
        }

        /**
         * @param items List of items in the filter.
         * 
         * @return builder
         * 
         */
        public Builder items(ConnectionMonitorEndpointFilterItemResponse... items) {
            return items(List.of(items));
        }

        /**
         * @param type The behavior of the endpoint filter. Currently only &#39;Include&#39; is supported.
         * 
         * @return builder
         * 
         */
        public Builder type(@Nullable String type) {
            $.type = type;
            return this;
        }

        public ConnectionMonitorEndpointFilterResponse build() {
            return $;
        }
    }

}
