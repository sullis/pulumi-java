// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.cdn.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class EndpointGlobalDeliveryRuleCacheKeyQueryStringActionArgs extends com.pulumi.resources.ResourceArgs {

    public static final EndpointGlobalDeliveryRuleCacheKeyQueryStringActionArgs Empty = new EndpointGlobalDeliveryRuleCacheKeyQueryStringActionArgs();

    /**
     * The behavior of the cache key for query strings. Valid values are `Exclude`, `ExcludeAll`, `Include` and `IncludeAll`.
     * 
     */
    @Import(name="behavior", required=true)
    private Output<String> behavior;

    /**
     * @return The behavior of the cache key for query strings. Valid values are `Exclude`, `ExcludeAll`, `Include` and `IncludeAll`.
     * 
     */
    public Output<String> behavior() {
        return this.behavior;
    }

    /**
     * Comma separated list of parameter values.
     * 
     */
    @Import(name="parameters")
    private @Nullable Output<String> parameters;

    /**
     * @return Comma separated list of parameter values.
     * 
     */
    public Optional<Output<String>> parameters() {
        return Optional.ofNullable(this.parameters);
    }

    private EndpointGlobalDeliveryRuleCacheKeyQueryStringActionArgs() {}

    private EndpointGlobalDeliveryRuleCacheKeyQueryStringActionArgs(EndpointGlobalDeliveryRuleCacheKeyQueryStringActionArgs $) {
        this.behavior = $.behavior;
        this.parameters = $.parameters;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(EndpointGlobalDeliveryRuleCacheKeyQueryStringActionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private EndpointGlobalDeliveryRuleCacheKeyQueryStringActionArgs $;

        public Builder() {
            $ = new EndpointGlobalDeliveryRuleCacheKeyQueryStringActionArgs();
        }

        public Builder(EndpointGlobalDeliveryRuleCacheKeyQueryStringActionArgs defaults) {
            $ = new EndpointGlobalDeliveryRuleCacheKeyQueryStringActionArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param behavior The behavior of the cache key for query strings. Valid values are `Exclude`, `ExcludeAll`, `Include` and `IncludeAll`.
         * 
         * @return builder
         * 
         */
        public Builder behavior(Output<String> behavior) {
            $.behavior = behavior;
            return this;
        }

        /**
         * @param behavior The behavior of the cache key for query strings. Valid values are `Exclude`, `ExcludeAll`, `Include` and `IncludeAll`.
         * 
         * @return builder
         * 
         */
        public Builder behavior(String behavior) {
            return behavior(Output.of(behavior));
        }

        /**
         * @param parameters Comma separated list of parameter values.
         * 
         * @return builder
         * 
         */
        public Builder parameters(@Nullable Output<String> parameters) {
            $.parameters = parameters;
            return this;
        }

        /**
         * @param parameters Comma separated list of parameter values.
         * 
         * @return builder
         * 
         */
        public Builder parameters(String parameters) {
            return parameters(Output.of(parameters));
        }

        public EndpointGlobalDeliveryRuleCacheKeyQueryStringActionArgs build() {
            $.behavior = Objects.requireNonNull($.behavior, "expected parameter 'behavior' to be non-null");
            return $;
        }
    }

}
