// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Header configuration of the Actions set in Application Gateway.
 * 
 */
public final class ApplicationGatewayHeaderConfigurationResponse extends io.pulumi.resources.InvokeArgs {

    public static final ApplicationGatewayHeaderConfigurationResponse Empty = new ApplicationGatewayHeaderConfigurationResponse();

    /**
     * Header name of the header configuration.
     * 
     */
    @InputImport(name="headerName")
      private final @Nullable String headerName;

    public Optional<String> getHeaderName() {
        return this.headerName == null ? Optional.empty() : Optional.ofNullable(this.headerName);
    }

    /**
     * Header value of the header configuration.
     * 
     */
    @InputImport(name="headerValue")
      private final @Nullable String headerValue;

    public Optional<String> getHeaderValue() {
        return this.headerValue == null ? Optional.empty() : Optional.ofNullable(this.headerValue);
    }

    public ApplicationGatewayHeaderConfigurationResponse(
        @Nullable String headerName,
        @Nullable String headerValue) {
        this.headerName = headerName;
        this.headerValue = headerValue;
    }

    private ApplicationGatewayHeaderConfigurationResponse() {
        this.headerName = null;
        this.headerValue = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApplicationGatewayHeaderConfigurationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String headerName;
        private @Nullable String headerValue;

        public Builder() {
    	      // Empty
        }

        public Builder(ApplicationGatewayHeaderConfigurationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.headerName = defaults.headerName;
    	      this.headerValue = defaults.headerValue;
        }

        public Builder setHeaderName(@Nullable String headerName) {
            this.headerName = headerName;
            return this;
        }

        public Builder setHeaderValue(@Nullable String headerValue) {
            this.headerValue = headerValue;
            return this;
        }
        public ApplicationGatewayHeaderConfigurationResponse build() {
            return new ApplicationGatewayHeaderConfigurationResponse(headerName, headerValue);
        }
    }
}