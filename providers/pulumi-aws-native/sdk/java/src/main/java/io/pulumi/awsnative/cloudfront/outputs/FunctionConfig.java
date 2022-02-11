// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.cloudfront.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class FunctionConfig {
    private final String comment;
    private final String runtime;

    @OutputCustomType.Constructor({"comment","runtime"})
    private FunctionConfig(
        String comment,
        String runtime) {
        this.comment = Objects.requireNonNull(comment);
        this.runtime = Objects.requireNonNull(runtime);
    }

    public String getComment() {
        return this.comment;
    }
    public String getRuntime() {
        return this.runtime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FunctionConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String comment;
        private String runtime;

        public Builder() {
    	      // Empty
        }

        public Builder(FunctionConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.comment = defaults.comment;
    	      this.runtime = defaults.runtime;
        }

        public Builder setComment(String comment) {
            this.comment = Objects.requireNonNull(comment);
            return this;
        }

        public Builder setRuntime(String runtime) {
            this.runtime = Objects.requireNonNull(runtime);
            return this;
        }

        public FunctionConfig build() {
            return new FunctionConfig(comment, runtime);
        }
    }
}
