// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute_alpha.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.compute_alpha.inputs.CorsPolicyResponse;
import com.pulumi.googlenative.compute_alpha.inputs.DurationResponse;
import com.pulumi.googlenative.compute_alpha.inputs.HttpFaultInjectionResponse;
import com.pulumi.googlenative.compute_alpha.inputs.HttpRetryPolicyResponse;
import com.pulumi.googlenative.compute_alpha.inputs.RequestMirrorPolicyResponse;
import com.pulumi.googlenative.compute_alpha.inputs.UrlRewriteResponse;
import com.pulumi.googlenative.compute_alpha.inputs.WeightedBackendServiceResponse;
import java.util.List;
import java.util.Objects;


public final class HttpRouteActionResponse extends com.pulumi.resources.InvokeArgs {

    public static final HttpRouteActionResponse Empty = new HttpRouteActionResponse();

    /**
     * The specification for allowing client-side cross-origin requests. For more information about the W3C recommendation for cross-origin resource sharing (CORS), see Fetch API Living Standard. Not supported when the URL map is bound to a target gRPC proxy.
     * 
     */
    @Import(name="corsPolicy", required=true)
    private CorsPolicyResponse corsPolicy;

    /**
     * @return The specification for allowing client-side cross-origin requests. For more information about the W3C recommendation for cross-origin resource sharing (CORS), see Fetch API Living Standard. Not supported when the URL map is bound to a target gRPC proxy.
     * 
     */
    public CorsPolicyResponse corsPolicy() {
        return this.corsPolicy;
    }

    /**
     * The specification for fault injection introduced into traffic to test the resiliency of clients to backend service failure. As part of fault injection, when clients send requests to a backend service, delays can be introduced by a load balancer on a percentage of requests before sending those requests to the backend service. Similarly requests from clients can be aborted by the load balancer for a percentage of requests. For the requests impacted by fault injection, timeout and retry_policy is ignored by clients that are configured with a fault_injection_policy.
     * 
     */
    @Import(name="faultInjectionPolicy", required=true)
    private HttpFaultInjectionResponse faultInjectionPolicy;

    /**
     * @return The specification for fault injection introduced into traffic to test the resiliency of clients to backend service failure. As part of fault injection, when clients send requests to a backend service, delays can be introduced by a load balancer on a percentage of requests before sending those requests to the backend service. Similarly requests from clients can be aborted by the load balancer for a percentage of requests. For the requests impacted by fault injection, timeout and retry_policy is ignored by clients that are configured with a fault_injection_policy.
     * 
     */
    public HttpFaultInjectionResponse faultInjectionPolicy() {
        return this.faultInjectionPolicy;
    }

    /**
     * Specifies the maximum duration (timeout) for streams on the selected route. Unlike the timeout field where the timeout duration starts from the time the request has been fully processed (known as *end-of-stream*), the duration in this field is computed from the beginning of the stream until the response has been processed, including all retries. A stream that does not complete in this duration is closed. If not specified, this field uses the maximum maxStreamDuration value among all backend services associated with the route. This field is only allowed if the Url map is used with backend services with loadBalancingScheme set to INTERNAL_SELF_MANAGED.
     * 
     */
    @Import(name="maxStreamDuration", required=true)
    private DurationResponse maxStreamDuration;

    /**
     * @return Specifies the maximum duration (timeout) for streams on the selected route. Unlike the timeout field where the timeout duration starts from the time the request has been fully processed (known as *end-of-stream*), the duration in this field is computed from the beginning of the stream until the response has been processed, including all retries. A stream that does not complete in this duration is closed. If not specified, this field uses the maximum maxStreamDuration value among all backend services associated with the route. This field is only allowed if the Url map is used with backend services with loadBalancingScheme set to INTERNAL_SELF_MANAGED.
     * 
     */
    public DurationResponse maxStreamDuration() {
        return this.maxStreamDuration;
    }

    /**
     * Specifies the policy on how requests intended for the route&#39;s backends are shadowed to a separate mirrored backend service. The load balancer does not wait for responses from the shadow service. Before sending traffic to the shadow service, the host / authority header is suffixed with -shadow. Not supported when the URL map is bound to a target gRPC proxy that has the validateForProxyless field set to true.
     * 
     */
    @Import(name="requestMirrorPolicy", required=true)
    private RequestMirrorPolicyResponse requestMirrorPolicy;

    /**
     * @return Specifies the policy on how requests intended for the route&#39;s backends are shadowed to a separate mirrored backend service. The load balancer does not wait for responses from the shadow service. Before sending traffic to the shadow service, the host / authority header is suffixed with -shadow. Not supported when the URL map is bound to a target gRPC proxy that has the validateForProxyless field set to true.
     * 
     */
    public RequestMirrorPolicyResponse requestMirrorPolicy() {
        return this.requestMirrorPolicy;
    }

