// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.wafv2.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class WebACLJsonMatchPattern extends io.pulumi.resources.InvokeArgs {

    public static final WebACLJsonMatchPattern Empty = new WebACLJsonMatchPattern();

    @InputImport(name="all")
    private final @Nullable Object all;

    public Optional<Object> getAll() {
        return this.all == null ? Optional.empty() : Optional.ofNullable(this.all);
    }

    @InputImport(name="includedPaths")
    private final @Nullable List<String> includedPaths;

    public List<String> getIncludedPaths() {
        return this.includedPaths == null ? List.of() : this.includedPaths;
    }

    public WebACLJsonMatchPattern(
        @Nullable Object all,
        @Nullable List<String> includedPaths) {
        this.all = all;
        this.includedPaths = includedPaths;
    }

    private WebACLJsonMatchPattern() {
        this.all = null;
        this.includedPaths = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebACLJsonMatchPattern defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Object all;
        private @Nullable List<String> includedPaths;

        public Builder() {
    	      // Empty
        }

        public Builder(WebACLJsonMatchPattern defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.all = defaults.all;
    	      this.includedPaths = defaults.includedPaths;
        }

        public Builder setAll(@Nullable Object all) {
            this.all = all;
            return this;
        }

        public Builder setIncludedPaths(@Nullable List<String> includedPaths) {
            this.includedPaths = includedPaths;
            return this;
        }

        public WebACLJsonMatchPattern build() {
            return new WebACLJsonMatchPattern(all, includedPaths);
        }
    }
}
