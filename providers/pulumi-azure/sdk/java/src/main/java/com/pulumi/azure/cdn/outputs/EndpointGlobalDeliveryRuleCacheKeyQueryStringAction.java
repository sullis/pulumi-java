// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.cdn.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class EndpointGlobalDeliveryRuleCacheKeyQueryStringAction {
    /**
     * @return The behavior of the cache key for query strings. Valid values are `Exclude`, `ExcludeAll`, `Include` and `IncludeAll`.
     * 
     */
    private final String behavior;
    /**
     * @return Comma separated list of parameter values.
     * 
     */
    private final @Nullable String parameters;

    @CustomType.Constructor
    private EndpointGlobalDeliveryRuleCacheKeyQueryStringAction(
        @CustomType.Parameter("behavior") String behavior,
        @CustomType.Parameter("parameters") @Nullable String parameters) {
        this.behavior = behavior;
        this.parameters = parameters;
    }

    /**
     * @return The behavior of the cache key for query strings. Valid values are `Exclude`, `ExcludeAll`, `Include` and `IncludeAll`.
     * 
     */
    public String behavior() {
        return this.behavior;
    }
    /**
     * @return Comma separated list of parameter values.
     * 
     */
    public Optional<String> parameters() {
        return Optional.ofNullable(this.parameters);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EndpointGlobalDeliveryRuleCacheKeyQueryStringAction defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String behavior;
        private @Nullable String parameters;

        public Builder() {
    	      // Empty
        }

        public Builder(EndpointGlobalDeliveryRuleCacheKeyQueryStringAction defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.behavior = defaults.behavior;
    	      this.parameters = defaults.parameters;
        }

        public Builder behavior(String behavior) {
            this.behavior = Objects.requireNonNull(behavior);
            return this;
        }
        public Builder parameters(@Nullable String parameters) {
            this.parameters = parameters;
            return this;
        }        public EndpointGlobalDeliveryRuleCacheKeyQueryStringAction build() {
            return new EndpointGlobalDeliveryRuleCacheKeyQueryStringAction(behavior, parameters);
        }
    }
}
