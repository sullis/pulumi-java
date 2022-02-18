// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.insights.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


/**
 * The endpoint used by agents to access their configuration.
 * 
 */
public final class DataCollectionEndpointResponseConfigurationAccess extends io.pulumi.resources.InvokeArgs {

    public static final DataCollectionEndpointResponseConfigurationAccess Empty = new DataCollectionEndpointResponseConfigurationAccess();

    /**
     * The endpoint. This property is READ-ONLY.
     * 
     */
    @InputImport(name="endpoint", required=true)
    private final String endpoint;

    public String getEndpoint() {
        return this.endpoint;
    }

    public DataCollectionEndpointResponseConfigurationAccess(String endpoint) {
        this.endpoint = Objects.requireNonNull(endpoint, "expected parameter 'endpoint' to be non-null");
    }

    private DataCollectionEndpointResponseConfigurationAccess() {
        this.endpoint = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DataCollectionEndpointResponseConfigurationAccess defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String endpoint;

        public Builder() {
    	      // Empty
        }

        public Builder(DataCollectionEndpointResponseConfigurationAccess defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.endpoint = defaults.endpoint;
        }

        public Builder setEndpoint(String endpoint) {
            this.endpoint = Objects.requireNonNull(endpoint);
            return this;
        }

        public DataCollectionEndpointResponseConfigurationAccess build() {
            return new DataCollectionEndpointResponseConfigurationAccess(endpoint);
        }
    }
}
