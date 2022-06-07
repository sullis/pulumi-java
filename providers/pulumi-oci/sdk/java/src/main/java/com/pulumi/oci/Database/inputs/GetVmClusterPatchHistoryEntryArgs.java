// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.Database.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetVmClusterPatchHistoryEntryArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetVmClusterPatchHistoryEntryArgs Empty = new GetVmClusterPatchHistoryEntryArgs();

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the patch history entry.
     * 
     */
    @Import(name="patchHistoryEntryId", required=true)
    private Output<String> patchHistoryEntryId;

    /**
     * @return The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the patch history entry.
     * 
     */
    public Output<String> patchHistoryEntryId() {
        return this.patchHistoryEntryId;
    }

    /**
     * The VM cluster [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
     * 
     */
    @Import(name="vmClusterId", required=true)
    private Output<String> vmClusterId;

    /**
     * @return The VM cluster [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
     * 
     */
    public Output<String> vmClusterId() {
        return this.vmClusterId;
    }

    private GetVmClusterPatchHistoryEntryArgs() {}

    private GetVmClusterPatchHistoryEntryArgs(GetVmClusterPatchHistoryEntryArgs $) {
        this.patchHistoryEntryId = $.patchHistoryEntryId;
        this.vmClusterId = $.vmClusterId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetVmClusterPatchHistoryEntryArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetVmClusterPatchHistoryEntryArgs $;

        public Builder() {
            $ = new GetVmClusterPatchHistoryEntryArgs();
        }

        public Builder(GetVmClusterPatchHistoryEntryArgs defaults) {
            $ = new GetVmClusterPatchHistoryEntryArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param patchHistoryEntryId The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the patch history entry.
         * 
         * @return builder
         * 
         */
        public Builder patchHistoryEntryId(Output<String> patchHistoryEntryId) {
            $.patchHistoryEntryId = patchHistoryEntryId;
            return this;
        }

        /**
         * @param patchHistoryEntryId The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the patch history entry.
         * 
         * @return builder
         * 
         */
        public Builder patchHistoryEntryId(String patchHistoryEntryId) {
            return patchHistoryEntryId(Output.of(patchHistoryEntryId));
        }

        /**
         * @param vmClusterId The VM cluster [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
         * 
         * @return builder
         * 
         */
        public Builder vmClusterId(Output<String> vmClusterId) {
            $.vmClusterId = vmClusterId;
            return this;
        }

        /**
         * @param vmClusterId The VM cluster [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
         * 
         * @return builder
         * 
         */
        public Builder vmClusterId(String vmClusterId) {
            return vmClusterId(Output.of(vmClusterId));
        }

        public GetVmClusterPatchHistoryEntryArgs build() {
            $.patchHistoryEntryId = Objects.requireNonNull($.patchHistoryEntryId, "expected parameter 'patchHistoryEntryId' to be non-null");
            $.vmClusterId = Objects.requireNonNull($.vmClusterId, "expected parameter 'vmClusterId' to be non-null");
            return $;
        }
    }

}
