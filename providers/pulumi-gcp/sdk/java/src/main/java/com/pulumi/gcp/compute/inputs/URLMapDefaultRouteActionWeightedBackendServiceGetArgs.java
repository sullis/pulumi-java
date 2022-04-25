// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.compute.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.gcp.compute.inputs.URLMapDefaultRouteActionWeightedBackendServiceHeaderActionGetArgs;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class URLMapDefaultRouteActionWeightedBackendServiceGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final URLMapDefaultRouteActionWeightedBackendServiceGetArgs Empty = new URLMapDefaultRouteActionWeightedBackendServiceGetArgs();

    /**
     * The full or partial URL to the BackendService resource being mirrored to.
     * 
     */
    @Import(name="backendService")
    private @Nullable Output<String> backendService;

    /**
     * @return The full or partial URL to the BackendService resource being mirrored to.
     * 
     */
    public Optional<Output<String>> backendService() {
        return Optional.ofNullable(this.backendService);
    }

    /**
     * Specifies changes to request and response headers that need to take effect for
     * the selected backendService.
     * headerAction specified here take effect before headerAction in the enclosing
     * HttpRouteRule, PathMatcher and UrlMap.
     * Structure is documented below.
     * 
     */
    @Import(name="headerAction")
    private @Nullable Output<URLMapDefaultRouteActionWeightedBackendServiceHeaderActionGetArgs> headerAction;

    /**
     * @return Specifies changes to request and response headers that need to take effect for
     * the selected backendService.
     * headerAction specified here take effect before headerAction in the enclosing
     * HttpRouteRule, PathMatcher and UrlMap.
     * Structure is documented below.
     * 
     */
    public Optional<Output<URLMapDefaultRouteActionWeightedBackendServiceHeaderActionGetArgs>> headerAction() {
        return Optional.ofNullable(this.headerAction);
    }

    /**
     * Specifies the fraction of traffic sent to backendService, computed as
     * weight / (sum of all weightedBackendService weights in routeAction) .
     * The selection of a backend service is determined only for new traffic. Once a user&#39;s request
     * has been directed to a backendService, subsequent requests will be sent to the same backendService
     * as determined by the BackendService&#39;s session affinity policy.
     * The value must be between 0 and 1000
     * 
     */
    @Import(name="weight")
    private @Nullable Output<Integer> weight;

    /**
     * @return Specifies the fraction of traffic sent to backendService, computed as
     * weight / (sum of all weightedBackendService weights in routeAction) .
     * The selection of a backend service is determined only for new traffic. Once a user&#39;s request
     * has been directed to a backendService, subsequent requests will be sent to the same backendService
     * as determined by the BackendService&#39;s session affinity policy.
     * The value must be between 0 and 1000
     * 
     */
    public Optional<Output<Integer>> weight() {
        return Optional.ofNullable(this.weight);
    }

    private URLMapDefaultRouteActionWeightedBackendServiceGetArgs() {}

    private URLMapDefaultRouteActionWeightedBackendServiceGetArgs(URLMapDefaultRouteActionWeightedBackendServiceGetArgs $) {
        this.backendService = $.backendService;
        this.headerAction = $.headerAction;
        this.weight = $.weight;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(URLMapDefaultRouteActionWeightedBackendServiceGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private URLMapDefaultRouteActionWeightedBackendServiceGetArgs $;

        public Builder() {
            $ = new URLMapDefaultRouteActionWeightedBackendServiceGetArgs();
        }

        public Builder(URLMapDefaultRouteActionWeightedBackendServiceGetArgs defaults) {
            $ = new URLMapDefaultRouteActionWeightedBackendServiceGetArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param backendService The full or partial URL to the BackendService resource being mirrored to.
         * 
         * @return builder
         * 
         */
        public Builder backendService(@Nullable Output<String> backendService) {
            $.backendService = backendService;
            return this;
        }

        /**
         * @param backendService The full or partial URL to the BackendService resource being mirrored to.
         * 
         * @return builder
         * 
         */
        public Builder backendService(String backendService) {
            return backendService(Output.of(backendService));
        }

        /**
         * @param headerAction Specifies changes to request and response headers that need to take effect for
         * the selected backendService.
         * headerAction specified here take effect before headerAction in the enclosing
         * HttpRouteRule, PathMatcher and UrlMap.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder headerAction(@Nullable Output<URLMapDefaultRouteActionWeightedBackendServiceHeaderActionGetArgs> headerAction) {
            $.headerAction = headerAction;
            return this;
        }

        /**
         * @param headerAction Specifies changes to request and response headers that need to take effect for
         * the selected backendService.
         * headerAction specified here take effect before headerAction in the enclosing
         * HttpRouteRule, PathMatcher and UrlMap.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder headerAction(URLMapDefaultRouteActionWeightedBackendServiceHeaderActionGetArgs headerAction) {
            return headerAction(Output.of(headerAction));
        }

        /**
         * @param weight Specifies the fraction of traffic sent to backendService, computed as
         * weight / (sum of all weightedBackendService weights in routeAction) .
         * The selection of a backend service is determined only for new traffic. Once a user&#39;s request
         * has been directed to a backendService, subsequent requests will be sent to the same backendService
         * as determined by the BackendService&#39;s session affinity policy.
         * The value must be between 0 and 1000
         * 
         * @return builder
         * 
         */
        public Builder weight(@Nullable Output<Integer> weight) {
            $.weight = weight;
            return this;
        }

        /**
         * @param weight Specifies the fraction of traffic sent to backendService, computed as
         * weight / (sum of all weightedBackendService weights in routeAction) .
         * The selection of a backend service is determined only for new traffic. Once a user&#39;s request
         * has been directed to a backendService, subsequent requests will be sent to the same backendService
         * as determined by the BackendService&#39;s session affinity policy.
         * The value must be between 0 and 1000
         * 
         * @return builder
         * 
         */
        public Builder weight(Integer weight) {
            return weight(Output.of(weight));
        }

        public URLMapDefaultRouteActionWeightedBackendServiceGetArgs build() {
            return $;
        }
    }

}
