// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.datacatalog.outputs;

import io.pulumi.core.annotations.CustomType;
import io.pulumi.gcp.datacatalog.outputs.EntryBigqueryTableSpecTableSpec;
import io.pulumi.gcp.datacatalog.outputs.EntryBigqueryTableSpecViewSpec;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class EntryBigqueryTableSpec {
    private final @Nullable String tableSourceType;
    private final @Nullable List<EntryBigqueryTableSpecTableSpec> tableSpecs;
    private final @Nullable List<EntryBigqueryTableSpecViewSpec> viewSpecs;

    @CustomType.Constructor
    private EntryBigqueryTableSpec(
        @CustomType.Parameter("tableSourceType") @Nullable String tableSourceType,
        @CustomType.Parameter("tableSpecs") @Nullable List<EntryBigqueryTableSpecTableSpec> tableSpecs,
        @CustomType.Parameter("viewSpecs") @Nullable List<EntryBigqueryTableSpecViewSpec> viewSpecs) {
        this.tableSourceType = tableSourceType;
        this.tableSpecs = tableSpecs;
        this.viewSpecs = viewSpecs;
    }

    public Optional<String> getTableSourceType() {
        return Optional.ofNullable(this.tableSourceType);
    }
    public List<EntryBigqueryTableSpecTableSpec> getTableSpecs() {
        return this.tableSpecs == null ? List.of() : this.tableSpecs;
    }
    public List<EntryBigqueryTableSpecViewSpec> getViewSpecs() {
        return this.viewSpecs == null ? List.of() : this.viewSpecs;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EntryBigqueryTableSpec defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String tableSourceType;
        private @Nullable List<EntryBigqueryTableSpecTableSpec> tableSpecs;
        private @Nullable List<EntryBigqueryTableSpecViewSpec> viewSpecs;

        public Builder() {
    	      // Empty
        }

        public Builder(EntryBigqueryTableSpec defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.tableSourceType = defaults.tableSourceType;
    	      this.tableSpecs = defaults.tableSpecs;
    	      this.viewSpecs = defaults.viewSpecs;
        }

        public Builder tableSourceType(@Nullable String tableSourceType) {
            this.tableSourceType = tableSourceType;
            return this;
        }
        public Builder tableSpecs(@Nullable List<EntryBigqueryTableSpecTableSpec> tableSpecs) {
            this.tableSpecs = tableSpecs;
            return this;
        }
        public Builder tableSpecs(EntryBigqueryTableSpecTableSpec... tableSpecs) {
            return tableSpecs(List.of(tableSpecs));
        }
        public Builder viewSpecs(@Nullable List<EntryBigqueryTableSpecViewSpec> viewSpecs) {
            this.viewSpecs = viewSpecs;
            return this;
        }
        public Builder viewSpecs(EntryBigqueryTableSpecViewSpec... viewSpecs) {
            return viewSpecs(List.of(viewSpecs));
        }        public EntryBigqueryTableSpec build() {
            return new EntryBigqueryTableSpec(tableSourceType, tableSpecs, viewSpecs);
        }
    }
}
