// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.Database.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetAutonomousDatabaseBackupPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetAutonomousDatabaseBackupPlainArgs Empty = new GetAutonomousDatabaseBackupPlainArgs();

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the Autonomous Database backup.
     * 
     */
    @Import(name="autonomousDatabaseBackupId", required=true)
    private String autonomousDatabaseBackupId;

    /**
     * @return The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the Autonomous Database backup.
     * 
     */
    public String autonomousDatabaseBackupId() {
        return this.autonomousDatabaseBackupId;
    }

    private GetAutonomousDatabaseBackupPlainArgs() {}

    private GetAutonomousDatabaseBackupPlainArgs(GetAutonomousDatabaseBackupPlainArgs $) {
        this.autonomousDatabaseBackupId = $.autonomousDatabaseBackupId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetAutonomousDatabaseBackupPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetAutonomousDatabaseBackupPlainArgs $;

        public Builder() {
            $ = new GetAutonomousDatabaseBackupPlainArgs();
        }

        public Builder(GetAutonomousDatabaseBackupPlainArgs defaults) {
            $ = new GetAutonomousDatabaseBackupPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param autonomousDatabaseBackupId The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the Autonomous Database backup.
         * 
         * @return builder
         * 
         */
        public Builder autonomousDatabaseBackupId(String autonomousDatabaseBackupId) {
            $.autonomousDatabaseBackupId = autonomousDatabaseBackupId;
            return this;
        }

        public GetAutonomousDatabaseBackupPlainArgs build() {
            $.autonomousDatabaseBackupId = Objects.requireNonNull($.autonomousDatabaseBackupId, "expected parameter 'autonomousDatabaseBackupId' to be non-null");
            return $;
        }
    }

}
