// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.sql.outputs;

import io.pulumi.azurenative.sql.outputs.SyncGroupSchemaTableResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class SyncGroupSchemaResponse {
    /**
     * Name of master sync member where the schema is from.
     * 
     */
    private final @Nullable String masterSyncMemberName;
    /**
     * List of tables in sync group schema.
     * 
     */
    private final @Nullable List<SyncGroupSchemaTableResponse> tables;

    @OutputCustomType.Constructor({"masterSyncMemberName","tables"})
    private SyncGroupSchemaResponse(
        @Nullable String masterSyncMemberName,
        @Nullable List<SyncGroupSchemaTableResponse> tables) {
        this.masterSyncMemberName = masterSyncMemberName;
        this.tables = tables;
    }

    /**
     * Name of master sync member where the schema is from.
     * 
    */
    public Optional<String> getMasterSyncMemberName() {
        return Optional.ofNullable(this.masterSyncMemberName);
    }
    /**
     * List of tables in sync group schema.
     * 
    */
    public List<SyncGroupSchemaTableResponse> getTables() {
        return this.tables == null ? List.of() : this.tables;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SyncGroupSchemaResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String masterSyncMemberName;
        private @Nullable List<SyncGroupSchemaTableResponse> tables;

        public Builder() {
    	      // Empty
        }

        public Builder(SyncGroupSchemaResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.masterSyncMemberName = defaults.masterSyncMemberName;
    	      this.tables = defaults.tables;
        }

        public Builder setMasterSyncMemberName(@Nullable String masterSyncMemberName) {
            this.masterSyncMemberName = masterSyncMemberName;
            return this;
        }

        public Builder setTables(@Nullable List<SyncGroupSchemaTableResponse> tables) {
            this.tables = tables;
            return this;
        }
        public SyncGroupSchemaResponse build() {
            return new SyncGroupSchemaResponse(masterSyncMemberName, tables);
        }
    }
}