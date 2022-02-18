// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.inputs;

import io.pulumi.azurenative.network.inputs.ApplicationGatewayClientAuthConfigurationArgs;
import io.pulumi.azurenative.network.inputs.ApplicationGatewaySslPolicyArgs;
import io.pulumi.azurenative.network.inputs.SubResourceArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * SSL profile of an application gateway.
 * 
 */
public final class ApplicationGatewaySslProfileArgs extends io.pulumi.resources.ResourceArgs {

    public static final ApplicationGatewaySslProfileArgs Empty = new ApplicationGatewaySslProfileArgs();

    /**
     * Client authentication configuration of the application gateway resource.
     * 
     */
    @InputImport(name="clientAuthConfiguration")
    private final @Nullable Input<ApplicationGatewayClientAuthConfigurationArgs> clientAuthConfiguration;

    public Input<ApplicationGatewayClientAuthConfigurationArgs> getClientAuthConfiguration() {
        return this.clientAuthConfiguration == null ? Input.empty() : this.clientAuthConfiguration;
    }

    /**
     * Resource ID.
     * 
     */
    @InputImport(name="id")
    private final @Nullable Input<String> id;

    public Input<String> getId() {
        return this.id == null ? Input.empty() : this.id;
    }

    /**
     * Name of the SSL profile that is unique within an Application Gateway.
     * 
     */
    @InputImport(name="name")
    private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * SSL policy of the application gateway resource.
     * 
     */
    @InputImport(name="sslPolicy")
    private final @Nullable Input<ApplicationGatewaySslPolicyArgs> sslPolicy;

    public Input<ApplicationGatewaySslPolicyArgs> getSslPolicy() {
        return this.sslPolicy == null ? Input.empty() : this.sslPolicy;
    }

    /**
     * Array of references to application gateway trusted client certificates.
     * 
     */
    @InputImport(name="trustedClientCertificates")
    private final @Nullable Input<List<SubResourceArgs>> trustedClientCertificates;

    public Input<List<SubResourceArgs>> getTrustedClientCertificates() {
        return this.trustedClientCertificates == null ? Input.empty() : this.trustedClientCertificates;
    }

    public ApplicationGatewaySslProfileArgs(
        @Nullable Input<ApplicationGatewayClientAuthConfigurationArgs> clientAuthConfiguration,
        @Nullable Input<String> id,
        @Nullable Input<String> name,
        @Nullable Input<ApplicationGatewaySslPolicyArgs> sslPolicy,
        @Nullable Input<List<SubResourceArgs>> trustedClientCertificates) {
        this.clientAuthConfiguration = clientAuthConfiguration;
        this.id = id;
        this.name = name;
        this.sslPolicy = sslPolicy;
        this.trustedClientCertificates = trustedClientCertificates;
    }

    private ApplicationGatewaySslProfileArgs() {
        this.clientAuthConfiguration = Input.empty();
        this.id = Input.empty();
        this.name = Input.empty();
        this.sslPolicy = Input.empty();
        this.trustedClientCertificates = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApplicationGatewaySslProfileArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<ApplicationGatewayClientAuthConfigurationArgs> clientAuthConfiguration;
        private @Nullable Input<String> id;
        private @Nullable Input<String> name;
        private @Nullable Input<ApplicationGatewaySslPolicyArgs> sslPolicy;
        private @Nullable Input<List<SubResourceArgs>> trustedClientCertificates;

        public Builder() {
    	      // Empty
        }

        public Builder(ApplicationGatewaySslProfileArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clientAuthConfiguration = defaults.clientAuthConfiguration;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.sslPolicy = defaults.sslPolicy;
    	      this.trustedClientCertificates = defaults.trustedClientCertificates;
        }

        public Builder setClientAuthConfiguration(@Nullable Input<ApplicationGatewayClientAuthConfigurationArgs> clientAuthConfiguration) {
            this.clientAuthConfiguration = clientAuthConfiguration;
            return this;
        }

        public Builder setClientAuthConfiguration(@Nullable ApplicationGatewayClientAuthConfigurationArgs clientAuthConfiguration) {
            this.clientAuthConfiguration = Input.ofNullable(clientAuthConfiguration);
            return this;
        }

        public Builder setId(@Nullable Input<String> id) {
            this.id = id;
            return this;
        }

        public Builder setId(@Nullable String id) {
            this.id = Input.ofNullable(id);
            return this;
        }

        public Builder setName(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder setSslPolicy(@Nullable Input<ApplicationGatewaySslPolicyArgs> sslPolicy) {
            this.sslPolicy = sslPolicy;
            return this;
        }

        public Builder setSslPolicy(@Nullable ApplicationGatewaySslPolicyArgs sslPolicy) {
            this.sslPolicy = Input.ofNullable(sslPolicy);
            return this;
        }

        public Builder setTrustedClientCertificates(@Nullable Input<List<SubResourceArgs>> trustedClientCertificates) {
            this.trustedClientCertificates = trustedClientCertificates;
            return this;
        }

        public Builder setTrustedClientCertificates(@Nullable List<SubResourceArgs> trustedClientCertificates) {
            this.trustedClientCertificates = Input.ofNullable(trustedClientCertificates);
            return this;
        }

        public ApplicationGatewaySslProfileArgs build() {
            return new ApplicationGatewaySslProfileArgs(clientAuthConfiguration, id, name, sslPolicy, trustedClientCertificates);
        }
    }
}
