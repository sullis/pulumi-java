// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.dynamodb.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class GetTableGlobalSecondaryIndex extends io.pulumi.resources.InvokeArgs {

    public static final GetTableGlobalSecondaryIndex Empty = new GetTableGlobalSecondaryIndex();

    @Import(name="hashKey", required=true)
      private final String hashKey;

    public String getHashKey() {
        return this.hashKey;
    }

    /**
     * The name of the DynamoDB table.
     * 
     */
    @Import(name="name", required=true)
      private final String name;

    public String getName() {
        return this.name;
    }

    @Import(name="nonKeyAttributes", required=true)
      private final List<String> nonKeyAttributes;

    public List<String> getNonKeyAttributes() {
        return this.nonKeyAttributes;
    }

    @Import(name="projectionType", required=true)
      private final String projectionType;

    public String getProjectionType() {
        return this.projectionType;
    }

    @Import(name="rangeKey", required=true)
      private final String rangeKey;

    public String getRangeKey() {
        return this.rangeKey;
    }

    @Import(name="readCapacity", required=true)
      private final Integer readCapacity;

    public Integer getReadCapacity() {
        return this.readCapacity;
    }

    @Import(name="writeCapacity", required=true)
      private final Integer writeCapacity;

    public Integer getWriteCapacity() {
        return this.writeCapacity;
    }

    public GetTableGlobalSecondaryIndex(
        String hashKey,
        String name,
        List<String> nonKeyAttributes,
        String projectionType,
        String rangeKey,
        Integer readCapacity,
        Integer writeCapacity) {
        this.hashKey = Objects.requireNonNull(hashKey, "expected parameter 'hashKey' to be non-null");
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.nonKeyAttributes = Objects.requireNonNull(nonKeyAttributes, "expected parameter 'nonKeyAttributes' to be non-null");
        this.projectionType = Objects.requireNonNull(projectionType, "expected parameter 'projectionType' to be non-null");
        this.rangeKey = Objects.requireNonNull(rangeKey, "expected parameter 'rangeKey' to be non-null");
        this.readCapacity = Objects.requireNonNull(readCapacity, "expected parameter 'readCapacity' to be non-null");
        this.writeCapacity = Objects.requireNonNull(writeCapacity, "expected parameter 'writeCapacity' to be non-null");
    }

    private GetTableGlobalSecondaryIndex() {
        this.hashKey = null;
        this.name = null;
        this.nonKeyAttributes = List.of();
        this.projectionType = null;
        this.rangeKey = null;
        this.readCapacity = null;
        this.writeCapacity = null;
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
