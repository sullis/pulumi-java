// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.dynamodb.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GlobalTableKeySchema extends io.pulumi.resources.InvokeArgs {

    public static final GlobalTableKeySchema Empty = new GlobalTableKeySchema();

    @InputImport(name="attributeName", required=true)
    private final String attributeName;

    public String getAttributeName() {
        return this.attributeName;
    }

    @InputImport(name="keyType", required=true)
    private final String keyType;

    public String getKeyType() {
        return this.keyType;
    }

    public GlobalTableKeySchema(
        String attributeName,
        String keyType) {
        this.attributeName = Objects.requireNonNull(attributeName, "expected parameter 'attributeName' to be non-null");
        this.keyType = Objects.requireNonNull(keyType, "expected parameter 'keyType' to be non-null");
    }

    private GlobalTableKeySchema() {
        this.attributeName = null;
        this.keyType = null;
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

        public Builder setAttributeName(String attributeName) {
            this.attributeName = Objects.requireNonNull(attributeName);
            return this;
        }

        public Builder setKeyType(String keyType) {
            this.keyType = Objects.requireNonNull(keyType);
            return this;
        }

        public GlobalTableKeySchema build() {
            return new GlobalTableKeySchema(attributeName, keyType);
        }
    }
}
