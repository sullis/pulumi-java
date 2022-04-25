// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.ec2.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * The regions IPAM is enabled for. Allows pools to be created in these regions, as well as enabling monitoring
 * 
 */
public final class IPAMIpamOperatingRegion extends com.pulumi.resources.InvokeArgs {

    public static final IPAMIpamOperatingRegion Empty = new IPAMIpamOperatingRegion();

    /**
     * The name of the region.
     * 
     */
    @Import(name="regionName", required=true)
    private String regionName;

    /**
     * @return The name of the region.
     * 
     */
    public String regionName() {
        return this.regionName;
    }

    private IPAMIpamOperatingRegion() {}

    private IPAMIpamOperatingRegion(IPAMIpamOperatingRegion $) {
        this.regionName = $.regionName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(IPAMIpamOperatingRegion defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private IPAMIpamOperatingRegion $;

        public Builder() {
            $ = new IPAMIpamOperatingRegion();
        }

        public Builder(IPAMIpamOperatingRegion defaults) {
            $ = new IPAMIpamOperatingRegion(Objects.requireNonNull(defaults));
        }

        /**
         * @param regionName The name of the region.
         * 
         * @return builder
         * 
         */
        public Builder regionName(String regionName) {
            $.regionName = regionName;
            return this;
        }

        public IPAMIpamOperatingRegion build() {
            $.regionName = Objects.requireNonNull($.regionName, "expected parameter 'regionName' to be non-null");
            return $;
        }
    }

}
