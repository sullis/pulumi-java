// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.cloudfront.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ResponseHeadersPolicyXSSProtectionArgs extends io.pulumi.resources.ResourceArgs {

    public static final ResponseHeadersPolicyXSSProtectionArgs Empty = new ResponseHeadersPolicyXSSProtectionArgs();

    @InputImport(name="modeBlock")
    private final @Nullable Input<Boolean> modeBlock;

    public Input<Boolean> getModeBlock() {
        return this.modeBlock == null ? Input.empty() : this.modeBlock;
    }

    @InputImport(name="override", required=true)
    private final Input<Boolean> override;

    public Input<Boolean> getOverride() {
        return this.override;
    }

    @InputImport(name="protection", required=true)
    private final Input<Boolean> protection;

    public Input<Boolean> getProtection() {
        return this.protection;
    }

    @InputImport(name="reportUri")
    private final @Nullable Input<String> reportUri;

    public Input<String> getReportUri() {
        return this.reportUri == null ? Input.empty() : this.reportUri;
    }

    public ResponseHeadersPolicyXSSProtectionArgs(
        @Nullable Input<Boolean> modeBlock,
        Input<Boolean> override,
        Input<Boolean> protection,
        @Nullable Input<String> reportUri) {
        this.modeBlock = modeBlock;
        this.override = Objects.requireNonNull(override, "expected parameter 'override' to be non-null");
        this.protection = Objects.requireNonNull(protection, "expected parameter 'protection' to be non-null");
        this.reportUri = reportUri;
    }

    private ResponseHeadersPolicyXSSProtectionArgs() {
        this.modeBlock = Input.empty();
        this.override = Input.empty();
        this.protection = Input.empty();
        this.reportUri = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ResponseHeadersPolicyXSSProtectionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Boolean> modeBlock;
        private Input<Boolean> override;
        private Input<Boolean> protection;
        private @Nullable Input<String> reportUri;

        public Builder() {
    	      // Empty
        }

        public Builder(ResponseHeadersPolicyXSSProtectionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.modeBlock = defaults.modeBlock;
    	      this.override = defaults.override;
    	      this.protection = defaults.protection;
    	      this.reportUri = defaults.reportUri;
        }

        public Builder setModeBlock(@Nullable Input<Boolean> modeBlock) {
            this.modeBlock = modeBlock;
            return this;
        }

        public Builder setModeBlock(@Nullable Boolean modeBlock) {
            this.modeBlock = Input.ofNullable(modeBlock);
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

        public Builder setProtection(Input<Boolean> protection) {
            this.protection = Objects.requireNonNull(protection);
            return this;
        }

        public Builder setProtection(Boolean protection) {
            this.protection = Input.of(Objects.requireNonNull(protection));
            return this;
        }

        public Builder setReportUri(@Nullable Input<String> reportUri) {
            this.reportUri = reportUri;
            return this;
        }

        public Builder setReportUri(@Nullable String reportUri) {
            this.reportUri = Input.ofNullable(reportUri);
            return this;
        }

        public ResponseHeadersPolicyXSSProtectionArgs build() {
            return new ResponseHeadersPolicyXSSProtectionArgs(modeBlock, override, protection, reportUri);
        }
    }
}
