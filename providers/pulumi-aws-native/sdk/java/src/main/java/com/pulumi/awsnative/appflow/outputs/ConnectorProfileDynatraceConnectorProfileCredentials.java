// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.appflow.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class ConnectorProfileDynatraceConnectorProfileCredentials {
    /**
     * @return The API tokens used by Dynatrace API to authenticate various API calls.
     * 
     */
    private final String apiToken;

    @CustomType.Constructor
    private ConnectorProfileDynatraceConnectorProfileCredentials(@CustomType.Parameter("apiToken") String apiToken) {
        this.apiToken = apiToken;
    }

    /**
     * @return The API tokens used by Dynatrace API to authenticate various API calls.
     * 
     */
    public String apiToken() {
        return this.apiToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConnectorProfileDynatraceConnectorProfileCredentials defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String apiToken;

        public Builder() {
    	      // Empty
        }

        public Builder(ConnectorProfileDynatraceConnectorProfileCredentials defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.apiToken = defaults.apiToken;
        }

        public Builder apiToken(String apiToken) {
            this.apiToken = Objects.requireNonNull(apiToken);
            return this;
        }        public ConnectorProfileDynatraceConnectorProfileCredentials build() {
            return new ConnectorProfileDynatraceConnectorProfileCredentials(apiToken);
        }
    }
}
