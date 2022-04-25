// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.compute.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.gcp.compute.inputs.RegionUrlMapPathMatcherRouteRuleRouteActionWeightedBackendServiceHeaderActionGetArgs;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class RegionUrlMapPathMatcherRouteRuleRouteActionWeightedBackendServiceGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final RegionUrlMapPathMatcherRouteRuleRouteActionWeightedBackendServiceGetArgs Empty = new RegionUrlMapPathMatcherRouteRuleRouteActionWeightedBackendServiceGetArgs();

    /**
     * The default RegionBackendService resource. Before
     * forwarding the request to backendService, the loadbalancer applies any relevant
     * headerActions specified as part of this backendServiceWeight.
     * 
     */
    @Import(name="backendService", required=true)
    private Output<String> backendService;

    /**
     * @return The default RegionBackendService resource. Before
     * forwarding the request to backendService, the loadbalancer applies any relevant
     * headerActions specified as part of this backendServiceWeight.
     * 
     */
    public Output<String> backendService() {
        return this.backendService;
    }

    /**
     * Specifies changes to request and response headers that need to take effect for
     * the selected backendService. headerAction specified here take effect before
     * headerAction in the enclosing HttpRouteRule, PathMatcher and UrlMap.
     * Structure is documented below.
     * 
     */
    @Import(name="headerAction")
    private @Nullable Output<RegionUrlMapPathMatcherRouteRuleRouteActionWeightedBackendServiceHeaderActionGetArgs> headerAction;

    /**
     * @return Specifies changes to request and response headers that need to take effect for
     * the selected backendService. headerAction specified here take effect before
     * headerAction in the enclosing HttpRouteRule, PathMatcher and UrlMap.
     * Structure is documented below.
     * 
     */
    public Optional<Output<RegionUrlMapPathMatcherRouteRuleRouteActionWeightedBackendServiceHeaderActionGetArgs>> headerAction() {
        return Optional.ofNullable(this.headerAction);
    }

    /**
     * Specifies the fraction of traffic sent to backendService, computed as weight /
     * (sum of all weightedBackendService weights in routeAction) . The selection of a
     * backend service is determined only for new traffic. Once a user&#39;s request has
     * been directed to a backendService, subsequent requests will be sent to the same
     * backendService as determined by the BackendService&#39;s session affinity policy.
     * The value must be between 0 and 1000
     * 
     */
    @Import(name="weight", required=true)
    private Output<Integer> weight;

    /**
     * @return Specifies the fraction of traffic sent to backendService, computed as weight /
     * (sum of all weightedBackendService weights in routeAction) . The selection of a
     * backend service is determined only for new traffic. Once a user&#39;s request has
     * been directed to a backendService, subsequent requests will be sent to the same
     * backendService as determined by the BackendService&#39;s session affinity policy.
     * The value must be between 0 and 1000
     * 
     */
    public Output<Integer> weight() {
        return this.weight;
    }

    private RegionUrlMapPathMatcherRouteRuleRouteActionWeightedBackendServiceGetArgs() {}

    private RegionUrlMapPathMatcherRouteRuleRouteActionWeightedBackendServiceGetArgs(RegionUrlMapPathMatcherRouteRuleRouteActionWeightedBackendServiceGetArgs $) {
        this.backendService = $.backendService;
        this.headerAction = $.headerAction;
        this.weight = $.weight;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RegionUrlMapPathMatcherRouteRuleRouteActionWeightedBackendServiceGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RegionUrlMapPathMatcherRouteRuleRouteActionWeightedBackendServiceGetArgs $;

        public Builder() {
            $ = new RegionUrlMapPathMatcherRouteRuleRouteActionWeightedBackendServiceGetArgs();
        }

        public Builder(RegionUrlMapPathMatcherRouteRuleRouteActionWeightedBackendServiceGetArgs defaults) {
            $ = new RegionUrlMapPathMatcherRouteRuleRouteActionWeightedBackendServiceGetArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param backendService The default RegionBackendService resource. Before
         * forwarding the request to backendService, the loadbalancer applies any relevant
         * headerActions specified as part of this backendServiceWeight.
         * 
         * @return builder
         * 
         */
        public Builder backendService(Output<String> backendService) {
            $.backendService = backendService;
            return this;
        }

        /**
         * @param backendService The default RegionBackendService resource. Before
         * forwarding the request to backendService, the loadbalancer applies any relevant
         * headerActions specified as part of this backendServiceWeight.
         * 
         * @return builder
         * 
         */
        public Builder backendService(String backendService) {
            return backendService(Output.of(backendService));
        }

        /**
         * @param headerAction Specifies changes to request and response headers that need to take effect for
         * the selected backendService. headerAction specified here take effect before
         * headerAction in the enclosing HttpRouteRule, PathMatcher and UrlMap.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder headerAction(@Nullable Output<RegionUrlMapPathMatcherRouteRuleRouteActionWeightedBackendServiceHeaderActionGetArgs> headerAction) {
            $.headerAction = headerAction;
            return this;
        }

        /**
         * @param headerAction Specifies changes to request and response headers that need to take effect for
         * the selected backendService. headerAction specified here take effect before
         * headerAction in the enclosing HttpRouteRule, PathMatcher and UrlMap.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder headerAction(RegionUrlMapPathMatcherRouteRuleRouteActionWeightedBackendServiceHeaderActionGetArgs headerAction) {
            return headerAction(Output.of(headerAction));
        }

        /**
         * @param weight Specifies the fraction of traffic sent to backendService, computed as weight /
         * (sum of all weightedBackendService weights in routeAction) . The selection of a
         * backend service is determined only for new traffic. Once a user&#39;s request has
         * been directed to a backendService, subsequent requests will be sent to the same
         * backendService as determined by the BackendService&#39;s session affinity policy.
         * The value must be between 0 and 1000
         * 
         * @return builder
         * 
         */
        public Builder weight(Output<Integer> weight) {
            $.weight = weight;
            return this;
        }

        /**
         * @param weight Specifies the fraction of traffic sent to backendService, computed as weight /
         * (sum of all weightedBackendService weights in routeAction) . The selection of a
         * backend service is determined only for new traffic. Once a user&#39;s request has
         * been directed to a backendService, subsequent requests will be sent to the same
         * backendService as determined by the BackendService&#39;s session affinity policy.
         * The value must be between 0 and 1000
         * 
         * @return builder
         * 
         */
        public Builder weight(Integer weight) {
            return weight(Output.of(weight));
        }

        public RegionUrlMapPathMatcherRouteRuleRouteActionWeightedBackendServiceGetArgs build() {
            $.backendService = Objects.requireNonNull($.backendService, "expected parameter 'backendService' to be non-null");
            $.weight = Objects.requireNonNull($.weight, "expected parameter 'weight' to be non-null");
            return $;
        }
    }

}
