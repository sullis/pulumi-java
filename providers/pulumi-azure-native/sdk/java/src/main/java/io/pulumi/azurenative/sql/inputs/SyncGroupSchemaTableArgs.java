// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.sql.inputs;

import io.pulumi.azurenative.sql.inputs.SyncGroupSchemaTableColumnArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Properties of table in sync group schema.
 * 
 */
public final class SyncGroupSchemaTableArgs extends io.pulumi.resources.ResourceArgs {

    public static final SyncGroupSchemaTableArgs Empty = new SyncGroupSchemaTableArgs();

    /**
     * List of columns in sync group schema.
     * 
     */
    @InputImport(name="columns")
    private final @Nullable Input<List<SyncGroupSchemaTableColumnArgs>> columns;

    public Input<List<SyncGroupSchemaTableColumnArgs>> getColumns() {
        return this.columns == null ? Input.empty() : this.columns;
    }

    /**
     * Quoted name of sync group schema table.
     * 
     */
    @InputImport(name="quotedName")
    private final @Nullable Input<String> quotedName;

    public Input<String> getQuotedName() {
        return this.quotedName == null ? Input.empty() : this.quotedName;
    }

    public SyncGroupSchemaTableArgs(
        @Nullable Input<List<SyncGroupSchemaTableColumnArgs>> columns,
        @Nullable Input<String> quotedName) {
        this.columns = columns;
        this.quotedName = quotedName;
    }

    private SyncGroupSchemaTableArgs() {
        this.columns = Input.empty();
        this.quotedName = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SyncGroupSchemaTableArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<SyncGroupSchemaTableColumnArgs>> columns;
        private @Nullable Input<String> quotedName;

        public Builder() {
    	      // Empty
        }

        public Builder(SyncGroupSchemaTableArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.columns = defaults.columns;
    	      this.quotedName = defaults.quotedName;
        }

        public Builder setColumns(@Nullable Input<List<SyncGroupSchemaTableColumnArgs>> columns) {
            this.columns = columns;
            return this;
        }

        public Builder setColumns(@Nullable List<SyncGroupSchemaTableColumnArgs> columns) {
            this.columns = Input.ofNullable(columns);
            return this;
        }

        public Builder setQuotedName(@Nullable Input<String> quotedName) {
            this.quotedName = quotedName;
            return this;
        }

        public Builder setQuotedName(@Nullable String quotedName) {
            this.quotedName = Input.ofNullable(quotedName);
            return this;
        }

        public SyncGroupSchemaTableArgs build() {
            return new SyncGroupSchemaTableArgs(columns, quotedName);
        }
    }
}
