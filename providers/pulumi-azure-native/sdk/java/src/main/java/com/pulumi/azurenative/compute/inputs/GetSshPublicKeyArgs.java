// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.compute.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetSshPublicKeyArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetSshPublicKeyArgs Empty = new GetSshPublicKeyArgs();

    /**
     * The name of the resource group.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private String resourceGroupName;

    /**
     * @return The name of the resource group.
     * 
     */
    public String resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The name of the SSH public key.
     * 
     */
    @Import(name="sshPublicKeyName", required=true)
    private String sshPublicKeyName;

    /**
     * @return The name of the SSH public key.
     * 
     */
    public String sshPublicKeyName() {
        return this.sshPublicKeyName;
    }

    private GetSshPublicKeyArgs() {}

    private GetSshPublicKeyArgs(GetSshPublicKeyArgs $) {
        this.resourceGroupName = $.resourceGroupName;
        this.sshPublicKeyName = $.sshPublicKeyName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetSshPublicKeyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetSshPublicKeyArgs $;

        public Builder() {
            $ = new GetSshPublicKeyArgs();
        }

        public Builder(GetSshPublicKeyArgs defaults) {
            $ = new GetSshPublicKeyArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param resourceGroupName The name of the resource group.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param sshPublicKeyName The name of the SSH public key.
         * 
         * @return builder
         * 
         */
        public Builder sshPublicKeyName(String sshPublicKeyName) {
            $.sshPublicKeyName = sshPublicKeyName;
            return this;
        }

        public GetSshPublicKeyArgs build() {
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.sshPublicKeyName = Objects.requireNonNull($.sshPublicKeyName, "expected parameter 'sshPublicKeyName' to be non-null");
            return $;
        }
    }

}
