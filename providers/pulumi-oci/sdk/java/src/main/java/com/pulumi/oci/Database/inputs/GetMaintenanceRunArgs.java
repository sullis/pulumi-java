// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.Database.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetMaintenanceRunArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetMaintenanceRunArgs Empty = new GetMaintenanceRunArgs();

    /**
     * The maintenance run OCID.
     * 
     */
    @Import(name="maintenanceRunId", required=true)
    private Output<String> maintenanceRunId;

    /**
     * @return The maintenance run OCID.
     * 
     */
    public Output<String> maintenanceRunId() {
        return this.maintenanceRunId;
    }

    private GetMaintenanceRunArgs() {}

    private GetMaintenanceRunArgs(GetMaintenanceRunArgs $) {
        this.maintenanceRunId = $.maintenanceRunId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetMaintenanceRunArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetMaintenanceRunArgs $;

        public Builder() {
            $ = new GetMaintenanceRunArgs();
        }

        public Builder(GetMaintenanceRunArgs defaults) {
            $ = new GetMaintenanceRunArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param maintenanceRunId The maintenance run OCID.
         * 
         * @return builder
         * 
         */
        public Builder maintenanceRunId(Output<String> maintenanceRunId) {
            $.maintenanceRunId = maintenanceRunId;
            return this;
        }

        /**
         * @param maintenanceRunId The maintenance run OCID.
         * 
         * @return builder
         * 
         */
        public Builder maintenanceRunId(String maintenanceRunId) {
            return maintenanceRunId(Output.of(maintenanceRunId));
        }

        public GetMaintenanceRunArgs build() {
            $.maintenanceRunId = Objects.requireNonNull($.maintenanceRunId, "expected parameter 'maintenanceRunId' to be non-null");
            return $;
        }
    }

}
