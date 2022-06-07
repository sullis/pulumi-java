// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.storsimple.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetBandwidthSettingPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetBandwidthSettingPlainArgs Empty = new GetBandwidthSettingPlainArgs();

    /**
     * The name of bandwidth setting to be fetched.
     * 
     */
    @Import(name="bandwidthSettingName", required=true)
    private String bandwidthSettingName;

    /**
     * @return The name of bandwidth setting to be fetched.
     * 
     */
    public String bandwidthSettingName() {
        return this.bandwidthSettingName;
    }

    /**
     * The manager name
     * 
     */
    @Import(name="managerName", required=true)
    private String managerName;

    /**
     * @return The manager name
     * 
     */
    public String managerName() {
        return this.managerName;
    }

    /**
     * The resource group name
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private String resourceGroupName;

    /**
     * @return The resource group name
     * 
     */
    public String resourceGroupName() {
        return this.resourceGroupName;
    }

    private GetBandwidthSettingPlainArgs() {}

    private GetBandwidthSettingPlainArgs(GetBandwidthSettingPlainArgs $) {
        this.bandwidthSettingName = $.bandwidthSettingName;
        this.managerName = $.managerName;
        this.resourceGroupName = $.resourceGroupName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetBandwidthSettingPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetBandwidthSettingPlainArgs $;

        public Builder() {
            $ = new GetBandwidthSettingPlainArgs();
        }

        public Builder(GetBandwidthSettingPlainArgs defaults) {
            $ = new GetBandwidthSettingPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param bandwidthSettingName The name of bandwidth setting to be fetched.
         * 
         * @return builder
         * 
         */
        public Builder bandwidthSettingName(String bandwidthSettingName) {
            $.bandwidthSettingName = bandwidthSettingName;
            return this;
        }

        /**
         * @param managerName The manager name
         * 
         * @return builder
         * 
         */
        public Builder managerName(String managerName) {
            $.managerName = managerName;
            return this;
        }

        /**
         * @param resourceGroupName The resource group name
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        public GetBandwidthSettingPlainArgs build() {
            $.bandwidthSettingName = Objects.requireNonNull($.bandwidthSettingName, "expected parameter 'bandwidthSettingName' to be non-null");
            $.managerName = Objects.requireNonNull($.managerName, "expected parameter 'managerName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
