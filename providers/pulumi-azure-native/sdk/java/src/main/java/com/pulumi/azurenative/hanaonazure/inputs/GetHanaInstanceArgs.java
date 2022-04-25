// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.hanaonazure.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetHanaInstanceArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetHanaInstanceArgs Empty = new GetHanaInstanceArgs();

    /**
     * Name of the SAP HANA on Azure instance.
     * 
     */
    @Import(name="hanaInstanceName", required=true)
    private String hanaInstanceName;

    /**
     * @return Name of the SAP HANA on Azure instance.
     * 
     */
    public String hanaInstanceName() {
        return this.hanaInstanceName;
    }

    /**
     * Name of the resource group.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private String resourceGroupName;

    /**
     * @return Name of the resource group.
     * 
     */
    public String resourceGroupName() {
        return this.resourceGroupName;
    }

    private GetHanaInstanceArgs() {}

    private GetHanaInstanceArgs(GetHanaInstanceArgs $) {
        this.hanaInstanceName = $.hanaInstanceName;
        this.resourceGroupName = $.resourceGroupName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetHanaInstanceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetHanaInstanceArgs $;

        public Builder() {
            $ = new GetHanaInstanceArgs();
        }

        public Builder(GetHanaInstanceArgs defaults) {
            $ = new GetHanaInstanceArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param hanaInstanceName Name of the SAP HANA on Azure instance.
         * 
         * @return builder
         * 
         */
        public Builder hanaInstanceName(String hanaInstanceName) {
            $.hanaInstanceName = hanaInstanceName;
            return this;
        }

        /**
         * @param resourceGroupName Name of the resource group.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        public GetHanaInstanceArgs build() {
            $.hanaInstanceName = Objects.requireNonNull($.hanaInstanceName, "expected parameter 'hanaInstanceName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
