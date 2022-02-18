// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.machinelearningservices.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class JobEndpointResponse {
    /**
     * Url for endpoint.
     * 
     */
    private final @Nullable String endpoint;
    /**
     * Endpoint type.
     * 
     */
    private final @Nullable String jobEndpointType;
    /**
     * Port for endpoint.
     * 
     */
    private final @Nullable Integer port;
    /**
     * Additional properties to set on the endpoint.
     * 
     */
    private final @Nullable Map<String,String> properties;

    @OutputCustomType.Constructor({"endpoint","jobEndpointType","port","properties"})
    private JobEndpointResponse(
        @Nullable String endpoint,
        @Nullable String jobEndpointType,
        @Nullable Integer port,
        @Nullable Map<String,String> properties) {
        this.endpoint = endpoint;
        this.jobEndpointType = jobEndpointType;
        this.port = port;
        this.properties = properties;
    }

    /**
     * Url for endpoint.
     * 
     */
    public Optional<String> getEndpoint() {
        return Optional.ofNullable(this.endpoint);
    }
    /**
     * Endpoint type.
     * 
     */
    public Optional<String> getJobEndpointType() {
        return Optional.ofNullable(this.jobEndpointType);
    }
    /**
     * Port for endpoint.
     * 
     */
    public Optional<Integer> getPort() {
        return Optional.ofNullable(this.port);
    }
    /**
     * Additional properties to set on the endpoint.
     * 
     */
    public Map<String,String> getProperties() {
        return this.properties == null ? Map.of() : this.properties;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(JobEndpointResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String endpoint;
        private @Nullable String jobEndpointType;
        private @Nullable Integer port;
        private @Nullable Map<String,String> properties;

        public Builder() {
    	      // Empty
        }

        public Builder(JobEndpointResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.endpoint = defaults.endpoint;
    	      this.jobEndpointType = defaults.jobEndpointType;
    	      this.port = defaults.port;
    	      this.properties = defaults.properties;
        }

        public Builder setEndpoint(@Nullable String endpoint) {
            this.endpoint = endpoint;
            return this;
        }

        public Builder setJobEndpointType(@Nullable String jobEndpointType) {
            this.jobEndpointType = jobEndpointType;
            return this;
        }

        public Builder setPort(@Nullable Integer port) {
            this.port = port;
            return this;
        }

        public Builder setProperties(@Nullable Map<String,String> properties) {
            this.properties = properties;
            return this;
        }

        public JobEndpointResponse build() {
            return new JobEndpointResponse(endpoint, jobEndpointType, port, properties);
        }
    }
}
