// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.appflow.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class ConnectorProfileDatadogConnectorProfileCredentials {
    private final String apiKey;
    private final String applicationKey;

    @OutputCustomType.Constructor({"apiKey","applicationKey"})
    private ConnectorProfileDatadogConnectorProfileCredentials(
        String apiKey,
        String applicationKey) {
        this.apiKey = Objects.requireNonNull(apiKey);
        this.applicationKey = Objects.requireNonNull(applicationKey);
    }

    public String getApiKey() {
        return this.apiKey;
    }
    public String getApplicationKey() {
        return this.applicationKey;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConnectorProfileDatadogConnectorProfileCredentials defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String apiKey;
        private String applicationKey;

        public Builder() {
    	      // Empty
        }

        public Builder(ConnectorProfileDatadogConnectorProfileCredentials defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.apiKey = defaults.apiKey;
    	      this.applicationKey = defaults.applicationKey;
        }

        public Builder setApiKey(String apiKey) {
            this.apiKey = Objects.requireNonNull(apiKey);
            return this;
        }

        public Builder setApplicationKey(String applicationKey) {
            this.applicationKey = Objects.requireNonNull(applicationKey);
            return this;
        }

        public ConnectorProfileDatadogConnectorProfileCredentials build() {
            return new ConnectorProfileDatadogConnectorProfileCredentials(apiKey, applicationKey);
        }
    }
}
