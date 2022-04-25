// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute_beta.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.compute_beta.inputs.DurationResponse;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * The retry policy associates with HttpRouteRule
 * 
 */
public final class HttpRetryPolicyResponse extends com.pulumi.resources.InvokeArgs {

    public static final HttpRetryPolicyResponse Empty = new HttpRetryPolicyResponse();

    /**
     * Specifies the allowed number retries. This number must be &gt; 0. If not specified, defaults to 1.
     * 
     */
    @Import(name="numRetries", required=true)
    private Integer numRetries;

    /**
     * @return Specifies the allowed number retries. This number must be &gt; 0. If not specified, defaults to 1.
     * 
     */
    public Integer numRetries() {
        return this.numRetries;
    }

    /**
     * Specifies a non-zero timeout per retry attempt. If not specified, will use the timeout set in the HttpRouteAction field. If timeout in the HttpRouteAction field is not set, this field uses the largest timeout among all backend services associated with the route. Not supported when the URL map is bound to a target gRPC proxy that has the validateForProxyless field set to true.
     * 
     */
    @Import(name="perTryTimeout", required=true)
    private DurationResponse perTryTimeout;

    /**
     * @return Specifies a non-zero timeout per retry attempt. If not specified, will use the timeout set in the HttpRouteAction field. If timeout in the HttpRouteAction field is not set, this field uses the largest timeout among all backend services associated with the route. Not supported when the URL map is bound to a target gRPC proxy that has the validateForProxyless field set to true.
     * 
     */
    public DurationResponse perTryTimeout() {
        return this.perTryTimeout;
    }

    /**
     * Specifies one or more conditions when this retry policy applies. Valid values are: - 5xx: retry is attempted if the instance or endpoint responds with any 5xx response code, or if the instance or endpoint does not respond at all. For example, disconnects, reset, read timeout, connection failure, and refused streams. - gateway-error: Similar to 5xx, but only applies to response codes 502, 503 or 504. - connect-failure: a retry is attempted on failures connecting to the instance or endpoint. For example, connection timeouts. - retriable-4xx: a retry is attempted if the instance or endpoint responds with a 4xx response code. The only error that you can retry is error code 409. - refused-stream: a retry is attempted if the instance or endpoint resets the stream with a REFUSED_STREAM error code. This reset type indicates that it is safe to retry. - cancelled: a retry is attempted if the gRPC status code in the response header is set to cancelled. - deadline-exceeded: a retry is attempted if the gRPC status code in the response header is set to deadline-exceeded. - internal: a retry is attempted if the gRPC status code in the response header is set to internal. - resource-exhausted: a retry is attempted if the gRPC status code in the response header is set to resource-exhausted. - unavailable: a retry is attempted if the gRPC status code in the response header is set to unavailable. Only the following codes are supported when the URL map is bound to target gRPC proxy that has validateForProxyless field set to true. - cancelled - deadline-exceeded - internal - resource-exhausted - unavailable
     * 
     */
    @Import(name="retryConditions", required=true)
    private List<String> retryConditions;

    /**
     * @return Specifies one or more conditions when this retry policy applies. Valid values are: - 5xx: retry is attempted if the instance or endpoint responds with any 5xx response code, or if the instance or endpoint does not respond at all. For example, disconnects, reset, read timeout, connection failure, and refused streams. - gateway-error: Similar to 5xx, but only applies to response codes 502, 503 or 504. - connect-failure: a retry is attempted on failures connecting to the instance or endpoint. For example, connection timeouts. - retriable-4xx: a retry is attempted if the instance or endpoint responds with a 4xx response code. The only error that you can retry is error code 409. - refused-stream: a retry is attempted if the instance or endpoint resets the stream with a REFUSED_STREAM error code. This reset type indicates that it is safe to retry. - cancelled: a retry is attempted if the gRPC status code in the response header is set to cancelled. - deadline-exceeded: a retry is attempted if the gRPC status code in the response header is set to deadline-exceeded. - internal: a retry is attempted if the gRPC status code in the response header is set to internal. - resource-exhausted: a retry is attempted if the gRPC status code in the response header is set to resource-exhausted. - unavailable: a retry is attempted if the gRPC status code in the response header is set to unavailable. Only the following codes are supported when the URL map is bound to target gRPC proxy that has validateForProxyless field set to true. - cancelled - deadline-exceeded - internal - resource-exhausted - unavailable
     * 
     */
    public List<String> retryConditions() {
        return this.retryConditions;
    }

    private HttpRetryPolicyResponse() {}

