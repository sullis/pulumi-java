// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.network.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetPublicIPsPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetPublicIPsPlainArgs Empty = new GetPublicIPsPlainArgs();

    /**
     * The Allocation Type for the Public IP Address. Possible values include `Static` or `Dynamic`.
     * 
     */
    @Import(name="allocationType")
    private @Nullable String allocationType;

    /**
     * @return The Allocation Type for the Public IP Address. Possible values include `Static` or `Dynamic`.
     * 
     */
    public Optional<String> allocationType() {
        return Optional.ofNullable(this.allocationType);
    }

    /**
     * Filter to include IP Addresses which are attached to a device, such as a VM/LB (`Attached`) or unattached (`Unattached`). To allow for both, use `All`.
     * 
     */
    @Import(name="attachmentStatus")
    private @Nullable String attachmentStatus;

    /**
     * @return Filter to include IP Addresses which are attached to a device, such as a VM/LB (`Attached`) or unattached (`Unattached`). To allow for both, use `All`.
     * 
     */
    public Optional<String> attachmentStatus() {
        return Optional.ofNullable(this.attachmentStatus);
    }

    /**
     * A prefix match used for the IP Addresses `name` field, case sensitive.
     * 
     */
    @Import(name="namePrefix")
    private @Nullable String namePrefix;

    /**
     * @return A prefix match used for the IP Addresses `name` field, case sensitive.
     * 
     */
    public Optional<String> namePrefix() {
        return Optional.ofNullable(this.namePrefix);
    }

    /**
     * Specifies the name of the resource group.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private String resourceGroupName;

    /**
     * @return Specifies the name of the resource group.
     * 
     */
    public String resourceGroupName() {
        return this.resourceGroupName;
    }

    private GetPublicIPsPlainArgs() {}

    private GetPublicIPsPlainArgs(GetPublicIPsPlainArgs $) {
        this.allocationType = $.allocationType;
        this.attachmentStatus = $.attachmentStatus;
        this.namePrefix = $.namePrefix;
        this.resourceGroupName = $.resourceGroupName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetPublicIPsPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetPublicIPsPlainArgs $;

        public Builder() {
            $ = new GetPublicIPsPlainArgs();
        }

        public Builder(GetPublicIPsPlainArgs defaults) {
            $ = new GetPublicIPsPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param allocationType The Allocation Type for the Public IP Address. Possible values include `Static` or `Dynamic`.
         * 
         * @return builder
         * 
         */
        public Builder allocationType(@Nullable String allocationType) {
            $.allocationType = allocationType;
            return this;
        }

        /**
         * @param attachmentStatus Filter to include IP Addresses which are attached to a device, such as a VM/LB (`Attached`) or unattached (`Unattached`). To allow for both, use `All`.
         * 
         * @return builder
         * 
         */
        public Builder attachmentStatus(@Nullable String attachmentStatus) {
            $.attachmentStatus = attachmentStatus;
            return this;
        }

        /**
         * @param namePrefix A prefix match used for the IP Addresses `name` field, case sensitive.
         * 
         * @return builder
         * 
         */
        public Builder namePrefix(@Nullable String namePrefix) {
            $.namePrefix = namePrefix;
            return this;
        }

        /**
         * @param resourceGroupName Specifies the name of the resource group.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        public GetPublicIPsPlainArgs build() {
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
