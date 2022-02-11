// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class GetUrlSuffixResult {
    private final String urlSuffix;

    @OutputCustomType.Constructor({"urlSuffix"})
    private GetUrlSuffixResult(String urlSuffix) {
        this.urlSuffix = Objects.requireNonNull(urlSuffix);
    }

    public String getUrlSuffix() {
        return this.urlSuffix;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetUrlSuffixResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String urlSuffix;

        public Builder() {
    	      // Empty
        }

        public Builder(GetUrlSuffixResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.urlSuffix = defaults.urlSuffix;
        }

        public Builder setUrlSuffix(String urlSuffix) {
            this.urlSuffix = Objects.requireNonNull(urlSuffix);
            return this;
        }

        public GetUrlSuffixResult build() {
            return new GetUrlSuffixResult(urlSuffix);
        }
    }
}
