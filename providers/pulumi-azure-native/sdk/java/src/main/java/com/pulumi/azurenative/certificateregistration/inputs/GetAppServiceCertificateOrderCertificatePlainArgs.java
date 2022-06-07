// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.certificateregistration.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetAppServiceCertificateOrderCertificatePlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetAppServiceCertificateOrderCertificatePlainArgs Empty = new GetAppServiceCertificateOrderCertificatePlainArgs();

    /**
     * Name of the certificate order.
     * 
     */
    @Import(name="certificateOrderName", required=true)
    private String certificateOrderName;

    /**
     * @return Name of the certificate order.
     * 
     */
    public String certificateOrderName() {
        return this.certificateOrderName;
    }

    /**
     * Name of the certificate.
     * 
     */
    @Import(name="name", required=true)
    private String name;

    /**
     * @return Name of the certificate.
     * 
     */
    public String name() {
        return this.name;
    }

    /**
     * Name of the resource group to which the resource belongs.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private String resourceGroupName;

    /**
     * @return Name of the resource group to which the resource belongs.
     * 
     */
    public String resourceGroupName() {
        return this.resourceGroupName;
    }

    private GetAppServiceCertificateOrderCertificatePlainArgs() {}

    private GetAppServiceCertificateOrderCertificatePlainArgs(GetAppServiceCertificateOrderCertificatePlainArgs $) {
        this.certificateOrderName = $.certificateOrderName;
        this.name = $.name;
        this.resourceGroupName = $.resourceGroupName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetAppServiceCertificateOrderCertificatePlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetAppServiceCertificateOrderCertificatePlainArgs $;

        public Builder() {
            $ = new GetAppServiceCertificateOrderCertificatePlainArgs();
        }

        public Builder(GetAppServiceCertificateOrderCertificatePlainArgs defaults) {
            $ = new GetAppServiceCertificateOrderCertificatePlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param certificateOrderName Name of the certificate order.
         * 
         * @return builder
         * 
         */
        public Builder certificateOrderName(String certificateOrderName) {
            $.certificateOrderName = certificateOrderName;
            return this;
        }

        /**
         * @param name Name of the certificate.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            $.name = name;
            return this;
        }

        /**
         * @param resourceGroupName Name of the resource group to which the resource belongs.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        public GetAppServiceCertificateOrderCertificatePlainArgs build() {
            $.certificateOrderName = Objects.requireNonNull($.certificateOrderName, "expected parameter 'certificateOrderName' to be non-null");
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
