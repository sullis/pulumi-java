// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.appplatform.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetStoragePlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetStoragePlainArgs Empty = new GetStoragePlainArgs();

    /**
     * The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private String resourceGroupName;

    /**
     * @return The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * 
     */
    public String resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The name of the Service resource.
     * 
     */
    @Import(name="serviceName", required=true)
    private String serviceName;

    /**
     * @return The name of the Service resource.
     * 
     */
    public String serviceName() {
        return this.serviceName;
    }

    /**
     * The name of the storage resource.
     * 
     */
    @Import(name="storageName", required=true)
    private String storageName;

    /**
     * @return The name of the storage resource.
     * 
     */
    public String storageName() {
        return this.storageName;
    }

    private GetStoragePlainArgs() {}

    private GetStoragePlainArgs(GetStoragePlainArgs $) {
        this.resourceGroupName = $.resourceGroupName;
        this.serviceName = $.serviceName;
        this.storageName = $.storageName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetStoragePlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetStoragePlainArgs $;

        public Builder() {
            $ = new GetStoragePlainArgs();
        }

        public Builder(GetStoragePlainArgs defaults) {
            $ = new GetStoragePlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param serviceName The name of the Service resource.
         * 
         * @return builder
         * 
         */
        public Builder serviceName(String serviceName) {
            $.serviceName = serviceName;
            return this;
        }

        /**
         * @param storageName The name of the storage resource.
         * 
         * @return builder
         * 
         */
        public Builder storageName(String storageName) {
            $.storageName = storageName;
            return this;
        }

        public GetStoragePlainArgs build() {
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.serviceName = Objects.requireNonNull($.serviceName, "expected parameter 'serviceName' to be non-null");
            $.storageName = Objects.requireNonNull($.storageName, "expected parameter 'storageName' to be non-null");
            return $;
        }
    }

}
