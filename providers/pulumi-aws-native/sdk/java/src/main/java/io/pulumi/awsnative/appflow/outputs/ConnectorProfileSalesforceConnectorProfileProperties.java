// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.appflow.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ConnectorProfileSalesforceConnectorProfileProperties {
    private final @Nullable String instanceUrl;
    private final @Nullable Boolean isSandboxEnvironment;

    @OutputCustomType.Constructor({"instanceUrl","isSandboxEnvironment"})
    private ConnectorProfileSalesforceConnectorProfileProperties(
        @Nullable String instanceUrl,
        @Nullable Boolean isSandboxEnvironment) {
        this.instanceUrl = instanceUrl;
        this.isSandboxEnvironment = isSandboxEnvironment;
    }

    public Optional<String> getInstanceUrl() {
        return Optional.ofNullable(this.instanceUrl);
    }
    public Optional<Boolean> getIsSandboxEnvironment() {
        return Optional.ofNullable(this.isSandboxEnvironment);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConnectorProfileSalesforceConnectorProfileProperties defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String instanceUrl;
        private @Nullable Boolean isSandboxEnvironment;

        public Builder() {
    	      // Empty
        }

        public Builder(ConnectorProfileSalesforceConnectorProfileProperties defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.instanceUrl = defaults.instanceUrl;
    	      this.isSandboxEnvironment = defaults.isSandboxEnvironment;
        }

        public Builder setInstanceUrl(@Nullable String instanceUrl) {
            this.instanceUrl = instanceUrl;
            return this;
        }

        public Builder setIsSandboxEnvironment(@Nullable Boolean isSandboxEnvironment) {
            this.isSandboxEnvironment = isSandboxEnvironment;
            return this;
        }

        public ConnectorProfileSalesforceConnectorProfileProperties build() {
            return new ConnectorProfileSalesforceConnectorProfileProperties(instanceUrl, isSandboxEnvironment);
        }
    }
}
