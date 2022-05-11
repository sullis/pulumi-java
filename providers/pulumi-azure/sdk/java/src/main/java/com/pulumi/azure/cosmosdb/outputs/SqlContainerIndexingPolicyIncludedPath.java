// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.cosmosdb.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class SqlContainerIndexingPolicyIncludedPath {
    /**
     * @return Path for which the indexing behaviour applies to.
     * 
     */
    private final String path;

    @CustomType.Constructor
    private SqlContainerIndexingPolicyIncludedPath(@CustomType.Parameter("path") String path) {
        this.path = path;
    }

    /**
     * @return Path for which the indexing behaviour applies to.
     * 
     */
    public String path() {
        return this.path;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SqlContainerIndexingPolicyIncludedPath defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String path;

        public Builder() {
    	      // Empty
        }

        public Builder(SqlContainerIndexingPolicyIncludedPath defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.path = defaults.path;
        }

        public Builder path(String path) {
            this.path = Objects.requireNonNull(path);
            return this;
        }        public SqlContainerIndexingPolicyIncludedPath build() {
            return new SqlContainerIndexingPolicyIncludedPath(path);
        }
    }
}
