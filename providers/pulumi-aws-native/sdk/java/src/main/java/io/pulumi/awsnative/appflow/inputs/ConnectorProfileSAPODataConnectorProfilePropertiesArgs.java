// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.appflow.inputs;

import io.pulumi.awsnative.appflow.inputs.ConnectorProfileOAuthPropertiesArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ConnectorProfileSAPODataConnectorProfilePropertiesArgs extends io.pulumi.resources.ResourceArgs {

    public static final ConnectorProfileSAPODataConnectorProfilePropertiesArgs Empty = new ConnectorProfileSAPODataConnectorProfilePropertiesArgs();

    @InputImport(name="applicationHostUrl")
    private final @Nullable Input<String> applicationHostUrl;

    public Input<String> getApplicationHostUrl() {
        return this.applicationHostUrl == null ? Input.empty() : this.applicationHostUrl;
    }

    @InputImport(name="applicationServicePath")
    private final @Nullable Input<String> applicationServicePath;

    public Input<String> getApplicationServicePath() {
        return this.applicationServicePath == null ? Input.empty() : this.applicationServicePath;
    }

    @InputImport(name="clientNumber")
    private final @Nullable Input<String> clientNumber;

    public Input<String> getClientNumber() {
        return this.clientNumber == null ? Input.empty() : this.clientNumber;
    }

    @InputImport(name="logonLanguage")
    private final @Nullable Input<String> logonLanguage;

    public Input<String> getLogonLanguage() {
        return this.logonLanguage == null ? Input.empty() : this.logonLanguage;
    }

    @InputImport(name="oAuthProperties")
    private final @Nullable Input<ConnectorProfileOAuthPropertiesArgs> oAuthProperties;

    public Input<ConnectorProfileOAuthPropertiesArgs> getOAuthProperties() {
        return this.oAuthProperties == null ? Input.empty() : this.oAuthProperties;
    }

    @InputImport(name="portNumber")
    private final @Nullable Input<Integer> portNumber;

    public Input<Integer> getPortNumber() {
        return this.portNumber == null ? Input.empty() : this.portNumber;
    }

    @InputImport(name="privateLinkServiceName")
    private final @Nullable Input<String> privateLinkServiceName;

    public Input<String> getPrivateLinkServiceName() {
        return this.privateLinkServiceName == null ? Input.empty() : this.privateLinkServiceName;
    }

    public ConnectorProfileSAPODataConnectorProfilePropertiesArgs(
        @Nullable Input<String> applicationHostUrl,
        @Nullable Input<String> applicationServicePath,
        @Nullable Input<String> clientNumber,
        @Nullable Input<String> logonLanguage,
        @Nullable Input<ConnectorProfileOAuthPropertiesArgs> oAuthProperties,
        @Nullable Input<Integer> portNumber,
        @Nullable Input<String> privateLinkServiceName) {
        this.applicationHostUrl = applicationHostUrl;
        this.applicationServicePath = applicationServicePath;
        this.clientNumber = clientNumber;
        this.logonLanguage = logonLanguage;
        this.oAuthProperties = oAuthProperties;
        this.portNumber = portNumber;
        this.privateLinkServiceName = privateLinkServiceName;
    }

    private ConnectorProfileSAPODataConnectorProfilePropertiesArgs() {
        this.applicationHostUrl = Input.empty();
        this.applicationServicePath = Input.empty();
        this.clientNumber = Input.empty();
        this.logonLanguage = Input.empty();
        this.oAuthProperties = Input.empty();
        this.portNumber = Input.empty();
        this.privateLinkServiceName = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConnectorProfileSAPODataConnectorProfilePropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> applicationHostUrl;
        private @Nullable Input<String> applicationServicePath;
        private @Nullable Input<String> clientNumber;
        private @Nullable Input<String> logonLanguage;
        private @Nullable Input<ConnectorProfileOAuthPropertiesArgs> oAuthProperties;
        private @Nullable Input<Integer> portNumber;
        private @Nullable Input<String> privateLinkServiceName;

        public Builder() {
    	      // Empty
        }

        public Builder(ConnectorProfileSAPODataConnectorProfilePropertiesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.applicationHostUrl = defaults.applicationHostUrl;
    	      this.applicationServicePath = defaults.applicationServicePath;
    	      this.clientNumber = defaults.clientNumber;
    	      this.logonLanguage = defaults.logonLanguage;
    	      this.oAuthProperties = defaults.oAuthProperties;
    	      this.portNumber = defaults.portNumber;
    	      this.privateLinkServiceName = defaults.privateLinkServiceName;
        }

        public Builder setApplicationHostUrl(@Nullable Input<String> applicationHostUrl) {
            this.applicationHostUrl = applicationHostUrl;
            return this;
        }

        public Builder setApplicationHostUrl(@Nullable String applicationHostUrl) {
            this.applicationHostUrl = Input.ofNullable(applicationHostUrl);
            return this;
        }

        public Builder setApplicationServicePath(@Nullable Input<String> applicationServicePath) {
            this.applicationServicePath = applicationServicePath;
            return this;
        }

        public Builder setApplicationServicePath(@Nullable String applicationServicePath) {
            this.applicationServicePath = Input.ofNullable(applicationServicePath);
            return this;
        }

        public Builder setClientNumber(@Nullable Input<String> clientNumber) {
            this.clientNumber = clientNumber;
            return this;
        }

        public Builder setClientNumber(@Nullable String clientNumber) {
            this.clientNumber = Input.ofNullable(clientNumber);
            return this;
        }

        public Builder setLogonLanguage(@Nullable Input<String> logonLanguage) {
            this.logonLanguage = logonLanguage;
            return this;
        }

        public Builder setLogonLanguage(@Nullable String logonLanguage) {
            this.logonLanguage = Input.ofNullable(logonLanguage);
            return this;
        }

        public Builder setOAuthProperties(@Nullable Input<ConnectorProfileOAuthPropertiesArgs> oAuthProperties) {
            this.oAuthProperties = oAuthProperties;
            return this;
        }

        public Builder setOAuthProperties(@Nullable ConnectorProfileOAuthPropertiesArgs oAuthProperties) {
            this.oAuthProperties = Input.ofNullable(oAuthProperties);
            return this;
        }

        public Builder setPortNumber(@Nullable Input<Integer> portNumber) {
            this.portNumber = portNumber;
            return this;
        }

        public Builder setPortNumber(@Nullable Integer portNumber) {
            this.portNumber = Input.ofNullable(portNumber);
            return this;
        }

        public Builder setPrivateLinkServiceName(@Nullable Input<String> privateLinkServiceName) {
            this.privateLinkServiceName = privateLinkServiceName;
            return this;
        }

        public Builder setPrivateLinkServiceName(@Nullable String privateLinkServiceName) {
            this.privateLinkServiceName = Input.ofNullable(privateLinkServiceName);
            return this;
        }

        public ConnectorProfileSAPODataConnectorProfilePropertiesArgs build() {
            return new ConnectorProfileSAPODataConnectorProfilePropertiesArgs(applicationHostUrl, applicationServicePath, clientNumber, logonLanguage, oAuthProperties, portNumber, privateLinkServiceName);
        }
    }
}
