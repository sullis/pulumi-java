// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.appmesh.outputs;

import io.pulumi.aws.appmesh.outputs.RouteSpecHttpRouteRetryPolicyPerRetryTimeout;
import io.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class RouteSpecHttpRouteRetryPolicy {
    /**
     * List of HTTP retry events.
     * Valid values: `client-error` (HTTP status code 409), `gateway-error` (HTTP status codes 502, 503, and 504), `server-error` (HTTP status codes 500, 501, 502, 503, 504, 505, 506, 507, 508, 510, and 511), `stream-error` (retry on refused stream).
     * Valid values: `client-error` (HTTP status code 409), `gateway-error` (HTTP status codes 502, 503, and 504), `server-error` (HTTP status codes 500, 501, 502, 503, 504, 505, 506, 507, 508, 510, and 511), `stream-error` (retry on refused stream).
     * 
     */
    private final @Nullable List<String> httpRetryEvents;
    /**
     * The maximum number of retries.
     * 
     */
    private final Integer maxRetries;
    /**
     * The per-retry timeout.
     * 
     */
    private final RouteSpecHttpRouteRetryPolicyPerRetryTimeout perRetryTimeout;
    /**
     * List of TCP retry events. The only valid value is `connection-error`.
     * 
     */
    private final @Nullable List<String> tcpRetryEvents;

    @CustomType.Constructor
    private RouteSpecHttpRouteRetryPolicy(
        @CustomType.Parameter("httpRetryEvents") @Nullable List<String> httpRetryEvents,
        @CustomType.Parameter("maxRetries") Integer maxRetries,
        @CustomType.Parameter("perRetryTimeout") RouteSpecHttpRouteRetryPolicyPerRetryTimeout perRetryTimeout,
        @CustomType.Parameter("tcpRetryEvents") @Nullable List<String> tcpRetryEvents) {
        this.httpRetryEvents = httpRetryEvents;
        this.maxRetries = maxRetries;
        this.perRetryTimeout = perRetryTimeout;
        this.tcpRetryEvents = tcpRetryEvents;
    }

    /**
     * List of HTTP retry events.
     * Valid values: `client-error` (HTTP status code 409), `gateway-error` (HTTP status codes 502, 503, and 504), `server-error` (HTTP status codes 500, 501, 502, 503, 504, 505, 506, 507, 508, 510, and 511), `stream-error` (retry on refused stream).
     * Valid values: `client-error` (HTTP status code 409), `gateway-error` (HTTP status codes 502, 503, and 504), `server-error` (HTTP status codes 500, 501, 502, 503, 504, 505, 506, 507, 508, 510, and 511), `stream-error` (retry on refused stream).
     * 
    */
    public List<String> httpRetryEvents() {
        return this.httpRetryEvents == null ? List.of() : this.httpRetryEvents;
    }
    /**
     * The maximum number of retries.
     * 
    */
    public Integer maxRetries() {
        return this.maxRetries;
    }
    /**
     * The per-retry timeout.
     * 
    */
    public RouteSpecHttpRouteRetryPolicyPerRetryTimeout perRetryTimeout() {
        return this.perRetryTimeout;
    }
    /**
     * List of TCP retry events. The only valid value is `connection-error`.
     * 
    */
    public List<String> tcpRetryEvents() {
        return this.tcpRetryEvents == null ? List.of() : this.tcpRetryEvents;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RouteSpecHttpRouteRetryPolicy defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<String> httpRetryEvents;
        private Integer maxRetries;
        private RouteSpecHttpRouteRetryPolicyPerRetryTimeout perRetryTimeout;
        private @Nullable List<String> tcpRetryEvents;

        public Builder() {
    	      // Empty
        }

        public Builder(RouteSpecHttpRouteRetryPolicy defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.httpRetryEvents = defaults.httpRetryEvents;
    	      this.maxRetries = defaults.maxRetries;
    	      this.perRetryTimeout = defaults.perRetryTimeout;
    	      this.tcpRetryEvents = defaults.tcpRetryEvents;
        }

        public Builder httpRetryEvents(@Nullable List<String> httpRetryEvents) {
            this.httpRetryEvents = httpRetryEvents;
            return this;
        }
        public Builder httpRetryEvents(String... httpRetryEvents) {
            return httpRetryEvents(List.of(httpRetryEvents));
        }
        public Builder maxRetries(Integer maxRetries) {
            this.maxRetries = Objects.requireNonNull(maxRetries);
            return this;
        }
        public Builder perRetryTimeout(RouteSpecHttpRouteRetryPolicyPerRetryTimeout perRetryTimeout) {
            this.perRetryTimeout = Objects.requireNonNull(perRetryTimeout);
            return this;
        }
        public Builder tcpRetryEvents(@Nullable List<String> tcpRetryEvents) {
            this.tcpRetryEvents = tcpRetryEvents;
            return this;
        }
        public Builder tcpRetryEvents(String... tcpRetryEvents) {
            return tcpRetryEvents(List.of(tcpRetryEvents));
        }        public RouteSpecHttpRouteRetryPolicy build() {
            return new RouteSpecHttpRouteRetryPolicy(httpRetryEvents, maxRetries, perRetryTimeout, tcpRetryEvents);
        }
    }
}
