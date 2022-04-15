// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.dynamodb.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GlobalTableKeySchema {
    private final String attributeName;
    private final String keyType;

    @CustomType.Constructor
    private GlobalTableKeySchema(
        @CustomType.Parameter("attributeName") String attributeName,
        @CustomType.Parameter("keyType") String keyType) {
        this.attributeName = attributeName;
        this.keyType = keyType;
    }

    public String attributeName() {
        return this.attributeName;
    }
    public String keyType() {
        return this.keyType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GlobalTableKeySchema defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String attributeName;
        private String keyType;

        public Builder() {
    	      // Empty
        }

        public Builder(GlobalTableKeySchema defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.attributeName = defaults.attributeName;
    	      this.keyType = defaults.keyType;
        }

        public Builder attributeName(String attributeName) {
            this.attributeName = Objects.requireNonNull(attributeName);
            return this;
        }
        public Builder keyType(String keyType) {
            this.keyType = Objects.requireNonNull(keyType);
            return this;
        }        public GlobalTableKeySchema build() {
            return new GlobalTableKeySchema(attributeName, keyType);
        }
    }
}