    private HttpRetryPolicyResponse(HttpRetryPolicyResponse $) {
        this.numRetries = $.numRetries;
        this.perTryTimeout = $.perTryTimeout;
        this.retryConditions = $.retryConditions;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(HttpRetryPolicyResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private HttpRetryPolicyResponse $;

        public Builder() {
            $ = new HttpRetryPolicyResponse();
        }

        public Builder(HttpRetryPolicyResponse defaults) {
            $ = new HttpRetryPolicyResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param numRetries Specifies the allowed number retries. This number must be &gt; 0. If not specified, defaults to 1.
         * 
         * @return builder
         * 
         */
        public Builder numRetries(Integer numRetries) {
            $.numRetries = numRetries;
            return this;
        }

        /**
         * @param perTryTimeout Specifies a non-zero timeout per retry attempt. If not specified, will use the timeout set in the HttpRouteAction field. If timeout in the HttpRouteAction field is not set, this field uses the largest timeout among all backend services associated with the route. Not supported when the URL map is bound to a target gRPC proxy that has the validateForProxyless field set to true.
         * 
         * @return builder
         * 
         */
        public Builder perTryTimeout(DurationResponse perTryTimeout) {
            $.perTryTimeout = perTryTimeout;
            return this;
        }

        /**
         * @param retryConditions Specifies one or more conditions when this retry policy applies. Valid values are: - 5xx: retry is attempted if the instance or endpoint responds with any 5xx response code, or if the instance or endpoint does not respond at all. For example, disconnects, reset, read timeout, connection failure, and refused streams. - gateway-error: Similar to 5xx, but only applies to response codes 502, 503 or 504. - connect-failure: a retry is attempted on failures connecting to the instance or endpoint. For example, connection timeouts. - retriable-4xx: a retry is attempted if the instance or endpoint responds with a 4xx response code. The only error that you can retry is error code 409. - refused-stream: a retry is attempted if the instance or endpoint resets the stream with a REFUSED_STREAM error code. This reset type indicates that it is safe to retry. - cancelled: a retry is attempted if the gRPC status code in the response header is set to cancelled. - deadline-exceeded: a retry is attempted if the gRPC status code in the response header is set to deadline-exceeded. - internal: a retry is attempted if the gRPC status code in the response header is set to internal. - resource-exhausted: a retry is attempted if the gRPC status code in the response header is set to resource-exhausted. - unavailable: a retry is attempted if the gRPC status code in the response header is set to unavailable. Only the following codes are supported when the URL map is bound to target gRPC proxy that has validateForProxyless field set to true. - cancelled - deadline-exceeded - internal - resource-exhausted - unavailable
         * 
         * @return builder
         * 
         */
        public Builder retryConditions(List<String> retryConditions) {
            $.retryConditions = retryConditions;
            return this;
        }

        /**
         * @param retryConditions Specifies one or more conditions when this retry policy applies. Valid values are: - 5xx: retry is attempted if the instance or endpoint responds with any 5xx response code, or if the instance or endpoint does not respond at all. For example, disconnects, reset, read timeout, connection failure, and refused streams. - gateway-error: Similar to 5xx, but only applies to response codes 502, 503 or 504. - connect-failure: a retry is attempted on failures connecting to the instance or endpoint. For example, connection timeouts. - retriable-4xx: a retry is attempted if the instance or endpoint responds with a 4xx response code. The only error that you can retry is error code 409. - refused-stream: a retry is attempted if the instance or endpoint resets the stream with a REFUSED_STREAM error code. This reset type indicates that it is safe to retry. - cancelled: a retry is attempted if the gRPC status code in the response header is set to cancelled. - deadline-exceeded: a retry is attempted if the gRPC status code in the response header is set to deadline-exceeded. - internal: a retry is attempted if the gRPC status code in the response header is set to internal. - resource-exhausted: a retry is attempted if the gRPC status code in the response header is set to resource-exhausted. - unavailable: a retry is attempted if the gRPC status code in the response header is set to unavailable. Only the following codes are supported when the URL map is bound to target gRPC proxy that has validateForProxyless field set to true. - cancelled - deadline-exceeded - internal - resource-exhausted - unavailable
         * 
         * @return builder
         * 
         */
        public Builder retryConditions(String... retryConditions) {
            return retryConditions(List.of(retryConditions));
        }

        public HttpRetryPolicyResponse build() {
            $.numRetries = Objects.requireNonNull($.numRetries, "expected parameter 'numRetries' to be non-null");
            $.perTryTimeout = Objects.requireNonNull($.perTryTimeout, "expected parameter 'perTryTimeout' to be non-null");
            $.retryConditions = Objects.requireNonNull($.retryConditions, "expected parameter 'retryConditions' to be non-null");
            return $;
        }
    }

}
