// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.dynamodb.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class GetTableTtl {
    private final String attributeName;
    private final Boolean enabled;

    @OutputCustomType.Constructor({"attributeName","enabled"})
    private GetTableTtl(
        String attributeName,
        Boolean enabled) {
        this.attributeName = Objects.requireNonNull(attributeName);
        this.enabled = Objects.requireNonNull(enabled);
    }

    public String getAttributeName() {
        return this.attributeName;
    }
    public Boolean getEnabled() {
        return this.enabled;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetTableTtl defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String attributeName;
        private Boolean enabled;

        public Builder() {
    	      // Empty
        }

        public Builder(GetTableTtl defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.attributeName = defaults.attributeName;
    	      this.enabled = defaults.enabled;
        }

        public Builder setAttributeName(String attributeName) {
            this.attributeName = Objects.requireNonNull(attributeName);
            return this;
        }

        public Builder setEnabled(Boolean enabled) {
            this.enabled = Objects.requireNonNull(enabled);
            return this;
        }
        public GetTableTtl build() {
            return new GetTableTtl(attributeName, enabled);
        }
    }
}