// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.glue.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class TriggerPredicateConditionGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final TriggerPredicateConditionGetArgs Empty = new TriggerPredicateConditionGetArgs();

    /**
     * The condition crawl state. Currently, the values supported are `RUNNING`, `SUCCEEDED`, `CANCELLED`, and `FAILED`. If this is specified, `crawler_name` must also be specified. Conflicts with `state`.
     * 
     */
    @Import(name="crawlState")
      private final @Nullable Output<String> crawlState;

    public Output<String> crawlState() {
        return this.crawlState == null ? Codegen.empty() : this.crawlState;
    }

    /**
     * The name of the crawler to watch. If this is specified, `crawl_state` must also be specified. Conflicts with `job_name`.
     * 
     */
    @Import(name="crawlerName")
      private final @Nullable Output<String> crawlerName;

    public Output<String> crawlerName() {
        return this.crawlerName == null ? Codegen.empty() : this.crawlerName;
    }

    /**
     * The name of the job to watch. If this is specified, `state` must also be specified. Conflicts with `crawler_name`.
     * 
     */
    @Import(name="jobName")
      private final @Nullable Output<String> jobName;

    public Output<String> jobName() {
        return this.jobName == null ? Codegen.empty() : this.jobName;
    }

    /**
     * A logical operator. Defaults to `EQUALS`.
     * 
     */
    @Import(name="logicalOperator")
      private final @Nullable Output<String> logicalOperator;

    public Output<String> logicalOperator() {
        return this.logicalOperator == null ? Codegen.empty() : this.logicalOperator;
    }

    /**
     * The condition job state. Currently, the values supported are `SUCCEEDED`, `STOPPED`, `TIMEOUT` and `FAILED`. If this is specified, `job_name` must also be specified. Conflicts with `crawler_state`.
     * 
     */
    @Import(name="state")
      private final @Nullable Output<String> state;

    public Output<String> state() {
        return this.state == null ? Codegen.empty() : this.state;
    }

    public TriggerPredicateConditionGetArgs(
        @Nullable Output<String> crawlState,
        @Nullable Output<String> crawlerName,
        @Nullable Output<String> jobName,
        @Nullable Output<String> logicalOperator,
        @Nullable Output<String> state) {
        this.crawlState = crawlState;
        this.crawlerName = crawlerName;
        this.jobName = jobName;
        this.logicalOperator = logicalOperator;
        this.state = state;
    }

    private TriggerPredicateConditionGetArgs() {
        this.crawlState = Codegen.empty();
        this.crawlerName = Codegen.empty();
        this.jobName = Codegen.empty();
        this.logicalOperator = Codegen.empty();
        this.state = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TriggerPredicateConditionGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> crawlState;
        private @Nullable Output<String> crawlerName;
        private @Nullable Output<String> jobName;
        private @Nullable Output<String> logicalOperator;
        private @Nullable Output<String> state;

        public Builder() {
    	      // Empty
        }

        public Builder(TriggerPredicateConditionGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.crawlState = defaults.crawlState;
    	      this.crawlerName = defaults.crawlerName;
    	      this.jobName = defaults.jobName;
    	      this.logicalOperator = defaults.logicalOperator;
    	      this.state = defaults.state;
        }

        public Builder crawlState(@Nullable Output<String> crawlState) {
            this.crawlState = crawlState;
            return this;
        }
        public Builder crawlState(@Nullable String crawlState) {
            this.crawlState = Codegen.ofNullable(crawlState);
            return this;
        }
        public Builder crawlerName(@Nullable Output<String> crawlerName) {
            this.crawlerName = crawlerName;
            return this;
        }
        public Builder crawlerName(@Nullable String crawlerName) {
            this.crawlerName = Codegen.ofNullable(crawlerName);
            return this;
        }
        public Builder jobName(@Nullable Output<String> jobName) {
            this.jobName = jobName;
            return this;
        }
        public Builder jobName(@Nullable String jobName) {
            this.jobName = Codegen.ofNullable(jobName);
            return this;
        }
        public Builder logicalOperator(@Nullable Output<String> logicalOperator) {
            this.logicalOperator = logicalOperator;
            return this;
        }
        public Builder logicalOperator(@Nullable String logicalOperator) {
            this.logicalOperator = Codegen.ofNullable(logicalOperator);
            return this;
        }
        public Builder state(@Nullable Output<String> state) {
            this.state = state;
            return this;
        }
        public Builder state(@Nullable String state) {
            this.state = Codegen.ofNullable(state);
            return this;
        }        public TriggerPredicateConditionGetArgs build() {
            return new TriggerPredicateConditionGetArgs(crawlState, crawlerName, jobName, logicalOperator, state);
        }
    }
}
