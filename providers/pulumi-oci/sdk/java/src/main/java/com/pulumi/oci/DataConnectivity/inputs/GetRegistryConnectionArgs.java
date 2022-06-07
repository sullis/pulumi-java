// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.DataConnectivity.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetRegistryConnectionArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetRegistryConnectionArgs Empty = new GetRegistryConnectionArgs();

    /**
     * The connection key.
     * 
     */
    @Import(name="connectionKey", required=true)
    private Output<String> connectionKey;

    /**
     * @return The connection key.
     * 
     */
    public Output<String> connectionKey() {
        return this.connectionKey;
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

    private GetRegistryConnectionArgs() {}

    private GetRegistryConnectionArgs(GetRegistryConnectionArgs $) {
        this.connectionKey = $.connectionKey;
        this.registryId = $.registryId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetRegistryConnectionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetRegistryConnectionArgs $;

        public Builder() {
            $ = new GetRegistryConnectionArgs();
        }

        public Builder(GetRegistryConnectionArgs defaults) {
            $ = new GetRegistryConnectionArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param connectionKey The connection key.
         * 
         * @return builder
         * 
         */
        public Builder connectionKey(Output<String> connectionKey) {
            $.connectionKey = connectionKey;
            return this;
        }

        /**
         * @param connectionKey The connection key.
         * 
         * @return builder
         * 
         */
        public Builder connectionKey(String connectionKey) {
            return connectionKey(Output.of(connectionKey));
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

        public GetRegistryConnectionArgs build() {
            $.connectionKey = Objects.requireNonNull($.connectionKey, "expected parameter 'connectionKey' to be non-null");
            $.registryId = Objects.requireNonNull($.registryId, "expected parameter 'registryId' to be non-null");
            return $;
        }
    }

}
