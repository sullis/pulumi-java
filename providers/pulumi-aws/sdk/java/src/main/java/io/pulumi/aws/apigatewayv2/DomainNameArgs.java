// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.apigatewayv2;

import io.pulumi.aws.apigatewayv2.inputs.DomainNameDomainNameConfigurationArgs;
import io.pulumi.aws.apigatewayv2.inputs.DomainNameMutualTlsAuthenticationArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DomainNameArgs extends io.pulumi.resources.ResourceArgs {

    public static final DomainNameArgs Empty = new DomainNameArgs();

    /**
     * The domain name. Must be between 1 and 512 characters in length.
     * 
     */
    @Import(name="domainName", required=true)
      private final Output<String> domainName;

    public Output<String> domainName() {
        return this.domainName;
    }

    /**
     * The domain name configuration.
     * 
     */
    @Import(name="domainNameConfiguration", required=true)
      private final Output<DomainNameDomainNameConfigurationArgs> domainNameConfiguration;

    public Output<DomainNameDomainNameConfigurationArgs> domainNameConfiguration() {
        return this.domainNameConfiguration;
    }

    /**
     * The mutual TLS authentication configuration for the domain name.
     * 
     */
    @Import(name="mutualTlsAuthentication")
      private final @Nullable Output<DomainNameMutualTlsAuthenticationArgs> mutualTlsAuthentication;

    public Output<DomainNameMutualTlsAuthenticationArgs> mutualTlsAuthentication() {
        return this.mutualTlsAuthentication == null ? Codegen.empty() : this.mutualTlsAuthentication;
    }

    /**
     * A map of tags to assign to the domain name. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<Map<String,String>> tags;

    public Output<Map<String,String>> tags() {
        return this.tags == null ? Codegen.empty() : this.tags;
    }

    public DomainNameArgs(
        Output<String> domainName,
        Output<DomainNameDomainNameConfigurationArgs> domainNameConfiguration,
        @Nullable Output<DomainNameMutualTlsAuthenticationArgs> mutualTlsAuthentication,
        @Nullable Output<Map<String,String>> tags) {
        this.domainName = Objects.requireNonNull(domainName, "expected parameter 'domainName' to be non-null");
        this.domainNameConfiguration = Objects.requireNonNull(domainNameConfiguration, "expected parameter 'domainNameConfiguration' to be non-null");
        this.mutualTlsAuthentication = mutualTlsAuthentication;
        this.tags = tags;
    }

    private DomainNameArgs() {
        this.domainName = Codegen.empty();
        this.domainNameConfiguration = Codegen.empty();
        this.mutualTlsAuthentication = Codegen.empty();
        this.tags = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DomainNameArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> domainName;
        private Output<DomainNameDomainNameConfigurationArgs> domainNameConfiguration;
        private @Nullable Output<DomainNameMutualTlsAuthenticationArgs> mutualTlsAuthentication;
        private @Nullable Output<Map<String,String>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(DomainNameArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.domainName = defaults.domainName;
    	      this.domainNameConfiguration = defaults.domainNameConfiguration;
    	      this.mutualTlsAuthentication = defaults.mutualTlsAuthentication;
    	      this.tags = defaults.tags;
        }

        public Builder domainName(Output<String> domainName) {
            this.domainName = Objects.requireNonNull(domainName);
            return this;
        }
        public Builder domainName(String domainName) {
            this.domainName = Output.of(Objects.requireNonNull(domainName));
            return this;
        }
        public Builder domainNameConfiguration(Output<DomainNameDomainNameConfigurationArgs> domainNameConfiguration) {
            this.domainNameConfiguration = Objects.requireNonNull(domainNameConfiguration);
            return this;
        }
        public Builder domainNameConfiguration(DomainNameDomainNameConfigurationArgs domainNameConfiguration) {
            this.domainNameConfiguration = Output.of(Objects.requireNonNull(domainNameConfiguration));
            return this;
        }
        public Builder mutualTlsAuthentication(@Nullable Output<DomainNameMutualTlsAuthenticationArgs> mutualTlsAuthentication) {
            this.mutualTlsAuthentication = mutualTlsAuthentication;
            return this;
        }
        public Builder mutualTlsAuthentication(@Nullable DomainNameMutualTlsAuthenticationArgs mutualTlsAuthentication) {
            this.mutualTlsAuthentication = Codegen.ofNullable(mutualTlsAuthentication);
            return this;
        }
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = Codegen.ofNullable(tags);
            return this;
        }        public DomainNameArgs build() {
            return new DomainNameArgs(domainName, domainNameConfiguration, mutualTlsAuthentication, tags);
        }
    }
}
