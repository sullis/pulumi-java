// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.deploymentmanager.inputs;

import io.pulumi.azurenative.deploymentmanager.inputs.RestRequestResponse;
import io.pulumi.azurenative.deploymentmanager.inputs.RestResponseResponse;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * A REST based health check
 * 
 */
public final class RestHealthCheckResponse extends io.pulumi.resources.InvokeArgs {

    public static final RestHealthCheckResponse Empty = new RestHealthCheckResponse();

    /**
     * A unique name for this check.
     * 
     */
    @InputImport(name="name", required=true)
    private final String name;

    public String getName() {
        return this.name;
    }

    /**
     * The request to the health provider.
     * 
     */
    @InputImport(name="request", required=true)
    private final RestRequestResponse request;

    public RestRequestResponse getRequest() {
        return this.request;
    }

    /**
     * The expected response from the health provider. If no expected response is provided, the default is to expect the received response to have an HTTP status code of 200 OK.
     * 
     */
    @InputImport(name="response")
    private final @Nullable RestResponseResponse response;

    public Optional<RestResponseResponse> getResponse() {
        return this.response == null ? Optional.empty() : Optional.ofNullable(this.response);
    }

    public RestHealthCheckResponse(
        String name,
        RestRequestResponse request,
        @Nullable RestResponseResponse response) {
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.request = Objects.requireNonNull(request, "expected parameter 'request' to be non-null");
        this.response = response;
    }

    private RestHealthCheckResponse() {
        this.name = null;
        this.request = null;
        this.response = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RestHealthCheckResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String name;
        private RestRequestResponse request;
        private @Nullable RestResponseResponse response;

        public Builder() {
    	      // Empty
        }

        public Builder(RestHealthCheckResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.request = defaults.request;
    	      this.response = defaults.response;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setRequest(RestRequestResponse request) {
            this.request = Objects.requireNonNull(request);
            return this;
        }

        public Builder setResponse(@Nullable RestResponseResponse response) {
            this.response = response;
            return this;
        }

        public RestHealthCheckResponse build() {
            return new RestHealthCheckResponse(name, request, response);
        }
    }
}
