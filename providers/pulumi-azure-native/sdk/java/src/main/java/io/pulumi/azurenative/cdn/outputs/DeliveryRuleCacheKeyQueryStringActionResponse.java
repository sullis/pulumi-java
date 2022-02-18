// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.cdn.outputs;

import io.pulumi.azurenative.cdn.outputs.CacheKeyQueryStringActionParametersResponse;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class DeliveryRuleCacheKeyQueryStringActionResponse {
    /**
     * The name of the action for the delivery rule.
     * Expected value is 'CacheKeyQueryString'.
     * 
     */
    private final String name;
    /**
     * Defines the parameters for the action.
     * 
     */
    private final CacheKeyQueryStringActionParametersResponse parameters;

    @OutputCustomType.Constructor({"name","parameters"})
    private DeliveryRuleCacheKeyQueryStringActionResponse(
        String name,
        CacheKeyQueryStringActionParametersResponse parameters) {
        this.name = Objects.requireNonNull(name);
        this.parameters = Objects.requireNonNull(parameters);
    }

    /**
     * The name of the action for the delivery rule.
     * Expected value is 'CacheKeyQueryString'.
     * 
     */
    public String getName() {
        return this.name;
    }
    /**
     * Defines the parameters for the action.
     * 
     */
    public CacheKeyQueryStringActionParametersResponse getParameters() {
        return this.parameters;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DeliveryRuleCacheKeyQueryStringActionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String name;
        private CacheKeyQueryStringActionParametersResponse parameters;

        public Builder() {
    	      // Empty
        }

        public Builder(DeliveryRuleCacheKeyQueryStringActionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.parameters = defaults.parameters;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setParameters(CacheKeyQueryStringActionParametersResponse parameters) {
            this.parameters = Objects.requireNonNull(parameters);
            return this;
        }

        public DeliveryRuleCacheKeyQueryStringActionResponse build() {
            return new DeliveryRuleCacheKeyQueryStringActionResponse(name, parameters);
        }
    }
}
