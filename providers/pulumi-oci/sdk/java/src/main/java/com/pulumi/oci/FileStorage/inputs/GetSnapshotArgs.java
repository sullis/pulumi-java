// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.FileStorage.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetSnapshotArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetSnapshotArgs Empty = new GetSnapshotArgs();

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the snapshot.
     * 
     */
    @Import(name="snapshotId", required=true)
    private Output<String> snapshotId;

    /**
     * @return The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the snapshot.
     * 
     */
    public Output<String> snapshotId() {
        return this.snapshotId;
    }

    private GetSnapshotArgs() {}

    private GetSnapshotArgs(GetSnapshotArgs $) {
        this.snapshotId = $.snapshotId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetSnapshotArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetSnapshotArgs $;

        public Builder() {
            $ = new GetSnapshotArgs();
        }

        public Builder(GetSnapshotArgs defaults) {
            $ = new GetSnapshotArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param snapshotId The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the snapshot.
         * 
         * @return builder
         * 
         */
        public Builder snapshotId(Output<String> snapshotId) {
            $.snapshotId = snapshotId;
            return this;
        }

        /**
         * @param snapshotId The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the snapshot.
         * 
         * @return builder
         * 
         */
        public Builder snapshotId(String snapshotId) {
            return snapshotId(Output.of(snapshotId));
        }

        public GetSnapshotArgs build() {
            $.snapshotId = Objects.requireNonNull($.snapshotId, "expected parameter 'snapshotId' to be non-null");
            return $;
        }
    }

}
