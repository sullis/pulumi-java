// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.powerplatform.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class PrivateEndpointResponse {
    /**
     * @return The ARM identifier for Private Endpoint
     * 
     */
    private final String id;

    @CustomType.Constructor
    private PrivateEndpointResponse(@CustomType.Parameter("id") String id) {
        this.id = id;
    }

    /**
     * @return The ARM identifier for Private Endpoint
     * 
     */
    public String id() {
        return this.id;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PrivateEndpointResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String id;

        public Builder() {
    	      // Empty
        }

        public Builder(PrivateEndpointResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
        }

        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }        public PrivateEndpointResponse build() {
            return new PrivateEndpointResponse(id);
        }
    }
}
