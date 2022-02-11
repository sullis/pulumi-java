// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class GetAzsResult {
    private final List<String> azs;

    @OutputCustomType.Constructor({"azs"})
    private GetAzsResult(List<String> azs) {
        this.azs = Objects.requireNonNull(azs);
    }

    public List<String> getAzs() {
        return this.azs;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAzsResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> azs;

        public Builder() {
    	      // Empty
        }

        public Builder(GetAzsResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.azs = defaults.azs;
        }

        public Builder setAzs(List<String> azs) {
            this.azs = Objects.requireNonNull(azs);
            return this;
        }

        public GetAzsResult build() {
            return new GetAzsResult(azs);
        }
    }
}
