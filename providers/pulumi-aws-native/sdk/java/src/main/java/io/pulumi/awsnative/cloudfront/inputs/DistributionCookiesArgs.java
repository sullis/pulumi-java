// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.cloudfront.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DistributionCookiesArgs extends io.pulumi.resources.ResourceArgs {

    public static final DistributionCookiesArgs Empty = new DistributionCookiesArgs();

    @InputImport(name="forward", required=true)
    private final Input<String> forward;

    public Input<String> getForward() {
        return this.forward;
    }

    @InputImport(name="whitelistedNames")
    private final @Nullable Input<List<String>> whitelistedNames;

    public Input<List<String>> getWhitelistedNames() {
        return this.whitelistedNames == null ? Input.empty() : this.whitelistedNames;
    }

    public DistributionCookiesArgs(
        Input<String> forward,
        @Nullable Input<List<String>> whitelistedNames) {
        this.forward = Objects.requireNonNull(forward, "expected parameter 'forward' to be non-null");
        this.whitelistedNames = whitelistedNames;
    }

    private DistributionCookiesArgs() {
        this.forward = Input.empty();
        this.whitelistedNames = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DistributionCookiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> forward;
        private @Nullable Input<List<String>> whitelistedNames;

        public Builder() {
    	      // Empty
        }

        public Builder(DistributionCookiesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.forward = defaults.forward;
    	      this.whitelistedNames = defaults.whitelistedNames;
        }

        public Builder setForward(Input<String> forward) {
            this.forward = Objects.requireNonNull(forward);
            return this;
        }

        public Builder setForward(String forward) {
            this.forward = Input.of(Objects.requireNonNull(forward));
            return this;
        }

        public Builder setWhitelistedNames(@Nullable Input<List<String>> whitelistedNames) {
            this.whitelistedNames = whitelistedNames;
            return this;
        }

        public Builder setWhitelistedNames(@Nullable List<String> whitelistedNames) {
            this.whitelistedNames = Input.ofNullable(whitelistedNames);
            return this;
        }

        public DistributionCookiesArgs build() {
            return new DistributionCookiesArgs(forward, whitelistedNames);
        }
    }
}
