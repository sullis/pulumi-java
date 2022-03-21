// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.insights.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class DataCollectionEndpointResponseConfigurationAccess {
    /**
     * The endpoint. This property is READ-ONLY.
     * 
     */
    private final String endpoint;

    @CustomType.Constructor
    private DataCollectionEndpointResponseConfigurationAccess(@CustomType.Parameter("endpoint") String endpoint) {
        this.endpoint = endpoint;
    }

    /**
     * The endpoint. This property is READ-ONLY.
     * 
    */
    public String getEndpoint() {
        return this.endpoint;
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

        public Builder endpoint(String endpoint) {
            this.endpoint = Objects.requireNonNull(endpoint);
            return this;
        }        public DataCollectionEndpointResponseConfigurationAccess build() {
            return new DataCollectionEndpointResponseConfigurationAccess(endpoint);
        }
    }
}
