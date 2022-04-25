// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.datamigration.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * Input for command that completes online migration for an Azure SQL Database Managed Instance.
 * 
 */
public final class MigrateMISyncCompleteCommandInputResponse extends com.pulumi.resources.InvokeArgs {

    public static final MigrateMISyncCompleteCommandInputResponse Empty = new MigrateMISyncCompleteCommandInputResponse();

    /**
     * Name of managed instance database
     * 
     */
    @Import(name="sourceDatabaseName", required=true)
    private String sourceDatabaseName;

    /**
     * @return Name of managed instance database
     * 
     */
    public String sourceDatabaseName() {
        return this.sourceDatabaseName;
    }

    private MigrateMISyncCompleteCommandInputResponse() {}

    private MigrateMISyncCompleteCommandInputResponse(MigrateMISyncCompleteCommandInputResponse $) {
        this.sourceDatabaseName = $.sourceDatabaseName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(MigrateMISyncCompleteCommandInputResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private MigrateMISyncCompleteCommandInputResponse $;

        public Builder() {
            $ = new MigrateMISyncCompleteCommandInputResponse();
        }

        public Builder(MigrateMISyncCompleteCommandInputResponse defaults) {
            $ = new MigrateMISyncCompleteCommandInputResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param sourceDatabaseName Name of managed instance database
         * 
         * @return builder
         * 
         */
        public Builder sourceDatabaseName(String sourceDatabaseName) {
            $.sourceDatabaseName = sourceDatabaseName;
            return this;
        }

        public MigrateMISyncCompleteCommandInputResponse build() {
            $.sourceDatabaseName = Objects.requireNonNull($.sourceDatabaseName, "expected parameter 'sourceDatabaseName' to be non-null");
            return $;
        }
    }

}
