// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.events.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class ConnectionApiKeyAuthParameters extends io.pulumi.resources.InvokeArgs {

    public static final ConnectionApiKeyAuthParameters Empty = new ConnectionApiKeyAuthParameters();

    @Import(name="apiKeyName", required=true)
      private final String apiKeyName;

    public String apiKeyName() {
        return this.apiKeyName;
    }

    @Import(name="apiKeyValue", required=true)
      private final String apiKeyValue;

    public String apiKeyValue() {
        return this.apiKeyValue;
    }

    public ConnectionApiKeyAuthParameters(
        String apiKeyName,
        String apiKeyValue) {
        this.apiKeyName = Objects.requireNonNull(apiKeyName, "expected parameter 'apiKeyName' to be non-null");
        this.apiKeyValue = Objects.requireNonNull(apiKeyValue, "expected parameter 'apiKeyValue' to be non-null");
    }

    private ConnectionApiKeyAuthParameters() {
        this.apiKeyName = null;
        this.apiKeyValue = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConnectionApiKeyAuthParameters defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String apiKeyName;
        private String apiKeyValue;

        public Builder() {
    	      // Empty
        }

        public Builder(ConnectionApiKeyAuthParameters defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.apiKeyName = defaults.apiKeyName;
    	      this.apiKeyValue = defaults.apiKeyValue;
        }

        public Builder apiKeyName(String apiKeyName) {
            this.apiKeyName = Objects.requireNonNull(apiKeyName);
            return this;
        }
        public Builder apiKeyValue(String apiKeyValue) {
            this.apiKeyValue = Objects.requireNonNull(apiKeyValue);
            return this;
        }        public ConnectionApiKeyAuthParameters build() {
            return new ConnectionApiKeyAuthParameters(apiKeyName, apiKeyValue);
        }
    }
}
