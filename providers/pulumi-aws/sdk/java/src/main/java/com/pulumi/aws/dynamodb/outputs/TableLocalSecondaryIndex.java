// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.dynamodb.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class TableLocalSecondaryIndex {
    /**
     * @return The name of the index
     * 
     */
    private final String name;
    /**
     * @return Only required with `INCLUDE` as a
     * projection type; a list of attributes to project into the index. These
     * do not need to be defined as attributes on the table.
     * 
     */
    private final @Nullable List<String> nonKeyAttributes;
    /**
     * @return One of `ALL`, `INCLUDE` or `KEYS_ONLY`
     * where `ALL` projects every attribute into the index, `KEYS_ONLY`
     * projects just the hash and range key into the index, and `INCLUDE`
     * projects only the keys specified in the _non_key_attributes_
     * parameter.
     * 
     */
    private final String projectionType;
    /**
     * @return The name of the range key; must be defined
     * 
     */
    private final String rangeKey;

    @CustomType.Constructor
    private TableLocalSecondaryIndex(
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("nonKeyAttributes") @Nullable List<String> nonKeyAttributes,
        @CustomType.Parameter("projectionType") String projectionType,
        @CustomType.Parameter("rangeKey") String rangeKey) {
        this.name = name;
        this.nonKeyAttributes = nonKeyAttributes;
        this.projectionType = projectionType;
        this.rangeKey = rangeKey;
    }

    /**
     * @return The name of the index
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return Only required with `INCLUDE` as a
     * projection type; a list of attributes to project into the index. These
     * do not need to be defined as attributes on the table.
     * 
     */
    public List<String> nonKeyAttributes() {
        return this.nonKeyAttributes == null ? List.of() : this.nonKeyAttributes;
    }
    /**
     * @return One of `ALL`, `INCLUDE` or `KEYS_ONLY`
     * where `ALL` projects every attribute into the index, `KEYS_ONLY`
     * projects just the hash and range key into the index, and `INCLUDE`
     * projects only the keys specified in the _non_key_attributes_
     * parameter.
     * 
     */
    public String projectionType() {
        return this.projectionType;
    }
    /**
     * @return The name of the range key; must be defined
     * 
     */
    public String rangeKey() {
        return this.rangeKey;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TableLocalSecondaryIndex defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String name;
        private @Nullable List<String> nonKeyAttributes;
        private String projectionType;
        private String rangeKey;

        public Builder() {
    	      // Empty
        }

        public Builder(TableLocalSecondaryIndex defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.nonKeyAttributes = defaults.nonKeyAttributes;
    	      this.projectionType = defaults.projectionType;
    	      this.rangeKey = defaults.rangeKey;
        }

        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder nonKeyAttributes(@Nullable List<String> nonKeyAttributes) {
            this.nonKeyAttributes = nonKeyAttributes;
            return this;
        }
        public Builder nonKeyAttributes(String... nonKeyAttributes) {
            return nonKeyAttributes(List.of(nonKeyAttributes));
        }
        public Builder projectionType(String projectionType) {
            this.projectionType = Objects.requireNonNull(projectionType);
            return this;
        }
        public Builder rangeKey(String rangeKey) {
            this.rangeKey = Objects.requireNonNull(rangeKey);
            return this;
        }        public TableLocalSecondaryIndex build() {
            return new TableLocalSecondaryIndex(name, nonKeyAttributes, projectionType, rangeKey);
        }
    }
}
