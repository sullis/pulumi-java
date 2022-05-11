// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.cosmosdb.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class SqlContainerIndexingPolicyIncludedPathArgs extends com.pulumi.resources.ResourceArgs {

    public static final SqlContainerIndexingPolicyIncludedPathArgs Empty = new SqlContainerIndexingPolicyIncludedPathArgs();

    /**
     * Path for which the indexing behaviour applies to.
     * 
     */
    @Import(name="path", required=true)
    private Output<String> path;

    /**
     * @return Path for which the indexing behaviour applies to.
     * 
     */
    public Output<String> path() {
        return this.path;
    }

    private SqlContainerIndexingPolicyIncludedPathArgs() {}

    private SqlContainerIndexingPolicyIncludedPathArgs(SqlContainerIndexingPolicyIncludedPathArgs $) {
        this.path = $.path;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SqlContainerIndexingPolicyIncludedPathArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SqlContainerIndexingPolicyIncludedPathArgs $;

        public Builder() {
            $ = new SqlContainerIndexingPolicyIncludedPathArgs();
        }

        public Builder(SqlContainerIndexingPolicyIncludedPathArgs defaults) {
            $ = new SqlContainerIndexingPolicyIncludedPathArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param path Path for which the indexing behaviour applies to.
         * 
         * @return builder
         * 
         */
        public Builder path(Output<String> path) {
            $.path = path;
            return this;
        }

        /**
         * @param path Path for which the indexing behaviour applies to.
         * 
         * @return builder
         * 
         */
        public Builder path(String path) {
            return path(Output.of(path));
        }

        public SqlContainerIndexingPolicyIncludedPathArgs build() {
            $.path = Objects.requireNonNull($.path, "expected parameter 'path' to be non-null");
            return $;
        }
    }

}
