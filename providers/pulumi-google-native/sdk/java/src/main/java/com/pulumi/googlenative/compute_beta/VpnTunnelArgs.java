// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute_beta;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class VpnTunnelArgs extends com.pulumi.resources.ResourceArgs {

    public static final VpnTunnelArgs Empty = new VpnTunnelArgs();

    /**
     * An optional description of this resource. Provide this property when you create the resource.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return An optional description of this resource. Provide this property when you create the resource.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * IKE protocol version to use when establishing the VPN tunnel with the peer VPN gateway. Acceptable IKE versions are 1 or 2. The default version is 2.
     * 
     */
    @Import(name="ikeVersion")
    private @Nullable Output<Integer> ikeVersion;

    /**
     * @return IKE protocol version to use when establishing the VPN tunnel with the peer VPN gateway. Acceptable IKE versions are 1 or 2. The default version is 2.
     * 
     */
    public Optional<Output<Integer>> ikeVersion() {
        return Optional.ofNullable(this.ikeVersion);
    }

    /**
     * Labels for this resource. These can only be added or modified by the setLabels method. Each label key/value pair must comply with RFC1035. Label values may be empty.
     * 
     */
    @Import(name="labels")
    private @Nullable Output<Map<String,String>> labels;

    /**
     * @return Labels for this resource. These can only be added or modified by the setLabels method. Each label key/value pair must comply with RFC1035. Label values may be empty.
     * 
     */
    public Optional<Output<Map<String,String>>> labels() {
        return Optional.ofNullable(this.labels);
    }

    /**
     * Local traffic selector to use when establishing the VPN tunnel with the peer VPN gateway. The value should be a CIDR formatted string, for example: 192.168.0.0/16. The ranges must be disjoint. Only IPv4 is supported.
     * 
     */
    @Import(name="localTrafficSelector")
    private @Nullable Output<List<String>> localTrafficSelector;

    /**
     * @return Local traffic selector to use when establishing the VPN tunnel with the peer VPN gateway. The value should be a CIDR formatted string, for example: 192.168.0.0/16. The ranges must be disjoint. Only IPv4 is supported.
     * 
     */
    public Optional<Output<List<String>>> localTrafficSelector() {
        return Optional.ofNullable(this.localTrafficSelector);
    }

    /**
     * Name of the resource. Provided by the client when the resource is created. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Name of the resource. Provided by the client when the resource is created. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * URL of the peer side external VPN gateway to which this VPN tunnel is connected. Provided by the client when the VPN tunnel is created. This field is exclusive with the field peerGcpGateway.
     * 
     */
    @Import(name="peerExternalGateway")
    private @Nullable Output<String> peerExternalGateway;

    /**
     * @return URL of the peer side external VPN gateway to which this VPN tunnel is connected. Provided by the client when the VPN tunnel is created. This field is exclusive with the field peerGcpGateway.
     * 
     */
    public Optional<Output<String>> peerExternalGateway() {
        return Optional.ofNullable(this.peerExternalGateway);
    }

    /**
     * The interface ID of the external VPN gateway to which this VPN tunnel is connected. Provided by the client when the VPN tunnel is created.
     * 
     */
    @Import(name="peerExternalGatewayInterface")
    private @Nullable Output<Integer> peerExternalGatewayInterface;

    /**
     * @return The interface ID of the external VPN gateway to which this VPN tunnel is connected. Provided by the client when the VPN tunnel is created.
     * 
     */
    public Optional<Output<Integer>> peerExternalGatewayInterface() {
        return Optional.ofNullable(this.peerExternalGatewayInterface);
    }

    /**
     * URL of the peer side HA GCP VPN gateway to which this VPN tunnel is connected. Provided by the client when the VPN tunnel is created. This field can be used when creating highly available VPN from VPC network to VPC network, the field is exclusive with the field peerExternalGateway. If provided, the VPN tunnel will automatically use the same vpnGatewayInterface ID in the peer GCP VPN gateway.
     * 
     */
    @Import(name="peerGcpGateway")
    private @Nullable Output<String> peerGcpGateway;

    /**
     * @return URL of the peer side HA GCP VPN gateway to which this VPN tunnel is connected. Provided by the client when the VPN tunnel is created. This field can be used when creating highly available VPN from VPC network to VPC network, the field is exclusive with the field peerExternalGateway. If provided, the VPN tunnel will automatically use the same vpnGatewayInterface ID in the peer GCP VPN gateway.
     * 
     */
    public Optional<Output<String>> peerGcpGateway() {
        return Optional.ofNullable(this.peerGcpGateway);
    }

    /**
     * IP address of the peer VPN gateway. Only IPv4 is supported.
     * 
     */
    @Import(name="peerIp")
    private @Nullable Output<String> peerIp;

    /**
     * @return IP address of the peer VPN gateway. Only IPv4 is supported.
     * 
     */
    public Optional<Output<String>> peerIp() {
        return Optional.ofNullable(this.peerIp);
    }

    @Import(name="project")
    private @Nullable Output<String> project;

    public Optional<Output<String>> project() {
        return Optional.ofNullable(this.project);
    }

    @Import(name="region", required=true)
    private Output<String> region;

    public Output<String> region() {
        return this.region;
    }

    /**
     * Remote traffic selectors to use when establishing the VPN tunnel with the peer VPN gateway. The value should be a CIDR formatted string, for example: 192.168.0.0/16. The ranges should be disjoint. Only IPv4 is supported.
     * 
     */
    @Import(name="remoteTrafficSelector")
    private @Nullable Output<List<String>> remoteTrafficSelector;

    /**
     * @return Remote traffic selectors to use when establishing the VPN tunnel with the peer VPN gateway. The value should be a CIDR formatted string, for example: 192.168.0.0/16. The ranges should be disjoint. Only IPv4 is supported.
     * 
     */
    public Optional<Output<List<String>>> remoteTrafficSelector() {
        return Optional.ofNullable(this.remoteTrafficSelector);
    }

    @Import(name="requestId")
    private @Nullable Output<String> requestId;

    public Optional<Output<String>> requestId() {
        return Optional.ofNullable(this.requestId);
    }

    /**
     * URL of the router resource to be used for dynamic routing.
     * 
     */
    @Import(name="router")
    private @Nullable Output<String> router;

    /**
     * @return URL of the router resource to be used for dynamic routing.
     * 
     */
    public Optional<Output<String>> router() {
        return Optional.ofNullable(this.router);
    }

    /**
     * Shared secret used to set the secure session between the Cloud VPN gateway and the peer VPN gateway.
     * 
     */
    @Import(name="sharedSecret")
    private @Nullable Output<String> sharedSecret;

    /**
     * @return Shared secret used to set the secure session between the Cloud VPN gateway and the peer VPN gateway.
     * 
     */
    public Optional<Output<String>> sharedSecret() {
        return Optional.ofNullable(this.sharedSecret);
    }

    /**
     * Hash of the shared secret.
     * 
     */
    @Import(name="sharedSecretHash")
    private @Nullable Output<String> sharedSecretHash;

    /**
     * @return Hash of the shared secret.
     * 
     */
    public Optional<Output<String>> sharedSecretHash() {
        return Optional.ofNullable(this.sharedSecretHash);
    }

    /**
     * URL of the Target VPN gateway with which this VPN tunnel is associated. Provided by the client when the VPN tunnel is created.
     * 
     */
    @Import(name="targetVpnGateway")
    private @Nullable Output<String> targetVpnGateway;

    /**
     * @return URL of the Target VPN gateway with which this VPN tunnel is associated. Provided by the client when the VPN tunnel is created.
     * 
     */
    public Optional<Output<String>> targetVpnGateway() {
        return Optional.ofNullable(this.targetVpnGateway);
    }

    /**
     * URL of the VPN gateway with which this VPN tunnel is associated. Provided by the client when the VPN tunnel is created. This must be used (instead of target_vpn_gateway) if a High Availability VPN gateway resource is created.
     * 
     */
    @Import(name="vpnGateway")
    private @Nullable Output<String> vpnGateway;

    /**
     * @return URL of the VPN gateway with which this VPN tunnel is associated. Provided by the client when the VPN tunnel is created. This must be used (instead of target_vpn_gateway) if a High Availability VPN gateway resource is created.
     * 
     */
    public Optional<Output<String>> vpnGateway() {
        return Optional.ofNullable(this.vpnGateway);
    }

    /**
     * The interface ID of the VPN gateway with which this VPN tunnel is associated.
     * 
     */
    @Import(name="vpnGatewayInterface")
    private @Nullable Output<Integer> vpnGatewayInterface;

    /**
     * @return The interface ID of the VPN gateway with which this VPN tunnel is associated.
     * 
     */
    public Optional<Output<Integer>> vpnGatewayInterface() {
        return Optional.ofNullable(this.vpnGatewayInterface);
    }

    private VpnTunnelArgs() {}

    private VpnTunnelArgs(VpnTunnelArgs $) {
        this.description = $.description;
        this.ikeVersion = $.ikeVersion;
        this.labels = $.labels;
        this.localTrafficSelector = $.localTrafficSelector;
        this.name = $.name;
        this.peerExternalGateway = $.peerExternalGateway;
        this.peerExternalGatewayInterface = $.peerExternalGatewayInterface;
        this.peerGcpGateway = $.peerGcpGateway;
        this.peerIp = $.peerIp;
        this.project = $.project;
        this.region = $.region;
        this.remoteTrafficSelector = $.remoteTrafficSelector;
        this.requestId = $.requestId;
        this.router = $.router;
        this.sharedSecret = $.sharedSecret;
        this.sharedSecretHash = $.sharedSecretHash;
        this.targetVpnGateway = $.targetVpnGateway;
        this.vpnGateway = $.vpnGateway;
        this.vpnGatewayInterface = $.vpnGatewayInterface;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(VpnTunnelArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private VpnTunnelArgs $;

        public Builder() {
            $ = new VpnTunnelArgs();
        }

        public Builder(VpnTunnelArgs defaults) {
            $ = new VpnTunnelArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param description An optional description of this resource. Provide this property when you create the resource.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description An optional description of this resource. Provide this property when you create the resource.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param ikeVersion IKE protocol version to use when establishing the VPN tunnel with the peer VPN gateway. Acceptable IKE versions are 1 or 2. The default version is 2.
         * 
         * @return builder
         * 
         */
        public Builder ikeVersion(@Nullable Output<Integer> ikeVersion) {
            $.ikeVersion = ikeVersion;
            return this;
        }

        /**
         * @param ikeVersion IKE protocol version to use when establishing the VPN tunnel with the peer VPN gateway. Acceptable IKE versions are 1 or 2. The default version is 2.
         * 
         * @return builder
         * 
         */
        public Builder ikeVersion(Integer ikeVersion) {
            return ikeVersion(Output.of(ikeVersion));
        }

        /**
         * @param labels Labels for this resource. These can only be added or modified by the setLabels method. Each label key/value pair must comply with RFC1035. Label values may be empty.
         * 
         * @return builder
         * 
         */
        public Builder labels(@Nullable Output<Map<String,String>> labels) {
            $.labels = labels;
            return this;
        }

        /**
         * @param labels Labels for this resource. These can only be added or modified by the setLabels method. Each label key/value pair must comply with RFC1035. Label values may be empty.
         * 
         * @return builder
         * 
         */
        public Builder labels(Map<String,String> labels) {
            return labels(Output.of(labels));
        }

        /**
         * @param localTrafficSelector Local traffic selector to use when establishing the VPN tunnel with the peer VPN gateway. The value should be a CIDR formatted string, for example: 192.168.0.0/16. The ranges must be disjoint. Only IPv4 is supported.
         * 
         * @return builder
         * 
         */
        public Builder localTrafficSelector(@Nullable Output<List<String>> localTrafficSelector) {
            $.localTrafficSelector = localTrafficSelector;
            return this;
        }

        /**
         * @param localTrafficSelector Local traffic selector to use when establishing the VPN tunnel with the peer VPN gateway. The value should be a CIDR formatted string, for example: 192.168.0.0/16. The ranges must be disjoint. Only IPv4 is supported.
         * 
         * @return builder
         * 
         */
        public Builder localTrafficSelector(List<String> localTrafficSelector) {
            return localTrafficSelector(Output.of(localTrafficSelector));
        }

        /**
         * @param localTrafficSelector Local traffic selector to use when establishing the VPN tunnel with the peer VPN gateway. The value should be a CIDR formatted string, for example: 192.168.0.0/16. The ranges must be disjoint. Only IPv4 is supported.
         * 
         * @return builder
         * 
         */
        public Builder localTrafficSelector(String... localTrafficSelector) {
            return localTrafficSelector(List.of(localTrafficSelector));
        }

        /**
         * @param name Name of the resource. Provided by the client when the resource is created. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Name of the resource. Provided by the client when the resource is created. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param peerExternalGateway URL of the peer side external VPN gateway to which this VPN tunnel is connected. Provided by the client when the VPN tunnel is created. This field is exclusive with the field peerGcpGateway.
         * 
         * @return builder
         * 
         */
        public Builder peerExternalGateway(@Nullable Output<String> peerExternalGateway) {
            $.peerExternalGateway = peerExternalGateway;
            return this;
        }

        /**
         * @param peerExternalGateway URL of the peer side external VPN gateway to which this VPN tunnel is connected. Provided by the client when the VPN tunnel is created. This field is exclusive with the field peerGcpGateway.
         * 
         * @return builder
         * 
         */
        public Builder peerExternalGateway(String peerExternalGateway) {
            return peerExternalGateway(Output.of(peerExternalGateway));
        }

        /**
         * @param peerExternalGatewayInterface The interface ID of the external VPN gateway to which this VPN tunnel is connected. Provided by the client when the VPN tunnel is created.
         * 
         * @return builder
         * 
         */
        public Builder peerExternalGatewayInterface(@Nullable Output<Integer> peerExternalGatewayInterface) {
            $.peerExternalGatewayInterface = peerExternalGatewayInterface;
            return this;
        }

        /**
         * @param peerExternalGatewayInterface The interface ID of the external VPN gateway to which this VPN tunnel is connected. Provided by the client when the VPN tunnel is created.
         * 
         * @return builder
         * 
         */
        public Builder peerExternalGatewayInterface(Integer peerExternalGatewayInterface) {
            return peerExternalGatewayInterface(Output.of(peerExternalGatewayInterface));
        }

        /**
         * @param peerGcpGateway URL of the peer side HA GCP VPN gateway to which this VPN tunnel is connected. Provided by the client when the VPN tunnel is created. This field can be used when creating highly available VPN from VPC network to VPC network, the field is exclusive with the field peerExternalGateway. If provided, the VPN tunnel will automatically use the same vpnGatewayInterface ID in the peer GCP VPN gateway.
         * 
         * @return builder
         * 
         */
        public Builder peerGcpGateway(@Nullable Output<String> peerGcpGateway) {
            $.peerGcpGateway = peerGcpGateway;
            return this;
        }

        /**
         * @param peerGcpGateway URL of the peer side HA GCP VPN gateway to which this VPN tunnel is connected. Provided by the client when the VPN tunnel is created. This field can be used when creating highly available VPN from VPC network to VPC network, the field is exclusive with the field peerExternalGateway. If provided, the VPN tunnel will automatically use the same vpnGatewayInterface ID in the peer GCP VPN gateway.
         * 
         * @return builder
         * 
         */
        public Builder peerGcpGateway(String peerGcpGateway) {
            return peerGcpGateway(Output.of(peerGcpGateway));
        }

        /**
         * @param peerIp IP address of the peer VPN gateway. Only IPv4 is supported.
         * 
         * @return builder
         * 
         */
        public Builder peerIp(@Nullable Output<String> peerIp) {
            $.peerIp = peerIp;
            return this;
        }

        /**
         * @param peerIp IP address of the peer VPN gateway. Only IPv4 is supported.
         * 
         * @return builder
         * 
         */
        public Builder peerIp(String peerIp) {
            return peerIp(Output.of(peerIp));
        }

        public Builder project(@Nullable Output<String> project) {
            $.project = project;
            return this;
        }

        public Builder project(String project) {
            return project(Output.of(project));
        }

        public Builder region(Output<String> region) {
            $.region = region;
            return this;
        }

        public Builder region(String region) {
            return region(Output.of(region));
        }

        /**
         * @param remoteTrafficSelector Remote traffic selectors to use when establishing the VPN tunnel with the peer VPN gateway. The value should be a CIDR formatted string, for example: 192.168.0.0/16. The ranges should be disjoint. Only IPv4 is supported.
         * 
         * @return builder
         * 
         */
        public Builder remoteTrafficSelector(@Nullable Output<List<String>> remoteTrafficSelector) {
            $.remoteTrafficSelector = remoteTrafficSelector;
            return this;
        }

        /**
         * @param remoteTrafficSelector Remote traffic selectors to use when establishing the VPN tunnel with the peer VPN gateway. The value should be a CIDR formatted string, for example: 192.168.0.0/16. The ranges should be disjoint. Only IPv4 is supported.
         * 
         * @return builder
         * 
         */
        public Builder remoteTrafficSelector(List<String> remoteTrafficSelector) {
            return remoteTrafficSelector(Output.of(remoteTrafficSelector));
        }

        /**
         * @param remoteTrafficSelector Remote traffic selectors to use when establishing the VPN tunnel with the peer VPN gateway. The value should be a CIDR formatted string, for example: 192.168.0.0/16. The ranges should be disjoint. Only IPv4 is supported.
         * 
         * @return builder
         * 
         */
        public Builder remoteTrafficSelector(String... remoteTrafficSelector) {
            return remoteTrafficSelector(List.of(remoteTrafficSelector));
        }

        public Builder requestId(@Nullable Output<String> requestId) {
            $.requestId = requestId;
            return this;
        }

        public Builder requestId(String requestId) {
            return requestId(Output.of(requestId));
        }

        /**
         * @param router URL of the router resource to be used for dynamic routing.
         * 
         * @return builder
         * 
         */
        public Builder router(@Nullable Output<String> router) {
            $.router = router;
            return this;
        }

        /**
         * @param router URL of the router resource to be used for dynamic routing.
         * 
         * @return builder
         * 
         */
        public Builder router(String router) {
            return router(Output.of(router));
        }

        /**
         * @param sharedSecret Shared secret used to set the secure session between the Cloud VPN gateway and the peer VPN gateway.
         * 
         * @return builder
         * 
         */
        public Builder sharedSecret(@Nullable Output<String> sharedSecret) {
            $.sharedSecret = sharedSecret;
            return this;
        }

        /**
         * @param sharedSecret Shared secret used to set the secure session between the Cloud VPN gateway and the peer VPN gateway.
         * 
         * @return builder
         * 
         */
        public Builder sharedSecret(String sharedSecret) {
            return sharedSecret(Output.of(sharedSecret));
        }

        /**
         * @param sharedSecretHash Hash of the shared secret.
         * 
         * @return builder
         * 
         */
        public Builder sharedSecretHash(@Nullable Output<String> sharedSecretHash) {
            $.sharedSecretHash = sharedSecretHash;
            return this;
        }

        /**
         * @param sharedSecretHash Hash of the shared secret.
         * 
         * @return builder
         * 
         */
        public Builder sharedSecretHash(String sharedSecretHash) {
            return sharedSecretHash(Output.of(sharedSecretHash));
        }

        /**
         * @param targetVpnGateway URL of the Target VPN gateway with which this VPN tunnel is associated. Provided by the client when the VPN tunnel is created.
         * 
         * @return builder
         * 
         */
        public Builder targetVpnGateway(@Nullable Output<String> targetVpnGateway) {
            $.targetVpnGateway = targetVpnGateway;
            return this;
        }

        /**
         * @param targetVpnGateway URL of the Target VPN gateway with which this VPN tunnel is associated. Provided by the client when the VPN tunnel is created.
         * 
         * @return builder
         * 
         */
        public Builder targetVpnGateway(String targetVpnGateway) {
            return targetVpnGateway(Output.of(targetVpnGateway));
        }

        /**
         * @param vpnGateway URL of the VPN gateway with which this VPN tunnel is associated. Provided by the client when the VPN tunnel is created. This must be used (instead of target_vpn_gateway) if a High Availability VPN gateway resource is created.
         * 
         * @return builder
         * 
         */
        public Builder vpnGateway(@Nullable Output<String> vpnGateway) {
            $.vpnGateway = vpnGateway;
            return this;
        }

        /**
         * @param vpnGateway URL of the VPN gateway with which this VPN tunnel is associated. Provided by the client when the VPN tunnel is created. This must be used (instead of target_vpn_gateway) if a High Availability VPN gateway resource is created.
         * 
         * @return builder
         * 
         */
        public Builder vpnGateway(String vpnGateway) {
            return vpnGateway(Output.of(vpnGateway));
        }

        /**
         * @param vpnGatewayInterface The interface ID of the VPN gateway with which this VPN tunnel is associated.
         * 
         * @return builder
         * 
         */
        public Builder vpnGatewayInterface(@Nullable Output<Integer> vpnGatewayInterface) {
            $.vpnGatewayInterface = vpnGatewayInterface;
            return this;
        }

        /**
         * @param vpnGatewayInterface The interface ID of the VPN gateway with which this VPN tunnel is associated.
         * 
         * @return builder
         * 
         */
        public Builder vpnGatewayInterface(Integer vpnGatewayInterface) {
            return vpnGatewayInterface(Output.of(vpnGatewayInterface));
        }

        public VpnTunnelArgs build() {
            $.region = Objects.requireNonNull($.region, "expected parameter 'region' to be non-null");
            return $;
        }
    }

}
