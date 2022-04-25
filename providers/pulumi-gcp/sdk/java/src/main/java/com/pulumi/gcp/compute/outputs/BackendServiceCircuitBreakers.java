// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.compute.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.gcp.compute.outputs.BackendServiceCircuitBreakersConnectTimeout;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class BackendServiceCircuitBreakers {
    /**
     * @return The timeout for new network connections to hosts.
     * Structure is documented below.
     * 
     */
    private final @Nullable BackendServiceCircuitBreakersConnectTimeout connectTimeout;
    /**
     * @return The maximum number of connections to the backend cluster.
     * Defaults to 1024.
     * 
     */
    private final @Nullable Integer maxConnections;
    /**
     * @return The maximum number of pending requests to the backend cluster.
     * Defaults to 1024.
     * 
     */
    private final @Nullable Integer maxPendingRequests;
    /**
     * @return The maximum number of parallel requests to the backend cluster.
     * Defaults to 1024.
     * 
     */
    private final @Nullable Integer maxRequests;
    /**
     * @return Maximum requests for a single backend connection. This parameter
     * is respected by both the HTTP/1.1 and HTTP/2 implementations. If
     * not specified, there is no limit. Setting this parameter to 1
     * will effectively disable keep alive.
     * 
     */
    private final @Nullable Integer maxRequestsPerConnection;
    /**
     * @return The maximum number of parallel retries to the backend cluster.
     * Defaults to 3.
     * 
     */
    private final @Nullable Integer maxRetries;

    @CustomType.Constructor
    private BackendServiceCircuitBreakers(
        @CustomType.Parameter("connectTimeout") @Nullable BackendServiceCircuitBreakersConnectTimeout connectTimeout,
        @CustomType.Parameter("maxConnections") @Nullable Integer maxConnections,
        @CustomType.Parameter("maxPendingRequests") @Nullable Integer maxPendingRequests,
        @CustomType.Parameter("maxRequests") @Nullable Integer maxRequests,
        @CustomType.Parameter("maxRequestsPerConnection") @Nullable Integer maxRequestsPerConnection,
        @CustomType.Parameter("maxRetries") @Nullable Integer maxRetries) {
        this.connectTimeout = connectTimeout;
        this.maxConnections = maxConnections;
        this.maxPendingRequests = maxPendingRequests;
        this.maxRequests = maxRequests;
        this.maxRequestsPerConnection = maxRequestsPerConnection;
        this.maxRetries = maxRetries;
    }

    /**
     * @return The timeout for new network connections to hosts.
     * Structure is documented below.
     * 
     */
    public Optional<BackendServiceCircuitBreakersConnectTimeout> connectTimeout() {
        return Optional.ofNullable(this.connectTimeout);
    }
    /**
     * @return The maximum number of connections to the backend cluster.
     * Defaults to 1024.
     * 
     */
    public Optional<Integer> maxConnections() {
        return Optional.ofNullable(this.maxConnections);
    }
    /**
     * @return The maximum number of pending requests to the backend cluster.
     * Defaults to 1024.
     * 
     */
    public Optional<Integer> maxPendingRequests() {
        return Optional.ofNullable(this.maxPendingRequests);
    }
    /**
     * @return The maximum number of parallel requests to the backend cluster.
     * Defaults to 1024.
     * 
     */
    public Optional<Integer> maxRequests() {
        return Optional.ofNullable(this.maxRequests);
    }
    /**
     * @return Maximum requests for a single backend connection. This parameter
     * is respected by both the HTTP/1.1 and HTTP/2 implementations. If
     * not specified, there is no limit. Setting this parameter to 1
     * will effectively disable keep alive.
     * 
     */
    public Optional<Integer> maxRequestsPerConnection() {
        return Optional.ofNullable(this.maxRequestsPerConnection);
    }
    /**
     * @return The maximum number of parallel retries to the backend cluster.
     * Defaults to 3.
     * 
     */
    public Optional<Integer> maxRetries() {
        return Optional.ofNullable(this.maxRetries);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BackendServiceCircuitBreakers defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable BackendServiceCircuitBreakersConnectTimeout connectTimeout;
        private @Nullable Integer maxConnections;
        private @Nullable Integer maxPendingRequests;
        private @Nullable Integer maxRequests;
        private @Nullable Integer maxRequestsPerConnection;
        private @Nullable Integer maxRetries;

        public Builder() {
    	      // Empty
        }

        public Builder(BackendServiceCircuitBreakers defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.connectTimeout = defaults.connectTimeout;
    	      this.maxConnections = defaults.maxConnections;
    	      this.maxPendingRequests = defaults.maxPendingRequests;
    	      this.maxRequests = defaults.maxRequests;
    	      this.maxRequestsPerConnection = defaults.maxRequestsPerConnection;
    	      this.maxRetries = defaults.maxRetries;
        }

        public Builder connectTimeout(@Nullable BackendServiceCircuitBreakersConnectTimeout connectTimeout) {
            this.connectTimeout = connectTimeout;
            return this;
        }
        public Builder maxConnections(@Nullable Integer maxConnections) {
            this.maxConnections = maxConnections;
            return this;
        }
        public Builder maxPendingRequests(@Nullable Integer maxPendingRequests) {
            this.maxPendingRequests = maxPendingRequests;
            return this;
        }
        public Builder maxRequests(@Nullable Integer maxRequests) {
            this.maxRequests = maxRequests;
            return this;
        }
        public Builder maxRequestsPerConnection(@Nullable Integer maxRequestsPerConnection) {
            this.maxRequestsPerConnection = maxRequestsPerConnection;
            return this;
        }
        public Builder maxRetries(@Nullable Integer maxRetries) {
            this.maxRetries = maxRetries;
            return this;
        }        public BackendServiceCircuitBreakers build() {
            return new BackendServiceCircuitBreakers(connectTimeout, maxConnections, maxPendingRequests, maxRequests, maxRequestsPerConnection, maxRetries);
        }
    }
}
