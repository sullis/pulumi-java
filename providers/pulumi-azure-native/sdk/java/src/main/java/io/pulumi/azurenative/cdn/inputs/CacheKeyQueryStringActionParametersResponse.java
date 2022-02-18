// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.cdn.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Defines the parameters for the cache-key query string action.
 * 
 */
public final class CacheKeyQueryStringActionParametersResponse extends io.pulumi.resources.InvokeArgs {

    public static final CacheKeyQueryStringActionParametersResponse Empty = new CacheKeyQueryStringActionParametersResponse();

    @InputImport(name="odataType", required=true)
    private final String odataType;

    public String getOdataType() {
        return this.odataType;
    }

    /**
     * query parameters to include or exclude (comma separated).
     * 
     */
    @InputImport(name="queryParameters")
    private final @Nullable String queryParameters;

    public Optional<String> getQueryParameters() {
        return this.queryParameters == null ? Optional.empty() : Optional.ofNullable(this.queryParameters);
    }

    /**
     * Caching behavior for the requests
     * 
     */
    @InputImport(name="queryStringBehavior", required=true)
    private final String queryStringBehavior;

    public String getQueryStringBehavior() {
        return this.queryStringBehavior;
    }

    public CacheKeyQueryStringActionParametersResponse(
        String odataType,
        @Nullable String queryParameters,
        String queryStringBehavior) {
        this.odataType = Objects.requireNonNull(odataType, "expected parameter 'odataType' to be non-null");
        this.queryParameters = queryParameters;
        this.queryStringBehavior = Objects.requireNonNull(queryStringBehavior, "expected parameter 'queryStringBehavior' to be non-null");
    }

    private CacheKeyQueryStringActionParametersResponse() {
        this.odataType = null;
        this.queryParameters = null;
        this.queryStringBehavior = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CacheKeyQueryStringActionParametersResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String odataType;
        private @Nullable String queryParameters;
        private String queryStringBehavior;

        public Builder() {
    	      // Empty
        }

        public Builder(CacheKeyQueryStringActionParametersResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.odataType = defaults.odataType;
    	      this.queryParameters = defaults.queryParameters;
    	      this.queryStringBehavior = defaults.queryStringBehavior;
        }

        public Builder setOdataType(String odataType) {
            this.odataType = Objects.requireNonNull(odataType);
            return this;
        }

        public Builder setQueryParameters(@Nullable String queryParameters) {
            this.queryParameters = queryParameters;
            return this;
        }

        public Builder setQueryStringBehavior(String queryStringBehavior) {
            this.queryStringBehavior = Objects.requireNonNull(queryStringBehavior);
            return this;
        }

        public CacheKeyQueryStringActionParametersResponse build() {
            return new CacheKeyQueryStringActionParametersResponse(odataType, queryParameters, queryStringBehavior);
        }
    }
}
