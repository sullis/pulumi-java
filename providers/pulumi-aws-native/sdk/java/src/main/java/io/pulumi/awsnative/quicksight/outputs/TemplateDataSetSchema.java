// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.quicksight.outputs;

import io.pulumi.awsnative.quicksight.outputs.TemplateColumnSchema;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@OutputCustomType
public final class TemplateDataSetSchema {
    private final @Nullable List<TemplateColumnSchema> columnSchemaList;

    @OutputCustomType.Constructor({"columnSchemaList"})
    private TemplateDataSetSchema(@Nullable List<TemplateColumnSchema> columnSchemaList) {
        this.columnSchemaList = columnSchemaList;
    }

    public List<TemplateColumnSchema> getColumnSchemaList() {
        return this.columnSchemaList == null ? List.of() : this.columnSchemaList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TemplateDataSetSchema defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<TemplateColumnSchema> columnSchemaList;

        public Builder() {
    	      // Empty
        }

        public Builder(TemplateDataSetSchema defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.columnSchemaList = defaults.columnSchemaList;
        }

        public Builder setColumnSchemaList(@Nullable List<TemplateColumnSchema> columnSchemaList) {
            this.columnSchemaList = columnSchemaList;
            return this;
        }

        public TemplateDataSetSchema build() {
            return new TemplateDataSetSchema(columnSchemaList);
        }
    }
}
