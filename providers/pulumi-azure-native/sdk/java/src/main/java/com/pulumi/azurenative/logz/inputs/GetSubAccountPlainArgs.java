// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.logz.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetSubAccountPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetSubAccountPlainArgs Empty = new GetSubAccountPlainArgs();

    /**
     * Monitor resource name
     * 
     */
    @Import(name="monitorName", required=true)
    private String monitorName;

    /**
     * @return Monitor resource name
     * 
     */
    public String monitorName() {
        return this.monitorName;
    }

    /**
     * The name of the resource group. The name is case insensitive.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private String resourceGroupName;

    /**
     * @return The name of the resource group. The name is case insensitive.
     * 
     */
    public String resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * Sub Account resource name
     * 
     */
    @Import(name="subAccountName", required=true)
    private String subAccountName;

    /**
     * @return Sub Account resource name
     * 
     */
    public String subAccountName() {
        return this.subAccountName;
    }

    private GetSubAccountPlainArgs() {}

    private GetSubAccountPlainArgs(GetSubAccountPlainArgs $) {
        this.monitorName = $.monitorName;
        this.resourceGroupName = $.resourceGroupName;
        this.subAccountName = $.subAccountName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetSubAccountPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetSubAccountPlainArgs $;

        public Builder() {
            $ = new GetSubAccountPlainArgs();
        }

        public Builder(GetSubAccountPlainArgs defaults) {
            $ = new GetSubAccountPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param monitorName Monitor resource name
         * 
         * @return builder
         * 
         */
        public Builder monitorName(String monitorName) {
            $.monitorName = monitorName;
            return this;
        }

        /**
         * @param resourceGroupName The name of the resource group. The name is case insensitive.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param subAccountName Sub Account resource name
         * 
         * @return builder
         * 
         */
        public Builder subAccountName(String subAccountName) {
            $.subAccountName = subAccountName;
            return this;
        }

        public GetSubAccountPlainArgs build() {
            $.monitorName = Objects.requireNonNull($.monitorName, "expected parameter 'monitorName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.subAccountName = Objects.requireNonNull($.subAccountName, "expected parameter 'subAccountName' to be non-null");
            return $;
        }
    }

}
