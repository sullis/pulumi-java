// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.Database.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetMaintenanceRunPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetMaintenanceRunPlainArgs Empty = new GetMaintenanceRunPlainArgs();

    /**
     * The maintenance run OCID.
     * 
     */
    @Import(name="maintenanceRunId", required=true)
    private String maintenanceRunId;

    /**
     * @return The maintenance run OCID.
     * 
     */
    public String maintenanceRunId() {
        return this.maintenanceRunId;
    }

    private GetMaintenanceRunPlainArgs() {}

    private GetMaintenanceRunPlainArgs(GetMaintenanceRunPlainArgs $) {
        this.maintenanceRunId = $.maintenanceRunId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetMaintenanceRunPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetMaintenanceRunPlainArgs $;

        public Builder() {
            $ = new GetMaintenanceRunPlainArgs();
        }

        public Builder(GetMaintenanceRunPlainArgs defaults) {
            $ = new GetMaintenanceRunPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param maintenanceRunId The maintenance run OCID.
         * 
         * @return builder
         * 
         */
        public Builder maintenanceRunId(String maintenanceRunId) {
            $.maintenanceRunId = maintenanceRunId;
            return this;
        }

        public GetMaintenanceRunPlainArgs build() {
            $.maintenanceRunId = Objects.requireNonNull($.maintenanceRunId, "expected parameter 'maintenanceRunId' to be non-null");
            return $;
        }
    }

}
