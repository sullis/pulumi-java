// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.avs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class HcxEnterpriseSiteArgs extends com.pulumi.resources.ResourceArgs {

    public static final HcxEnterpriseSiteArgs Empty = new HcxEnterpriseSiteArgs();

    /**
     * Name of the HCX Enterprise Site in the private cloud
     * 
     */
    @Import(name="hcxEnterpriseSiteName")
    private @Nullable Output<String> hcxEnterpriseSiteName;

    /**
     * @return Name of the HCX Enterprise Site in the private cloud
     * 
     */
    public Optional<Output<String>> hcxEnterpriseSiteName() {
        return Optional.ofNullable(this.hcxEnterpriseSiteName);
    }

    /**
     * The name of the private cloud.
     * 
     */
    @Import(name="privateCloudName", required=true)
    private Output<String> privateCloudName;

    /**
     * @return The name of the private cloud.
     * 
     */
    public Output<String> privateCloudName() {
        return this.privateCloudName;
    }

    /**
     * The name of the resource group. The name is case insensitive.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    /**
     * @return The name of the resource group. The name is case insensitive.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    private HcxEnterpriseSiteArgs() {}

    private HcxEnterpriseSiteArgs(HcxEnterpriseSiteArgs $) {
        this.hcxEnterpriseSiteName = $.hcxEnterpriseSiteName;
        this.privateCloudName = $.privateCloudName;
        this.resourceGroupName = $.resourceGroupName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(HcxEnterpriseSiteArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private HcxEnterpriseSiteArgs $;

        public Builder() {
            $ = new HcxEnterpriseSiteArgs();
        }

        public Builder(HcxEnterpriseSiteArgs defaults) {
            $ = new HcxEnterpriseSiteArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param hcxEnterpriseSiteName Name of the HCX Enterprise Site in the private cloud
         * 
         * @return builder
         * 
         */
        public Builder hcxEnterpriseSiteName(@Nullable Output<String> hcxEnterpriseSiteName) {
            $.hcxEnterpriseSiteName = hcxEnterpriseSiteName;
            return this;
        }

        /**
         * @param hcxEnterpriseSiteName Name of the HCX Enterprise Site in the private cloud
         * 
         * @return builder
         * 
         */
        public Builder hcxEnterpriseSiteName(String hcxEnterpriseSiteName) {
            return hcxEnterpriseSiteName(Output.of(hcxEnterpriseSiteName));
        }

        /**
         * @param privateCloudName The name of the private cloud.
         * 
         * @return builder
         * 
         */
        public Builder privateCloudName(Output<String> privateCloudName) {
            $.privateCloudName = privateCloudName;
            return this;
        }

        /**
         * @param privateCloudName The name of the private cloud.
         * 
         * @return builder
         * 
         */
        public Builder privateCloudName(String privateCloudName) {
            return privateCloudName(Output.of(privateCloudName));
        }

        /**
         * @param resourceGroupName The name of the resource group. The name is case insensitive.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName The name of the resource group. The name is case insensitive.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        public HcxEnterpriseSiteArgs build() {
            $.privateCloudName = Objects.requireNonNull($.privateCloudName, "expected parameter 'privateCloudName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
