// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.appflow.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class ConnectorProfileDatadogConnectorProfileProperties {
    private final String instanceUrl;

    @OutputCustomType.Constructor({"instanceUrl"})
    private ConnectorProfileDatadogConnectorProfileProperties(String instanceUrl) {
        this.instanceUrl = Objects.requireNonNull(instanceUrl);
    }

    public String getInstanceUrl() {
        return this.instanceUrl;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConnectorProfileDatadogConnectorProfileProperties defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String instanceUrl;

        public Builder() {
    	      // Empty
        }

        public Builder(ConnectorProfileDatadogConnectorProfileProperties defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.instanceUrl = defaults.instanceUrl;
        }

        public Builder setInstanceUrl(String instanceUrl) {
            this.instanceUrl = Objects.requireNonNull(instanceUrl);
            return this;
        }

        public ConnectorProfileDatadogConnectorProfileProperties build() {
            return new ConnectorProfileDatadogConnectorProfileProperties(instanceUrl);
        }
    }
}
