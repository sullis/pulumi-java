// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.cloudtrail.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;


public final class TrailInsightSelectorGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final TrailInsightSelectorGetArgs Empty = new TrailInsightSelectorGetArgs();

    /**
     * Type of insights to log on a trail. The valid value is `ApiCallRateInsight`.
     * 
     */
    @Import(name="insightType", required=true)
      private final Output<String> insightType;

    public Output<String> insightType() {
        return this.insightType;
    }

    public TrailInsightSelectorGetArgs(Output<String> insightType) {
        this.insightType = Objects.requireNonNull(insightType, "expected parameter 'insightType' to be non-null");
    }

    private TrailInsightSelectorGetArgs() {
        this.insightType = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TrailInsightSelectorGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> insightType;

        public Builder() {
    	      // Empty
        }

        public Builder(TrailInsightSelectorGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.insightType = defaults.insightType;
        }

        public Builder insightType(Output<String> insightType) {
            this.insightType = Objects.requireNonNull(insightType);
            return this;
        }
        public Builder insightType(String insightType) {
            this.insightType = Output.of(Objects.requireNonNull(insightType));
            return this;
        }        public TrailInsightSelectorGetArgs build() {
            return new TrailInsightSelectorGetArgs(insightType);
        }
    }
}
