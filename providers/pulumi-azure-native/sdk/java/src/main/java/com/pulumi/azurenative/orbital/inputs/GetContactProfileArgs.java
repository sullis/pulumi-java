// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.orbital.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetContactProfileArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetContactProfileArgs Empty = new GetContactProfileArgs();

    /**
     * Contact Profile Name
     * 
     */
    @Import(name="contactProfileName", required=true)
    private Output<String> contactProfileName;

    /**
     * @return Contact Profile Name
     * 
     */
    public Output<String> contactProfileName() {
        return this.contactProfileName;
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

    private GetContactProfileArgs() {}

    private GetContactProfileArgs(GetContactProfileArgs $) {
        this.contactProfileName = $.contactProfileName;
        this.resourceGroupName = $.resourceGroupName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetContactProfileArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetContactProfileArgs $;

        public Builder() {
            $ = new GetContactProfileArgs();
        }

        public Builder(GetContactProfileArgs defaults) {
            $ = new GetContactProfileArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param contactProfileName Contact Profile Name
         * 
         * @return builder
         * 
         */
        public Builder contactProfileName(Output<String> contactProfileName) {
            $.contactProfileName = contactProfileName;
            return this;
        }

        /**
         * @param contactProfileName Contact Profile Name
         * 
         * @return builder
         * 
         */
        public Builder contactProfileName(String contactProfileName) {
            return contactProfileName(Output.of(contactProfileName));
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

        public GetContactProfileArgs build() {
            $.contactProfileName = Objects.requireNonNull($.contactProfileName, "expected parameter 'contactProfileName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
