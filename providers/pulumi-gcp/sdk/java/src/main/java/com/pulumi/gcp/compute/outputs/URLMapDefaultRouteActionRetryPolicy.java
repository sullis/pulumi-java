// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.compute.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.gcp.compute.outputs.URLMapDefaultRouteActionRetryPolicyPerTryTimeout;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class URLMapDefaultRouteActionRetryPolicy {
    /**
     * @return Specifies the allowed number retries. This number must be &gt; 0. If not specified, defaults to 1.
     * 
     */
    private final @Nullable Integer numRetries;
    /**
     * @return Specifies a non-zero timeout per retry attempt.
     * If not specified, will use the timeout set in HttpRouteAction. If timeout in HttpRouteAction is not set,
     * will use the largest timeout among all backend services associated with the route.
     * Structure is documented below.
     * 
     */
    private final @Nullable URLMapDefaultRouteActionRetryPolicyPerTryTimeout perTryTimeout;
    /**
     * @return Specfies one or more conditions when this retry rule applies. Valid values are:
     * * 5xx: Loadbalancer will attempt a retry if the backend service responds with any 5xx response code,
     *   or if the backend service does not respond at all, example: disconnects, reset, read timeout,
     * * connection failure, and refused streams.
     * * gateway-error: Similar to 5xx, but only applies to response codes 502, 503 or 504.
     * * connect-failure: Loadbalancer will retry on failures connecting to backend services,
     *   for example due to connection timeouts.
     * * retriable-4xx: Loadbalancer will retry for retriable 4xx response codes.
     *   Currently the only retriable error supported is 409.
     * * refused-stream:Loadbalancer will retry if the backend service resets the stream with a REFUSED_STREAM error code.
     *   This reset type indicates that it is safe to retry.
     * * cancelled: Loadbalancer will retry if the gRPC status code in the response header is set to cancelled
     * * deadline-exceeded: Loadbalancer will retry if the gRPC status code in the response header is set to deadline-exceeded
     * * resource-exhausted: Loadbalancer will retry if the gRPC status code in the response header is set to resource-exhausted
     * * unavailable: Loadbalancer will retry if the gRPC status code in the response header is set to unavailable
     * 
     */
    private final @Nullable List<String> retryConditions;

    @CustomType.Constructor
    private URLMapDefaultRouteActionRetryPolicy(
        @CustomType.Parameter("numRetries") @Nullable Integer numRetries,
        @CustomType.Parameter("perTryTimeout") @Nullable URLMapDefaultRouteActionRetryPolicyPerTryTimeout perTryTimeout,
        @CustomType.Parameter("retryConditions") @Nullable List<String> retryConditions) {
        this.numRetries = numRetries;
        this.perTryTimeout = perTryTimeout;
        this.retryConditions = retryConditions;
    }

    /**
     * @return Specifies the allowed number retries. This number must be &gt; 0. If not specified, defaults to 1.
     * 
     */
    public Optional<Integer> numRetries() {
        return Optional.ofNullable(this.numRetries);
    }
    /**
     * @return Specifies a non-zero timeout per retry attempt.
     * If not specified, will use the timeout set in HttpRouteAction. If timeout in HttpRouteAction is not set,
     * will use the largest timeout among all backend services associated with the route.
     * Structure is documented below.
     * 
     */
    public Optional<URLMapDefaultRouteActionRetryPolicyPerTryTimeout> perTryTimeout() {
        return Optional.ofNullable(this.perTryTimeout);
    }
    /**
     * @return Specfies one or more conditions when this retry rule applies. Valid values are:
     * * 5xx: Loadbalancer will attempt a retry if the backend service responds with any 5xx response code,
     *   or if the backend service does not respond at all, example: disconnects, reset, read timeout,
     * * connection failure, and refused streams.
     * * gateway-error: Similar to 5xx, but only applies to response codes 502, 503 or 504.
     * * connect-failure: Loadbalancer will retry on failures connecting to backend services,
     *   for example due to connection timeouts.
     * * retriable-4xx: Loadbalancer will retry for retriable 4xx response codes.
     *   Currently the only retriable error supported is 409.
     * * refused-stream:Loadbalancer will retry if the backend service resets the stream with a REFUSED_STREAM error code.
     *   This reset type indicates that it is safe to retry.
     * * cancelled: Loadbalancer will retry if the gRPC status code in the response header is set to cancelled
     * * deadline-exceeded: Loadbalancer will retry if the gRPC status code in the response header is set to deadline-exceeded
     * * resource-exhausted: Loadbalancer will retry if the gRPC status code in the response header is set to resource-exhausted
     * * unavailable: Loadbalancer will retry if the gRPC status code in the response header is set to unavailable
     * 
     */
    public List<String> retryConditions() {
        return this.retryConditions == null ? List.of() : this.retryConditions;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(URLMapDefaultRouteActionRetryPolicy defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer numRetries;
        private @Nullable URLMapDefaultRouteActionRetryPolicyPerTryTimeout perTryTimeout;
        private @Nullable List<String> retryConditions;

        public Builder() {
    	      // Empty
        }

        public Builder(URLMapDefaultRouteActionRetryPolicy defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.numRetries = defaults.numRetries;
    	      this.perTryTimeout = defaults.perTryTimeout;
    	      this.retryConditions = defaults.retryConditions;
        }

        public Builder numRetries(@Nullable Integer numRetries) {
            this.numRetries = numRetries;
            return this;
        }
        public Builder perTryTimeout(@Nullable URLMapDefaultRouteActionRetryPolicyPerTryTimeout perTryTimeout) {
            this.perTryTimeout = perTryTimeout;
            return this;
        }
        public Builder retryConditions(@Nullable List<String> retryConditions) {
            this.retryConditions = retryConditions;
            return this;
        }
        public Builder retryConditions(String... retryConditions) {
            return retryConditions(List.of(retryConditions));
        }        public URLMapDefaultRouteActionRetryPolicy build() {
            return new URLMapDefaultRouteActionRetryPolicy(numRetries, perTryTimeout, retryConditions);
        }
    }
}
