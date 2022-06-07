// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.Core.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetBlockVolumeReplicaArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetBlockVolumeReplicaArgs Empty = new GetBlockVolumeReplicaArgs();

    /**
     * The OCID of the block volume replica.
     * 
     */
    @Import(name="blockVolumeReplicaId", required=true)
    private Output<String> blockVolumeReplicaId;

    /**
     * @return The OCID of the block volume replica.
     * 
     */
    public Output<String> blockVolumeReplicaId() {
        return this.blockVolumeReplicaId;
    }

    private GetBlockVolumeReplicaArgs() {}

    private GetBlockVolumeReplicaArgs(GetBlockVolumeReplicaArgs $) {
        this.blockVolumeReplicaId = $.blockVolumeReplicaId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetBlockVolumeReplicaArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetBlockVolumeReplicaArgs $;

        public Builder() {
            $ = new GetBlockVolumeReplicaArgs();
        }

        public Builder(GetBlockVolumeReplicaArgs defaults) {
            $ = new GetBlockVolumeReplicaArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param blockVolumeReplicaId The OCID of the block volume replica.
         * 
         * @return builder
         * 
         */
        public Builder blockVolumeReplicaId(Output<String> blockVolumeReplicaId) {
            $.blockVolumeReplicaId = blockVolumeReplicaId;
            return this;
        }

        /**
         * @param blockVolumeReplicaId The OCID of the block volume replica.
         * 
         * @return builder
         * 
         */
        public Builder blockVolumeReplicaId(String blockVolumeReplicaId) {
            return blockVolumeReplicaId(Output.of(blockVolumeReplicaId));
        }

        public GetBlockVolumeReplicaArgs build() {
            $.blockVolumeReplicaId = Objects.requireNonNull($.blockVolumeReplicaId, "expected parameter 'blockVolumeReplicaId' to be non-null");
            return $;
        }
    }

}
