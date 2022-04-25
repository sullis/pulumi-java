// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.compute.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class RegionUrlMapPathMatcherPathRuleRouteActionRequestMirrorPolicy {
    /**
     * @return The default RegionBackendService resource. Before
     * forwarding the request to backendService, the loadbalancer applies any relevant
     * headerActions specified as part of this backendServiceWeight.
     * 
     */
    private final String backendService;

    @CustomType.Constructor
    private RegionUrlMapPathMatcherPathRuleRouteActionRequestMirrorPolicy(@CustomType.Parameter("backendService") String backendService) {
        this.backendService = backendService;
    }

    /**
     * @return The default RegionBackendService resource. Before
     * forwarding the request to backendService, the loadbalancer applies any relevant
     * headerActions specified as part of this backendServiceWeight.
     * 
     */
    public String backendService() {
        return this.backendService;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RegionUrlMapPathMatcherPathRuleRouteActionRequestMirrorPolicy defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String backendService;

        public Builder() {
    	      // Empty
        }

        public Builder(RegionUrlMapPathMatcherPathRuleRouteActionRequestMirrorPolicy defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.backendService = defaults.backendService;
        }

        public Builder backendService(String backendService) {
            this.backendService = Objects.requireNonNull(backendService);
            return this;
        }        public RegionUrlMapPathMatcherPathRuleRouteActionRequestMirrorPolicy build() {
            return new RegionUrlMapPathMatcherPathRuleRouteActionRequestMirrorPolicy(backendService);
        }
    }
}
