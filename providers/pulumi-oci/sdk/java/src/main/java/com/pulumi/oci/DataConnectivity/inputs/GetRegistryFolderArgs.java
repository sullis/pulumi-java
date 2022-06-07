// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.DataConnectivity.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetRegistryFolderArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetRegistryFolderArgs Empty = new GetRegistryFolderArgs();

    /**
     * The folder ID.
     * 
     */
    @Import(name="folderKey", required=true)
    private Output<String> folderKey;

    /**
     * @return The folder ID.
     * 
     */
    public Output<String> folderKey() {
        return this.folderKey;
    }

    /**
     * The registry Ocid.
     * 
     */
    @Import(name="registryId", required=true)
    private Output<String> registryId;

    /**
     * @return The registry Ocid.
     * 
     */
    public Output<String> registryId() {
        return this.registryId;
    }

    private GetRegistryFolderArgs() {}

    private GetRegistryFolderArgs(GetRegistryFolderArgs $) {
        this.folderKey = $.folderKey;
        this.registryId = $.registryId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetRegistryFolderArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetRegistryFolderArgs $;

        public Builder() {
            $ = new GetRegistryFolderArgs();
        }

        public Builder(GetRegistryFolderArgs defaults) {
            $ = new GetRegistryFolderArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param folderKey The folder ID.
         * 
         * @return builder
         * 
         */
        public Builder folderKey(Output<String> folderKey) {
            $.folderKey = folderKey;
            return this;
        }

        /**
         * @param folderKey The folder ID.
         * 
         * @return builder
         * 
         */
        public Builder folderKey(String folderKey) {
            return folderKey(Output.of(folderKey));
        }

        /**
         * @param registryId The registry Ocid.
         * 
         * @return builder
         * 
         */
        public Builder registryId(Output<String> registryId) {
            $.registryId = registryId;
            return this;
        }

        /**
         * @param registryId The registry Ocid.
         * 
         * @return builder
         * 
         */
        public Builder registryId(String registryId) {
            return registryId(Output.of(registryId));
        }

        public GetRegistryFolderArgs build() {
            $.folderKey = Objects.requireNonNull($.folderKey, "expected parameter 'folderKey' to be non-null");
            $.registryId = Objects.requireNonNull($.registryId, "expected parameter 'registryId' to be non-null");
            return $;
        }
    }

}
