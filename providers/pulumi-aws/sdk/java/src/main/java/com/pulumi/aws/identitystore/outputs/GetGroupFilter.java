// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.identitystore.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetGroupFilter {
    /**
     * @return The attribute path that is used to specify which attribute name to search. Currently, `DisplayName` is the only valid attribute path.
     * 
     */
    private final String attributePath;
    /**
     * @return The value for an attribute.
     * 
     */
    private final String attributeValue;

    @CustomType.Constructor
    private GetGroupFilter(
        @CustomType.Parameter("attributePath") String attributePath,
        @CustomType.Parameter("attributeValue") String attributeValue) {
        this.attributePath = attributePath;
        this.attributeValue = attributeValue;
    }

    /**
     * @return The attribute path that is used to specify which attribute name to search. Currently, `DisplayName` is the only valid attribute path.
     * 
     */
    public String attributePath() {
        return this.attributePath;
    }
    /**
     * @return The value for an attribute.
     * 
     */
    public String attributeValue() {
        return this.attributeValue;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetGroupFilter defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String attributePath;
        private String attributeValue;

        public Builder() {
    	      // Empty
        }

        public Builder(GetGroupFilter defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.attributePath = defaults.attributePath;
    	      this.attributeValue = defaults.attributeValue;
        }

        public Builder attributePath(String attributePath) {
            this.attributePath = Objects.requireNonNull(attributePath);
            return this;
        }
        public Builder attributeValue(String attributeValue) {
            this.attributeValue = Objects.requireNonNull(attributeValue);
            return this;
        }        public GetGroupFilter build() {
            return new GetGroupFilter(attributePath, attributeValue);
        }
    }
}
