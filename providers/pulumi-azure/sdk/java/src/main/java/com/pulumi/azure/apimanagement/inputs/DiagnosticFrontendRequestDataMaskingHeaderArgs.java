// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.apimanagement.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class DiagnosticFrontendRequestDataMaskingHeaderArgs extends com.pulumi.resources.ResourceArgs {

    public static final DiagnosticFrontendRequestDataMaskingHeaderArgs Empty = new DiagnosticFrontendRequestDataMaskingHeaderArgs();

    @Import(name="mode", required=true)
    private Output<String> mode;

    public Output<String> mode() {
        return this.mode;
    }

    @Import(name="value", required=true)
    private Output<String> value;

    public Output<String> value() {
        return this.value;
    }

    private DiagnosticFrontendRequestDataMaskingHeaderArgs() {}

    private DiagnosticFrontendRequestDataMaskingHeaderArgs(DiagnosticFrontendRequestDataMaskingHeaderArgs $) {
        this.mode = $.mode;
        this.value = $.value;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DiagnosticFrontendRequestDataMaskingHeaderArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DiagnosticFrontendRequestDataMaskingHeaderArgs $;

        public Builder() {
            $ = new DiagnosticFrontendRequestDataMaskingHeaderArgs();
        }

        public Builder(DiagnosticFrontendRequestDataMaskingHeaderArgs defaults) {
            $ = new DiagnosticFrontendRequestDataMaskingHeaderArgs(Objects.requireNonNull(defaults));
        }

        public Builder mode(Output<String> mode) {
            $.mode = mode;
            return this;
        }

        public Builder mode(String mode) {
            return mode(Output.of(mode));
        }

        public Builder value(Output<String> value) {
            $.value = value;
            return this;
        }

        public Builder value(String value) {
            return value(Output.of(value));
        }

        public DiagnosticFrontendRequestDataMaskingHeaderArgs build() {
            $.mode = Objects.requireNonNull($.mode, "expected parameter 'mode' to be non-null");
            $.value = Objects.requireNonNull($.value, "expected parameter 'value' to be non-null");
            return $;
        }
    }

}
