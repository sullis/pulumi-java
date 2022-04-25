// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute_v1.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * A policy that specifies how requests intended for the route&#39;s backends are shadowed to a separate mirrored backend service. The load balancer doesn&#39;t wait for responses from the shadow service. Before sending traffic to the shadow service, the host or authority header is suffixed with -shadow.
 * 
 */
public final class RequestMirrorPolicyResponse extends com.pulumi.resources.InvokeArgs {

    public static final RequestMirrorPolicyResponse Empty = new RequestMirrorPolicyResponse();

    /**
     * The full or partial URL to the BackendService resource being mirrored to.
     * 
     */
    @Import(name="backendService", required=true)
    private String backendService;

    /**
     * @return The full or partial URL to the BackendService resource being mirrored to.
     * 
     */
    public String backendService() {
        return this.backendService;
    }

    private RequestMirrorPolicyResponse() {}

    private RequestMirrorPolicyResponse(RequestMirrorPolicyResponse $) {
        this.backendService = $.backendService;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RequestMirrorPolicyResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RequestMirrorPolicyResponse $;

        public Builder() {
            $ = new RequestMirrorPolicyResponse();
        }

        public Builder(RequestMirrorPolicyResponse defaults) {
            $ = new RequestMirrorPolicyResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param backendService The full or partial URL to the BackendService resource being mirrored to.
         * 
         * @return builder
         * 
         */
        public Builder backendService(String backendService) {
            $.backendService = backendService;
            return this;
        }

        public RequestMirrorPolicyResponse build() {
            $.backendService = Objects.requireNonNull($.backendService, "expected parameter 'backendService' to be non-null");
            return $;
        }
    }

}
