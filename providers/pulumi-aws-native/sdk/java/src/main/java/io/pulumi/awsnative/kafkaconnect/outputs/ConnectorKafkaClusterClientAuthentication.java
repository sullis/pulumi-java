// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.kafkaconnect.outputs;

import io.pulumi.awsnative.kafkaconnect.enums.ConnectorKafkaClusterClientAuthenticationType;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.util.Objects;

@OutputCustomType
public final class ConnectorKafkaClusterClientAuthentication {
    private final ConnectorKafkaClusterClientAuthenticationType authenticationType;

    @OutputCustomType.Constructor({"authenticationType"})
    private ConnectorKafkaClusterClientAuthentication(ConnectorKafkaClusterClientAuthenticationType authenticationType) {
        this.authenticationType = Objects.requireNonNull(authenticationType);
    }

    public ConnectorKafkaClusterClientAuthenticationType getAuthenticationType() {
        return this.authenticationType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConnectorKafkaClusterClientAuthentication defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ConnectorKafkaClusterClientAuthenticationType authenticationType;

        public Builder() {
    	      // Empty
        }

        public Builder(ConnectorKafkaClusterClientAuthentication defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.authenticationType = defaults.authenticationType;
        }

        public Builder setAuthenticationType(ConnectorKafkaClusterClientAuthenticationType authenticationType) {
            this.authenticationType = Objects.requireNonNull(authenticationType);
            return this;
        }

        public ConnectorKafkaClusterClientAuthentication build() {
            return new ConnectorKafkaClusterClientAuthentication(authenticationType);
        }
    }
}
