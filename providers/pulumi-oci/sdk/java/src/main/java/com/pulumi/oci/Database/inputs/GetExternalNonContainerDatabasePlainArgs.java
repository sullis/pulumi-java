// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.Database.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetExternalNonContainerDatabasePlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetExternalNonContainerDatabasePlainArgs Empty = new GetExternalNonContainerDatabasePlainArgs();

    /**
     * The external non-container database [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
     * 
     */
    @Import(name="externalNonContainerDatabaseId", required=true)
    private String externalNonContainerDatabaseId;

    /**
     * @return The external non-container database [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
     * 
     */
    public String externalNonContainerDatabaseId() {
        return this.externalNonContainerDatabaseId;
    }

    private GetExternalNonContainerDatabasePlainArgs() {}

    private GetExternalNonContainerDatabasePlainArgs(GetExternalNonContainerDatabasePlainArgs $) {
        this.externalNonContainerDatabaseId = $.externalNonContainerDatabaseId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetExternalNonContainerDatabasePlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetExternalNonContainerDatabasePlainArgs $;

        public Builder() {
            $ = new GetExternalNonContainerDatabasePlainArgs();
        }

        public Builder(GetExternalNonContainerDatabasePlainArgs defaults) {
            $ = new GetExternalNonContainerDatabasePlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param externalNonContainerDatabaseId The external non-container database [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
         * 
         * @return builder
         * 
         */
        public Builder externalNonContainerDatabaseId(String externalNonContainerDatabaseId) {
            $.externalNonContainerDatabaseId = externalNonContainerDatabaseId;
            return this;
        }

        public GetExternalNonContainerDatabasePlainArgs build() {
            $.externalNonContainerDatabaseId = Objects.requireNonNull($.externalNonContainerDatabaseId, "expected parameter 'externalNonContainerDatabaseId' to be non-null");
            return $;
        }
    }

}
