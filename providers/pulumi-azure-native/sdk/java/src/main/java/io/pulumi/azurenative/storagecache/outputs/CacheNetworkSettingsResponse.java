// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.storagecache.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class CacheNetworkSettingsResponse {
    /**
     * DNS search domain
     * 
     */
    private final @Nullable String dnsSearchDomain;
    /**
     * DNS servers for the cache to use.  It will be set from the network configuration if no value is provided.
     * 
     */
    private final @Nullable List<String> dnsServers;
    /**
     * The IPv4 maximum transmission unit configured for the subnet.
     * 
     */
    private final @Nullable Integer mtu;
    /**
     * NTP server IP Address or FQDN for the cache to use. The default is time.windows.com.
     * 
     */
    private final @Nullable String ntpServer;
    /**
     * Array of additional IP addresses used by this Cache.
     * 
     */
    private final List<String> utilityAddresses;

    @CustomType.Constructor
    private CacheNetworkSettingsResponse(
        @CustomType.Parameter("dnsSearchDomain") @Nullable String dnsSearchDomain,
        @CustomType.Parameter("dnsServers") @Nullable List<String> dnsServers,
        @CustomType.Parameter("mtu") @Nullable Integer mtu,
        @CustomType.Parameter("ntpServer") @Nullable String ntpServer,
        @CustomType.Parameter("utilityAddresses") List<String> utilityAddresses) {
        this.dnsSearchDomain = dnsSearchDomain;
        this.dnsServers = dnsServers;
        this.mtu = mtu;
        this.ntpServer = ntpServer;
        this.utilityAddresses = utilityAddresses;
    }

    /**
     * DNS search domain
     * 
    */
    public Optional<String> getDnsSearchDomain() {
        return Optional.ofNullable(this.dnsSearchDomain);
    }
    /**
     * DNS servers for the cache to use.  It will be set from the network configuration if no value is provided.
     * 
    */
    public List<String> getDnsServers() {
        return this.dnsServers == null ? List.of() : this.dnsServers;
    }
    /**
     * The IPv4 maximum transmission unit configured for the subnet.
     * 
    */
    public Optional<Integer> getMtu() {
        return Optional.ofNullable(this.mtu);
    }
    /**
     * NTP server IP Address or FQDN for the cache to use. The default is time.windows.com.
     * 
    */
    public Optional<String> getNtpServer() {
        return Optional.ofNullable(this.ntpServer);
    }
    /**
     * Array of additional IP addresses used by this Cache.
     * 
    */
    public List<String> getUtilityAddresses() {
        return this.utilityAddresses;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CacheNetworkSettingsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String dnsSearchDomain;
        private @Nullable List<String> dnsServers;
        private @Nullable Integer mtu;
        private @Nullable String ntpServer;
        private List<String> utilityAddresses;

        public Builder() {
    	      // Empty
        }

        public Builder(CacheNetworkSettingsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dnsSearchDomain = defaults.dnsSearchDomain;
    	      this.dnsServers = defaults.dnsServers;
    	      this.mtu = defaults.mtu;
    	      this.ntpServer = defaults.ntpServer;
    	      this.utilityAddresses = defaults.utilityAddresses;
        }

        public Builder dnsSearchDomain(@Nullable String dnsSearchDomain) {
            this.dnsSearchDomain = dnsSearchDomain;
            return this;
        }
        public Builder dnsServers(@Nullable List<String> dnsServers) {
            this.dnsServers = dnsServers;
            return this;
        }
        public Builder dnsServers(String... dnsServers) {
            return dnsServers(List.of(dnsServers));
        }
        public Builder mtu(@Nullable Integer mtu) {
            this.mtu = mtu;
            return this;
        }
        public Builder ntpServer(@Nullable String ntpServer) {
            this.ntpServer = ntpServer;
            return this;
        }
        public Builder utilityAddresses(List<String> utilityAddresses) {
            this.utilityAddresses = Objects.requireNonNull(utilityAddresses);
            return this;
        }
        public Builder utilityAddresses(String... utilityAddresses) {
            return utilityAddresses(List.of(utilityAddresses));
        }        public CacheNetworkSettingsResponse build() {
            return new CacheNetworkSettingsResponse(dnsSearchDomain, dnsServers, mtu, ntpServer, utilityAddresses);
        }
    }
}
