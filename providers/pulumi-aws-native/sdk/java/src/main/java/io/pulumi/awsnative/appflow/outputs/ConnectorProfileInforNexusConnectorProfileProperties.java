// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.appflow.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class ConnectorProfileInforNexusConnectorProfileProperties {
    /**
     * The location of the InforNexus resource
     * 
     */
    private final String instanceUrl;

    @CustomType.Constructor
    private ConnectorProfileInforNexusConnectorProfileProperties(@CustomType.Parameter("instanceUrl") String instanceUrl) {
        this.instanceUrl = instanceUrl;
    }

    /**
     * The location of the InforNexus resource
     * 
    */
    public String instanceUrl() {
        return this.instanceUrl;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConnectorProfileInforNexusConnectorProfileProperties defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String instanceUrl;

        public Builder() {
    	      // Empty
        }

        public Builder(ConnectorProfileInforNexusConnectorProfileProperties defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.instanceUrl = defaults.instanceUrl;
        }

        public Builder instanceUrl(String instanceUrl) {
            this.instanceUrl = Objects.requireNonNull(instanceUrl);
            return this;
        }        public ConnectorProfileInforNexusConnectorProfileProperties build() {
            return new ConnectorProfileInforNexusConnectorProfileProperties(instanceUrl);
        }
    }
}
