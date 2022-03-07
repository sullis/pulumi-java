// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.container.inputs;

import io.pulumi.core.annotations.InputImport;
import io.pulumi.gcp.container.inputs.GetClusterPrivateClusterConfigMasterGlobalAccessConfig;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class GetClusterPrivateClusterConfig extends io.pulumi.resources.InvokeArgs {

    public static final GetClusterPrivateClusterConfig Empty = new GetClusterPrivateClusterConfig();

    @InputImport(name="enablePrivateEndpoint", required=true)
      private final Boolean enablePrivateEndpoint;

    public Boolean getEnablePrivateEndpoint() {
        return this.enablePrivateEndpoint;
    }

    @InputImport(name="enablePrivateNodes", required=true)
      private final Boolean enablePrivateNodes;

    public Boolean getEnablePrivateNodes() {
        return this.enablePrivateNodes;
    }

    @InputImport(name="masterGlobalAccessConfigs", required=true)
      private final List<GetClusterPrivateClusterConfigMasterGlobalAccessConfig> masterGlobalAccessConfigs;

    public List<GetClusterPrivateClusterConfigMasterGlobalAccessConfig> getMasterGlobalAccessConfigs() {
        return this.masterGlobalAccessConfigs;
    }

    @InputImport(name="masterIpv4CidrBlock", required=true)
      private final String masterIpv4CidrBlock;

    public String getMasterIpv4CidrBlock() {
        return this.masterIpv4CidrBlock;
    }

    @InputImport(name="peeringName", required=true)
      private final String peeringName;

    public String getPeeringName() {
        return this.peeringName;
    }

    @InputImport(name="privateEndpoint", required=true)
      private final String privateEndpoint;

    public String getPrivateEndpoint() {
        return this.privateEndpoint;
    }

    @InputImport(name="publicEndpoint", required=true)
      private final String publicEndpoint;

    public String getPublicEndpoint() {
        return this.publicEndpoint;
    }

    public GetClusterPrivateClusterConfig(
        Boolean enablePrivateEndpoint,
        Boolean enablePrivateNodes,
        List<GetClusterPrivateClusterConfigMasterGlobalAccessConfig> masterGlobalAccessConfigs,
        String masterIpv4CidrBlock,
        String peeringName,
        String privateEndpoint,
        String publicEndpoint) {
        this.enablePrivateEndpoint = Objects.requireNonNull(enablePrivateEndpoint, "expected parameter 'enablePrivateEndpoint' to be non-null");
        this.enablePrivateNodes = Objects.requireNonNull(enablePrivateNodes, "expected parameter 'enablePrivateNodes' to be non-null");
        this.masterGlobalAccessConfigs = Objects.requireNonNull(masterGlobalAccessConfigs, "expected parameter 'masterGlobalAccessConfigs' to be non-null");
        this.masterIpv4CidrBlock = Objects.requireNonNull(masterIpv4CidrBlock, "expected parameter 'masterIpv4CidrBlock' to be non-null");
        this.peeringName = Objects.requireNonNull(peeringName, "expected parameter 'peeringName' to be non-null");
        this.privateEndpoint = Objects.requireNonNull(privateEndpoint, "expected parameter 'privateEndpoint' to be non-null");
        this.publicEndpoint = Objects.requireNonNull(publicEndpoint, "expected parameter 'publicEndpoint' to be non-null");
    }

    private GetClusterPrivateClusterConfig() {
        this.enablePrivateEndpoint = null;
        this.enablePrivateNodes = null;
        this.masterGlobalAccessConfigs = List.of();
        this.masterIpv4CidrBlock = null;
        this.peeringName = null;
        this.privateEndpoint = null;
        this.publicEndpoint = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetClusterPrivateClusterConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean enablePrivateEndpoint;
        private Boolean enablePrivateNodes;
        private List<GetClusterPrivateClusterConfigMasterGlobalAccessConfig> masterGlobalAccessConfigs;
        private String masterIpv4CidrBlock;
        private String peeringName;
        private String privateEndpoint;
        private String publicEndpoint;

        public Builder() {
    	      // Empty
        }

        public Builder(GetClusterPrivateClusterConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enablePrivateEndpoint = defaults.enablePrivateEndpoint;
    	      this.enablePrivateNodes = defaults.enablePrivateNodes;
    	      this.masterGlobalAccessConfigs = defaults.masterGlobalAccessConfigs;
    	      this.masterIpv4CidrBlock = defaults.masterIpv4CidrBlock;
    	      this.peeringName = defaults.peeringName;
    	      this.privateEndpoint = defaults.privateEndpoint;
    	      this.publicEndpoint = defaults.publicEndpoint;
        }

        public Builder setEnablePrivateEndpoint(Boolean enablePrivateEndpoint) {
            this.enablePrivateEndpoint = Objects.requireNonNull(enablePrivateEndpoint);
            return this;
        }

        public Builder setEnablePrivateNodes(Boolean enablePrivateNodes) {
            this.enablePrivateNodes = Objects.requireNonNull(enablePrivateNodes);
            return this;
        }

        public Builder setMasterGlobalAccessConfigs(List<GetClusterPrivateClusterConfigMasterGlobalAccessConfig> masterGlobalAccessConfigs) {
            this.masterGlobalAccessConfigs = Objects.requireNonNull(masterGlobalAccessConfigs);
            return this;
        }

        public Builder setMasterIpv4CidrBlock(String masterIpv4CidrBlock) {
            this.masterIpv4CidrBlock = Objects.requireNonNull(masterIpv4CidrBlock);
            return this;
        }

        public Builder setPeeringName(String peeringName) {
            this.peeringName = Objects.requireNonNull(peeringName);
            return this;
        }

        public Builder setPrivateEndpoint(String privateEndpoint) {
            this.privateEndpoint = Objects.requireNonNull(privateEndpoint);
            return this;
        }

        public Builder setPublicEndpoint(String publicEndpoint) {
            this.publicEndpoint = Objects.requireNonNull(publicEndpoint);
            return this;
        }
        public GetClusterPrivateClusterConfig build() {
            return new GetClusterPrivateClusterConfig(enablePrivateEndpoint, enablePrivateNodes, masterGlobalAccessConfigs, masterIpv4CidrBlock, peeringName, privateEndpoint, publicEndpoint);
        }
    }
}