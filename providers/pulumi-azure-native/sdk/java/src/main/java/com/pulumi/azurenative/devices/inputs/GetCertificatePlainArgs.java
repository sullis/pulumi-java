// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.devices.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetCertificatePlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetCertificatePlainArgs Empty = new GetCertificatePlainArgs();

    /**
     * The name of the certificate
     * 
     */
    @Import(name="certificateName", required=true)
    private String certificateName;

    /**
     * @return The name of the certificate
     * 
     */
    public String certificateName() {
        return this.certificateName;
    }

    /**
     * The name of the resource group that contains the IoT hub.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private String resourceGroupName;

    /**
     * @return The name of the resource group that contains the IoT hub.
     * 
     */
    public String resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The name of the IoT hub.
     * 
     */
    @Import(name="resourceName", required=true)
    private String resourceName;

    /**
     * @return The name of the IoT hub.
     * 
     */
    public String resourceName() {
        return this.resourceName;
    }

    private GetCertificatePlainArgs() {}

    private GetCertificatePlainArgs(GetCertificatePlainArgs $) {
        this.certificateName = $.certificateName;
        this.resourceGroupName = $.resourceGroupName;
        this.resourceName = $.resourceName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetCertificatePlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetCertificatePlainArgs $;

        public Builder() {
            $ = new GetCertificatePlainArgs();
        }

        public Builder(GetCertificatePlainArgs defaults) {
            $ = new GetCertificatePlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param certificateName The name of the certificate
         * 
         * @return builder
         * 
         */
        public Builder certificateName(String certificateName) {
            $.certificateName = certificateName;
            return this;
        }

        /**
         * @param resourceGroupName The name of the resource group that contains the IoT hub.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceName The name of the IoT hub.
         * 
         * @return builder
         * 
         */
        public Builder resourceName(String resourceName) {
            $.resourceName = resourceName;
            return this;
        }

        public GetCertificatePlainArgs build() {
            $.certificateName = Objects.requireNonNull($.certificateName, "expected parameter 'certificateName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.resourceName = Objects.requireNonNull($.resourceName, "expected parameter 'resourceName' to be non-null");
            return $;
        }
    }

}
