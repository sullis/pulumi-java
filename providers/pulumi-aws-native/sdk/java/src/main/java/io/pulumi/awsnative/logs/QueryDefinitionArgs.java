// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.logs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class QueryDefinitionArgs extends io.pulumi.resources.ResourceArgs {

    public static final QueryDefinitionArgs Empty = new QueryDefinitionArgs();

    /**
     * Optionally define specific log groups as part of your query definition
     * 
     */
    @Import(name="logGroupNames")
      private final @Nullable Output<List<String>> logGroupNames;

    public Output<List<String>> logGroupNames() {
        return this.logGroupNames == null ? Codegen.empty() : this.logGroupNames;
    }

    /**
     * A name for the saved query definition
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> name() {
        return this.name == null ? Codegen.empty() : this.name;
    }

    /**
     * The query string to use for this definition
     * 
     */
    @Import(name="queryString", required=true)
      private final Output<String> queryString;

    public Output<String> queryString() {
        return this.queryString;
    }

    public QueryDefinitionArgs(
        @Nullable Output<List<String>> logGroupNames,
        @Nullable Output<String> name,
        Output<String> queryString) {
        this.logGroupNames = logGroupNames;
        this.name = name;
        this.queryString = Objects.requireNonNull(queryString, "expected parameter 'queryString' to be non-null");
    }

    private QueryDefinitionArgs() {
        this.logGroupNames = Codegen.empty();
        this.name = Codegen.empty();
        this.queryString = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(QueryDefinitionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<String>> logGroupNames;
        private @Nullable Output<String> name;
        private Output<String> queryString;

        public Builder() {
    	      // Empty
        }

        public Builder(QueryDefinitionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.logGroupNames = defaults.logGroupNames;
    	      this.name = defaults.name;
    	      this.queryString = defaults.queryString;
        }

        public Builder logGroupNames(@Nullable Output<List<String>> logGroupNames) {
            this.logGroupNames = logGroupNames;
            return this;
        }
        public Builder logGroupNames(@Nullable List<String> logGroupNames) {
            this.logGroupNames = Codegen.ofNullable(logGroupNames);
            return this;
        }
        public Builder logGroupNames(String... logGroupNames) {
            return logGroupNames(List.of(logGroupNames));
        }
        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Codegen.ofNullable(name);
            return this;
        }
        public Builder queryString(Output<String> queryString) {
            this.queryString = Objects.requireNonNull(queryString);
            return this;
        }
        public Builder queryString(String queryString) {
            this.queryString = Output.of(Objects.requireNonNull(queryString));
            return this;
        }        public QueryDefinitionArgs build() {
            return new QueryDefinitionArgs(logGroupNames, name, queryString);
        }
    }
}
