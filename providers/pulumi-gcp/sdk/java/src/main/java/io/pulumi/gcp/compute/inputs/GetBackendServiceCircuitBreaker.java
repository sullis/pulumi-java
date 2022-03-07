// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.inputs;

import io.pulumi.core.annotations.InputImport;
import io.pulumi.gcp.compute.inputs.GetBackendServiceCircuitBreakerConnectTimeout;
import java.lang.Integer;
import java.util.List;
import java.util.Objects;


public final class GetBackendServiceCircuitBreaker extends io.pulumi.resources.InvokeArgs {

    public static final GetBackendServiceCircuitBreaker Empty = new GetBackendServiceCircuitBreaker();

    @InputImport(name="connectTimeouts", required=true)
      private final List<GetBackendServiceCircuitBreakerConnectTimeout> connectTimeouts;

    public List<GetBackendServiceCircuitBreakerConnectTimeout> getConnectTimeouts() {
        return this.connectTimeouts;
    }

    @InputImport(name="maxConnections", required=true)
      private final Integer maxConnections;

    public Integer getMaxConnections() {
        return this.maxConnections;
    }

    @InputImport(name="maxPendingRequests", required=true)
      private final Integer maxPendingRequests;

    public Integer getMaxPendingRequests() {
        return this.maxPendingRequests;
    }

    @InputImport(name="maxRequests", required=true)
      private final Integer maxRequests;

    public Integer getMaxRequests() {
        return this.maxRequests;
    }

    @InputImport(name="maxRequestsPerConnection", required=true)
      private final Integer maxRequestsPerConnection;

    public Integer getMaxRequestsPerConnection() {
        return this.maxRequestsPerConnection;
    }

    @InputImport(name="maxRetries", required=true)
      private final Integer maxRetries;

    public Integer getMaxRetries() {
        return this.maxRetries;
    }

    public GetBackendServiceCircuitBreaker(
        List<GetBackendServiceCircuitBreakerConnectTimeout> connectTimeouts,
        Integer maxConnections,
        Integer maxPendingRequests,
        Integer maxRequests,
        Integer maxRequestsPerConnection,
        Integer maxRetries) {
        this.connectTimeouts = Objects.requireNonNull(connectTimeouts, "expected parameter 'connectTimeouts' to be non-null");
        this.maxConnections = Objects.requireNonNull(maxConnections, "expected parameter 'maxConnections' to be non-null");
        this.maxPendingRequests = Objects.requireNonNull(maxPendingRequests, "expected parameter 'maxPendingRequests' to be non-null");
        this.maxRequests = Objects.requireNonNull(maxRequests, "expected parameter 'maxRequests' to be non-null");
        this.maxRequestsPerConnection = Objects.requireNonNull(maxRequestsPerConnection, "expected parameter 'maxRequestsPerConnection' to be non-null");
        this.maxRetries = Objects.requireNonNull(maxRetries, "expected parameter 'maxRetries' to be non-null");
    }

    private GetBackendServiceCircuitBreaker() {
        this.connectTimeouts = List.of();
        this.maxConnections = null;
        this.maxPendingRequests = null;
        this.maxRequests = null;
        this.maxRequestsPerConnection = null;
        this.maxRetries = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetBackendServiceCircuitBreaker defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<GetBackendServiceCircuitBreakerConnectTimeout> connectTimeouts;
        private Integer maxConnections;
        private Integer maxPendingRequests;
        private Integer maxRequests;
        private Integer maxRequestsPerConnection;
        private Integer maxRetries;

        public Builder() {
    	      // Empty
        }

        public Builder(GetBackendServiceCircuitBreaker defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.connectTimeouts = defaults.connectTimeouts;
    	      this.maxConnections = defaults.maxConnections;
    	      this.maxPendingRequests = defaults.maxPendingRequests;
    	      this.maxRequests = defaults.maxRequests;
    	      this.maxRequestsPerConnection = defaults.maxRequestsPerConnection;
    	      this.maxRetries = defaults.maxRetries;
        }

        public Builder setConnectTimeouts(List<GetBackendServiceCircuitBreakerConnectTimeout> connectTimeouts) {
            this.connectTimeouts = Objects.requireNonNull(connectTimeouts);
            return this;
        }

        public Builder setMaxConnections(Integer maxConnections) {
            this.maxConnections = Objects.requireNonNull(maxConnections);
            return this;
        }

        public Builder setMaxPendingRequests(Integer maxPendingRequests) {
            this.maxPendingRequests = Objects.requireNonNull(maxPendingRequests);
            return this;
        }

        public Builder setMaxRequests(Integer maxRequests) {
            this.maxRequests = Objects.requireNonNull(maxRequests);
            return this;
        }

        public Builder setMaxRequestsPerConnection(Integer maxRequestsPerConnection) {
            this.maxRequestsPerConnection = Objects.requireNonNull(maxRequestsPerConnection);
            return this;
        }

        public Builder setMaxRetries(Integer maxRetries) {
            this.maxRetries = Objects.requireNonNull(maxRetries);
            return this;
        }
        public GetBackendServiceCircuitBreaker build() {
            return new GetBackendServiceCircuitBreaker(connectTimeouts, maxConnections, maxPendingRequests, maxRequests, maxRequestsPerConnection, maxRetries);
        }
    }
}