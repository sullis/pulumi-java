// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.compute.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.gcp.compute.inputs.RegionUrlMapPathMatcherPathRuleRouteActionWeightedBackendServiceHeaderActionRequestHeadersToAddArgs;
import com.pulumi.gcp.compute.inputs.RegionUrlMapPathMatcherPathRuleRouteActionWeightedBackendServiceHeaderActionResponseHeadersToAddArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class RegionUrlMapPathMatcherPathRuleRouteActionWeightedBackendServiceHeaderActionArgs extends com.pulumi.resources.ResourceArgs {

    public static final RegionUrlMapPathMatcherPathRuleRouteActionWeightedBackendServiceHeaderActionArgs Empty = new RegionUrlMapPathMatcherPathRuleRouteActionWeightedBackendServiceHeaderActionArgs();

    /**
     * Headers to add to a matching request prior to forwarding the request to the
     * backendService.
     * Structure is documented below.
     * 
     */
    @Import(name="requestHeadersToAdds")
    private @Nullable Output<List<RegionUrlMapPathMatcherPathRuleRouteActionWeightedBackendServiceHeaderActionRequestHeadersToAddArgs>> requestHeadersToAdds;

    /**
     * @return Headers to add to a matching request prior to forwarding the request to the
     * backendService.
     * Structure is documented below.
     * 
     */
    public Optional<Output<List<RegionUrlMapPathMatcherPathRuleRouteActionWeightedBackendServiceHeaderActionRequestHeadersToAddArgs>>> requestHeadersToAdds() {
        return Optional.ofNullable(this.requestHeadersToAdds);
    }

    /**
     * A list of header names for headers that need to be removed from the request
     * prior to forwarding the request to the backendService.
     * 
     */
    @Import(name="requestHeadersToRemoves")
    private @Nullable Output<List<String>> requestHeadersToRemoves;

    /**
     * @return A list of header names for headers that need to be removed from the request
     * prior to forwarding the request to the backendService.
     * 
     */
    public Optional<Output<List<String>>> requestHeadersToRemoves() {
        return Optional.ofNullable(this.requestHeadersToRemoves);
    }

    /**
     * Headers to add the response prior to sending the response back to the client.
     * Structure is documented below.
     * 
     */
    @Import(name="responseHeadersToAdds")
    private @Nullable Output<List<RegionUrlMapPathMatcherPathRuleRouteActionWeightedBackendServiceHeaderActionResponseHeadersToAddArgs>> responseHeadersToAdds;

    /**
     * @return Headers to add the response prior to sending the response back to the client.
     * Structure is documented below.
     * 
     */
    public Optional<Output<List<RegionUrlMapPathMatcherPathRuleRouteActionWeightedBackendServiceHeaderActionResponseHeadersToAddArgs>>> responseHeadersToAdds() {
        return Optional.ofNullable(this.responseHeadersToAdds);
    }

    /**
     * A list of header names for headers that need to be removed from the response
     * prior to sending the response back to the client.
     * 
     */
    @Import(name="responseHeadersToRemoves")
    private @Nullable Output<List<String>> responseHeadersToRemoves;

    /**
     * @return A list of header names for headers that need to be removed from the response
     * prior to sending the response back to the client.
     * 
     */
    public Optional<Output<List<String>>> responseHeadersToRemoves() {
        return Optional.ofNullable(this.responseHeadersToRemoves);
    }

    private RegionUrlMapPathMatcherPathRuleRouteActionWeightedBackendServiceHeaderActionArgs() {}

    private RegionUrlMapPathMatcherPathRuleRouteActionWeightedBackendServiceHeaderActionArgs(RegionUrlMapPathMatcherPathRuleRouteActionWeightedBackendServiceHeaderActionArgs $) {
        this.requestHeadersToAdds = $.requestHeadersToAdds;
        this.requestHeadersToRemoves = $.requestHeadersToRemoves;
        this.responseHeadersToAdds = $.responseHeadersToAdds;
        this.responseHeadersToRemoves = $.responseHeadersToRemoves;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RegionUrlMapPathMatcherPathRuleRouteActionWeightedBackendServiceHeaderActionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RegionUrlMapPathMatcherPathRuleRouteActionWeightedBackendServiceHeaderActionArgs $;

        public Builder() {
            $ = new RegionUrlMapPathMatcherPathRuleRouteActionWeightedBackendServiceHeaderActionArgs();
        }

        public Builder(RegionUrlMapPathMatcherPathRuleRouteActionWeightedBackendServiceHeaderActionArgs defaults) {
            $ = new RegionUrlMapPathMatcherPathRuleRouteActionWeightedBackendServiceHeaderActionArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param requestHeadersToAdds Headers to add to a matching request prior to forwarding the request to the
         * backendService.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder requestHeadersToAdds(@Nullable Output<List<RegionUrlMapPathMatcherPathRuleRouteActionWeightedBackendServiceHeaderActionRequestHeadersToAddArgs>> requestHeadersToAdds) {
            $.requestHeadersToAdds = requestHeadersToAdds;
            return this;
        }

        /**
         * @param requestHeadersToAdds Headers to add to a matching request prior to forwarding the request to the
         * backendService.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder requestHeadersToAdds(List<RegionUrlMapPathMatcherPathRuleRouteActionWeightedBackendServiceHeaderActionRequestHeadersToAddArgs> requestHeadersToAdds) {
            return requestHeadersToAdds(Output.of(requestHeadersToAdds));
        }

        /**
         * @param requestHeadersToAdds Headers to add to a matching request prior to forwarding the request to the
         * backendService.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder requestHeadersToAdds(RegionUrlMapPathMatcherPathRuleRouteActionWeightedBackendServiceHeaderActionRequestHeadersToAddArgs... requestHeadersToAdds) {
            return requestHeadersToAdds(List.of(requestHeadersToAdds));
        }

        /**
         * @param requestHeadersToRemoves A list of header names for headers that need to be removed from the request
         * prior to forwarding the request to the backendService.
         * 
         * @return builder
         * 
         */
        public Builder requestHeadersToRemoves(@Nullable Output<List<String>> requestHeadersToRemoves) {
            $.requestHeadersToRemoves = requestHeadersToRemoves;
            return this;
        }

        /**
         * @param requestHeadersToRemoves A list of header names for headers that need to be removed from the request
         * prior to forwarding the request to the backendService.
         * 
         * @return builder
         * 
         */
        public Builder requestHeadersToRemoves(List<String> requestHeadersToRemoves) {
            return requestHeadersToRemoves(Output.of(requestHeadersToRemoves));
        }

        /**
         * @param requestHeadersToRemoves A list of header names for headers that need to be removed from the request
         * prior to forwarding the request to the backendService.
         * 
         * @return builder
         * 
         */
        public Builder requestHeadersToRemoves(String... requestHeadersToRemoves) {
            return requestHeadersToRemoves(List.of(requestHeadersToRemoves));
        }

        /**
         * @param responseHeadersToAdds Headers to add the response prior to sending the response back to the client.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder responseHeadersToAdds(@Nullable Output<List<RegionUrlMapPathMatcherPathRuleRouteActionWeightedBackendServiceHeaderActionResponseHeadersToAddArgs>> responseHeadersToAdds) {
            $.responseHeadersToAdds = responseHeadersToAdds;
            return this;
        }

        /**
         * @param responseHeadersToAdds Headers to add the response prior to sending the response back to the client.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder responseHeadersToAdds(List<RegionUrlMapPathMatcherPathRuleRouteActionWeightedBackendServiceHeaderActionResponseHeadersToAddArgs> responseHeadersToAdds) {
            return responseHeadersToAdds(Output.of(responseHeadersToAdds));
        }

        /**
         * @param responseHeadersToAdds Headers to add the response prior to sending the response back to the client.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder responseHeadersToAdds(RegionUrlMapPathMatcherPathRuleRouteActionWeightedBackendServiceHeaderActionResponseHeadersToAddArgs... responseHeadersToAdds) {
            return responseHeadersToAdds(List.of(responseHeadersToAdds));
        }

        /**
         * @param responseHeadersToRemoves A list of header names for headers that need to be removed from the response
         * prior to sending the response back to the client.
         * 
         * @return builder
         * 
         */
        public Builder responseHeadersToRemoves(@Nullable Output<List<String>> responseHeadersToRemoves) {
            $.responseHeadersToRemoves = responseHeadersToRemoves;
            return this;
        }

        /**
         * @param responseHeadersToRemoves A list of header names for headers that need to be removed from the response
         * prior to sending the response back to the client.
         * 
         * @return builder
         * 
         */
        public Builder responseHeadersToRemoves(List<String> responseHeadersToRemoves) {
            return responseHeadersToRemoves(Output.of(responseHeadersToRemoves));
        }

        /**
         * @param responseHeadersToRemoves A list of header names for headers that need to be removed from the response
         * prior to sending the response back to the client.
         * 
         * @return builder
         * 
         */
        public Builder responseHeadersToRemoves(String... responseHeadersToRemoves) {
            return responseHeadersToRemoves(List.of(responseHeadersToRemoves));
        }

        public RegionUrlMapPathMatcherPathRuleRouteActionWeightedBackendServiceHeaderActionArgs build() {
            return $;
        }
    }

}
