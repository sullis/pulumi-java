// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.cloudfront.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Boolean;
import java.lang.Integer;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ResponseHeadersPolicyStrictTransportSecurityArgs extends io.pulumi.resources.ResourceArgs {

    public static final ResponseHeadersPolicyStrictTransportSecurityArgs Empty = new ResponseHeadersPolicyStrictTransportSecurityArgs();

    @InputImport(name="accessControlMaxAgeSec", required=true)
    private final Input<Integer> accessControlMaxAgeSec;

    public Input<Integer> getAccessControlMaxAgeSec() {
        return this.accessControlMaxAgeSec;
    }

    @InputImport(name="includeSubdomains")
    private final @Nullable Input<Boolean> includeSubdomains;

    public Input<Boolean> getIncludeSubdomains() {
        return this.includeSubdomains == null ? Input.empty() : this.includeSubdomains;
    }

    @InputImport(name="override", required=true)
    private final Input<Boolean> override;

    public Input<Boolean> getOverride() {
        return this.override;
    }

    @InputImport(name="preload")
    private final @Nullable Input<Boolean> preload;

    public Input<Boolean> getPreload() {
        return this.preload == null ? Input.empty() : this.preload;
    }

    public ResponseHeadersPolicyStrictTransportSecurityArgs(
        Input<Integer> accessControlMaxAgeSec,
        @Nullable Input<Boolean> includeSubdomains,
        Input<Boolean> override,
        @Nullable Input<Boolean> preload) {
        this.accessControlMaxAgeSec = Objects.requireNonNull(accessControlMaxAgeSec, "expected parameter 'accessControlMaxAgeSec' to be non-null");
        this.includeSubdomains = includeSubdomains;
        this.override = Objects.requireNonNull(override, "expected parameter 'override' to be non-null");
        this.preload = preload;
    }

    private ResponseHeadersPolicyStrictTransportSecurityArgs() {
        this.accessControlMaxAgeSec = Input.empty();
        this.includeSubdomains = Input.empty();
        this.override = Input.empty();
        this.preload = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ResponseHeadersPolicyStrictTransportSecurityArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<Integer> accessControlMaxAgeSec;
        private @Nullable Input<Boolean> includeSubdomains;
        private Input<Boolean> override;
        private @Nullable Input<Boolean> preload;

        public Builder() {
    	      // Empty
        }

        public Builder(ResponseHeadersPolicyStrictTransportSecurityArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accessControlMaxAgeSec = defaults.accessControlMaxAgeSec;
    	      this.includeSubdomains = defaults.includeSubdomains;
    	      this.override = defaults.override;
    	      this.preload = defaults.preload;
        }

        public Builder setAccessControlMaxAgeSec(Input<Integer> accessControlMaxAgeSec) {
            this.accessControlMaxAgeSec = Objects.requireNonNull(accessControlMaxAgeSec);
            return this;
        }

        public Builder setAccessControlMaxAgeSec(Integer accessControlMaxAgeSec) {
            this.accessControlMaxAgeSec = Input.of(Objects.requireNonNull(accessControlMaxAgeSec));
            return this;
        }

        public Builder setIncludeSubdomains(@Nullable Input<Boolean> includeSubdomains) {
            this.includeSubdomains = includeSubdomains;
            return this;
        }

        public Builder setIncludeSubdomains(@Nullable Boolean includeSubdomains) {
            this.includeSubdomains = Input.ofNullable(includeSubdomains);
            return this;
        }

        public Builder setOverride(Input<Boolean> override) {
            this.override = Objects.requireNonNull(override);
            return this;
        }

        public Builder setOverride(Boolean override) {
            this.override = Input.of(Objects.requireNonNull(override));
            return this;
        }

        public Builder setPreload(@Nullable Input<Boolean> preload) {
            this.preload = preload;
            return this;
        }

        public Builder setPreload(@Nullable Boolean preload) {
            this.preload = Input.ofNullable(preload);
            return this;
        }

        public ResponseHeadersPolicyStrictTransportSecurityArgs build() {
            return new ResponseHeadersPolicyStrictTransportSecurityArgs(accessControlMaxAgeSec, includeSubdomains, override, preload);
        }
    }
}
