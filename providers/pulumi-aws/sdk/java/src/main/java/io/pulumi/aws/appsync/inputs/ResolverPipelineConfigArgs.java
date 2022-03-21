// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.appsync.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ResolverPipelineConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final ResolverPipelineConfigArgs Empty = new ResolverPipelineConfigArgs();

    /**
     * The list of Function ID.
     * 
     */
    @Import(name="functions")
      private final @Nullable Output<List<String>> functions;

    public Output<List<String>> getFunctions() {
        return this.functions == null ? Output.empty() : this.functions;
    }

    public ResolverPipelineConfigArgs(@Nullable Output<List<String>> functions) {
        this.functions = functions;
    }

    private ResolverPipelineConfigArgs() {
        this.functions = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ResolverPipelineConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<String>> functions;

        public Builder() {
    	      // Empty
        }

        public Builder(ResolverPipelineConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.functions = defaults.functions;
        }

        public Builder functions(@Nullable Output<List<String>> functions) {
            this.functions = functions;
            return this;
        }
        public Builder functions(@Nullable List<String> functions) {
            this.functions = Output.ofNullable(functions);
            return this;
        }
        public Builder functions(String... functions) {
            return functions(List.of(functions));
        }        public ResolverPipelineConfigArgs build() {
            return new ResolverPipelineConfigArgs(functions);
        }
    }
}
