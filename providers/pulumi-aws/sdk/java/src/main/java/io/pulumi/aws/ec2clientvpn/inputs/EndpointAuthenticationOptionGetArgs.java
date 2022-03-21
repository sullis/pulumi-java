// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ec2clientvpn.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class EndpointAuthenticationOptionGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final EndpointAuthenticationOptionGetArgs Empty = new EndpointAuthenticationOptionGetArgs();

    /**
     * The ID of the Active Directory to be used for authentication if type is `directory-service-authentication`.
     * 
     */
    @Import(name="activeDirectoryId")
      private final @Nullable Output<String> activeDirectoryId;

    public Output<String> getActiveDirectoryId() {
        return this.activeDirectoryId == null ? Output.empty() : this.activeDirectoryId;
    }

    /**
     * The ARN of the client certificate. The certificate must be signed by a certificate authority (CA) and it must be provisioned in AWS Certificate Manager (ACM). Only necessary when type is set to `certificate-authentication`.
     * 
     */
    @Import(name="rootCertificateChainArn")
      private final @Nullable Output<String> rootCertificateChainArn;

    public Output<String> getRootCertificateChainArn() {
        return this.rootCertificateChainArn == null ? Output.empty() : this.rootCertificateChainArn;
    }

    /**
     * The ARN of the IAM SAML identity provider if type is `federated-authentication`.
     * 
     */
    @Import(name="samlProviderArn")
      private final @Nullable Output<String> samlProviderArn;

    public Output<String> getSamlProviderArn() {
        return this.samlProviderArn == null ? Output.empty() : this.samlProviderArn;
    }

    /**
     * The ARN of the IAM SAML identity provider for the self service portal if type is `federated-authentication`.
     * 
     */
    @Import(name="selfServiceSamlProviderArn")
      private final @Nullable Output<String> selfServiceSamlProviderArn;

    public Output<String> getSelfServiceSamlProviderArn() {
        return this.selfServiceSamlProviderArn == null ? Output.empty() : this.selfServiceSamlProviderArn;
    }

    /**
     * The type of client authentication to be used. Specify `certificate-authentication` to use certificate-based authentication, `directory-service-authentication` to use Active Directory authentication, or `federated-authentication` to use Federated Authentication via SAML 2.0.
     * 
     */
    @Import(name="type", required=true)
      private final Output<String> type;

    public Output<String> getType() {
        return this.type;
    }

    public EndpointAuthenticationOptionGetArgs(
        @Nullable Output<String> activeDirectoryId,
        @Nullable Output<String> rootCertificateChainArn,
        @Nullable Output<String> samlProviderArn,
        @Nullable Output<String> selfServiceSamlProviderArn,
        Output<String> type) {
        this.activeDirectoryId = activeDirectoryId;
        this.rootCertificateChainArn = rootCertificateChainArn;
        this.samlProviderArn = samlProviderArn;
        this.selfServiceSamlProviderArn = selfServiceSamlProviderArn;
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private EndpointAuthenticationOptionGetArgs() {
        this.activeDirectoryId = Output.empty();
        this.rootCertificateChainArn = Output.empty();
        this.samlProviderArn = Output.empty();
        this.selfServiceSamlProviderArn = Output.empty();
        this.type = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EndpointAuthenticationOptionGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> activeDirectoryId;
        private @Nullable Output<String> rootCertificateChainArn;
        private @Nullable Output<String> samlProviderArn;
        private @Nullable Output<String> selfServiceSamlProviderArn;
        private Output<String> type;

        public Builder() {
    	      // Empty
        }

        public Builder(EndpointAuthenticationOptionGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.activeDirectoryId = defaults.activeDirectoryId;
    	      this.rootCertificateChainArn = defaults.rootCertificateChainArn;
    	      this.samlProviderArn = defaults.samlProviderArn;
    	      this.selfServiceSamlProviderArn = defaults.selfServiceSamlProviderArn;
    	      this.type = defaults.type;
        }

        public Builder activeDirectoryId(@Nullable Output<String> activeDirectoryId) {
            this.activeDirectoryId = activeDirectoryId;
            return this;
        }
        public Builder activeDirectoryId(@Nullable String activeDirectoryId) {
            this.activeDirectoryId = Output.ofNullable(activeDirectoryId);
            return this;
        }
        public Builder rootCertificateChainArn(@Nullable Output<String> rootCertificateChainArn) {
            this.rootCertificateChainArn = rootCertificateChainArn;
            return this;
        }
        public Builder rootCertificateChainArn(@Nullable String rootCertificateChainArn) {
            this.rootCertificateChainArn = Output.ofNullable(rootCertificateChainArn);
            return this;
        }
        public Builder samlProviderArn(@Nullable Output<String> samlProviderArn) {
            this.samlProviderArn = samlProviderArn;
            return this;
        }
        public Builder samlProviderArn(@Nullable String samlProviderArn) {
            this.samlProviderArn = Output.ofNullable(samlProviderArn);
            return this;
        }
        public Builder selfServiceSamlProviderArn(@Nullable Output<String> selfServiceSamlProviderArn) {
            this.selfServiceSamlProviderArn = selfServiceSamlProviderArn;
            return this;
        }
        public Builder selfServiceSamlProviderArn(@Nullable String selfServiceSamlProviderArn) {
            this.selfServiceSamlProviderArn = Output.ofNullable(selfServiceSamlProviderArn);
            return this;
        }
        public Builder type(Output<String> type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public Builder type(String type) {
            this.type = Output.of(Objects.requireNonNull(type));
            return this;
        }        public EndpointAuthenticationOptionGetArgs build() {
            return new EndpointAuthenticationOptionGetArgs(activeDirectoryId, rootCertificateChainArn, samlProviderArn, selfServiceSamlProviderArn, type);
        }
    }
}