    /**
     * Specifies the retry policy associated with this route.
     * 
     */
    @Import(name="retryPolicy", required=true)
    private HttpRetryPolicyResponse retryPolicy;

    /**
     * @return Specifies the retry policy associated with this route.
     * 
     */
    public HttpRetryPolicyResponse retryPolicy() {
        return this.retryPolicy;
    }

    /**
     * Specifies the timeout for the selected route. Timeout is computed from the time the request has been fully processed (known as *end-of-stream*) up until the response has been processed. Timeout includes all retries. If not specified, this field uses the largest timeout among all backend services associated with the route. Not supported when the URL map is bound to a target gRPC proxy that has validateForProxyless field set to true.
     * 
     */
    @Import(name="timeout", required=true)
    private DurationResponse timeout;

    /**
     * @return Specifies the timeout for the selected route. Timeout is computed from the time the request has been fully processed (known as *end-of-stream*) up until the response has been processed. Timeout includes all retries. If not specified, this field uses the largest timeout among all backend services associated with the route. Not supported when the URL map is bound to a target gRPC proxy that has validateForProxyless field set to true.
     * 
     */
    public DurationResponse timeout() {
        return this.timeout;
    }

    /**
     * The spec to modify the URL of the request, before forwarding the request to the matched service. urlRewrite is the only action supported in UrlMaps for external HTTP(S) load balancers. Not supported when the URL map is bound to a target gRPC proxy that has the validateForProxyless field set to true.
     * 
     */
    @Import(name="urlRewrite", required=true)
    private UrlRewriteResponse urlRewrite;

    /**
     * @return The spec to modify the URL of the request, before forwarding the request to the matched service. urlRewrite is the only action supported in UrlMaps for external HTTP(S) load balancers. Not supported when the URL map is bound to a target gRPC proxy that has the validateForProxyless field set to true.
     * 
     */
    public UrlRewriteResponse urlRewrite() {
        return this.urlRewrite;
    }

    /**
     * A list of weighted backend services to send traffic to when a route match occurs. The weights determine the fraction of traffic that flows to their corresponding backend service. If all traffic needs to go to a single backend service, there must be one weightedBackendService with weight set to a non-zero number. After a backend service is identified and before forwarding the request to the backend service, advanced routing actions such as URL rewrites and header transformations are applied depending on additional settings specified in this HttpRouteAction.
     * 
     */
    @Import(name="weightedBackendServices", required=true)
    private List<WeightedBackendServiceResponse> weightedBackendServices;

    /**
     * @return A list of weighted backend services to send traffic to when a route match occurs. The weights determine the fraction of traffic that flows to their corresponding backend service. If all traffic needs to go to a single backend service, there must be one weightedBackendService with weight set to a non-zero number. After a backend service is identified and before forwarding the request to the backend service, advanced routing actions such as URL rewrites and header transformations are applied depending on additional settings specified in this HttpRouteAction.
     * 
     */
    public List<WeightedBackendServiceResponse> weightedBackendServices() {
        return this.weightedBackendServices;
    }

    private HttpRouteActionResponse() {}

