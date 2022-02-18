// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.dataloss.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import io.pulumi.gcp.dataloss.outputs.PreventionStoredInfoTypeLargeCustomDictionaryBigQueryFieldField;
import io.pulumi.gcp.dataloss.outputs.PreventionStoredInfoTypeLargeCustomDictionaryBigQueryFieldTable;
import java.util.Objects;

@OutputCustomType
public final class PreventionStoredInfoTypeLargeCustomDictionaryBigQueryField {
    /**
     * Designated field in the BigQuery table.
     * Structure is documented below.
     * 
     */
    private final PreventionStoredInfoTypeLargeCustomDictionaryBigQueryFieldField field;
    /**
     * Field in a BigQuery table where each cell represents a dictionary phrase.
     * Structure is documented below.
     * 
     */
    private final PreventionStoredInfoTypeLargeCustomDictionaryBigQueryFieldTable table;

    @OutputCustomType.Constructor({"field","table"})
    private PreventionStoredInfoTypeLargeCustomDictionaryBigQueryField(
        PreventionStoredInfoTypeLargeCustomDictionaryBigQueryFieldField field,
        PreventionStoredInfoTypeLargeCustomDictionaryBigQueryFieldTable table) {
        this.field = Objects.requireNonNull(field);
        this.table = Objects.requireNonNull(table);
    }

    /**
     * Designated field in the BigQuery table.
     * Structure is documented below.
     * 
     */
    public PreventionStoredInfoTypeLargeCustomDictionaryBigQueryFieldField getField() {
        return this.field;
    }
    /**
     * Field in a BigQuery table where each cell represents a dictionary phrase.
     * Structure is documented below.
     * 
     */
    public PreventionStoredInfoTypeLargeCustomDictionaryBigQueryFieldTable getTable() {
        return this.table;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PreventionStoredInfoTypeLargeCustomDictionaryBigQueryField defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PreventionStoredInfoTypeLargeCustomDictionaryBigQueryFieldField field;
        private PreventionStoredInfoTypeLargeCustomDictionaryBigQueryFieldTable table;

        public Builder() {
    	      // Empty
        }

        public Builder(PreventionStoredInfoTypeLargeCustomDictionaryBigQueryField defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.field = defaults.field;
    	      this.table = defaults.table;
        }

        public Builder setField(PreventionStoredInfoTypeLargeCustomDictionaryBigQueryFieldField field) {
            this.field = Objects.requireNonNull(field);
            return this;
        }

        public Builder setTable(PreventionStoredInfoTypeLargeCustomDictionaryBigQueryFieldTable table) {
            this.table = Objects.requireNonNull(table);
            return this;
        }

        public PreventionStoredInfoTypeLargeCustomDictionaryBigQueryField build() {
            return new PreventionStoredInfoTypeLargeCustomDictionaryBigQueryField(field, table);
        }
    }
}
