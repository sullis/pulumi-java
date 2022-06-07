// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.signalrservice.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetSignalRCustomCertificateArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetSignalRCustomCertificateArgs Empty = new GetSignalRCustomCertificateArgs();

    /**
     * Custom certificate name
     * 
     */
    @Import(name="certificateName", required=true)
    private Output<String> certificateName;

    /**
     * @return Custom certificate name
     * 
     */
    public Output<String> certificateName() {
        return this.certificateName;
    }

    /**
     * The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    /**
     * @return The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The name of the resource.
     * 
     */
    @Import(name="resourceName", required=true)
    private Output<String> resourceName;

    /**
     * @return The name of the resource.
     * 
     */
    public Output<String> resourceName() {
        return this.resourceName;
    }

    private GetSignalRCustomCertificateArgs() {}

    private GetSignalRCustomCertificateArgs(GetSignalRCustomCertificateArgs $) {
        this.certificateName = $.certificateName;
        this.resourceGroupName = $.resourceGroupName;
        this.resourceName = $.resourceName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetSignalRCustomCertificateArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetSignalRCustomCertificateArgs $;

        public Builder() {
            $ = new GetSignalRCustomCertificateArgs();
        }

        public Builder(GetSignalRCustomCertificateArgs defaults) {
            $ = new GetSignalRCustomCertificateArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param certificateName Custom certificate name
         * 
         * @return builder
         * 
         */
        public Builder certificateName(Output<String> certificateName) {
            $.certificateName = certificateName;
            return this;
        }

        /**
         * @param certificateName Custom certificate name
         * 
         * @return builder
         * 
         */
        public Builder certificateName(String certificateName) {
            return certificateName(Output.of(certificateName));
        }

        /**
         * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        /**
         * @param resourceName The name of the resource.
         * 
         * @return builder
         * 
         */
        public Builder resourceName(Output<String> resourceName) {
            $.resourceName = resourceName;
            return this;
        }

        /**
         * @param resourceName The name of the resource.
         * 
         * @return builder
         * 
         */
        public Builder resourceName(String resourceName) {
            return resourceName(Output.of(resourceName));
        }

        public GetSignalRCustomCertificateArgs build() {
            $.certificateName = Objects.requireNonNull($.certificateName, "expected parameter 'certificateName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.resourceName = Objects.requireNonNull($.resourceName, "expected parameter 'resourceName' to be non-null");
            return $;
        }
    }

}