    private HttpRouteActionResponse(HttpRouteActionResponse $) {
        this.corsPolicy = $.corsPolicy;
        this.faultInjectionPolicy = $.faultInjectionPolicy;
        this.maxStreamDuration = $.maxStreamDuration;
        this.requestMirrorPolicy = $.requestMirrorPolicy;
        this.retryPolicy = $.retryPolicy;
        this.timeout = $.timeout;
        this.urlRewrite = $.urlRewrite;
        this.weightedBackendServices = $.weightedBackendServices;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(HttpRouteActionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private HttpRouteActionResponse $;

        public Builder() {
            $ = new HttpRouteActionResponse();
        }

        public Builder(HttpRouteActionResponse defaults) {
            $ = new HttpRouteActionResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param corsPolicy The specification for allowing client-side cross-origin requests. For more information about the W3C recommendation for cross-origin resource sharing (CORS), see Fetch API Living Standard. Not supported when the URL map is bound to a target gRPC proxy.
         * 
         * @return builder
         * 
         */
        public Builder corsPolicy(CorsPolicyResponse corsPolicy) {
            $.corsPolicy = corsPolicy;
            return this;
        }

        /**
         * @param faultInjectionPolicy The specification for fault injection introduced into traffic to test the resiliency of clients to backend service failure. As part of fault injection, when clients send requests to a backend service, delays can be introduced by a load balancer on a percentage of requests before sending those requests to the backend service. Similarly requests from clients can be aborted by the load balancer for a percentage of requests. For the requests impacted by fault injection, timeout and retry_policy is ignored by clients that are configured with a fault_injection_policy.
         * 
         * @return builder
         * 
         */
        public Builder faultInjectionPolicy(HttpFaultInjectionResponse faultInjectionPolicy) {
            $.faultInjectionPolicy = faultInjectionPolicy;
            return this;
        }

        /**
         * @param maxStreamDuration Specifies the maximum duration (timeout) for streams on the selected route. Unlike the timeout field where the timeout duration starts from the time the request has been fully processed (known as *end-of-stream*), the duration in this field is computed from the beginning of the stream until the response has been processed, including all retries. A stream that does not complete in this duration is closed. If not specified, this field uses the maximum maxStreamDuration value among all backend services associated with the route. This field is only allowed if the Url map is used with backend services with loadBalancingScheme set to INTERNAL_SELF_MANAGED.
         * 
         * @return builder
         * 
         */
        public Builder maxStreamDuration(DurationResponse maxStreamDuration) {
            $.maxStreamDuration = maxStreamDuration;
            return this;
        }

        /**
         * @param requestMirrorPolicy Specifies the policy on how requests intended for the route&#39;s backends are shadowed to a separate mirrored backend service. The load balancer does not wait for responses from the shadow service. Before sending traffic to the shadow service, the host / authority header is suffixed with -shadow. Not supported when the URL map is bound to a target gRPC proxy that has the validateForProxyless field set to true.
         * 
         * @return builder
         * 
         */
        public Builder requestMirrorPolicy(RequestMirrorPolicyResponse requestMirrorPolicy) {
            $.requestMirrorPolicy = requestMirrorPolicy;
            return this;
        }

        /**
         * @param retryPolicy Specifies the retry policy associated with this route.
         * 
         * @return builder
         * 
         */
        public Builder retryPolicy(HttpRetryPolicyResponse retryPolicy) {
            $.retryPolicy = retryPolicy;
            return this;
        }

        /**
         * @param timeout Specifies the timeout for the selected route. Timeout is computed from the time the request has been fully processed (known as *end-of-stream*) up until the response has been processed. Timeout includes all retries. If not specified, this field uses the largest timeout among all backend services associated with the route. Not supported when the URL map is bound to a target gRPC proxy that has validateForProxyless field set to true.
         * 
         * @return builder
         * 
         */
        public Builder timeout(DurationResponse timeout) {
            $.timeout = timeout;
            return this;
        }

        /**
         * @param urlRewrite The spec to modify the URL of the request, before forwarding the request to the matched service. urlRewrite is the only action supported in UrlMaps for external HTTP(S) load balancers. Not supported when the URL map is bound to a target gRPC proxy that has the validateForProxyless field set to true.
         * 
         * @return builder
         * 
         */
        public Builder urlRewrite(UrlRewriteResponse urlRewrite) {
            $.urlRewrite = urlRewrite;
            return this;
        }

        /**
         * @param weightedBackendServices A list of weighted backend services to send traffic to when a route match occurs. The weights determine the fraction of traffic that flows to their corresponding backend service. If all traffic needs to go to a single backend service, there must be one weightedBackendService with weight set to a non-zero number. After a backend service is identified and before forwarding the request to the backend service, advanced routing actions such as URL rewrites and header transformations are applied depending on additional settings specified in this HttpRouteAction.
         * 
         * @return builder
         * 
         */
        public Builder weightedBackendServices(List<WeightedBackendServiceResponse> weightedBackendServices) {
            $.weightedBackendServices = weightedBackendServices;
            return this;
        }

        /**
         * @param weightedBackendServices A list of weighted backend services to send traffic to when a route match occurs. The weights determine the fraction of traffic that flows to their corresponding backend service. If all traffic needs to go to a single backend service, there must be one weightedBackendService with weight set to a non-zero number. After a backend service is identified and before forwarding the request to the backend service, advanced routing actions such as URL rewrites and header transformations are applied depending on additional settings specified in this HttpRouteAction.
         * 
         * @return builder
         * 
         */
        public Builder weightedBackendServices(WeightedBackendServiceResponse... weightedBackendServices) {
            return weightedBackendServices(List.of(weightedBackendServices));
        }

        public HttpRouteActionResponse build() {
            $.corsPolicy = Objects.requireNonNull($.corsPolicy, "expected parameter 'corsPolicy' to be non-null");
            $.faultInjectionPolicy = Objects.requireNonNull($.faultInjectionPolicy, "expected parameter 'faultInjectionPolicy' to be non-null");
            $.maxStreamDuration = Objects.requireNonNull($.maxStreamDuration, "expected parameter 'maxStreamDuration' to be non-null");
            $.requestMirrorPolicy = Objects.requireNonNull($.requestMirrorPolicy, "expected parameter 'requestMirrorPolicy' to be non-null");
            $.retryPolicy = Objects.requireNonNull($.retryPolicy, "expected parameter 'retryPolicy' to be non-null");
            $.timeout = Objects.requireNonNull($.timeout, "expected parameter 'timeout' to be non-null");
            $.urlRewrite = Objects.requireNonNull($.urlRewrite, "expected parameter 'urlRewrite' to be non-null");
            $.weightedBackendServices = Objects.requireNonNull($.weightedBackendServices, "expected parameter 'weightedBackendServices' to be non-null");
            return $;
        }
    }

}
