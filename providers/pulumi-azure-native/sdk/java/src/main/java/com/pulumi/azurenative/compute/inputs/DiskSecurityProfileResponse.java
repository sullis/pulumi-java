// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.compute.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Contains the security related information for the resource.
 * 
 */
public final class DiskSecurityProfileResponse extends com.pulumi.resources.InvokeArgs {

    public static final DiskSecurityProfileResponse Empty = new DiskSecurityProfileResponse();

    /**
     * Specifies the SecurityType of the VM. Applicable for OS disks only.
     * 
     */
    @Import(name="securityType")
    private @Nullable String securityType;

    /**
     * @return Specifies the SecurityType of the VM. Applicable for OS disks only.
     * 
     */
    public Optional<String> securityType() {
        return Optional.ofNullable(this.securityType);
    }

    private DiskSecurityProfileResponse() {}

    private DiskSecurityProfileResponse(DiskSecurityProfileResponse $) {
        this.securityType = $.securityType;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DiskSecurityProfileResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DiskSecurityProfileResponse $;

        public Builder() {
            $ = new DiskSecurityProfileResponse();
        }

        public Builder(DiskSecurityProfileResponse defaults) {
            $ = new DiskSecurityProfileResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param securityType Specifies the SecurityType of the VM. Applicable for OS disks only.
         * 
         * @return builder
         * 
         */
        public Builder securityType(@Nullable String securityType) {
            $.securityType = securityType;
            return this;
        }

        public DiskSecurityProfileResponse build() {
            return $;
        }
    }

}
