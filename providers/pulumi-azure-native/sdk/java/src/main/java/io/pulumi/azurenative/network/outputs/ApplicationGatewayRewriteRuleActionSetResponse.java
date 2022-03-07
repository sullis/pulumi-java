// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.outputs;

import io.pulumi.azurenative.network.outputs.ApplicationGatewayHeaderConfigurationResponse;
import io.pulumi.azurenative.network.outputs.ApplicationGatewayUrlConfigurationResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ApplicationGatewayRewriteRuleActionSetResponse {
    /**
     * Request Header Actions in the Action Set.
     * 
     */
    private final @Nullable List<ApplicationGatewayHeaderConfigurationResponse> requestHeaderConfigurations;
    /**
     * Response Header Actions in the Action Set.
     * 
     */
    private final @Nullable List<ApplicationGatewayHeaderConfigurationResponse> responseHeaderConfigurations;
    /**
     * Url Configuration Action in the Action Set.
     * 
     */
    private final @Nullable ApplicationGatewayUrlConfigurationResponse urlConfiguration;

    @OutputCustomType.Constructor({"requestHeaderConfigurations","responseHeaderConfigurations","urlConfiguration"})
    private ApplicationGatewayRewriteRuleActionSetResponse(
        @Nullable List<ApplicationGatewayHeaderConfigurationResponse> requestHeaderConfigurations,
        @Nullable List<ApplicationGatewayHeaderConfigurationResponse> responseHeaderConfigurations,
        @Nullable ApplicationGatewayUrlConfigurationResponse urlConfiguration) {
        this.requestHeaderConfigurations = requestHeaderConfigurations;
        this.responseHeaderConfigurations = responseHeaderConfigurations;
        this.urlConfiguration = urlConfiguration;
    }

    /**
     * Request Header Actions in the Action Set.
     * 
    */
    public List<ApplicationGatewayHeaderConfigurationResponse> getRequestHeaderConfigurations() {
        return this.requestHeaderConfigurations == null ? List.of() : this.requestHeaderConfigurations;
    }
    /**
     * Response Header Actions in the Action Set.
     * 
    */
    public List<ApplicationGatewayHeaderConfigurationResponse> getResponseHeaderConfigurations() {
        return this.responseHeaderConfigurations == null ? List.of() : this.responseHeaderConfigurations;
    }
    /**
     * Url Configuration Action in the Action Set.
     * 
    */
    public Optional<ApplicationGatewayUrlConfigurationResponse> getUrlConfiguration() {
        return Optional.ofNullable(this.urlConfiguration);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApplicationGatewayRewriteRuleActionSetResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<ApplicationGatewayHeaderConfigurationResponse> requestHeaderConfigurations;
        private @Nullable List<ApplicationGatewayHeaderConfigurationResponse> responseHeaderConfigurations;
        private @Nullable ApplicationGatewayUrlConfigurationResponse urlConfiguration;

        public Builder() {
    	      // Empty
        }

        public Builder(ApplicationGatewayRewriteRuleActionSetResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.requestHeaderConfigurations = defaults.requestHeaderConfigurations;
    	      this.responseHeaderConfigurations = defaults.responseHeaderConfigurations;
    	      this.urlConfiguration = defaults.urlConfiguration;
        }

        public Builder setRequestHeaderConfigurations(@Nullable List<ApplicationGatewayHeaderConfigurationResponse> requestHeaderConfigurations) {
            this.requestHeaderConfigurations = requestHeaderConfigurations;
            return this;
        }

        public Builder setResponseHeaderConfigurations(@Nullable List<ApplicationGatewayHeaderConfigurationResponse> responseHeaderConfigurations) {
            this.responseHeaderConfigurations = responseHeaderConfigurations;
            return this;
        }

        public Builder setUrlConfiguration(@Nullable ApplicationGatewayUrlConfigurationResponse urlConfiguration) {
            this.urlConfiguration = urlConfiguration;
            return this;
        }
        public ApplicationGatewayRewriteRuleActionSetResponse build() {
            return new ApplicationGatewayRewriteRuleActionSetResponse(requestHeaderConfigurations, responseHeaderConfigurations, urlConfiguration);
        }
    }
}