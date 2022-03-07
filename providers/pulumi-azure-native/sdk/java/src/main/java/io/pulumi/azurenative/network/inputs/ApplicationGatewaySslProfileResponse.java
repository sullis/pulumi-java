// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.inputs;

import io.pulumi.azurenative.network.inputs.ApplicationGatewayClientAuthConfigurationResponse;
import io.pulumi.azurenative.network.inputs.ApplicationGatewaySslPolicyResponse;
import io.pulumi.azurenative.network.inputs.SubResourceResponse;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * SSL profile of an application gateway.
 * 
 */
public final class ApplicationGatewaySslProfileResponse extends io.pulumi.resources.InvokeArgs {

    public static final ApplicationGatewaySslProfileResponse Empty = new ApplicationGatewaySslProfileResponse();

    /**
     * Client authentication configuration of the application gateway resource.
     * 
     */
    @InputImport(name="clientAuthConfiguration")
      private final @Nullable ApplicationGatewayClientAuthConfigurationResponse clientAuthConfiguration;

    public Optional<ApplicationGatewayClientAuthConfigurationResponse> getClientAuthConfiguration() {
        return this.clientAuthConfiguration == null ? Optional.empty() : Optional.ofNullable(this.clientAuthConfiguration);
    }

    /**
     * A unique read-only string that changes whenever the resource is updated.
     * 
     */
    @InputImport(name="etag", required=true)
      private final String etag;

    public String getEtag() {
        return this.etag;
    }

    /**
     * Resource ID.
     * 
     */
    @InputImport(name="id")
      private final @Nullable String id;

    public Optional<String> getId() {
        return this.id == null ? Optional.empty() : Optional.ofNullable(this.id);
    }

    /**
     * Name of the SSL profile that is unique within an Application Gateway.
     * 
     */
    @InputImport(name="name")
      private final @Nullable String name;

    public Optional<String> getName() {
        return this.name == null ? Optional.empty() : Optional.ofNullable(this.name);
    }

    /**
     * The provisioning state of the HTTP listener resource.
     * 
     */
    @InputImport(name="provisioningState", required=true)
      private final String provisioningState;

    public String getProvisioningState() {
        return this.provisioningState;
    }

    /**
     * SSL policy of the application gateway resource.
     * 
     */
    @InputImport(name="sslPolicy")
      private final @Nullable ApplicationGatewaySslPolicyResponse sslPolicy;

    public Optional<ApplicationGatewaySslPolicyResponse> getSslPolicy() {
        return this.sslPolicy == null ? Optional.empty() : Optional.ofNullable(this.sslPolicy);
    }

    /**
     * Array of references to application gateway trusted client certificates.
     * 
     */
    @InputImport(name="trustedClientCertificates")
      private final @Nullable List<SubResourceResponse> trustedClientCertificates;

    public List<SubResourceResponse> getTrustedClientCertificates() {
        return this.trustedClientCertificates == null ? List.of() : this.trustedClientCertificates;
    }

    /**
     * Type of the resource.
     * 
     */
    @InputImport(name="type", required=true)
      private final String type;

    public String getType() {
        return this.type;
    }

    public ApplicationGatewaySslProfileResponse(
        @Nullable ApplicationGatewayClientAuthConfigurationResponse clientAuthConfiguration,
        String etag,
        @Nullable String id,
        @Nullable String name,
        String provisioningState,
        @Nullable ApplicationGatewaySslPolicyResponse sslPolicy,
        @Nullable List<SubResourceResponse> trustedClientCertificates,
        String type) {
        this.clientAuthConfiguration = clientAuthConfiguration;
        this.etag = Objects.requireNonNull(etag, "expected parameter 'etag' to be non-null");
        this.id = id;
        this.name = name;
        this.provisioningState = Objects.requireNonNull(provisioningState, "expected parameter 'provisioningState' to be non-null");
        this.sslPolicy = sslPolicy;
        this.trustedClientCertificates = trustedClientCertificates;
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private ApplicationGatewaySslProfileResponse() {
        this.clientAuthConfiguration = null;
        this.etag = null;
        this.id = null;
        this.name = null;
        this.provisioningState = null;
        this.sslPolicy = null;
        this.trustedClientCertificates = List.of();
        this.type = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApplicationGatewaySslProfileResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable ApplicationGatewayClientAuthConfigurationResponse clientAuthConfiguration;
        private String etag;
        private @Nullable String id;
        private @Nullable String name;
        private String provisioningState;
        private @Nullable ApplicationGatewaySslPolicyResponse sslPolicy;
        private @Nullable List<SubResourceResponse> trustedClientCertificates;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(ApplicationGatewaySslProfileResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clientAuthConfiguration = defaults.clientAuthConfiguration;
    	      this.etag = defaults.etag;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.provisioningState = defaults.provisioningState;
    	      this.sslPolicy = defaults.sslPolicy;
    	      this.trustedClientCertificates = defaults.trustedClientCertificates;
    	      this.type = defaults.type;
        }

        public Builder setClientAuthConfiguration(@Nullable ApplicationGatewayClientAuthConfigurationResponse clientAuthConfiguration) {
            this.clientAuthConfiguration = clientAuthConfiguration;
            return this;
        }

        public Builder setEtag(String etag) {
            this.etag = Objects.requireNonNull(etag);
            return this;
        }

        public Builder setId(@Nullable String id) {
            this.id = id;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = name;
            return this;
        }

        public Builder setProvisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }

        public Builder setSslPolicy(@Nullable ApplicationGatewaySslPolicyResponse sslPolicy) {
            this.sslPolicy = sslPolicy;
            return this;
        }

        public Builder setTrustedClientCertificates(@Nullable List<SubResourceResponse> trustedClientCertificates) {
            this.trustedClientCertificates = trustedClientCertificates;
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public ApplicationGatewaySslProfileResponse build() {
            return new ApplicationGatewaySslProfileResponse(clientAuthConfiguration, etag, id, name, provisioningState, sslPolicy, trustedClientCertificates, type);
        }
    }
}