// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.datashare.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetSynchronizationSettingPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetSynchronizationSettingPlainArgs Empty = new GetSynchronizationSettingPlainArgs();

    /**
     * The name of the share account.
     * 
     */
    @Import(name="accountName", required=true)
    private String accountName;

    /**
     * @return The name of the share account.
     * 
     */
    public String accountName() {
        return this.accountName;
    }

    /**
     * The resource group name.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private String resourceGroupName;

    /**
     * @return The resource group name.
     * 
     */
    public String resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The name of the share.
     * 
     */
    @Import(name="shareName", required=true)
    private String shareName;

    /**
     * @return The name of the share.
     * 
     */
    public String shareName() {
        return this.shareName;
    }

    /**
     * The name of the synchronizationSetting.
     * 
     */
    @Import(name="synchronizationSettingName", required=true)
    private String synchronizationSettingName;

    /**
     * @return The name of the synchronizationSetting.
     * 
     */
    public String synchronizationSettingName() {
        return this.synchronizationSettingName;
    }

    private GetSynchronizationSettingPlainArgs() {}

    private GetSynchronizationSettingPlainArgs(GetSynchronizationSettingPlainArgs $) {
        this.accountName = $.accountName;
        this.resourceGroupName = $.resourceGroupName;
        this.shareName = $.shareName;
        this.synchronizationSettingName = $.synchronizationSettingName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetSynchronizationSettingPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetSynchronizationSettingPlainArgs $;

        public Builder() {
            $ = new GetSynchronizationSettingPlainArgs();
        }

        public Builder(GetSynchronizationSettingPlainArgs defaults) {
            $ = new GetSynchronizationSettingPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param accountName The name of the share account.
         * 
         * @return builder
         * 
         */
        public Builder accountName(String accountName) {
            $.accountName = accountName;
            return this;
        }

        /**
         * @param resourceGroupName The resource group name.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param shareName The name of the share.
         * 
         * @return builder
         * 
         */
        public Builder shareName(String shareName) {
            $.shareName = shareName;
            return this;
        }

        /**
         * @param synchronizationSettingName The name of the synchronizationSetting.
         * 
         * @return builder
         * 
         */
        public Builder synchronizationSettingName(String synchronizationSettingName) {
            $.synchronizationSettingName = synchronizationSettingName;
            return this;
        }

        public GetSynchronizationSettingPlainArgs build() {
            $.accountName = Objects.requireNonNull($.accountName, "expected parameter 'accountName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.shareName = Objects.requireNonNull($.shareName, "expected parameter 'shareName' to be non-null");
            $.synchronizationSettingName = Objects.requireNonNull($.synchronizationSettingName, "expected parameter 'synchronizationSettingName' to be non-null");
            return $;
        }
    }

}
