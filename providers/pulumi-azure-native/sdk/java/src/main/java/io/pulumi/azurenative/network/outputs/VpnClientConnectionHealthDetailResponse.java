// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class VpnClientConnectionHealthDetailResponse {
    /**
     * The egress bytes per second.
     * 
     */
    private final Double egressBytesTransferred;
    /**
     * The egress packets per second.
     * 
     */
    private final Double egressPacketsTransferred;
    /**
     * The ingress bytes per second.
     * 
     */
    private final Double ingressBytesTransferred;
    /**
     * The ingress packets per second.
     * 
     */
    private final Double ingressPacketsTransferred;
    /**
     * The max band width.
     * 
     */
    private final Double maxBandwidth;
    /**
     * The max packets transferred per second.
     * 
     */
    private final Double maxPacketsPerSecond;
    /**
     * The assigned private Ip of a connected vpn client.
     * 
     */
    private final String privateIpAddress;
    /**
     * The public Ip of a connected vpn client.
     * 
     */
    private final String publicIpAddress;
    /**
     * The duration time of a connected vpn client.
     * 
     */
    private final Double vpnConnectionDuration;
    /**
     * The vpn client Id.
     * 
     */
    private final String vpnConnectionId;
    /**
     * The start time of a connected vpn client.
     * 
     */
    private final String vpnConnectionTime;
    /**
     * The user name of a connected vpn client.
     * 
     */
    private final String vpnUserName;

    @OutputCustomType.Constructor({"egressBytesTransferred","egressPacketsTransferred","ingressBytesTransferred","ingressPacketsTransferred","maxBandwidth","maxPacketsPerSecond","privateIpAddress","publicIpAddress","vpnConnectionDuration","vpnConnectionId","vpnConnectionTime","vpnUserName"})
    private VpnClientConnectionHealthDetailResponse(
        Double egressBytesTransferred,
        Double egressPacketsTransferred,
        Double ingressBytesTransferred,
        Double ingressPacketsTransferred,
        Double maxBandwidth,
        Double maxPacketsPerSecond,
        String privateIpAddress,
        String publicIpAddress,
        Double vpnConnectionDuration,
        String vpnConnectionId,
        String vpnConnectionTime,
        String vpnUserName) {
        this.egressBytesTransferred = Objects.requireNonNull(egressBytesTransferred);
        this.egressPacketsTransferred = Objects.requireNonNull(egressPacketsTransferred);
        this.ingressBytesTransferred = Objects.requireNonNull(ingressBytesTransferred);
        this.ingressPacketsTransferred = Objects.requireNonNull(ingressPacketsTransferred);
        this.maxBandwidth = Objects.requireNonNull(maxBandwidth);
        this.maxPacketsPerSecond = Objects.requireNonNull(maxPacketsPerSecond);
        this.privateIpAddress = Objects.requireNonNull(privateIpAddress);
        this.publicIpAddress = Objects.requireNonNull(publicIpAddress);
        this.vpnConnectionDuration = Objects.requireNonNull(vpnConnectionDuration);
        this.vpnConnectionId = Objects.requireNonNull(vpnConnectionId);
        this.vpnConnectionTime = Objects.requireNonNull(vpnConnectionTime);
        this.vpnUserName = Objects.requireNonNull(vpnUserName);
    }

    /**
     * The egress bytes per second.
     * 
     */
    public Double getEgressBytesTransferred() {
        return this.egressBytesTransferred;
    }
    /**
     * The egress packets per second.
     * 
     */
    public Double getEgressPacketsTransferred() {
        return this.egressPacketsTransferred;
    }
    /**
     * The ingress bytes per second.
     * 
     */
    public Double getIngressBytesTransferred() {
        return this.ingressBytesTransferred;
    }
    /**
     * The ingress packets per second.
     * 
     */
    public Double getIngressPacketsTransferred() {
        return this.ingressPacketsTransferred;
    }
    /**
     * The max band width.
     * 
     */
    public Double getMaxBandwidth() {
        return this.maxBandwidth;
    }
    /**
     * The max packets transferred per second.
     * 
     */
    public Double getMaxPacketsPerSecond() {
        return this.maxPacketsPerSecond;
    }
    /**
     * The assigned private Ip of a connected vpn client.
     * 
     */
    public String getPrivateIpAddress() {
        return this.privateIpAddress;
    }
    /**
     * The public Ip of a connected vpn client.
     * 
     */
    public String getPublicIpAddress() {
        return this.publicIpAddress;
    }
    /**
     * The duration time of a connected vpn client.
     * 
     */
    public Double getVpnConnectionDuration() {
        return this.vpnConnectionDuration;
    }
    /**
     * The vpn client Id.
     * 
     */
    public String getVpnConnectionId() {
        return this.vpnConnectionId;
    }
    /**
     * The start time of a connected vpn client.
     * 
     */
    public String getVpnConnectionTime() {
        return this.vpnConnectionTime;
    }
    /**
     * The user name of a connected vpn client.
     * 
     */
    public String getVpnUserName() {
        return this.vpnUserName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VpnClientConnectionHealthDetailResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Double egressBytesTransferred;
        private Double egressPacketsTransferred;
        private Double ingressBytesTransferred;
        private Double ingressPacketsTransferred;
        private Double maxBandwidth;
        private Double maxPacketsPerSecond;
        private String privateIpAddress;
        private String publicIpAddress;
        private Double vpnConnectionDuration;
        private String vpnConnectionId;
        private String vpnConnectionTime;
        private String vpnUserName;

        public Builder() {
    	      // Empty
        }

        public Builder(VpnClientConnectionHealthDetailResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.egressBytesTransferred = defaults.egressBytesTransferred;
    	      this.egressPacketsTransferred = defaults.egressPacketsTransferred;
    	      this.ingressBytesTransferred = defaults.ingressBytesTransferred;
    	      this.ingressPacketsTransferred = defaults.ingressPacketsTransferred;
    	      this.maxBandwidth = defaults.maxBandwidth;
    	      this.maxPacketsPerSecond = defaults.maxPacketsPerSecond;
    	      this.privateIpAddress = defaults.privateIpAddress;
    	      this.publicIpAddress = defaults.publicIpAddress;
    	      this.vpnConnectionDuration = defaults.vpnConnectionDuration;
    	      this.vpnConnectionId = defaults.vpnConnectionId;
    	      this.vpnConnectionTime = defaults.vpnConnectionTime;
    	      this.vpnUserName = defaults.vpnUserName;
        }

        public Builder setEgressBytesTransferred(Double egressBytesTransferred) {
            this.egressBytesTransferred = Objects.requireNonNull(egressBytesTransferred);
            return this;
        }

        public Builder setEgressPacketsTransferred(Double egressPacketsTransferred) {
            this.egressPacketsTransferred = Objects.requireNonNull(egressPacketsTransferred);
            return this;
        }

        public Builder setIngressBytesTransferred(Double ingressBytesTransferred) {
            this.ingressBytesTransferred = Objects.requireNonNull(ingressBytesTransferred);
            return this;
        }

        public Builder setIngressPacketsTransferred(Double ingressPacketsTransferred) {
            this.ingressPacketsTransferred = Objects.requireNonNull(ingressPacketsTransferred);
            return this;
        }

        public Builder setMaxBandwidth(Double maxBandwidth) {
            this.maxBandwidth = Objects.requireNonNull(maxBandwidth);
            return this;
        }

        public Builder setMaxPacketsPerSecond(Double maxPacketsPerSecond) {
            this.maxPacketsPerSecond = Objects.requireNonNull(maxPacketsPerSecond);
            return this;
        }

        public Builder setPrivateIpAddress(String privateIpAddress) {
            this.privateIpAddress = Objects.requireNonNull(privateIpAddress);
            return this;
        }

        public Builder setPublicIpAddress(String publicIpAddress) {
            this.publicIpAddress = Objects.requireNonNull(publicIpAddress);
            return this;
        }

        public Builder setVpnConnectionDuration(Double vpnConnectionDuration) {
            this.vpnConnectionDuration = Objects.requireNonNull(vpnConnectionDuration);
            return this;
        }

        public Builder setVpnConnectionId(String vpnConnectionId) {
            this.vpnConnectionId = Objects.requireNonNull(vpnConnectionId);
            return this;
        }

        public Builder setVpnConnectionTime(String vpnConnectionTime) {
            this.vpnConnectionTime = Objects.requireNonNull(vpnConnectionTime);
            return this;
        }

        public Builder setVpnUserName(String vpnUserName) {
            this.vpnUserName = Objects.requireNonNull(vpnUserName);
            return this;
        }

        public VpnClientConnectionHealthDetailResponse build() {
            return new VpnClientConnectionHealthDetailResponse(egressBytesTransferred, egressPacketsTransferred, ingressBytesTransferred, ingressPacketsTransferred, maxBandwidth, maxPacketsPerSecond, privateIpAddress, publicIpAddress, vpnConnectionDuration, vpnConnectionId, vpnConnectionTime, vpnUserName);
        }
    }
}
