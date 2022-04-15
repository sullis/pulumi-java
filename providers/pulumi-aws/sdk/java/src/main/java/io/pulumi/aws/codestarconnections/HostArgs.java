// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.codestarconnections;

import io.pulumi.aws.codestarconnections.inputs.HostVpcConfigurationArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class HostArgs extends io.pulumi.resources.ResourceArgs {

    public static final HostArgs Empty = new HostArgs();

    /**
     * The name of the host to be created. The name must be unique in the calling AWS account.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> name() {
        return this.name == null ? Codegen.empty() : this.name;
    }

    /**
     * The endpoint of the infrastructure to be represented by the host after it is created.
     * 
     */
    @Import(name="providerEndpoint", required=true)
      private final Output<String> providerEndpoint;

    public Output<String> providerEndpoint() {
        return this.providerEndpoint;
    }

    /**
     * The name of the external provider where your third-party code repository is configured.
     * 
     */
    @Import(name="providerType", required=true)
      private final Output<String> providerType;

    public Output<String> providerType() {
        return this.providerType;
    }

    /**
     * The VPC configuration to be provisioned for the host. A VPC must be configured, and the infrastructure to be represented by the host must already be connected to the VPC.
     * 
     */
    @Import(name="vpcConfiguration")
      private final @Nullable Output<HostVpcConfigurationArgs> vpcConfiguration;

    public Output<HostVpcConfigurationArgs> vpcConfiguration() {
        return this.vpcConfiguration == null ? Codegen.empty() : this.vpcConfiguration;
    }

    public HostArgs(
        @Nullable Output<String> name,
        Output<String> providerEndpoint,
        Output<String> providerType,
        @Nullable Output<HostVpcConfigurationArgs> vpcConfiguration) {
        this.name = name;
        this.providerEndpoint = Objects.requireNonNull(providerEndpoint, "expected parameter 'providerEndpoint' to be non-null");
        this.providerType = Objects.requireNonNull(providerType, "expected parameter 'providerType' to be non-null");
        this.vpcConfiguration = vpcConfiguration;
    }

    private HostArgs() {
        this.name = Codegen.empty();
        this.providerEndpoint = Codegen.empty();
        this.providerType = Codegen.empty();
        this.vpcConfiguration = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(HostArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> name;
        private Output<String> providerEndpoint;
        private Output<String> providerType;
        private @Nullable Output<HostVpcConfigurationArgs> vpcConfiguration;

        public Builder() {
    	      // Empty
        }

        public Builder(HostArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.providerEndpoint = defaults.providerEndpoint;
    	      this.providerType = defaults.providerType;
    	      this.vpcConfiguration = defaults.vpcConfiguration;
        }

        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Codegen.ofNullable(name);
            return this;
        }
        public Builder providerEndpoint(Output<String> providerEndpoint) {
            this.providerEndpoint = Objects.requireNonNull(providerEndpoint);
            return this;
        }
        public Builder providerEndpoint(String providerEndpoint) {
            this.providerEndpoint = Output.of(Objects.requireNonNull(providerEndpoint));
            return this;
        }
        public Builder providerType(Output<String> providerType) {
            this.providerType = Objects.requireNonNull(providerType);
            return this;
        }
        public Builder providerType(String providerType) {
            this.providerType = Output.of(Objects.requireNonNull(providerType));
            return this;
        }
        public Builder vpcConfiguration(@Nullable Output<HostVpcConfigurationArgs> vpcConfiguration) {
            this.vpcConfiguration = vpcConfiguration;
            return this;
        }
        public Builder vpcConfiguration(@Nullable HostVpcConfigurationArgs vpcConfiguration) {
            this.vpcConfiguration = Codegen.ofNullable(vpcConfiguration);
            return this;
        }        public HostArgs build() {
            return new HostArgs(name, providerEndpoint, providerType, vpcConfiguration);
        }
    }
}
