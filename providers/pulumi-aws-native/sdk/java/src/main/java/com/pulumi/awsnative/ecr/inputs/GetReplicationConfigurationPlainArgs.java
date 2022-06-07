// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.ecr.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetReplicationConfigurationPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetReplicationConfigurationPlainArgs Empty = new GetReplicationConfigurationPlainArgs();

    /**
     * The RegistryId associated with the aws account.
     * 
     */
    @Import(name="registryId", required=true)
    private String registryId;

    /**
     * @return The RegistryId associated with the aws account.
     * 
     */
    public String registryId() {
        return this.registryId;
    }

    private GetReplicationConfigurationPlainArgs() {}

    private GetReplicationConfigurationPlainArgs(GetReplicationConfigurationPlainArgs $) {
        this.registryId = $.registryId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetReplicationConfigurationPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetReplicationConfigurationPlainArgs $;

        public Builder() {
            $ = new GetReplicationConfigurationPlainArgs();
        }

        public Builder(GetReplicationConfigurationPlainArgs defaults) {
            $ = new GetReplicationConfigurationPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param registryId The RegistryId associated with the aws account.
         * 
         * @return builder
         * 
         */
        public Builder registryId(String registryId) {
            $.registryId = registryId;
            return this;
        }

        public GetReplicationConfigurationPlainArgs build() {
            $.registryId = Objects.requireNonNull($.registryId, "expected parameter 'registryId' to be non-null");
            return $;
        }
    }

}
