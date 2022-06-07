// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.securityandcompliance.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetprivateLinkServicesForM365SecurityCenterArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetprivateLinkServicesForM365SecurityCenterArgs Empty = new GetprivateLinkServicesForM365SecurityCenterArgs();

    /**
     * The name of the resource group that contains the service instance.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    /**
     * @return The name of the resource group that contains the service instance.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The name of the service instance.
     * 
     */
    @Import(name="resourceName", required=true)
    private Output<String> resourceName;

    /**
     * @return The name of the service instance.
     * 
     */
    public Output<String> resourceName() {
        return this.resourceName;
    }

    private GetprivateLinkServicesForM365SecurityCenterArgs() {}

    private GetprivateLinkServicesForM365SecurityCenterArgs(GetprivateLinkServicesForM365SecurityCenterArgs $) {
        this.resourceGroupName = $.resourceGroupName;
        this.resourceName = $.resourceName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetprivateLinkServicesForM365SecurityCenterArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetprivateLinkServicesForM365SecurityCenterArgs $;

        public Builder() {
            $ = new GetprivateLinkServicesForM365SecurityCenterArgs();
        }

        public Builder(GetprivateLinkServicesForM365SecurityCenterArgs defaults) {
            $ = new GetprivateLinkServicesForM365SecurityCenterArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param resourceGroupName The name of the resource group that contains the service instance.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName The name of the resource group that contains the service instance.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        /**
         * @param resourceName The name of the service instance.
         * 
         * @return builder
         * 
         */
        public Builder resourceName(Output<String> resourceName) {
            $.resourceName = resourceName;
            return this;
        }

        /**
         * @param resourceName The name of the service instance.
         * 
         * @return builder
         * 
         */
        public Builder resourceName(String resourceName) {
            return resourceName(Output.of(resourceName));
        }

        public GetprivateLinkServicesForM365SecurityCenterArgs build() {
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.resourceName = Objects.requireNonNull($.resourceName, "expected parameter 'resourceName' to be non-null");
            return $;
        }
    }

}
