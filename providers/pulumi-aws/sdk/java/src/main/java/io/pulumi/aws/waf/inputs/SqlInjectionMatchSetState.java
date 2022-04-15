// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.waf.inputs;

import io.pulumi.aws.waf.inputs.SqlInjectionMatchSetSqlInjectionMatchTupleGetArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class SqlInjectionMatchSetState extends io.pulumi.resources.ResourceArgs {

    public static final SqlInjectionMatchSetState Empty = new SqlInjectionMatchSetState();

    /**
     * The name or description of the SQL Injection Match Set.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> name() {
        return this.name == null ? Codegen.empty() : this.name;
    }

    /**
     * The parts of web requests that you want AWS WAF to inspect for malicious SQL code and, if you want AWS WAF to inspect a header, the name of the header.
     * 
     */
    @Import(name="sqlInjectionMatchTuples")
      private final @Nullable Output<List<SqlInjectionMatchSetSqlInjectionMatchTupleGetArgs>> sqlInjectionMatchTuples;

    public Output<List<SqlInjectionMatchSetSqlInjectionMatchTupleGetArgs>> sqlInjectionMatchTuples() {
        return this.sqlInjectionMatchTuples == null ? Codegen.empty() : this.sqlInjectionMatchTuples;
    }

    public SqlInjectionMatchSetState(
        @Nullable Output<String> name,
        @Nullable Output<List<SqlInjectionMatchSetSqlInjectionMatchTupleGetArgs>> sqlInjectionMatchTuples) {
        this.name = name;
        this.sqlInjectionMatchTuples = sqlInjectionMatchTuples;
    }

    private SqlInjectionMatchSetState() {
        this.name = Codegen.empty();
        this.sqlInjectionMatchTuples = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SqlInjectionMatchSetState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> name;
        private @Nullable Output<List<SqlInjectionMatchSetSqlInjectionMatchTupleGetArgs>> sqlInjectionMatchTuples;

        public Builder() {
    	      // Empty
        }

        public Builder(SqlInjectionMatchSetState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.sqlInjectionMatchTuples = defaults.sqlInjectionMatchTuples;
        }

        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Codegen.ofNullable(name);
            return this;
        }
        public Builder sqlInjectionMatchTuples(@Nullable Output<List<SqlInjectionMatchSetSqlInjectionMatchTupleGetArgs>> sqlInjectionMatchTuples) {
            this.sqlInjectionMatchTuples = sqlInjectionMatchTuples;
            return this;
        }
        public Builder sqlInjectionMatchTuples(@Nullable List<SqlInjectionMatchSetSqlInjectionMatchTupleGetArgs> sqlInjectionMatchTuples) {
            this.sqlInjectionMatchTuples = Codegen.ofNullable(sqlInjectionMatchTuples);
            return this;
        }
        public Builder sqlInjectionMatchTuples(SqlInjectionMatchSetSqlInjectionMatchTupleGetArgs... sqlInjectionMatchTuples) {
            return sqlInjectionMatchTuples(List.of(sqlInjectionMatchTuples));
        }        public SqlInjectionMatchSetState build() {
            return new SqlInjectionMatchSetState(name, sqlInjectionMatchTuples);
        }
    }
}
