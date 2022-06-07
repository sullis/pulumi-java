// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.appservice.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetCertificateOrderArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetCertificateOrderArgs Empty = new GetCertificateOrderArgs();

    /**
     * The name of the App Service.
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return The name of the App Service.
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    /**
     * The Name of the Resource Group where the App Service exists.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    /**
     * @return The Name of the Resource Group where the App Service exists.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    private GetCertificateOrderArgs() {}

    private GetCertificateOrderArgs(GetCertificateOrderArgs $) {
        this.name = $.name;
        this.resourceGroupName = $.resourceGroupName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetCertificateOrderArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetCertificateOrderArgs $;

        public Builder() {
            $ = new GetCertificateOrderArgs();
        }

        public Builder(GetCertificateOrderArgs defaults) {
            $ = new GetCertificateOrderArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param name The name of the App Service.
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the App Service.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param resourceGroupName The Name of the Resource Group where the App Service exists.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName The Name of the Resource Group where the App Service exists.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        public GetCertificateOrderArgs build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
