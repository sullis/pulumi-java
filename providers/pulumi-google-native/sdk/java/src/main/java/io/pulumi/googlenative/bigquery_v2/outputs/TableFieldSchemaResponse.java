// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.bigquery_v2.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.bigquery_v2.outputs.TableFieldSchemaCategoriesResponse;
import io.pulumi.googlenative.bigquery_v2.outputs.TableFieldSchemaPolicyTagsResponse;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class TableFieldSchemaResponse {
    /**
     * [Optional] The categories attached to this field, used for field-level access control.
     * 
     */
    private final TableFieldSchemaCategoriesResponse categories;
    /**
     * Optional. Collation specification of the field. It only can be set on string type field.
     * 
     */
    private final String collationSpec;
    /**
     * [Optional] The field description. The maximum length is 1,024 characters.
     * 
     */
    private final String description;
    /**
     * [Optional] Describes the nested schema fields if the type property is set to RECORD.
     * 
     */
    private final List<TableFieldSchemaResponse> fields;
    /**
     * [Optional] Maximum length of values of this field for STRINGS or BYTES. If max_length is not specified, no maximum length constraint is imposed on this field. If type = "STRING", then max_length represents the maximum UTF-8 length of strings in this field. If type = "BYTES", then max_length represents the maximum number of bytes in this field. It is invalid to set this field if type ≠ "STRING" and ≠ "BYTES".
     * 
     */
    private final String maxLength;
    /**
     * [Optional] The field mode. Possible values include NULLABLE, REQUIRED and REPEATED. The default value is NULLABLE.
     * 
     */
    private final String mode;
    /**
     * [Required] The field name. The name must contain only letters (a-z, A-Z), numbers (0-9), or underscores (_), and must start with a letter or underscore. The maximum length is 300 characters.
     * 
     */
    private final String name;
    private final TableFieldSchemaPolicyTagsResponse policyTags;
    /**
     * [Optional] Precision (maximum number of total digits in base 10) and scale (maximum number of digits in the fractional part in base 10) constraints for values of this field for NUMERIC or BIGNUMERIC. It is invalid to set precision or scale if type ≠ "NUMERIC" and ≠ "BIGNUMERIC". If precision and scale are not specified, no value range constraint is imposed on this field insofar as values are permitted by the type. Values of this NUMERIC or BIGNUMERIC field must be in this range when: - Precision (P) and scale (S) are specified: [-10P-S + 10-S, 10P-S - 10-S] - Precision (P) is specified but not scale (and thus scale is interpreted to be equal to zero): [-10P + 1, 10P - 1]. Acceptable values for precision and scale if both are specified: - If type = "NUMERIC": 1 ≤ precision - scale ≤ 29 and 0 ≤ scale ≤ 9. - If type = "BIGNUMERIC": 1 ≤ precision - scale ≤ 38 and 0 ≤ scale ≤ 38. Acceptable values for precision if only precision is specified but not scale (and thus scale is interpreted to be equal to zero): - If type = "NUMERIC": 1 ≤ precision ≤ 29. - If type = "BIGNUMERIC": 1 ≤ precision ≤ 38. If scale is specified but not precision, then it is invalid.
     * 
     */
    private final String precision;
    /**
     * [Optional] See documentation for precision.
     * 
     */
    private final String scale;
    /**
     * [Required] The field data type. Possible values include STRING, BYTES, INTEGER, INT64 (same as INTEGER), FLOAT, FLOAT64 (same as FLOAT), NUMERIC, BIGNUMERIC, BOOLEAN, BOOL (same as BOOLEAN), TIMESTAMP, DATE, TIME, DATETIME, INTERVAL, RECORD (where RECORD indicates that the field contains a nested schema) or STRUCT (same as RECORD).
     * 
     */
    private final String type;

    @OutputCustomType.Constructor({"categories","collationSpec","description","fields","maxLength","mode","name","policyTags","precision","scale","type"})
    private TableFieldSchemaResponse(
        TableFieldSchemaCategoriesResponse categories,
        String collationSpec,
        String description,
        List<TableFieldSchemaResponse> fields,
        String maxLength,
        String mode,
        String name,
        TableFieldSchemaPolicyTagsResponse policyTags,
        String precision,
        String scale,
        String type) {
        this.categories = Objects.requireNonNull(categories);
        this.collationSpec = Objects.requireNonNull(collationSpec);
        this.description = Objects.requireNonNull(description);
        this.fields = Objects.requireNonNull(fields);
        this.maxLength = Objects.requireNonNull(maxLength);
        this.mode = Objects.requireNonNull(mode);
        this.name = Objects.requireNonNull(name);
        this.policyTags = Objects.requireNonNull(policyTags);
        this.precision = Objects.requireNonNull(precision);
        this.scale = Objects.requireNonNull(scale);
        this.type = Objects.requireNonNull(type);
    }

    /**
     * [Optional] The categories attached to this field, used for field-level access control.
     * 
    */
    public TableFieldSchemaCategoriesResponse getCategories() {
        return this.categories;
    }
    /**
     * Optional. Collation specification of the field. It only can be set on string type field.
     * 
    */
    public String getCollationSpec() {
        return this.collationSpec;
    }
    /**
     * [Optional] The field description. The maximum length is 1,024 characters.
     * 
    */
    public String getDescription() {
        return this.description;
    }
    /**
     * [Optional] Describes the nested schema fields if the type property is set to RECORD.
     * 
    */
    public List<TableFieldSchemaResponse> getFields() {
        return this.fields;
    }
    /**
     * [Optional] Maximum length of values of this field for STRINGS or BYTES. If max_length is not specified, no maximum length constraint is imposed on this field. If type = "STRING", then max_length represents the maximum UTF-8 length of strings in this field. If type = "BYTES", then max_length represents the maximum number of bytes in this field. It is invalid to set this field if type ≠ "STRING" and ≠ "BYTES".
     * 
    */
    public String getMaxLength() {
        return this.maxLength;
    }
    /**
     * [Optional] The field mode. Possible values include NULLABLE, REQUIRED and REPEATED. The default value is NULLABLE.
     * 
    */
    public String getMode() {
        return this.mode;
    }
    /**
     * [Required] The field name. The name must contain only letters (a-z, A-Z), numbers (0-9), or underscores (_), and must start with a letter or underscore. The maximum length is 300 characters.
     * 
    */
    public String getName() {
        return this.name;
    }
    public TableFieldSchemaPolicyTagsResponse getPolicyTags() {
        return this.policyTags;
    }
    /**
     * [Optional] Precision (maximum number of total digits in base 10) and scale (maximum number of digits in the fractional part in base 10) constraints for values of this field for NUMERIC or BIGNUMERIC. It is invalid to set precision or scale if type ≠ "NUMERIC" and ≠ "BIGNUMERIC". If precision and scale are not specified, no value range constraint is imposed on this field insofar as values are permitted by the type. Values of this NUMERIC or BIGNUMERIC field must be in this range when: - Precision (P) and scale (S) are specified: [-10P-S + 10-S, 10P-S - 10-S] - Precision (P) is specified but not scale (and thus scale is interpreted to be equal to zero): [-10P + 1, 10P - 1]. Acceptable values for precision and scale if both are specified: - If type = "NUMERIC": 1 ≤ precision - scale ≤ 29 and 0 ≤ scale ≤ 9. - If type = "BIGNUMERIC": 1 ≤ precision - scale ≤ 38 and 0 ≤ scale ≤ 38. Acceptable values for precision if only precision is specified but not scale (and thus scale is interpreted to be equal to zero): - If type = "NUMERIC": 1 ≤ precision ≤ 29. - If type = "BIGNUMERIC": 1 ≤ precision ≤ 38. If scale is specified but not precision, then it is invalid.
     * 
    */
    public String getPrecision() {
        return this.precision;
    }
    /**
     * [Optional] See documentation for precision.
     * 
    */
    public String getScale() {
        return this.scale;
    }
    /**
     * [Required] The field data type. Possible values include STRING, BYTES, INTEGER, INT64 (same as INTEGER), FLOAT, FLOAT64 (same as FLOAT), NUMERIC, BIGNUMERIC, BOOLEAN, BOOL (same as BOOLEAN), TIMESTAMP, DATE, TIME, DATETIME, INTERVAL, RECORD (where RECORD indicates that the field contains a nested schema) or STRUCT (same as RECORD).
     * 
    */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TableFieldSchemaResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private TableFieldSchemaCategoriesResponse categories;
        private String collationSpec;
        private String description;
        private List<TableFieldSchemaResponse> fields;
        private String maxLength;
        private String mode;
        private String name;
        private TableFieldSchemaPolicyTagsResponse policyTags;
        private String precision;
        private String scale;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(TableFieldSchemaResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.categories = defaults.categories;
    	      this.collationSpec = defaults.collationSpec;
    	      this.description = defaults.description;
    	      this.fields = defaults.fields;
    	      this.maxLength = defaults.maxLength;
    	      this.mode = defaults.mode;
    	      this.name = defaults.name;
    	      this.policyTags = defaults.policyTags;
    	      this.precision = defaults.precision;
    	      this.scale = defaults.scale;
    	      this.type = defaults.type;
        }

        public Builder setCategories(TableFieldSchemaCategoriesResponse categories) {
            this.categories = Objects.requireNonNull(categories);
            return this;
        }

        public Builder setCollationSpec(String collationSpec) {
            this.collationSpec = Objects.requireNonNull(collationSpec);
            return this;
        }

        public Builder setDescription(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }

        public Builder setFields(List<TableFieldSchemaResponse> fields) {
            this.fields = Objects.requireNonNull(fields);
            return this;
        }

        public Builder setMaxLength(String maxLength) {
            this.maxLength = Objects.requireNonNull(maxLength);
            return this;
        }

        public Builder setMode(String mode) {
            this.mode = Objects.requireNonNull(mode);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setPolicyTags(TableFieldSchemaPolicyTagsResponse policyTags) {
            this.policyTags = Objects.requireNonNull(policyTags);
            return this;
        }

        public Builder setPrecision(String precision) {
            this.precision = Objects.requireNonNull(precision);
            return this;
        }

        public Builder setScale(String scale) {
            this.scale = Objects.requireNonNull(scale);
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public TableFieldSchemaResponse build() {
            return new TableFieldSchemaResponse(categories, collationSpec, description, fields, maxLength, mode, name, policyTags, precision, scale, type);
        }
    }
}