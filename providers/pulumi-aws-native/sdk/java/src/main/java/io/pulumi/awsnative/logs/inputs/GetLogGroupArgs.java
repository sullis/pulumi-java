// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.logs.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetLogGroupArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetLogGroupArgs Empty = new GetLogGroupArgs();

    /**
     * The name of the log group. If you don't specify a name, AWS CloudFormation generates a unique ID for the log group.
     * 
     */
    @Import(name="logGroupName", required=true)
      private final String logGroupName;

    public String getLogGroupName() {
        return this.logGroupName;
    }

    public GetLogGroupArgs(String logGroupName) {
        this.logGroupName = Objects.requireNonNull(logGroupName, "expected parameter 'logGroupName' to be non-null");
    }

    private GetLogGroupArgs() {
        this.logGroupName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetLogGroupArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String logGroupName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetLogGroupArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.logGroupName = defaults.logGroupName;
        }

        public Builder logGroupName(String logGroupName) {
            this.logGroupName = Objects.requireNonNull(logGroupName);
            return this;
        }        public GetLogGroupArgs build() {
            return new GetLogGroupArgs(logGroupName);
        }
    }
}
