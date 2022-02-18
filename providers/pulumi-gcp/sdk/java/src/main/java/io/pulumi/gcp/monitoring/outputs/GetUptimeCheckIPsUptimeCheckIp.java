// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.monitoring.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class GetUptimeCheckIPsUptimeCheckIp {
    /**
     * The IP address from which the Uptime check originates. This is a fully specified IP address
     * (not an IP address range). Most IP addresses, as of this publication, are in IPv4 format; however, one should not
     * rely on the IP addresses being in IPv4 format indefinitely, and should support interpreting this field in either
     * IPv4 or IPv6 format.
     * 
     */
    private final String ipAddress;
    /**
     * A more specific location within the region that typically encodes a particular city/town/metro
     * (and its containing state/province or country) within the broader umbrella region category.
     * 
     */
    private final String location;
    /**
     * A broad region category in which the IP address is located.
     * 
     */
    private final String region;

    @OutputCustomType.Constructor({"ipAddress","location","region"})
    private GetUptimeCheckIPsUptimeCheckIp(
        String ipAddress,
        String location,
        String region) {
        this.ipAddress = Objects.requireNonNull(ipAddress);
        this.location = Objects.requireNonNull(location);
        this.region = Objects.requireNonNull(region);
    }

    /**
     * The IP address from which the Uptime check originates. This is a fully specified IP address
     * (not an IP address range). Most IP addresses, as of this publication, are in IPv4 format; however, one should not
     * rely on the IP addresses being in IPv4 format indefinitely, and should support interpreting this field in either
     * IPv4 or IPv6 format.
     * 
     */
    public String getIpAddress() {
        return this.ipAddress;
    }
    /**
     * A more specific location within the region that typically encodes a particular city/town/metro
     * (and its containing state/province or country) within the broader umbrella region category.
     * 
     */
    public String getLocation() {
        return this.location;
    }
    /**
     * A broad region category in which the IP address is located.
     * 
     */
    public String getRegion() {
        return this.region;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetUptimeCheckIPsUptimeCheckIp defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String ipAddress;
        private String location;
        private String region;

        public Builder() {
    	      // Empty
        }

        public Builder(GetUptimeCheckIPsUptimeCheckIp defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ipAddress = defaults.ipAddress;
    	      this.location = defaults.location;
    	      this.region = defaults.region;
        }

        public Builder setIpAddress(String ipAddress) {
            this.ipAddress = Objects.requireNonNull(ipAddress);
            return this;
        }

        public Builder setLocation(String location) {
            this.location = Objects.requireNonNull(location);
            return this;
        }

        public Builder setRegion(String region) {
            this.region = Objects.requireNonNull(region);
            return this;
        }

        public GetUptimeCheckIPsUptimeCheckIp build() {
            return new GetUptimeCheckIPsUptimeCheckIp(ipAddress, location, region);
        }
    }
}
