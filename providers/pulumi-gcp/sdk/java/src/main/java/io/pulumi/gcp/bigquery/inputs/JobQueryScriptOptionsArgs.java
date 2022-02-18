// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.bigquery.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class JobQueryScriptOptionsArgs extends io.pulumi.resources.ResourceArgs {

    public static final JobQueryScriptOptionsArgs Empty = new JobQueryScriptOptionsArgs();

    /**
     * Determines which statement in the script represents the "key result",
     * used to populate the schema and query results of the script job.
     * Possible values are `LAST` and `FIRST_SELECT`.
     * 
     */
    @InputImport(name="keyResultStatement")
    private final @Nullable Input<String> keyResultStatement;

    public Input<String> getKeyResultStatement() {
        return this.keyResultStatement == null ? Input.empty() : this.keyResultStatement;
    }

    /**
     * Limit on the number of bytes billed per statement. Exceeding this budget results in an error.
     * 
     */
    @InputImport(name="statementByteBudget")
    private final @Nullable Input<String> statementByteBudget;

    public Input<String> getStatementByteBudget() {
        return this.statementByteBudget == null ? Input.empty() : this.statementByteBudget;
    }

    /**
     * Timeout period for each statement in a script.
     * 
     */
    @InputImport(name="statementTimeoutMs")
    private final @Nullable Input<String> statementTimeoutMs;

    public Input<String> getStatementTimeoutMs() {
        return this.statementTimeoutMs == null ? Input.empty() : this.statementTimeoutMs;
    }

    public JobQueryScriptOptionsArgs(
        @Nullable Input<String> keyResultStatement,
        @Nullable Input<String> statementByteBudget,
        @Nullable Input<String> statementTimeoutMs) {
        this.keyResultStatement = keyResultStatement;
        this.statementByteBudget = statementByteBudget;
        this.statementTimeoutMs = statementTimeoutMs;
    }

    private JobQueryScriptOptionsArgs() {
        this.keyResultStatement = Input.empty();
        this.statementByteBudget = Input.empty();
        this.statementTimeoutMs = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(JobQueryScriptOptionsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> keyResultStatement;
        private @Nullable Input<String> statementByteBudget;
        private @Nullable Input<String> statementTimeoutMs;

        public Builder() {
    	      // Empty
        }

        public Builder(JobQueryScriptOptionsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.keyResultStatement = defaults.keyResultStatement;
    	      this.statementByteBudget = defaults.statementByteBudget;
    	      this.statementTimeoutMs = defaults.statementTimeoutMs;
        }

        public Builder setKeyResultStatement(@Nullable Input<String> keyResultStatement) {
            this.keyResultStatement = keyResultStatement;
            return this;
        }

        public Builder setKeyResultStatement(@Nullable String keyResultStatement) {
            this.keyResultStatement = Input.ofNullable(keyResultStatement);
            return this;
        }

        public Builder setStatementByteBudget(@Nullable Input<String> statementByteBudget) {
            this.statementByteBudget = statementByteBudget;
            return this;
        }

        public Builder setStatementByteBudget(@Nullable String statementByteBudget) {
            this.statementByteBudget = Input.ofNullable(statementByteBudget);
            return this;
        }

        public Builder setStatementTimeoutMs(@Nullable Input<String> statementTimeoutMs) {
            this.statementTimeoutMs = statementTimeoutMs;
            return this;
        }

        public Builder setStatementTimeoutMs(@Nullable String statementTimeoutMs) {
            this.statementTimeoutMs = Input.ofNullable(statementTimeoutMs);
            return this;
        }

        public JobQueryScriptOptionsArgs build() {
            return new JobQueryScriptOptionsArgs(keyResultStatement, statementByteBudget, statementTimeoutMs);
        }
    }
}
