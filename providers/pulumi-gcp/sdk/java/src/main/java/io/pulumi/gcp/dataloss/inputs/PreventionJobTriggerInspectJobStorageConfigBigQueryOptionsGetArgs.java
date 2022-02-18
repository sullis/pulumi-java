// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.dataloss.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.gcp.dataloss.inputs.PreventionJobTriggerInspectJobStorageConfigBigQueryOptionsTableReferenceGetArgs;
import java.util.Objects;


public final class PreventionJobTriggerInspectJobStorageConfigBigQueryOptionsGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final PreventionJobTriggerInspectJobStorageConfigBigQueryOptionsGetArgs Empty = new PreventionJobTriggerInspectJobStorageConfigBigQueryOptionsGetArgs();

    /**
     * Set of files to scan.
     * Structure is documented below.
     * 
     */
    @InputImport(name="tableReference", required=true)
    private final Input<PreventionJobTriggerInspectJobStorageConfigBigQueryOptionsTableReferenceGetArgs> tableReference;

    public Input<PreventionJobTriggerInspectJobStorageConfigBigQueryOptionsTableReferenceGetArgs> getTableReference() {
        return this.tableReference;
    }

    public PreventionJobTriggerInspectJobStorageConfigBigQueryOptionsGetArgs(Input<PreventionJobTriggerInspectJobStorageConfigBigQueryOptionsTableReferenceGetArgs> tableReference) {
        this.tableReference = Objects.requireNonNull(tableReference, "expected parameter 'tableReference' to be non-null");
    }

    private PreventionJobTriggerInspectJobStorageConfigBigQueryOptionsGetArgs() {
        this.tableReference = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PreventionJobTriggerInspectJobStorageConfigBigQueryOptionsGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<PreventionJobTriggerInspectJobStorageConfigBigQueryOptionsTableReferenceGetArgs> tableReference;

        public Builder() {
    	      // Empty
        }

        public Builder(PreventionJobTriggerInspectJobStorageConfigBigQueryOptionsGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.tableReference = defaults.tableReference;
        }

        public Builder setTableReference(Input<PreventionJobTriggerInspectJobStorageConfigBigQueryOptionsTableReferenceGetArgs> tableReference) {
            this.tableReference = Objects.requireNonNull(tableReference);
            return this;
        }

        public Builder setTableReference(PreventionJobTriggerInspectJobStorageConfigBigQueryOptionsTableReferenceGetArgs tableReference) {
            this.tableReference = Input.of(Objects.requireNonNull(tableReference));
            return this;
        }

        public PreventionJobTriggerInspectJobStorageConfigBigQueryOptionsGetArgs build() {
            return new PreventionJobTriggerInspectJobStorageConfigBigQueryOptionsGetArgs(tableReference);
        }
    }
}
