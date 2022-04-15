// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.dynamodb.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetTableGlobalSecondaryIndex {
    private final String hashKey;
    /**
     * The name of the DynamoDB table.
     * 
     */
    private final String name;
    private final List<String> nonKeyAttributes;
    private final String projectionType;
    private final String rangeKey;
    private final Integer readCapacity;
    private final Integer writeCapacity;

    @CustomType.Constructor
    private GetTableGlobalSecondaryIndex(
        @CustomType.Parameter("hashKey") String hashKey,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("nonKeyAttributes") List<String> nonKeyAttributes,
        @CustomType.Parameter("projectionType") String projectionType,
        @CustomType.Parameter("rangeKey") String rangeKey,
        @CustomType.Parameter("readCapacity") Integer readCapacity,
        @CustomType.Parameter("writeCapacity") Integer writeCapacity) {
        this.hashKey = hashKey;
        this.name = name;
        this.nonKeyAttributes = nonKeyAttributes;
        this.projectionType = projectionType;
        this.rangeKey = rangeKey;
        this.readCapacity = readCapacity;
        this.writeCapacity = writeCapacity;
    }

    public String hashKey() {
        return this.hashKey;
    }
    /**
     * The name of the DynamoDB table.
     * 
    */
    public String name() {
        return this.name;
    }
    public List<String> nonKeyAttributes() {
        return this.nonKeyAttributes;
    }
    public String projectionType() {
        return this.projectionType;
    }
    public String rangeKey() {
        return this.rangeKey;
    }
    public Integer readCapacity() {
        return this.readCapacity;
    }
    public Integer writeCapacity() {
        return this.writeCapacity;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetTableGlobalSecondaryIndex defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String hashKey;
        private String name;
        private List<String> nonKeyAttributes;
        private String projectionType;
        private String rangeKey;
        private Integer readCapacity;
        private Integer writeCapacity;

        public Builder() {
    	      // Empty
        }

        public Builder(GetTableGlobalSecondaryIndex defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.hashKey = defaults.hashKey;
    	      this.name = defaults.name;
    	      this.nonKeyAttributes = defaults.nonKeyAttributes;
    	      this.projectionType = defaults.projectionType;
    	      this.rangeKey = defaults.rangeKey;
    	      this.readCapacity = defaults.readCapacity;
    	      this.writeCapacity = defaults.writeCapacity;
        }

        public Builder hashKey(String hashKey) {
            this.hashKey = Objects.requireNonNull(hashKey);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder nonKeyAttributes(List<String> nonKeyAttributes) {
            this.nonKeyAttributes = Objects.requireNonNull(nonKeyAttributes);
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
        }
        public Builder readCapacity(Integer readCapacity) {
            this.readCapacity = Objects.requireNonNull(readCapacity);
            return this;
        }
        public Builder writeCapacity(Integer writeCapacity) {
            this.writeCapacity = Objects.requireNonNull(writeCapacity);
            return this;
        }        public GetTableGlobalSecondaryIndex build() {
            return new GetTableGlobalSecondaryIndex(hashKey, name, nonKeyAttributes, projectionType, rangeKey, readCapacity, writeCapacity);
        }
    }
}
