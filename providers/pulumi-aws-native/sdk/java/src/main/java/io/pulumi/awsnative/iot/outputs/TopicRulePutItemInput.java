// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.iot.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class TopicRulePutItemInput {
    private final String tableName;

    @CustomType.Constructor
    private TopicRulePutItemInput(@CustomType.Parameter("tableName") String tableName) {
        this.tableName = tableName;
    }

    public String getTableName() {
        return this.tableName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TopicRulePutItemInput defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String tableName;

        public Builder() {
    	      // Empty
        }

        public Builder(TopicRulePutItemInput defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.tableName = defaults.tableName;
        }

        public Builder tableName(String tableName) {
            this.tableName = Objects.requireNonNull(tableName);
            return this;
        }        public TopicRulePutItemInput build() {
            return new TopicRulePutItemInput(tableName);
        }
    }
}
