// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.appflow.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class ConnectorProfileAmplitudeConnectorProfileCredentials {
    private final String apiKey;
    private final String secretKey;

    @OutputCustomType.Constructor({"apiKey","secretKey"})
    private ConnectorProfileAmplitudeConnectorProfileCredentials(
        String apiKey,
        String secretKey) {
        this.apiKey = Objects.requireNonNull(apiKey);
        this.secretKey = Objects.requireNonNull(secretKey);
    }

    public String getApiKey() {
        return this.apiKey;
    }
    public String getSecretKey() {
        return this.secretKey;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConnectorProfileAmplitudeConnectorProfileCredentials defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String apiKey;
        private String secretKey;

        public Builder() {
    	      // Empty
        }

        public Builder(ConnectorProfileAmplitudeConnectorProfileCredentials defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.apiKey = defaults.apiKey;
    	      this.secretKey = defaults.secretKey;
        }

        public Builder setApiKey(String apiKey) {
            this.apiKey = Objects.requireNonNull(apiKey);
            return this;
        }

        public Builder setSecretKey(String secretKey) {
            this.secretKey = Objects.requireNonNull(secretKey);
            return this;
        }

        public ConnectorProfileAmplitudeConnectorProfileCredentials build() {
            return new ConnectorProfileAmplitudeConnectorProfileCredentials(apiKey, secretKey);
        }
    }
}
