// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.kendra.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class DataSourceAclConfiguration {
    private final String allowedGroupsColumnName;

    @OutputCustomType.Constructor({"allowedGroupsColumnName"})
    private DataSourceAclConfiguration(String allowedGroupsColumnName) {
        this.allowedGroupsColumnName = Objects.requireNonNull(allowedGroupsColumnName);
    }

    public String getAllowedGroupsColumnName() {
        return this.allowedGroupsColumnName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DataSourceAclConfiguration defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String allowedGroupsColumnName;

        public Builder() {
    	      // Empty
        }

        public Builder(DataSourceAclConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowedGroupsColumnName = defaults.allowedGroupsColumnName;
        }

        public Builder setAllowedGroupsColumnName(String allowedGroupsColumnName) {
            this.allowedGroupsColumnName = Objects.requireNonNull(allowedGroupsColumnName);
            return this;
        }

        public DataSourceAclConfiguration build() {
            return new DataSourceAclConfiguration(allowedGroupsColumnName);
        }
    }
}
